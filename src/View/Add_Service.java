/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Pkkg
 */
public class Add_Service extends javax.swing.JFrame {

    /**
     * Creates new form Add_Service
     */
    public Add_Service() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmb_type = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txt_update_price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_update_id = new javax.swing.JTextField();
        txt_update_name = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_id_delete = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(45, 118, 232));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Kelso Lanka(Pvt)Ltd.");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/navigation.png"))); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sales Management");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Webp.net-resizeimage (3).png"))); // NOI18N

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_name.setText("Username");

        lbl_type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_type.setText("Type");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel2))
                .addContainerGap(1602, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_type)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_type)
                            .addComponent(lbl_name)))))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 397, 167, -1));

        jLabel5.setText("Service Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 400, -1, -1));
        getContentPane().add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 450, 167, -1));

        jLabel6.setText("Service Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 453, -1, -1));

        jLabel7.setText("Service Type");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 505, -1, -1));

        cmb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Service", "Wash" }));
        getContentPane().add(cmb_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 502, 167, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 265, 550, 440));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backnew.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 246, -1, -1));

        jButton1.setText("Add Service");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, -1, -1));

        jButton2.setText("Clear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 80, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 377, 167, -1));

        jLabel10.setText("Service ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 351, -1, -1));

        txt_id.setEditable(false);
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 348, 167, -1));

        jPanel1.setBackground(new java.awt.Color(45, 118, 232));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Service_Price");

        jLabel8.setText("Service_Name");

        jLabel4.setText("Service_ID");

        txt_update_id.setEditable(false);

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(txt_update_id, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_update_name, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_update_price, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_update_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_update_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_update_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 260, 330, 210));

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Service_ID");

        txt_id_delete.setEditable(false);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(txt_id_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_id_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButton3)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, 330, 210));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 String name,type;
 Connection con;
    void get_user_details()
    {
        name=lbl_name.getText();
        type=lbl_type.getText();
    }
    public Add_Service(String name,String type)
    {
        initComponents();
       lbl_name.setText(name);
       lbl_type.setText(type);
       lbl_name.setVisible(true);
       lbl_type.setVisible(true);
    }
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       
        new Admin_Menu(name, type).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
