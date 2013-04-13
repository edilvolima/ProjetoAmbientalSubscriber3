/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.GUI;

import java.awt.Color;

/**
 *
 * @author Zeff
 */
public class SecretariaSaude extends javax.swing.JFrame {

    /**
     * Creates new form SecretariaMeioAmbiente
     */
    
    private AtualizaSubscriber conexao = new AtualizaSubscriber(null);
    private String Texto;
    public SecretariaSaude() {
        initComponents();
    }
    
    
    
    public void exibirInformacao(String informacao) {
        String valores[] = informacao.split(";");
        //valores[0] = area
        //valores[1] = nome da function
        //valores[2] = estado do contexto ou informacao relevante
        
        if(valores[1].equals("temperatureMonitor")){
            if(valores[0].equals(1)){
            if(Float.parseFloat(valores[2]) <= 10){
                labelTempA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp1.png")));
                labelTempA1.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 10 && Float.parseFloat(valores[2]) <= 20){
                labelTempA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp2.png")));
                labelTempA1.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 20 && Float.parseFloat(valores[2]) <= 30){
                labelTempA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png")));
                labelTempA1.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 30 && Float.parseFloat(valores[2]) <= 40){
                labelTempA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp4.png")));
                labelTempA1.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 40){
                labelTempA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp5.png")));
                labelTempA1.setText("" + valores[2]);
            }
            }
            if(valores[0].equals(2)){
            if(Float.parseFloat(valores[2]) <= 10){
                labelTempA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp1.png")));
                labelTempA2.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 10 && Float.parseFloat(valores[2]) <= 20){
                labelTempA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp2.png")));
                labelTempA2.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 20 && Float.parseFloat(valores[2]) <= 30){
                labelTempA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png")));
                labelTempA2.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 30 && Float.parseFloat(valores[2]) <= 40){
                labelTempA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp4.png")));
                labelTempA2.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 40){
                labelTempA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp5.png")));
                labelTempA2.setText("" + valores[2]);
            }
            }
            if(valores[0].equals(3)){
            if(Float.parseFloat(valores[2]) <= 10){
                labelTempA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp1.png")));
                labelTempA3.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 10 && Float.parseFloat(valores[2]) <= 20){
                labelTempA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp2.png")));
                labelTempA3.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 20 && Float.parseFloat(valores[2]) <= 30){
                labelTempA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png")));
                labelTempA3.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 30 && Float.parseFloat(valores[2]) <= 40){
                labelTempA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp4.png")));
                labelTempA3.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 40){
                labelTempA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp5.png")));
                labelTempA3.setText("" + valores[2]);
            }
            }
            if(valores[0].equals(4)){
            if(Float.parseFloat(valores[2]) <= 10){
                labelTempA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp1.png")));
                labelTempA4.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 10 && Float.parseFloat(valores[2]) <= 20){
                labelTempA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp2.png")));
                labelTempA4.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 20 && Float.parseFloat(valores[2]) <= 30){
                labelTempA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png")));
                labelTempA4.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 30 && Float.parseFloat(valores[2]) <= 40){
                labelTempA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp4.png")));
                labelTempA4.setText("" + valores[2]);
            }
            else if(Float.parseFloat(valores[2]) > 40){
                labelTempA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp5.png")));
                labelTempA4.setText("" + valores[2]);
            }
            }
        }
        else if(valores[1].equals("beautifulWeather")){
            if(valores[0].equals(1)){
                labelTempA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/sol.png")));
                Texto = Texto + "Tempo Bom na área " + valores[0];
                    jTextArea1.setText("" + Texto);
            }
            if(valores[0].equals(2)){
                labelTempA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/sol.png")));
                Texto = Texto + "Tempo Bom na área " + valores[0];
                    jTextArea1.setText("" + Texto);
            }
            if(valores[0].equals(3)){
                labelTempA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/sol.png")));
                Texto = Texto + "Tempo Bom na área " + valores[0];
                    jTextArea1.setText("" + Texto);
            }
            if(valores[0].equals(4)){
                labelTempA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/sol.png")));
                Texto = Texto + "Tempo Bom na área " + valores[0];
                    jTextArea1.setText("" + Texto);
            }
        }
        else if(valores[1].equals("hotDryMonitor")){
            if(valores[0].equals(1)){
                labelSolA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon.png")));
                Texto = Texto + "Tempo quente e seco na área " + valores[0];
                jTextArea1.setText("" + Texto);
            }
            if(valores[0].equals(2)){
                labelSolA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon.png")));
                Texto = Texto + "Tempo quente e seco na área " + valores[0];
                jTextArea1.setText("" + Texto);
            }
            if(valores[0].equals(3)){
                labelSolA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon.png")));
                Texto = Texto + "Tempo quente e seco na área " + valores[0];
                jTextArea1.setText("" + Texto);
            }
            if(valores[0].equals(4)){
                labelSolA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon.png")));
                Texto = Texto + "Tempo quente e seco na área " + valores[0];
                jTextArea1.setText("" + Texto);
            }
            
        }
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelRuimA1 = new javax.swing.JLabel();
        labelTempA1 = new javax.swing.JLabel();
        labelSolA1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelRuimA2 = new javax.swing.JLabel();
        labelTempA2 = new javax.swing.JLabel();
        labelSolA2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        labelRuimA3 = new javax.swing.JLabel();
        labelTempA3 = new javax.swing.JLabel();
        labelSolA3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelRuimA4 = new javax.swing.JLabel();
        labelTempA4 = new javax.swing.JLabel();
        labelSolA4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/subscribers3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jButton1.setText("Desconectado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Clique para se conectar ao Hub");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 1"));

        labelRuimA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png"))); // NOI18N

        labelTempA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png"))); // NOI18N
        labelTempA1.setText("0");

        labelSolA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Semsol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRuimA1)
                .addGap(18, 18, 18)
                .addComponent(labelTempA1)
                .addGap(18, 18, 18)
                .addComponent(labelSolA1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSolA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTempA1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelRuimA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 1"));

        labelRuimA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png"))); // NOI18N

        labelTempA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png"))); // NOI18N
        labelTempA2.setText("0");

        labelSolA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Semsol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRuimA2)
                .addGap(18, 18, 18)
                .addComponent(labelTempA2)
                .addGap(18, 18, 18)
                .addComponent(labelSolA2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSolA2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelTempA2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelRuimA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 1"));

        labelRuimA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png"))); // NOI18N

        labelTempA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png"))); // NOI18N
        labelTempA3.setText("0");

        labelSolA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Semsol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRuimA3)
                .addGap(18, 18, 18)
                .addComponent(labelTempA3)
                .addGap(18, 18, 18)
                .addComponent(labelSolA3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSolA3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelTempA3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelRuimA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 1"));

        labelRuimA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png"))); // NOI18N

        labelTempA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png"))); // NOI18N
        labelTempA4.setText("0");

        labelSolA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Semsol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRuimA4)
                .addGap(18, 18, 18)
                .addComponent(labelTempA4)
                .addGap(18, 18, 18)
                .addComponent(labelSolA4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSolA4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelTempA4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelRuimA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jButton1.getText() == "OFF"){
            conexao.subscribe();
            jButton1.setText("ON");
            jButton1.setBackground(Color.GREEN);
            jButton1.setForeground(Color.RED);
            jLabel2.setText("Clique para se desconectar do Hub");
        }else{
            conexao.unsubscribe();
            labelRuimA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png")));
            labelTempA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png")));
            labelSolA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png")));
            labelRuimA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png")));
            labelTempA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png")));
            labelSolA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png")));
            labelRuimA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png")));
            labelTempA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png")));
            labelSolA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png")));
            labelRuimA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png")));
            labelTempA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/temp3.png")));
            labelSolA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/eyes-on-fire-icon-sem.png")));
            jButton1.setText("OFF");
            jButton1.setBackground(Color.RED);
            jButton1.setForeground(Color.GREEN);
            jLabel2.setText("Clique para se conectar ao Hub");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SecretariaSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretariaSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretariaSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretariaSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretariaSaude().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelRuimA1;
    private javax.swing.JLabel labelRuimA2;
    private javax.swing.JLabel labelRuimA3;
    private javax.swing.JLabel labelRuimA4;
    private javax.swing.JLabel labelSolA1;
    private javax.swing.JLabel labelSolA2;
    private javax.swing.JLabel labelSolA3;
    private javax.swing.JLabel labelSolA4;
    private javax.swing.JLabel labelTempA1;
    private javax.swing.JLabel labelTempA2;
    private javax.swing.JLabel labelTempA3;
    private javax.swing.JLabel labelTempA4;
    // End of variables declaration//GEN-END:variables
}
