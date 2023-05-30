package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author ak542
 */
public class BloodIndex extends javax.swing.JFrame {
static int flag1=0,flag2=0,flag3=0;
    /**
     * Creates new form BloodIndex
     */
    public BloodIndex() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        scount = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ap = new javax.swing.JLabel();
        an = new javax.swing.JLabel();
        bp = new javax.swing.JLabel();
        bn = new javax.swing.JLabel();
        op = new javax.swing.JLabel();
        on = new javax.swing.JLabel();
        abp = new javax.swing.JLabel();
        abn = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        bg = new javax.swing.JComboBox<>();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        nerror = new javax.swing.JLabel();
        aerror = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eerror = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        scount.setTitle("Count ");
        scount.setAlwaysOnTop(true);
        scount.setResizable(false);
        scount.setSize(new java.awt.Dimension(352, 352));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("A+");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("A-");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("B+");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("B-");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("O+");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("O-");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("AB+");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("AB-");

        ap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ap.setText("jLabel15");

        an.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        an.setText("jLabel16");

        bp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bp.setText("jLabel17");

        bn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bn.setText("jLabel18");

        op.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        op.setText("jLabel19");

        on.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        on.setText("jLabel20");

        abp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        abp.setText("jLabel21");

        abn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        abn.setText("jLabel22");

