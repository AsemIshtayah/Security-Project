/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Asem Ishtayah
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        
        
        String textToHide = "asem";
        int textLength = textToHide.length();
        int[] twoBitText = new int[4 * textLength];
        
//        char currentChar = 'a';
//        System.out.println((int)(currentChar));
//        System.out.println("(currentChar >> 6) & 0x3");
//        System.out.println((currentChar >> 6) & 0x3);
//        System.out.println((currentChar >> 4) & 0x3);
//        System.out.println((currentChar >> 2) & 0x3);
//        System.out.println((currentChar) & 0x3);
        
        
    }
    public BufferedImage bufferedImageCover = null;
    public BufferedImage bufferedImageSecrete = null;
    public BufferedImage bufferedImageResult = null;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cover Image appears here");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));

        jButton1.setText("Upload Cover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Secrete Image appears here");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));

        jButton2.setText("Upload Secrete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Upload Result");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Result Image appears here");
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));

        jButton4.setText("Save Encrypted Img to Disk");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Encrypt", "Decrypt" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 bit Enc", "2 bit Enc", "3 bit Enc" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton7.setText("Run");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setText("Save Decrypted Img to Disk");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(9, 9, 9))
                    .addComponent(jButton3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6)
                                    .addComponent(jButton4)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(209, 209, 209)
                        .addComponent(jButton3)
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bufferedImageCover = uploadImage(jLabel1);
//        System.out.println(bufferedImageCover.getWidth());
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        bufferedImageSecrete = uploadImage(jLabel2);
        
        BufferedImage img = bufferedImageSecrete;
        Image tmp = img.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(300, 200, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        
        for(int y = 0; y < dimg.getHeight(); y++){
            for(int x = 0; x < dimg.getWidth(); x++){
                List<Integer> listRgbPixel = getRGBPixel(dimg, x, y);
                int grayColor = ((listRgbPixel.get(0) + listRgbPixel.get(1) + listRgbPixel.get(2))/3);
                dimg = setRGBPixel(dimg, x, y, grayColor, grayColor, grayColor);
            }
        }
        bufferedImageSecrete = dimg;
        displayImage(dimg, jLabel2);
    }//GEN-LAST:event_jButton2ActionPerformed
  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        bufferedImageResult = uploadImage(jLabel3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            writeToFile(bufferedImageCover, "png", "./asem.png");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    public void writeToFile(BufferedImage bufferedImage, String filename, String path) throws IOException {
        // TODO add your handling code here:
        ImageIO.write(bufferedImage, filename, new File(path));
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jLabel1.setIcon(null);
        jLabel2.setIcon(null);
        jLabel3.setIcon(null);
        jLabel1.setText("Cover Image appears here");
        jLabel2.setText("Secrete Image appears here");
        jLabel3.setText("Result Image appears here");
        bufferedImageCover = null;
        bufferedImageSecrete = null;
        bufferedImageResult = null;
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem().toString().equals("Encrypt")){
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(false);
            jButton4.setEnabled(true);
            jButton6.setEnabled(false);
        } else{
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(true);
            jButton4.setEnabled(false);
            jButton6.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
//        int[][] arrSecreteTest = generateArrayOfGrayPixels(bufferedImageSecrete);
//        for(int a = 0; a < 200; a++){
//            for(int b = 0; b < 300; b++){
//                System.out.print(arrSecreteTest[a][b] + " | ");
//                if(arrSecreteTest[a][b] > 255) {
//                    System.err.println("more than 255 !!!!!!!!");
//                    return;
//                }
//            }
//            System.out.println("");
//        }
        int andLogicWith = 0;
        int numBitEnc = 0;
        // 1 bit Enc, 2 bit Enc, 3 bit Enc
        if(jComboBox2.getSelectedItem().toString().equals("1 bit Enc")){
//            System.out.println("1 bit Enc");
            andLogicWith = 254;   //  1111 1110
            numBitEnc = 1;
        } else if(jComboBox2.getSelectedItem().toString().equals("2 bit Enc")){
            System.out.println("2 bit Enc");
            andLogicWith = 252;   //  1111 1100
            numBitEnc = 2;
        } else {
//            System.out.println("3 bit Enc");
            andLogicWith = 248; //  1111 1000
            numBitEnc = 3;
        }
        
        
        if(jComboBox1.getSelectedItem().toString().equals("Encrypt")){
//            System.out.println("Encrypt");
            int[][] arrSecrete = generateArrayOfGrayPixels(bufferedImageSecrete);
            int x = 0;
            int y = 0;
            int m;
            int n;
            
            for(n = 0; n < bufferedImageSecrete.getHeight(); n++){
                for(m = 0; m < bufferedImageSecrete.getWidth(); m++){
                    if(numBitEnc == 1){
                        List<Integer> listRgbPixel = getRGBPixel(bufferedImageCover, x, y);
                        int r = listRgbPixel.get(0);
                        int g = listRgbPixel.get(1);
                        int b = listRgbPixel.get(2);
                        
                        r = (r&254) + arrSecrete[n][m]%2;
                        arrSecrete[n][m] = arrSecrete[n][m]/2;
                        
                        g = (g&254) + arrSecrete[n][m]%2;
                        arrSecrete[n][m] = arrSecrete[n][m]/2;
                        
                        b = (b&254) + arrSecrete[n][m]%2;
                        arrSecrete[n][m] = arrSecrete[n][m]/2;
                        
                        setRGBPixel(bufferedImageCover, x, y, r, g, b);
                        
                        x++;
                        if(x==bufferedImageCover.getWidth()){
                            x=0;
                            y++;
                        }
                        
                        listRgbPixel = getRGBPixel(bufferedImageCover, x, y);
                        r = listRgbPixel.get(0);
                        g = listRgbPixel.get(1);
                        b = listRgbPixel.get(2);
                        
                        r = (r&254) + arrSecrete[n][m]%2;
                        arrSecrete[n][m] = arrSecrete[n][m]/2;
                        
                        g = (g&254) + arrSecrete[n][m]%2;
                        arrSecrete[n][m] = arrSecrete[n][m]/2;
                        
                        b = (b&254) + arrSecrete[n][m]%2;
                        arrSecrete[n][m] = arrSecrete[n][m]/2;
                        
                        setRGBPixel(bufferedImageCover, x, y, r, g, b);
                        
                        x++;
                        if(x==bufferedImageCover.getWidth()){
                            x=0;
                            y++;
                        }
                        
                        listRgbPixel = getRGBPixel(bufferedImageCover, x, y);
                        r = listRgbPixel.get(0);
                        g = listRgbPixel.get(1);
                        b = listRgbPixel.get(2);
                        
                        r = (r&254) + arrSecrete[n][m]%2;
                        arrSecrete[n][m] = arrSecrete[n][m]/2;
                        
                        g = (g&254) + arrSecrete[n][m]%2;
                        arrSecrete[n][m] = arrSecrete[n][m]/2;
                        
                        setRGBPixel(bufferedImageCover, x, y, r, g, b);
                        
                        x++;
                        if(x==bufferedImageCover.getWidth()){
                            x=0;
                            y++;
                        }
                                                
                    } else if(numBitEnc == 2){
                        List<Integer> listRgbPixel = getRGBPixel(bufferedImageCover, x, y);
                        int r = listRgbPixel.get(0);
                        int g = listRgbPixel.get(1);
                        int b = listRgbPixel.get(2);
                        
                        r = (r&252) + arrSecrete[n][m]%4;
                        arrSecrete[n][m] = arrSecrete[n][m]/4;
                        
                        g = (g&252) + arrSecrete[n][m]%4;
                        arrSecrete[n][m] = arrSecrete[n][m]/4;
                        
                        b = (b&252) + arrSecrete[n][m]%4;
                        arrSecrete[n][m] = arrSecrete[n][m]/4;
                        
                        setRGBPixel(bufferedImageCover, x, y, r, g, b);
                        
                        x++;
                        if(x==bufferedImageCover.getWidth()){
                            x=0;
                            y++;
                        }
                        listRgbPixel = getRGBPixel(bufferedImageCover, x, y);
                        r = listRgbPixel.get(0);
                        g = listRgbPixel.get(1);
                        b = listRgbPixel.get(2);
                        r = (r&252) + arrSecrete[n][m]%4;
                        setRGBPixel(bufferedImageCover, x, y, r, g, b);
                        
                        x++;
                        if(x==bufferedImageCover.getWidth()){
                            x=0;
                            y++;
                        }
                        
                    } else { // numBitEnc == 3
                        List<Integer> listRgbPixel = getRGBPixel(bufferedImageCover, x, y);
                        int r = listRgbPixel.get(0);
                        int g = listRgbPixel.get(1);
                        int b = listRgbPixel.get(2);
                        
                        r = (r&248) + arrSecrete[n][m]%8;
                        arrSecrete[n][m] = arrSecrete[n][m]/8;
                        
                        g = (g&248) + arrSecrete[n][m]%8;
                        arrSecrete[n][m] = arrSecrete[n][m]/8;
                        
                        b = (b&248) + arrSecrete[n][m]%8;
                        arrSecrete[n][m] = arrSecrete[n][m]/8;
                        
                        setRGBPixel(bufferedImageCover, x, y, r, g, b);
                        
                        x++;
                        if(x==bufferedImageCover.getWidth()){
                            x=0;
                            y++;
                        }
                    }
                    
                }
            }
            displayImage(bufferedImageCover, jLabel3);
           
        } else{
//            System.out.println("Decrept");
            int[][] arrSecrete = new int[200][300];
            int x = 0;
            int y = 0;
            int m;
            int n;
            
            for(n = 0; n < 200; n++){
                for(m = 0; m < 300; m++){
                     if(numBitEnc == 1){
                         
                        List<Integer> listRgbPixel = getRGBPixel(bufferedImageResult, x, y);
                        int r = listRgbPixel.get(0);
                        int g = listRgbPixel.get(1);
                        int b = listRgbPixel.get(2);
                        
                        arrSecrete[n][m] = (r&1) + (g&1)*2 + (b&1)*4;
                        
                        x++;
                        if(x == bufferedImageResult.getWidth()){
                            x =0;
                            y++;
//                            if(y == bufferedImageCover.getHeight()) return;
                        }
                        
                        listRgbPixel = getRGBPixel(bufferedImageResult, x, y);
                        r = listRgbPixel.get(0);
                        g = listRgbPixel.get(1);
                        b = listRgbPixel.get(2);
                        
                        arrSecrete[n][m] = arrSecrete[n][m] + (r&1)*8 + (g&1)*16 + (b&1)*32;
                        
                        x++;
                        if(x == bufferedImageResult.getWidth()){
                            x =0;
                            y++;
//                            if(y == bufferedImageCover.getHeight()) return;
                        }
                        
                        listRgbPixel = getRGBPixel(bufferedImageResult, x, y);
                        r = listRgbPixel.get(0);
                        g = listRgbPixel.get(1);
                        b = listRgbPixel.get(2);
                        
                        arrSecrete[n][m] = arrSecrete[n][m] + (r&1)*64 + (g&1)*128;
                        
                        x++;
                        if(x == bufferedImageResult.getWidth()){
                            x =0;
                            y++;
//                            if(y == bufferedImageCover.getHeight()) return;
                        }
                        
                        
                    } else if(numBitEnc == 2){
                        List<Integer> listRgbPixel = getRGBPixel(bufferedImageResult, x, y);
                        int r = listRgbPixel.get(0);
                        int g = listRgbPixel.get(1);
                        int b = listRgbPixel.get(2);
                        
                        arrSecrete[n][m] = (r&3) + (g&3)*4 + (b&3)*16;
                        
                        x++;
                        if(x == bufferedImageResult.getWidth()){
                            x =0;
                            y++;
//                            if(y == bufferedImageCover.getHeight()) return;
                        }
                        
                        listRgbPixel = getRGBPixel(bufferedImageResult, x, y);
                        r = listRgbPixel.get(0);
                        g = listRgbPixel.get(1);
                        b = listRgbPixel.get(2);
                        
                        arrSecrete[n][m] = arrSecrete[n][m] + (r&3)*64;
                        x++;
                        if(x == bufferedImageResult.getWidth()){
                            x =0;
                            y++;
//                            if(y == bufferedImageCover.getHeight()) return;
                        }
                        
                        
                    } else {
                        List<Integer> listRgbPixel = getRGBPixel(bufferedImageResult, x, y);
                        int r = listRgbPixel.get(0);
                        int g = listRgbPixel.get(1);
                        int b = listRgbPixel.get(2);
                        
                        arrSecrete[n][m] = (r&7) + (g&7)*8 + (b&7)*64;
                        
                        x++;
                        if(x == bufferedImageResult.getWidth()){
                            x =0;
                            y++;
//                            if(y == bufferedImageCover.getHeight()) return;
                        }
                    }
                }
            }
            bufferedImageSecrete = makeBufferedImageFromArray(arrSecrete);
            displayImage(bufferedImageSecrete, jLabel2);
            
            
        }
                
        
    }//GEN-LAST:event_jButton7ActionPerformed

    public String decimalToBinary(int number) {
        String binary = "";
        binary = (number % 2) + binary;
        number = number >> 1;
        binary = (number % 2) + binary;
        number = number >> 1;
        binary = (number % 2) + binary;
        number = number >> 1;
        binary = (number % 2) + binary;
        number = number >> 1;
        binary = (number % 2) + binary;
        number = number >> 1;
        binary = (number % 2) + binary;
        number = number >> 1;
        binary = (number % 2) + binary;
        number = number >> 1;
        binary = (number % 2) + binary;
        return binary;
    }



    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try{
            writeToFile(bufferedImageSecrete, "png", "./asem_dec.png");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    public BufferedImage uploadImage(JLabel jLabel){
        BufferedImage bufferedImage = null;
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "bmp");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        
        
        File selectedFile = file.getSelectedFile();
//        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(selectedFile);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayImage(bufferedImage, jLabel);
        return bufferedImage;
    }

    public void displayImage(BufferedImage bufferedImage, JLabel jLabel) {
        ImageIcon myImage = new ImageIcon(bufferedImage);
//        ImageIcon imageRepresent = new ImageIcon(bufferedImage);
        
        Image img = myImage.getImage();
        Image newImg = img.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH);
        myImage = new ImageIcon(newImg);

        jLabel.setIcon(new ImageIcon((myImage.getImage()).getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    public List<Integer> getRGBPixel(BufferedImage img, int x, int y){
        List<Integer> RgbPixel = new ArrayList<>();
        int pixel = img.getRGB(x,y);
        //Creating a Color object from pixel value
        Color color = new Color(pixel, true);
        //Retrieving the R G B values
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        RgbPixel.add(red);
        RgbPixel.add(green);
        RgbPixel.add(blue);
        return RgbPixel;
    }
    
    public BufferedImage setRGBPixel(BufferedImage img, int x, int y, int red, int green, int blue){        
        Color color = new Color(red, green, blue);
        img.setRGB(x, y, color.getRGB());
        return img;
    }
    
        public int[][] generateArrayOfGrayPixels(BufferedImage bufferedImage) {
        int[][] secureImg = new int[bufferedImage.getHeight()][bufferedImage.getWidth()];
        
        for (int y = 0; y < bufferedImage.getHeight(); y++) {
            for (int x = 0; x < bufferedImage.getWidth(); x++) {
                List<Integer> RgbPixel = getRGBPixel(bufferedImage, x, y);
                secureImg[y][x] = (RgbPixel.get(0) + RgbPixel.get(1) + RgbPixel.get(2)) / 3;
//                Color c = new Color(RgbPixel.get(0), RgbPixel.get(1), RgbPixel.get(2));
//                bufferedImage.setRGB(x, y, c.getRGB());
            }
        }
        return secureImg;
    }
        
    public BufferedImage makeBufferedImageFromArray(int[][] arr){
        BufferedImage bufferedImage = new BufferedImage(300, 200, BufferedImage.TYPE_BYTE_GRAY);
//        System.out.println("arr.length:\t" + arr.length);
        for (int y = 0; y < bufferedImage.getHeight(); y++) {
            for (int x = 0; x < bufferedImage.getWidth(); x++) {
//                System.out.println(x+", "+ y+") : " +"(" + arr[y][x] +")");
                Color c = new Color(arr[y][x],arr[y][x],arr[y][x]);
                bufferedImage.setRGB(x, y, c.getRGB());
            }    
//            System.out.println("");
        }
//        System.out.println(bufferedImage.getWidth() + "," + bufferedImage.getHeight());
        return bufferedImage;
            
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

//    byte[] photo = null;
//    String filename = null;
}
