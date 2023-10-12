/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.User;

/**
 *
 * @author neel
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    private JPanel bottomPanel;

    public FormPanel(JPanel inputPanel) {
        initComponents();
        this.bottomPanel = inputPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uploadImageField = new javax.swing.JTextField();
        lastNameErrorField = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        Male = new javax.swing.JRadioButton();
        ageField = new javax.swing.JTextField();
        patientTypeDropBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageField = new javax.swing.JTextArea();
        firstNameErrorField = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        patientType = new javax.swing.JLabel();
        Female = new javax.swing.JRadioButton();
        emailField = new javax.swing.JTextField();
        None = new javax.swing.JRadioButton();
        emailErrorField = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageErrorField = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(0, 0, 102));

        uploadImageField.setEditable(false);
        uploadImageField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uploadImageField.setText("Picture Path");

        lastNameErrorField.setForeground(new java.awt.Color(255, 51, 51));

        messageLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        messageLabel.setText("Message:");

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        firstNameLabel.setText("First Name:");

        submitButton.setBackground(new java.awt.Color(0, 0, 204));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        Male.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Male.setText("Male");

        ageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageFieldKeyReleased(evt);
            }
        });

        patientTypeDropBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Guest" }));
        patientTypeDropBox.setSelectedIndex(-1);

        messageField.setColumns(20);
        messageField.setRows(5);
        jScrollPane1.setViewportView(messageField);

        firstNameErrorField.setForeground(new java.awt.Color(255, 51, 51));

        genderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genderLabel.setText("Gender:");

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lastNameLabel.setText("Last Name:");

        patientType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        patientType.setText(" Type:");

        Female.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Female.setText("Female");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailFieldKeyReleased(evt);
            }
        });

        None.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        None.setText("Prefer not to say");
        None.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoneActionPerformed(evt);
            }
        });

        emailErrorField.setForeground(new java.awt.Color(255, 51, 51));

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyTyped(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ageLabel.setText("Age:");

        ageErrorField.setForeground(new java.awt.Color(255, 51, 51));

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Registration Form");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailLabel.setText("Email:");

        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Date of Birth:");

        jDateChooser1.setDateFormatString("dd-MMM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lastNameErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(genderLabel)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageLabel))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 42, Short.MAX_VALUE)
                                                .addComponent(ageErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(emailErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(firstNameErrorField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Female)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(None))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(patientType, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(patientTypeDropBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uploadImageField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(uploadButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstNameLabel))
                    .addComponent(firstNameErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastNameLabel))
                    .addComponent(lastNameErrorField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ageLabel)
                        .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ageErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Male)
                        .addComponent(Female)
                        .addComponent(None)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailLabel))
                    .addComponent(emailErrorField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientTypeDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientType)))
                    .addComponent(messageLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadImageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadButton))
                .addGap(27, 27, 27)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:

        User newUser = new User();
        newUser.setFirstname(firstNameField.getText());
        newUser.setLastname(lastNameField.getText());
        newUser.setAge(ageField.getText());
        newUser.setEmail(emailField.getText());
        newUser.setType(patientTypeDropBox.getSelectedItem().toString());
        newUser.setMessage(messageField.getText());
        newUser.setfilename(filename);

        if (Male.isSelected() == true) {
            newUser.setGender("Male");
        } else if (Female.isSelected() == true) {
            newUser.setGender("Female");
        } else {
            newUser.setGender("Prefer not to say");
        }
        Date date = jDateChooser1.getDate();
        String strDate = DateFormat.getDateInstance().format(date);
        newUser.setDate(strDate);

        ViewPanel newViewPanel = new ViewPanel(newUser);
        bottomPanel.add(newViewPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void ageFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || Character.isISOControl(c)) {
            ageField.setEditable(true);
        } else {
            ageField.setEditable(false);
        }
    }//GEN-LAST:event_ageFieldKeyPressed

    private void ageFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^(1[0-1][0-9]|[1-9][0-9]|[1-9])$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(ageField.getText());
        if (!match.matches()) {
            ageErrorField.setText("Age is Invalid");
        } else {
            ageErrorField.setText(null);
        }
    }//GEN-LAST:event_ageFieldKeyReleased

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void emailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(emailField.getText());
        if (!match.matches()) {
            emailErrorField.setText("Email is invalid");
        } else {
            emailErrorField.setText(null);
        }
    }//GEN-LAST:event_emailFieldKeyReleased

    private void NoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoneActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void firstNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldKeyPressed

    private void firstNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{1,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(firstNameField.getText());
        if (!match.matches()) {
            firstNameErrorField.setText("First name is Invalid");
        } else {
            firstNameErrorField.setText(null);
        }
    }//GEN-LAST:event_firstNameFieldKeyReleased

    private void firstNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume(); // Consume the event, preventing the character from being typed
        }
    }//GEN-LAST:event_firstNameFieldKeyTyped

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:

        //        filename = f.getAbsolutePath();
        //        Upload_image_field.setText(filename);
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGE", "png", "jpg", "jpeg");
        chooser.addChoosableFileFilter(fnef);
        int showOpenDialogue = chooser.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = chooser.getSelectedFile();
            filename = selectedImageFile.getAbsolutePath();
            uploadImageField.setText(filename);

        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void lastNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{1,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(lastNameField.getText());
        if (!match.matches()) {
            lastNameErrorField.setText("Last name is Invalid");
        } else {
            lastNameErrorField.setText(null);
        }
    }//GEN-LAST:event_lastNameFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JRadioButton None;
    private javax.swing.JLabel ageErrorField;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel emailErrorField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel firstNameErrorField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genderLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameErrorField;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextArea messageField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel patientType;
    private javax.swing.JComboBox<String> patientTypeDropBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    private javax.swing.JTextField uploadImageField;
    // End of variables declaration//GEN-END:variables
    String filename;
}