        javax.swing.GroupLayout scountLayout = new javax.swing.GroupLayout(scount.getContentPane());
        scount.getContentPane().setLayout(scountLayout);
        scountLayout.setHorizontalGroup(
            scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scountLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ap)
                    .addComponent(an)
                    .addComponent(bp)
                    .addComponent(bn)
                    .addComponent(op)
                    .addComponent(on)
                    .addComponent(abp)
                    .addComponent(abn))
                .addGap(68, 68, 68))
        );
        scountLayout.setVerticalGroup(
            scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(scountLayout.createSequentialGroup()
                        .addGroup(scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(ap))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(an))
                .addGap(18, 18, 18)
                .addGroup(scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(bp))
                .addGap(18, 18, 18)
                .addGroup(scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(bn))
                .addGap(18, 18, 18)
                .addGroup(scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(op))
                .addGap(18, 18, 18)
                .addGroup(scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(on))
                .addGap(18, 18, 18)
                .addGroup(scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(abp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(scountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(abn))
                .addGap(45, 45, 45))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Age");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Blood Group");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Gender");

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });

        age.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageKeyReleased(evt);
            }
        });

        address.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        bg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Group", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        buttonGroup1.add(r1);
        r1.setText("Male");

        buttonGroup1.add(r2);
        r2.setText("Female");

        jButton2.setText("Show Count");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        nerror.setForeground(new java.awt.Color(255, 0, 51));
        nerror.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nerrorKeyReleased(evt);
            }
        });

        aerror.setForeground(new java.awt.Color(255, 0, 0));
        aerror.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aerrorKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Email ");

        eerror.setForeground(new java.awt.Color(255, 0, 51));

        email.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name)
                            .addComponent(address)
                            .addComponent(age)
                            .addComponent(bg, 0, 166, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r1)
                                .addGap(18, 18, 18)
                                .addComponent(r2))
                            .addComponent(email))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nerror)
                                    .addComponent(eerror)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aerror)))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(nerror)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(aerror))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(r1)
                    .addComponent(r2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eerror)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
    String PATTERN="^[a-zA-Z]{5,30}$";
    Pattern pt=Pattern.compile(PATTERN);
    Matcher match=pt.matcher(name.getText());
    if(!match.matches())
    {
        nerror.setText("INVALID INPUT");
        flag1=0;
    }
    else
    {
        nerror.setText(null);
        flag1=1;
    }      
    }//GEN-LAST:event_nameKeyReleased

    private void ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyReleased
    if(age.getText()!=null)
    {
        int x=  Integer.valueOf(age.getText());
        if(x<18 || x>50)
        {
            aerror.setText("Enter Between 18 & 50");
            flag2=0;
        }
        else
        {
            aerror.setText(null); 
            flag2=1;
        }
    }
   
    }//GEN-LAST:event_ageKeyReleased

    private void aerrorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aerrorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_aerrorKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(name.getText()==null || age.getText()==null || address.getText()==null || bg.getSelectedIndex()==0 )
      {
          JOptionPane.showMessageDialog(null,"Some Fields are not Filled\nPlease Fill Them"); 
      }
      else if(!r1.isSelected() && !r2.isSelected())
      {
          JOptionPane.showMessageDialog(null,"Some Fields are not Filled\nPlease Fill Them"); 
      }
      else if(flag1==0||flag2==0||flag3==0)
      {
          JOptionPane.showMessageDialog(null,"Invalid Inputs"); 
      }
      else
      {
        
          String pname=name.getText();
          String page=age.getText();
          String paddress=address.getText();
          String bgroup=(String) bg.getSelectedItem();
          String gender="";
          if(r1.isSelected())
          {
          gender=r1.getText();
          }
          else
          {
          gender=r2.getText();
          }
          String emaill=email.getText();
          
          String url="jdbc:derby://localhost:1527/blood_donation";
          String pass="root";
          String user="root";
          try{
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          Connection con=DriverManager.getConnection(url,user,pass);
          Statement stmt=con.createStatement();
          stmt.executeUpdate("insert into khoondaan values('"+pname+"','"+page+"','"+paddress+"','"+bgroup+"','"+gender+"','"+emaill+"',NEXT VALUE FOR pid)");
          ResultSet rs=stmt.executeQuery("select id from khoondaan where email='"+emaill+"' and name='"+pname+"'");
          if(rs.next())
          {
              JOptionPane.showMessageDialog(null,"Name = "+pname+"\nUnique id = "+rs.getInt("id")+"\nDetails Submitted Succesfully");
          }
          con.close();
          
          }
          catch(Exception ae)
          {
          System.out.println(ae);    
          }
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
    
    }//GEN-LAST:event_nameActionPerformed

    private void nerrorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nerrorKeyReleased
     
    }//GEN-LAST:event_nerrorKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
    String PATTERN="^[a-zA-Z0-9]{2,30}[@][a-zA-Z]{1,10}[.][a-zA-Z]{1,5}$";
    Pattern pt=Pattern.compile(PATTERN);
    Matcher match=pt.matcher(email.getText());
    if(!match.matches())
    {
        eerror.setText("INVALID INPUT");
         flag3=0;
    }
    else
    {       eerror.setText(null);
         flag3=1;
    }      
    
    }//GEN-LAST:event_emailKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String url="jdbc:derby://localhost:1527/blood_donation";
          String pass="root";
          String user="root";
          try{
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          Connection con=DriverManager.getConnection(url,user,pass);
          Statement stmt=con.createStatement();
          ResultSet r1=stmt.executeQuery("select count(*) from khoondaan where bgroup='A+'");
          if(r1.next())
          {ap.setText(String.valueOf(r1.getInt(1)));}
          ResultSet r2=stmt.executeQuery("select count(*) from khoondaan where bgroup='A-'");
          if(r2.next())
          {an.setText(String.valueOf(r2.getInt(1)));}
          ResultSet r3=stmt.executeQuery("select count(*) from khoondaan where bgroup='B+'");
          if(r3.next())
          {bp.setText(String.valueOf(r3.getInt(1)));}
          ResultSet r4=stmt.executeQuery("select count(*) from khoondaan where bgroup='B-'");
          if(r4.next())
          {bn.setText(String.valueOf(r4.getInt(1)));}
          ResultSet r5=stmt.executeQuery("select count(*) from khoondaan where bgroup='O+'");
          if(r5.next())
          {op.setText(String.valueOf(r5.getInt(1)));}
          ResultSet r6=stmt.executeQuery("select count(*) from khoondaan where bgroup='O-'");
          if(r6.next())
          {on.setText(String.valueOf(r6.getInt(1)));}
          ResultSet r7=stmt.executeQuery("select count(*) from khoondaan where bgroup='AB+'");
          if(r7.next())
          {abp.setText(String.valueOf(r7.getInt(1)));}
          ResultSet r8=stmt.executeQuery("select count(*) from khoondaan where bgroup='AB-'");
          if(r8.next())
          {abn.setText(String.valueOf(r8.getInt(1)));}
         
          con.close();
          
          }
          catch(Exception ae)
          {
          System.out.println(ae);    
          }
        scount.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BloodIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abn;
    private javax.swing.JLabel abp;
    private javax.swing.JTextField address;
    private javax.swing.JLabel aerror;
    private javax.swing.JTextField age;
    private javax.swing.JLabel an;
    private javax.swing.JLabel ap;
    private javax.swing.JComboBox<String> bg;
    private javax.swing.JLabel bn;
    private javax.swing.JLabel bp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel eerror;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nerror;
    private javax.swing.JLabel on;
    private javax.swing.JLabel op;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JDialog scount;
    // End of variables declaration//GEN-END:variables
}
