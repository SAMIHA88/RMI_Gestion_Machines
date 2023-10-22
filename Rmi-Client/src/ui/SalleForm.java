/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author Samih
 */
import dao.IDao;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class SalleForm extends javax.swing.JInternalFrame {
    private int idSalle;
   IDao<Salle> daos=null ;
    DefaultTableModel models ;
    private static int id;
    /**
     * Creates new form SalleForm
     */
  
    public SalleForm() {
        initComponents();
        try {
            daos = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/daos");
        } catch (NotBoundException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
           models = (DefaultTableModel) listeSalle.getModel();
        loadSalle();

    }
  public void loadSalle (){
        models.setRowCount(0);
       try {
           for(Salle s : daos.findAll())
               models.addRow(new Object[]{
                   s.getId(),
                   s.getCode(),
                       s.getLibelle()
               });
       } catch (RemoteException ex) {
           Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtcode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Addbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        supprimerbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtlibelle = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeSalle = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Information des salles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 3, 13))); // NOI18N

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 13)); // NOI18N
        jLabel1.setText("Code :");

        Addbtn.setBackground(new java.awt.Color(0, 102, 51));
        Addbtn.setFont(new java.awt.Font("MV Boli", 3, 13)); // NOI18N
        Addbtn.setText("Ajouter");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 0, 204));
        jButton2.setFont(new java.awt.Font("MV Boli", 3, 13)); // NOI18N
        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        supprimerbtn.setBackground(new java.awt.Color(204, 51, 0));
        supprimerbtn.setFont(new java.awt.Font("MV Boli", 3, 13)); // NOI18N
        supprimerbtn.setText("Supprimer");
        supprimerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 13)); // NOI18N
        jLabel2.setText("Libelle :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcode, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(txtlibelle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supprimerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtlibelle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Addbtn)
                    .addComponent(jButton2)
                    .addComponent(supprimerbtn))
                .addGap(34, 34, 34))
        );

        listeSalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Code", "Libelle"
            }
        ));
        listeSalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeSalleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listeSalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleName("Informations des salles");

        getAccessibleContext().setAccessibleName("G - Salle");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listeSalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeSalleMouseClicked
        // TODO add your handling code here:
         id = Integer.parseInt(models.getValueAt(listeSalle.getSelectedRow(), 0).toString());
        txtcode.setText(models.getValueAt(listeSalle.getSelectedRow(), 1).toString());
        txtlibelle.setText(models.getValueAt(listeSalle.getSelectedRow(),2).toString());
    }//GEN-LAST:event_listeSalleMouseClicked

    private void supprimerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerbtnActionPerformed
        // TODO add your handling code here:
        try{
            int reponse=JOptionPane.showConfirmDialog(this, "Voulez-vous Vraiment supprimer cette salle?");
            if(reponse==0 & id!=0){
                
            Salle m = daos.findById(id);
            daos.delete(m);
            loadSalle();
            }
        }  catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_supprimerbtnActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
        try{
            String code = txtcode.getText().toString();
             String libelle = txtlibelle.getText().toString();
            daos.create(new Salle(code,libelle));
            loadSalle();
        }catch(RemoteException ex){
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_AddbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            
            String code = txtcode.getText().toString();
             String libelle = txtlibelle.getText().toString();
            daos.update(new Salle(id,code,libelle));
            loadSalle();
        }catch(RemoteException ex){
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable listeSalle;
    private javax.swing.JButton supprimerbtn;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtlibelle;
    // End of variables declaration//GEN-END:variables
}
