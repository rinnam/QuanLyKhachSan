/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.source.Form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.source.Sql.connectDB;;

/**
 *
 * @author HP
 */
public class traphong extends javax.swing.JPanel {
    connectDB con = new connectDB();
    Connection conn;

    /**
     * Creates new form traphong
     */
    public traphong() {
        initComponents();
        intablePhieuthue();

        timkiem.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                timphieuthue();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                timphieuthue();
            }
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                timphieuthue();
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        traphong = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        maphieuthue = new javax.swing.JTextField();
        timkiem = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        makhachhang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        thoigiano = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tinhtien = new javax.swing.JTextField();
        tinhtien1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        maphong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu thuê", "Mã KH", "Mã phòng", "Mã nhân viên", "Ngày đến", "Ngày đi", "Hình thức", "Tính tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        traphong.setBackground(new java.awt.Color(102, 102, 102));
        traphong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        traphong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                traphongMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Trả phòng");

        javax.swing.GroupLayout traphongLayout = new javax.swing.GroupLayout(traphong);
        traphong.setLayout(traphongLayout);
        traphongLayout.setHorizontalGroup(
            traphongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(traphongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        traphongLayout.setVerticalGroup(
            traphongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(traphongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        maphieuthue.setEditable(false);
        maphieuthue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        timkiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Mã phiếu thuê");

        jLabel2.setText("Tìm kiếm");

        makhachhang.setEditable(false);
        makhachhang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Mã khách hàng");

        thoigiano.setEditable(false);
        thoigiano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Thời gian ở");

        jLabel5.setText("Tính tiền");

        tinhtien.setEditable(false);
        tinhtien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tinhtien1.setBackground(new java.awt.Color(102, 102, 102));
        tinhtien1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tinhtien1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tinhtien1MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tính tiền");

        javax.swing.GroupLayout tinhtien1Layout = new javax.swing.GroupLayout(tinhtien1);
        tinhtien1.setLayout(tinhtien1Layout);
        tinhtien1Layout.setHorizontalGroup(
            tinhtien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tinhtien1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tinhtien1Layout.setVerticalGroup(
            tinhtien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tinhtien1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        maphong.setEditable(false);
        maphong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Mã phòng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(maphieuthue, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(makhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(thoigiano, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maphong, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tinhtien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(traphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tinhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(88, 88, 88))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tinhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maphong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maphieuthue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(makhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(traphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(tinhtien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(thoigiano, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34)))
                .addGap(23, 23, 23))
        );

        jPanel2.add(jPanel3, "card2");

        jPanel4.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 935, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void traphongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_traphongMouseClicked
        // TODO add your handling code here:
        //ghi ngaydi theo thời gian hiện tại
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String ngaydi = sdf.format(date);
        try {
            conn = new connectDB().getConnection();
            String sql = "UPDATE PhieuThue SET ngaydi = ? WHERE maPT = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ngaydi);
            ps.setString(2, maphieuthue.getText());
            ps.executeUpdate();
            intablePhieuthue();
        } catch (Exception e) {
        }
        //tính khoảng cách giữa ngayden và ngaydi và ghi vào jTextField thoigiano, đọc trong databse nếu hinhthuc = 'gio' thì trả về khoảng cách giờ, nếu là 'ngay' thì trả về khoảng cách ngày
        try {
            conn = new connectDB().getConnection();
            String sql = "SELECT * FROM PhieuThue WHERE maPT = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maphieuthue.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String hinhthuc = rs.getString("hinhthuc");
                Timestamp ngayden = rs.getTimestamp("ngayden");
                Timestamp ngaydi1 = rs.getTimestamp("ngaydi");
                long thoigian = ngaydi1.getTime() - ngayden.getTime();
                
                float hour = (float) thoigian /3600000;
                int resulthour = (int) Math.ceil(hour);
                
                float day =(float) thoigian / 86400000;
                int resultday = (int) Math.ceil(day);
                
                if (hinhthuc.equals("gio")) {
                    thoigiano.setText(resulthour + " giờ");
                } else {
                    thoigiano.setText(resultday + " ngày");
                }
                //hiện thông báo
                JOptionPane.showMessageDialog(this, "Trả phòng thành công");
            }
            // đưa tinhtrang phòng được chọn trong csdl về Dọn dẹp
            String sql1 = "UPDATE Phong SET tinhtrang = 'Don dep' WHERE maphong = ?";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, maphong.getText());
            ps1.executeUpdate();
        } catch (Exception e) {
        }
                                        
    }//GEN-LAST:event_traphongMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int i = jTable1.getSelectedRow();
                if(i>=0){
                    maphieuthue.setText(model.getValueAt(i, 0).toString());
                    makhachhang.setText(model.getValueAt(i, 1).toString());
                    maphong.setText(model.getValueAt(i, 2).toString());
                    thoigiano.setText("");
                }
    }//GEN-LAST:event_jTable1MouseClicked

    private void tinhtien1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tinhtien1MouseClicked
        // TODO add your handling code here:
        //tính tiền theo hình thức, nếu là 'gio' thì sẽ lấy gio dau tiên * gia1giodau và các giò sau nhân với giacacgiosau . Ví dụ 3gio => 1*gia1giodau + 2+giacacgiosau
        try {
            conn = new connectDB().getConnection();
            String sql = "SELECT * FROM PhieuThue WHERE maPT = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maphieuthue.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //lấy giá các phòng từ table Phong
                if(thoigiano.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Vui lòng trả phòng trước");
                } else if (maphieuthue.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Vui lòng chọn phiếu thuê");
                }
                 else{
                String hinhthuc = rs.getString("hinhthuc");
                Timestamp ngayden = rs.getTimestamp("ngayden");
                Timestamp ngaydi1 = rs.getTimestamp("ngaydi");
                long thoigian = ngaydi1.getTime() - ngayden.getTime();
                
                float hour = (float) thoigian /3600000;
                int resulthour = (int) Math.ceil(hour);
                
                float day =(float) thoigian / 86400000;
                int resultday = (int) Math.ceil(day);

                String sql1 = "SELECT * FROM Phong WHERE maphong = ?";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                ps1.setString(1, maphong.getText());
                ResultSet rs1 = ps1.executeQuery();
                if (rs1.next()) {
                    int gia1giodau = rs1.getInt("gia1giodau");
                    int giacacgiosau = rs1.getInt("giacacgiosau");
                    int giangay = rs1.getInt("giatheongay");
                    int tien = 0;
                    if (hinhthuc.equals("gio")) {
                        if (resulthour <= 1) {
                            tien = gia1giodau;
                        } else {
                            tien = gia1giodau + (resulthour - 1) * giacacgiosau;
                        }
                    } else {
                        tien = resultday * giangay;
                    }
                    tinhtien.setText(String.valueOf(tien));
                    //ghi tinhtien vao database
                    String sql2 = "UPDATE PhieuThue SET tinhtien = ? WHERE maPT = ?";
                    PreparedStatement ps2 = conn.prepareStatement(sql2);
                    ps2.setString(1, String.valueOf(tien));
                    ps2.setString(2, maphieuthue.getText());
                    ps2.executeUpdate();
                    intablePhieuthue();
                    //hiện thông báo
                    JOptionPane.showMessageDialog(this, "Tính tiền thành công");
                }
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
            //in ra thông báo
            JOptionPane.showMessageDialog(this, "Tính tiền thất bại");
        }
        
    }//GEN-LAST:event_tinhtien1MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        intablePhieuthue();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void intablePhieuthue(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            conn = new connectDB().getConnection();
            String sql = "SELECT * FROM PhieuThue ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector row = new Vector();
                row.add(rs.getString("maPT").trim());
                row.add(rs.getString("maKH").trim());
                row.add(rs.getString("maphong").trim());
                row.add(rs.getString("maNV").trim());
                row.add(sdf.format(rs.getDate("ngayden")));   
                Date ngaydi = rs.getDate("ngaydi");
                if (ngaydi != null) {
                    row.add(sdf.format(ngaydi));
                } else {
                    row.add("N/A");
                }
                row.add(rs.getString("hinhthuc").trim());
                row.add(rs.getString("tinhtien").trim());
                model.addRow(row);
                }
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }

    private void timphieuthue(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            conn = new connectDB().getConnection();
            String sql = "SELECT * FROM PhieuThue WHERE maPT LIKE ? OR maKH LIKE ? OR maphong LIKE ? OR maNV LIKE ? OR ngayden LIKE ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + timkiem.getText() + "%");
            ps.setString(2, "%" + timkiem.getText() + "%");
            ps.setString(3, "%" + timkiem.getText() + "%");
            ps.setString(4, "%" + timkiem.getText() + "%");
            ps.setString(5, "%" + timkiem.getText() + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector row = new Vector();
                row.add(rs.getString("maPT").trim());
                row.add(rs.getString("maKH").trim());
                row.add(rs.getString("maphong").trim());
                row.add(rs.getString("maNV").trim());
                row.add(sdf.format(rs.getDate("ngayden")));   
                Date ngaydi = rs.getDate("ngaydi");
                if (ngaydi != null) {
                    row.add(sdf.format(ngaydi));
                } else {
                    row.add("N/A");
                }
                row.add(rs.getString("hinhthuc").trim());
                row.add(rs.getString("tinhtien").trim());
                model.addRow(row);
                }
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField makhachhang;
    private javax.swing.JTextField maphieuthue;
    private javax.swing.JTextField maphong;
    private javax.swing.JTextField thoigiano;
    private javax.swing.JTextField timkiem;
    private javax.swing.JTextField tinhtien;
    private javax.swing.JPanel tinhtien1;
    private javax.swing.JPanel traphong;
    // End of variables declaration//GEN-END:variables
}
