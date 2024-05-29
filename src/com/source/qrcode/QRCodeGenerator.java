package com.source.qrcode;
import com.source.Sql.connectDB;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.Collection;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.json.JSONObject;

public class QRCodeGenerator extends JFrame {
    private JLabel qrCodeLabel;
    private JButton generateButton;

    connectDB cn = new connectDB();
    Connection conn;

    public QRCodeGenerator() {
        setTitle("QR Code Generator");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        qrCodeLabel = new JLabel();
        qrCodeLabel.setHorizontalAlignment(JLabel.CENTER);

        generateButton = new JButton("Generate QR Code");
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateQRCode();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(generateButton);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(qrCodeLabel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    private void generateQRCode() {
        try {
            // Tạo kết nối đến API
            URL url = new URL("https://api.vietqr.io/v2/generate");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            // con.setRequestProperty("x-client-id", "<e7c158a0-a7c9-4d1f-bf81-d6b763078821>");
            // con.setRequestProperty("x-api-key", "<437269d1-4432-49db-a174-0935b7a5f631>");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);

            //lấy thông tin từ csdl
            BigDecimal tongtien = null;
            String stk = null;
            String tenTK = null;
            String binNH = null;

            try {
                conn = new connectDB().getConnection();
                String sql = "SELECT * FROM HoaDon where trangthai = 1";
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    tongtien = rs.getBigDecimal("tongTien").setScale(0, RoundingMode.DOWN);
                    System.out.println(tongtien);
                }
                String sql1 = "SELECT * FROM TaiKhoanNganHang where trangthai = 1";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                while (rs1.next()) {
                    stk = rs1.getString("soTK");
                    System.out.println(stk);
                    tenTK = rs1.getString("tenTK");
                    System.out.println(tenTK);
                    binNH = rs1.getString("binNH");
                    System.out.println(binNH);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Tạo JSON cho dữ liệu yêu cầu
            JSONObject requestData = new JSONObject();
            requestData.put("accountNo", stk);
            requestData.put("accountName", tenTK);
            requestData.put("acqId", binNH);
            requestData.put("addInfo", "");
            requestData.put("amount", tongtien);
            requestData.put("template", "compact2");

            // Gửi dữ liệu yêu cầu đến API
            con.getOutputStream().write(requestData.toString().getBytes());

            // Đọc phản hồi từ API
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Xử lý phản hồi JSON
            JSONObject jsonResponse = new JSONObject(response.toString());
            // String qrCodeData = jsonResponse.getJSONObject("data").getString("qrCode");
            String qrDataURL = jsonResponse.getJSONObject("data").getString("qrDataURL");

            // // Tạo mã QR code từ dữ liệu nhận được
            // int width = 300; // replace with desired width
            // int height = 300; // replace with desired height

            // ByteArrayOutputStream stream = QRCode.from(qrCodeData).to(ImageType.PNG).withSize(width, height).stream();
            // byte[] qrCodeBytes = stream.toByteArray();
            // ImageIcon icon = new ImageIcon(qrCodeBytes);
            // qrCodeLabel.setIcon(icon);

            displayQRCodeFromDataURL(qrDataURL);

            // Đóng kết nối
            con.disconnect();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void displayQRCodeFromDataURL(String qrDataURL) {
        try {
            // Tách tiền tố data:image/png;base64, và giải mã base64
            String base64Data = qrDataURL.split(",")[1];
            byte[] imageBytes = Base64.getDecoder().decode(base64Data);
            InputStream is = new ByteArrayInputStream(imageBytes);
            BufferedImage image = ImageIO.read(is);

            // Hiển thị hình ảnh trong JLabel
            qrCodeLabel.setIcon(new ImageIcon(image));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error displaying QR Code: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new QRCodeGenerator().setVisible(true);
            }
        });
    }
}
