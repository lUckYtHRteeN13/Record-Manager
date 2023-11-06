/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JFileChooser;
/**
 *
 * @author lucky13
 */
public class Main extends javax.swing.JFrame {
    /**
     *  The color White.
     *      In the default sRGB space.
     */
    public static final Color WHITE = new Color(255,255,255);

    /**
     * The color gray.
     *      In the default sRGB space.
     */
    public static final Color GRAY = new Color(128, 128, 128);
    
    /**
    *  The state of user.
    *       (Default) is <code>false</code> 
    *       Since the user is not viewing the record.
    * 
    *       Will be <code>true</code> if the user
    *       is viewing the record.
    */
    private boolean VIEW;
    
    /**
    *  The state of user.
    *       (Default) is <code>false</code> 
    *       Since the user is not editing the record.
    * 
    *       Will be <code>true</code> if the user
    *       is editing the record.
    */
    private boolean EDIT;
    
    /**
    *  The state of user.
    *       (Default) is <code>false</code>.
    *       Since the user is not adding record.
    * 
    *       Will be <code>true</code> if the user
    *       is adding to the record.
    */
    private boolean ADD;
    
    /**
     * Current index or size of your array.
     *      (Default) is 0.
     * 
     *      As you <B>Add</B> or <B>Delete</B> a record
     *      it will <I>increment</I> or <I>decrement</I>.
     */
    private int index;
    
    /**
     * The current position of the user.
     *      (Default) is 0.
     * 
     *      <B>Increments</B> or <B>Decrements</B> depending
     *      on wether the user is navigating
     *      <I>forward</I> or <I>backward</I>.
     */
    private int navigator;    

    /**
     * An Array of names. 
     *      Any array containing a list of names.
     */
    private String[] names;
    
    /**
     * An Array of images.
     *      Any array containing a list of images relative to the names.
     */
    private Icon[] images;

    /**
     * Creates new form Main
     */
    public Main() {
        this.images = new Icon[5];
        this.names = new String[5];
        
        this.navigator = 0;
        this.index = 0;
        this.ADD = false;
        this.EDIT = false;
        this.VIEW = false;
        
        initComponents();
    }
    
    /**
     *  Shows the data or record.
     *      It sets the name while viewing the record.
     *      It sets the icon or image while viewing the record.
     */
    private void view() {
        this.nameTF.setText(names[navigator]);
        this.image.setIcon(images[navigator]);
    }
    
    /**
     * @param name (String) - the name that the user has inputted.
     * @param img (Icon) - the image that the user has inputted.
     * @param i (Integer) - the nth number of where the information will be saved.
     * 
     *      Saves the given information (name, img) to the appropriate index
     *      of the arrays (names, images) if the name is not blank
     */
    private void save(String name, Icon img, int i) {
        if ((!name.isBlank())) {
            this.names[i] = name;
            this.images[i] = img;
        }
    }
    
    /**
     * @param name (String) - the name that the user has inputted.
     * @param img (Icon) - the image that the user has inputted.
     * 
     *      Calls or runs the save method to override (replace) the information
     *      given in the current position of the user.
     */
    private void edit(String name, Icon img) {
        this.save(name, img, this.navigator);
    }
    
    /**
     * Performs the enabling and disabling of navigation buttons.
     *      if navigator is less than number of elements - 1,
     *      enable next and last buttons, otherwise disable
     * 
     *      if navigator is greater than or equal to one,
     *      enable the previous and first buttons, otherwise disable.
     */
    private void doNavigate() {
        this.viewBtn.setEnabled(true);
        
        if (this.navigator < this.index - 1) {
            this.nextBtn.setEnabled(true);
            this.lastBtn.setEnabled(true);
        } else {
            this.nextBtn.setEnabled(false);
            this.lastBtn.setEnabled(false);
        }
        
        if (navigator >= 1) {
            prevBtn.setEnabled(true);
            this.firstBtn.setEnabled(true);
        } else {
            prevBtn.setEnabled(false);
            this.firstBtn.setEnabled(false);
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

        title = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        firstBtn = new javax.swing.JButton();
        prevBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        lastBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        title.setText("RECORD MANAGEMENT SYSTEM");
        getContentPane().add(title);
        title.setBounds(50, 10, 400, 28);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        image.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        image.setPreferredSize(new java.awt.Dimension(100, 100));
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
        });
        getContentPane().add(image);
        image.setBounds(170, 80, 150, 150);

        nameTF.setBackground(new java.awt.Color(204, 204, 204));
        nameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nameTF.setEnabled(false);
        getContentPane().add(nameTF);
        nameTF.setBounds(100, 260, 290, 50);

        saveBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        saveBtn.setText("SAVE");
        saveBtn.setEnabled(false);
        saveBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn);
        saveBtn.setBounds(250, 420, 90, 80);

        firstBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        firstBtn.setText("FIRST");
        firstBtn.setEnabled(false);
        firstBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        firstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnActionPerformed(evt);
            }
        });
        getContentPane().add(firstBtn);
        firstBtn.setBounds(50, 340, 80, 40);

        prevBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        prevBtn.setText("PREV");
        prevBtn.setEnabled(false);
        prevBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });
        getContentPane().add(prevBtn);
        prevBtn.setBounds(130, 340, 80, 40);

        viewBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        viewBtn.setText("VIEW");
        viewBtn.setEnabled(false);
        viewBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewBtn);
        viewBtn.setBounds(210, 340, 80, 40);

        nextBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        nextBtn.setText("NEXT");
        nextBtn.setEnabled(false);
        nextBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextBtn);
        nextBtn.setBounds(290, 340, 80, 40);

        lastBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        lastBtn.setText("LAST");
        lastBtn.setEnabled(false);
        lastBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lastBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnActionPerformed(evt);
            }
        });
        getContentPane().add(lastBtn);
        lastBtn.setBounds(370, 340, 80, 40);

        addBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        addBtn.setText("ADD");
        addBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn);
        addBtn.setBounds(160, 420, 90, 80);

        searchBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        searchBtn.setText("SEARCH");
        searchBtn.setEnabled(false);
        searchBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn);
        searchBtn.setBounds(160, 580, 180, 40);

        editBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        editBtn.setText("EDIT");
        editBtn.setEnabled(false);
        editBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editBtn);
        editBtn.setBounds(160, 500, 90, 80);

        deleteBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setEnabled(false);
        deleteBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn);
        deleteBtn.setBounds(250, 500, 90, 80);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (this.ADD) {
            if ((!this.nameTF.getText().isBlank())) {
                save(nameTF.getText(), this.image.getIcon(), this.index);
                this.index++;
            }

            if (this.index == this.names.length) {
                this.addBtn.setEnabled(false);
            } else {
                this.addBtn.setEnabled(true);
            }
            
            this.nameTF.setBackground(Main.GRAY);        
            this.nameTF.setEnabled(false);        
            this.nameTF.setText("");
            this.image.setIcon(null);
            this.ADD = false;
            
        } else if (EDIT) {
            this.edit(nameTF.getText(), this.image.getIcon());
            this.editBtn.setEnabled(true);
            this.deleteBtn.setEnabled(false);
            this.nameTF.setEditable(false);
            this.nameTF.setFocusable(false);
            this.EDIT = false;
            this.doNavigate();
        }
        
        if (this.index != 0) {
            this.viewBtn.setEnabled(true);
        }
        this.saveBtn.setEnabled(false);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void firstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnActionPerformed
        // TODO add your handling code here:
        navigator = 0;
        this.doNavigate();
        view();
    }//GEN-LAST:event_firstBtnActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        // TODO add your handling code here: 
        this.navigator --;
        this.doNavigate();
        this.view();
    }//GEN-LAST:event_prevBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        if (!this.VIEW && (this.index >= 1)) {
            this.VIEW = true;
            
            this.nameTF.setEnabled(true);
            this.nameTF.setEditable(false);
            this.nameTF.setFocusable(false);
            this.nameTF.setBackground(WHITE);
            
            this.addBtn.setEnabled(false);
            
            if (this.index >= 2) {
                this.doNavigate();
            }
            this.editBtn.setEnabled(true);
            view();
            
        } else {
            this.VIEW = false;
            
            this.nameTF.setText("");
            this.nameTF.setEnabled(false);
            this.nameTF.setEditable(true);
            this.nameTF.setFocusable(true);
            this.nameTF.setBackground(GRAY);
            
            if (this.index ==this. names.length) {
                this.addBtn.setEnabled(false);  
                
            } else {
                this.addBtn.setEnabled(true);            
            }
            
            this.nextBtn.setEnabled(false);
            this.lastBtn.setEnabled(false);
            this.firstBtn.setEnabled(false);
            this.prevBtn.setEnabled(false);
            this.editBtn.setEnabled(false);
            this.image.setIcon(null);
            
            this.navigator = 0;
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        navigator++;
        
        this.doNavigate();        
        view();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void lastBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnActionPerformed
        // TODO add your handling code here:
        navigator = index-1;
        this.doNavigate();
        view();
    }//GEN-LAST:event_lastBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        viewBtn.setEnabled(false);
        addBtn.setEnabled(false);
        saveBtn.setEnabled(true);
        nameTF.setEnabled(true);
        nameTF.setBackground(WHITE);
        ADD = true;
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        if (!EDIT) {
            this.nameTF.setBackground(WHITE);
            this.nameTF.setEnabled(true);
            this.nameTF.setFocusable(true);
            this.nameTF.setEditable(true);
            
            this.nextBtn.setEnabled(false);
            this.prevBtn.setEnabled(false);
            this.lastBtn.setEnabled(false);
            this.firstBtn.setEnabled(false);
            this.viewBtn.setEnabled(false);
            this.editBtn.setEnabled(false);
            this.saveBtn.setEnabled(true);
            this.deleteBtn.setEnabled(true);
            this.EDIT = true;
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("--Delte--");
        this.image.setIcon(null);
        this.nameTF.setText(null);
        this.images[navigator] = this.image.getIcon();
        this.names[navigator] = this.nameTF.getText();
        this.index--;

        for (int i = navigator; i < index; i++) {
          this.images[i] = this.images[i+1];
          this.names[i] = this.names[i+1];
        }
        
        if (this.navigator > 0) {
            this.navigator--;
        }
        
        if (this.index == 0) {
            this.VIEW = false;
            
            this.viewBtn.setEnabled(false);
            this.addBtn.setEnabled(true);
            this.nameTF.setEnabled(false);
        } else {
            this.viewBtn.setEnabled(true);
            
            this.editBtn.setEnabled(true);
            this.nameTF.setEditable(false);
            this.nameTF.setFocusable(false);
            this.doNavigate();
            this.view();
        }
        
        this.saveBtn.setEnabled(false);
        this.deleteBtn.setEnabled(false);
        this.EDIT = false;
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
        // TODO add your handling code here:
        if (this.ADD || this.EDIT) {
            JFileChooser fileChooser = new javax.swing.JFileChooser();
            fileChooser.setVisible(true);
            fileChooser.showOpenDialog(this);
            Icon icon = new javax.swing.ImageIcon(fileChooser.getSelectedFile().toPath().toString());
            this.image.setIcon(icon);
        }
    }//GEN-LAST:event_imageMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton firstBtn;
    private javax.swing.JLabel image;
    private javax.swing.JButton lastBtn;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton prevBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel title;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
