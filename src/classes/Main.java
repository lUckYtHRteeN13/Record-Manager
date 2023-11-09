/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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
    private int numberOfElements;
    
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
     *      Default size is 5
     */
    private String[] names;
    
    /**
     * An Array of images.
     *      Any array containing a list of images relative to the names.
     *      Default size is 5
     */
    private Icon[] images;

    /**
     * Creates new form Main
     */
    public Main() {
        this.images = new Icon[5];
        this.names = new String[5];
        
        this.navigator = 0;
        this.numberOfElements = 0;
        this.ADD = false;
        this.EDIT = false;
        this.VIEW = false;
        
        initComponents();
    }
    
    /**
     *  Shows the data or record.
     *      It sets the name while viewing the record.
     *      It sets the icon or image while viewing the record
     * 
     *      It is done by accessing the element of the names and images arrays
     *      through the use of index (value of the navigator)
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
     * 
     *      It is done by setting the element of the names and images arrays
     *      at index (value of i) to the value of name and img
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
        
        if (this.navigator < this.numberOfElements - 1) {
            this.nextBtn.setEnabled(true);
            this.lastBtn.setEnabled(true);
        } else {
            this.nextBtn.setEnabled(false);
            this.lastBtn.setEnabled(false);
        }
        
        if (navigator >= 1) {
            this.prevBtn.setEnabled(true);
            this.firstBtn.setEnabled(true);
        } else {
            this.prevBtn.setEnabled(false);
            this.firstBtn.setEnabled(false);
        }
        
    }
    
    /**
     *   Resets the look of the TextField, image, and navigator
     */
    private void reset() {
        this.nameTF.setBackground(Main.GRAY);        
        this.nameTF.setEnabled(false);        
        this.nameTF.setText("");
        this.image.setIcon(null);
        this.navigator = 0;
    }
    
    private void disableNavigator() {
        this.nextBtn.setEnabled(false);
        this.prevBtn.setEnabled(false);
        this.lastBtn.setEnabled(false);
        this.firstBtn.setEnabled(false);
        this.viewBtn.setEnabled(false);
        this.editBtn.setEnabled(false);
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
        title = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        border = new javax.swing.JLabel();
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
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(500, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        title.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(153, 153, 0));
        title.setText("RECORD MANAGEMENT SYSTEM");
        jPanel1.add(title);
        title.setBounds(50, 10, 400, 28);

        image.setBackground(new java.awt.Color(102, 102, 0));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        image.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        image.setOpaque(true);
        image.setPreferredSize(new java.awt.Dimension(100, 100));
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
        });
        jPanel1.add(image);
        image.setBounds(170, 80, 150, 150);

        border.setBackground(new java.awt.Color(153, 153, 0));
        border.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        border.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        border.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        border.setOpaque(true);
        border.setPreferredSize(new java.awt.Dimension(100, 100));
        border.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borderMouseClicked(evt);
            }
        });
        jPanel1.add(border);
        border.setBounds(160, 70, 170, 170);

        nameTF.setBackground(new java.awt.Color(204, 204, 204));
        nameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nameTF.setEnabled(false);
        jPanel1.add(nameTF);
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
        jPanel1.add(saveBtn);
        saveBtn.setBounds(250, 420, 90, 80);

        firstBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        firstBtn.setText("FIRST");
        firstBtn.setEnabled(false);
        firstBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        firstBtn.setNextFocusableComponent(prevBtn);
        firstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBtnActionPerformed(evt);
            }
        });
        jPanel1.add(firstBtn);
        firstBtn.setBounds(50, 340, 80, 40);

        prevBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        prevBtn.setText("PREV");
        prevBtn.setEnabled(false);
        prevBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        prevBtn.setNextFocusableComponent(viewBtn);
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });
        jPanel1.add(prevBtn);
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
        jPanel1.add(viewBtn);
        viewBtn.setBounds(210, 340, 80, 40);

        nextBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        nextBtn.setText("NEXT");
        nextBtn.setEnabled(false);
        nextBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextBtn.setNextFocusableComponent(lastBtn);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nextBtn);
        nextBtn.setBounds(290, 340, 80, 40);

        lastBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        lastBtn.setText("LAST");
        lastBtn.setEnabled(false);
        lastBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lastBtn.setNextFocusableComponent(firstBtn);
        lastBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnActionPerformed(evt);
            }
        });
        jPanel1.add(lastBtn);
        lastBtn.setBounds(370, 340, 80, 40);

        addBtn.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        addBtn.setText("ADD");
        addBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn);
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
        jPanel1.add(searchBtn);
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
        jPanel1.add(editBtn);
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
        jPanel1.add(deleteBtn);
        deleteBtn.setBounds(250, 500, 90, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (this.ADD) {
            if ((!this.nameTF.getText().isBlank())) {
                save(nameTF.getText().trim(), this.image.getIcon(), this.numberOfElements);
                this.numberOfElements++;
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Cannot Add A non-existing object",
                        "ERROR",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }

            if (this.numberOfElements == this.names.length) {
                this.addBtn.setEnabled(false);
            } else {
                this.addBtn.setEnabled(true);
            }
            
            this.reset();
            this.ADD = false;
            
        } else if (EDIT) {
            this.edit(nameTF.getText(), this.image.getIcon());
            this.editBtn.setEnabled(true);
            this.searchBtn.setEnabled(true);
            this.deleteBtn.setEnabled(false);
            this.nameTF.setEditable(false);
            this.nameTF.setFocusable(false);
            this.EDIT = false;
            this.doNavigate();
        }
        
        if (this.numberOfElements != 0) {
            this.viewBtn.setEnabled(true);
        }
        this.saveBtn.setEnabled(false);
    }//GEN-LAST:event_saveBtnActionPerformed

    /**
     * Every time the user press the button it will set the navigator to 0,
     * Then call/run the doNavigate and view method above
     */
    private void firstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBtnActionPerformed
        // TODO add your handling code here:
        this.navigator = 0;
        this.doNavigate();
        this.view();
    }//GEN-LAST:event_firstBtnActionPerformed

    /**
     * Every time the user press the button it will decrement the navigator by 1,
     * Then call/run the doNavigate and view method above
     */
    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        // TODO add your handling code here: 
        this.navigator --;
        this.doNavigate();
        this.view();
    }//GEN-LAST:event_prevBtnActionPerformed
    
    /**
     * Every time the user press the button it will disable the Add button and
     * enables the Name Text Field, Edit Button, and Search if and only if the 
     * number of elements is greater than or equal to 1 and the user is not on 
     * view mode
     * 
     * It will also enable the First, Previous, Next, and Last buttons in the 
     * navigation if and only if the number of elements is greater or equal to 2
     * 
     * Otherwise, it will disable all the buttons except view and will enable
     * Add button and Name Text Field
     */
    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        if (!this.VIEW && (this.numberOfElements >= 1)) {
            this.VIEW = true; // Status/Mode of the user
            
            this.nameTF.setEnabled(true);
            this.nameTF.setEditable(false);
            this.nameTF.setFocusable(false);
            this.nameTF.setBackground(WHITE);
            
            this.addBtn.setEnabled(false);
            
            if (this.numberOfElements >= 2) {
                this.doNavigate();
            }
            this.editBtn.setEnabled(true);
            this.searchBtn.setEnabled(true);
            this.view();
            
        } else {
            this.VIEW = false; // Staus/Mode of the user
            
            if (this.numberOfElements ==this.names.length) {
                this.addBtn.setEnabled(false);  
                
            } else {
                this.addBtn.setEnabled(true);            
            }
            
            this.nextBtn.setEnabled(false);
            this.lastBtn.setEnabled(false);
            this.firstBtn.setEnabled(false);
            this.prevBtn.setEnabled(false);
            this.editBtn.setEnabled(false);
            this.searchBtn.setEnabled(false);
            
            this.reset();
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    /**
     * Every time the user press the button it will increment the navigator by 1,
     * Then call/run the doNavigate and view method above
     */
    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        this.navigator++;
        this.doNavigate();        
        this.view();
    }//GEN-LAST:event_nextBtnActionPerformed

    /**
     * Every time the user press the button it will set the navigator to the 
     * index/position of the last element hen call/run the doNavigate and view 
     * method above
     */
    private void lastBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBtnActionPerformed
        // TODO add your handling code here:
        this.navigator = this.numberOfElements-1;
        this.doNavigate();
        this.view();
    }//GEN-LAST:event_lastBtnActionPerformed

    /**
     * Every time the user press the button it will disable the View button and
     * enable the Add and Save buttons, and the Name Text Field
     */
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        this.viewBtn.setEnabled(false);
        this.addBtn.setEnabled(false);
        this.saveBtn.setEnabled(true);
        
        this.nameTF.setEnabled(true);
        this.nameTF.setEditable(true);
        this.nameTF.setFocusable(true);
        this.nameTF.setBackground(WHITE);
        this.nameTF.grabFocus();
        this.ADD = true; // Status/Mode of the user
    }//GEN-LAST:event_addBtnActionPerformed

    /** 
     * Every time the user press the button it will prompt a simple input window
     * and the user will be asked to put a name in the text field
     * 
     * It will then search if the inputted name exists in the list of names
     */
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        boolean found = false;
        
        // Show a Input Dialog or prompt that accepts user input
        String userInput = javax.swing.JOptionPane.showInputDialog(
                this,
                "<html><b>User:</html>",
                "Name",
                javax.swing.JOptionPane.PLAIN_MESSAGE);
        
        if (userInput != null) {
            // Loop (Search) Through the list of names
            for (int i = 0; i <= names.length - 1; i++) {
                // Check if there's an equal in the list of names to the user input
                if (userInput.trim().equals(names[i])) {
                    found = true;
                    this.navigator = i;
                    break;
                }
            }
        }
        
        if (found) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "<html><b>User Has Been Found!</html>",
                    "SUCCESSFUL",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "<html><b>User Has Not Been Found!</html>",
                    "ERROR",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
        // Redraw or show the data
        this.view();
        this.doNavigate();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        if (!this.EDIT) {
            this.nameTF.setBackground(WHITE);
            this.nameTF.setEnabled(true);
            this.nameTF.setFocusable(true);
            this.nameTF.setEditable(true);
            
            this.disableNavigator();
            this.searchBtn.setEnabled(false);
            this.saveBtn.setEnabled(true);
            this.deleteBtn.setEnabled(true);
            this.EDIT = true;
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        this.image.setIcon(null);
        this.nameTF.setText(null);
        this.images[navigator] = this.image.getIcon();
        this.names[navigator] = this.nameTF.getText();
        this.numberOfElements--;

        for (int i = navigator; i < this.numberOfElements; i++) {
          this.images[i] = this.images[i+1];
          this.names[i] = this.names[i+1];
        }
        
        if (this.navigator > 0) {
            this.navigator--;
        }
        
        if (this.numberOfElements == 0) {
            this.VIEW = false;
            
            this.addBtn.setEnabled(true);
            this.reset();
            this.disableNavigator();
        } else {
            this.viewBtn.setEnabled(true);
            
            this.editBtn.setEnabled(true);  
            this.searchBtn.setEnabled(true);  
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
            BufferedImage buffedImg = null;
            JFileChooser fileChooser = new javax.swing.JFileChooser();
            fileChooser.setVisible(true);
            fileChooser.showOpenDialog(this);
            try {
                buffedImg = ImageIO.read(fileChooser.getSelectedFile());
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image img = buffedImg.getScaledInstance(this.image.getWidth() - 20,
                   this.image.getHeight() - 20, Image.SCALE_DEFAULT);
            Icon icon = new javax.swing.ImageIcon(img);
            this.image.setIcon(icon);
        }
    }//GEN-LAST:event_imageMouseClicked

    private void borderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_borderMouseClicked

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
    private javax.swing.JLabel border;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton firstBtn;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
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
