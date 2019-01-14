/*  Gestionale D&D
    Copyright (C) 2019  Manuel Ceroni

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.*/
package ddgestionale;

import java.io.*;
import javax.swing.JFrame;

public class CaricaPG extends javax.swing.JFrame 
{
    Finestra f;
    private Pg[] m = new Pg[1000];
    private char[] v;
    public CaricaPG()
    {
        initComponents();
        this.setLocationRelativeTo(this);
        setTextDefault();
        this.setTitle("Gestionale D&D - Configurazione gruppo base");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Fatto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("In questa schermata è necessario inserire i Pg che fanno\nparte del gruppo. Si inseriscono con \"nome iniziativaBase\" e \npoi andare a capo. N.B i nomi devono essere attaccati! Es.\nSifer 7\nNelfio 5");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void setTextDefault()
    {
        try
        {
            DataInputStream datiDaLeggere = new DataInputStream(new FileInputStream("./gruppo.txt"));
            String nome = "";
            while(datiDaLeggere.available()>0)
            {
                nome = nome + (char)datiDaLeggere.readByte();
            }
            datiDaLeggere.close();
            this.jTextArea1.setText(nome);
        }catch(IOException e)
        {
            System.out.print(e);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String prova = this.jTextArea1.getText();
        int contatore = 0;
        String[] words = prova.split("\\W+");
        try
        {
            for(int i = 0; i < words.length; i++)
            {
                if(i%2 != 0)
                {
                    m[contatore] = new Pg(words[i-1], Integer.parseInt(words[i]));
                    contatore++;
                }
            }
            DataOutputStream datiDaSalvare;
            try 
            {
                datiDaSalvare = new DataOutputStream(new FileOutputStream("./gruppo.txt"));
                datiDaSalvare.writeBytes(this.jTextArea1.getText());
                this.setVisible(false);
                f = new Finestra(m,contatore);
            }catch (IOException ex) {
                System.out.println(ex);
            }
        }catch(NumberFormatException e)
        {
            System.out.println("Da implementare");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