get_user_details();


        try {
            view();
            getid();
        } catch (Exception ex) {
            Logger.getLogger(Add_Service.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened
void getid() throws Exception
    {
       try
        {
          con= DB.createConnection();
          String id="select MAX(service_id) AS Max_id from service";
       PreparedStatement   pst=con.prepareStatement(id);
          ResultSet rst=pst.executeQuery(id);
          rst.next();
          int newid=0;
          newid=rst.getInt(1);
          newid=newid+1;
          txt_id.setText(newid+"");
          
          
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error While Getting ID from The Database");
        }        
    }
void delete_service()
{
     try 
            {
                Connection con = DB.createConnection();
                String sql = "delete from `service` where Service_id='"+txt_id_delete.getText()+"'";
                PreparedStatement stmt = con.prepareStatement(sql);
                int i = stmt.executeUpdate();

                if (i == 1) 
                {
                    JOptionPane.showMessageDialog(this, "Successfully Deleted the Service", "Done", JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Cannot Delete the Service. Try Again","Error  ",JOptionPane.ERROR_MESSAGE);
                }

            } 
            
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this,"Database Error. Please Try Again","Database Error",JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(this,"Please Try Again","Error  " + e,JOptionPane.ERROR_MESSAGE);
            }
}
void update_service()
{
    try 
            {
                Connection con = DB.createConnection();
                String sql = "Update service set Service_name='"+txt_update_name.getText()+"',Service_price='"+txt_update_price.getText()+"' where Service_id='"+txt_update_id.getText()+"'";
                PreparedStatement stmt = con.prepareStatement(sql);
                int i = stmt.executeUpdate();

                if (i == 1) 
                {
                    JOptionPane.showMessageDialog(this, "Successfully Updated Service Details", "Done", JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Cannot Update Service Details. Try Again","Error  ",JOptionPane.ERROR_MESSAGE);
                }

            } 
            
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this,"Database Error. Please Try Again","Database Error",JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(this,"Please Try Again","Error  " + e,JOptionPane.ERROR_MESSAGE);
            }
    
    
}


 void Add_Service()
{
  
    
    
    try 
            {
                Connection con = DB.createConnection();
                String sql = "Insert into service (Service_id,Service_name,Service_price,service_category) values('"+txt_id.getText()+"','"+txt_name.getText()+"','"+txt_price.getText()+"','"+cmb_type.getSelectedItem().toString()+"')";
                PreparedStatement stmt = con.prepareStatement(sql);
                int i = stmt.executeUpdate();

                if (i == 1) 
                {
                    JOptionPane.showMessageDialog(this, "Successfully Added a New Service.", "Done", JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Cannot Add Service. Try Again","Error  ",JOptionPane.ERROR_MESSAGE);
                }

            } 
            
            catch(SQLException e)
            {JOptionPane.showMessageDialog(null,e);
               // JOptionPane.showMessageDialog(this,"Database Error. Please Try Again","Database Error",JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(this,"Please Try Again","Error  " + e,JOptionPane.ERROR_MESSAGE);
            }
            
}
  void view() throws Exception
{
    try
        {
         
       Connection con = DB.createConnection();
                Statement st = con.createStatement();
                String sql = "select * from service  ORDER BY Service_id  ";
        ResultSet rst = st.executeQuery(sql);
         
         DefaultTableModel model=new DefaultTableModel(new String[]{"Service_id","Service_name","Service_price","service_category"},0);
         
          while (rst.next()){
         Vector vec = new Vector();
         
         vec.add(rst.getString("Service_id"));
         vec.add(rst.getString("Service_name"));
         vec.add(rst.getString("Service_price"));
         vec.add(rst.getString("service_category"));
       
        
         model.addRow(vec);
         table.setModel(model);
        
          
         }
         
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Database Error !!");
        }
}
  void vali_update()
  {try
  {  if(txt_update_id.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null,"ID Cannot Be Null");
      }
   else  if(txt_update_name.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null,"Name Cannot Be Null");
      }
      else if(!Pattern.matches("[a-zA-Z]+", txt_update_name.getText()))
      {
          JOptionPane.showMessageDialog(null,"Name Cannot Include Numbers");
      }
     
      else if(txt_update_price.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null,"Price Cannot Be Null ");
      }
      else if((Integer.parseInt(txt_update_price.getText()))<0)
      {
          JOptionPane.showMessageDialog(null,"Price Cannot be Negative");
      }
      
      
      
      else
      {
          Integer.parseInt(txt_update_price.getText());
          update_service();
      } 
  }
     catch(NumberFormatException ex)
     {
         JOptionPane.showMessageDialog(null,"Price Cannot Include Letters ");
     }
          
  }
  void vali_delete()
  {
      if(txt_update_id.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null,"ID Cannot Be Null");
      }
      else
      {
          delete_service();
      }
      
  }
  void clear_txt()
  {
      txt_name.setText("");
      txt_price.setText("");
      get_user_details();
      
  }
          
  void vali_add_service()
  {try
  { if(txt_id.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null,"ID Cannot Be Null");
      }
   else if(txt_name.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null,"Name Cannot Be Null");
      }
     else if(!Pattern.matches("[a-zA-Z]+", txt_name.getText()))
      {
          JOptionPane.showMessageDialog(null,"Name Can Be Only Letters");
      }
     else if(txt_price.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null,"Price Cannot Be Null ");
      }
      else if(Pattern.matches("[a-zA-Z]+", txt_price.getText()))
      {
          JOptionPane.showMessageDialog(null,"Price Cannot Include Letters");
      }
      
      
      else if((Integer.parseInt(txt_price.getText()))<0)
      {
          JOptionPane.showMessageDialog(null,"Price Cannot be Negative");
      }
     
      else
      {  int price=Integer.parseInt(txt_price.getText());
           Add_Service();
      }  
  }
      catch(NumberFormatException ex)
      {
          JOptionPane.showMessageDialog(null,"Price Cannot Include Letters");
      }
  }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     vali_add_service();
    
        try {
            view();
            getid();
        } catch (Exception ex) {
            Logger.getLogger(Add_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        clear_txt();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
int i = table.getSelectedRow();
        TableModel model = table.getModel();
        txt_update_id.setText((String) model.getValueAt(i, 0)); 
             txt_id_delete.setText((String) model.getValueAt(i, 0));        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    vali_update();
        try {
            view();
        } catch (Exception ex) {
            Logger.getLogger(Add_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    vali_delete();
        try {
            view();
        } catch (Exception ex) {
            Logger.getLogger(Add_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        get_user_details();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
clear_txt();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Add_Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Service().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_type;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_id_delete;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_update_id;
    private javax.swing.JTextField txt_update_name;
    private javax.swing.JTextField txt_update_price;
    // End of variables declaration//GEN-END:variables
}
