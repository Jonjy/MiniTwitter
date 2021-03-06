/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csupomona.cs365.miniTwitter;

/**
 *
 * @author Jon
 */
public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        super("ADMIN");
        initComponents();
    }
    
    public void statsUpdate(){
        userCount.setText("" + Admin.getInstance().userCount());
        groupCount.setText("" + Admin.getInstance().groupCount());
        messageCount.setText("" + Admin.getInstance().messageCount());
        percentPositive.setText("" + Admin.getInstance().positivity());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupPanel = new javax.swing.JScrollPane();
        groupTree = Admin.getInstance().getTree();
        jPanel1 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        addUser = new javax.swing.JButton();
        addGroup = new javax.swing.JButton();
        selectGroup = new javax.swing.JButton();
        userView = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();
        groupLabel = new javax.swing.JLabel();
        currentUser = new javax.swing.JTextField();
        currentGroup = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        uCountLabel = new javax.swing.JLabel();
        userCount = new javax.swing.JLabel();
        gCountLabel = new javax.swing.JLabel();
        groupCount = new javax.swing.JLabel();
        mCountLabel = new javax.swing.JLabel();
        messageCount = new javax.swing.JLabel();
        posPercentLabel = new javax.swing.JLabel();
        percentPositive = new javax.swing.JLabel();
        statsHeader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        groupPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Groups & Users"));
        groupPanel.setViewportView(groupTree);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nameField.setText("Enter User or Group name here");
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });

        addUser.setText("Add as User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        addGroup.setText("Add as Group");
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });

        selectGroup.setText("Select Group");
        selectGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectGroupActionPerformed(evt);
            }
        });

        userView.setText("View as User");
        userView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userViewActionPerformed(evt);
            }
        });

        userLabel.setText("Current User:");

        groupLabel.setText("Current Group:");

        currentUser.setText("none");

        currentGroup.setText("root");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addUser)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addGroup)
                                .addGap(18, 18, 18)
                                .addComponent(selectGroup))
                            .addComponent(nameField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currentUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(groupLabel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userView)
                    .addComponent(currentGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupLabel)
                    .addComponent(userLabel)
                    .addComponent(currentUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUser)
                    .addComponent(addGroup)
                    .addComponent(selectGroup)
                    .addComponent(userView))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uCountLabel.setText("User Count:");

        userCount.setText("0");

        gCountLabel.setText("Group Count:");

        groupCount.setText("0");

        mCountLabel.setText("Message Count:");

        messageCount.setText("0");

        posPercentLabel.setText("Percent Positive:");

        percentPositive.setText("0");

        statsHeader.setText("Statistics");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(uCountLabel)
                            .addComponent(mCountLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageCount, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userCount, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(198, 198, 198)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(posPercentLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gCountLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(percentPositive, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupCount, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(statsHeader)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(statsHeader)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupCount)
                    .addComponent(gCountLabel)
                    .addComponent(uCountLabel)
                    .addComponent(userCount))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mCountLabel)
                    .addComponent(messageCount)
                    .addComponent(posPercentLabel)
                    .addComponent(percentPositive))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(groupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(groupPanel)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        Admin.getInstance().addUser(nameField.getText());
        currentUser.setText(Admin.getInstance().getUser(nameField.getText()).getName());
        statsUpdate();
    }//GEN-LAST:event_addUserActionPerformed

    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed
        Admin.getInstance().addGroup(nameField.getText());
        currentGroup.setText(Admin.getInstance().getCurrentGroup().getName());
        statsUpdate();
    }//GEN-LAST:event_addGroupActionPerformed

    private void selectGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectGroupActionPerformed
        Admin.getInstance().getGroup(nameField.getText());
        currentGroup.setText(Admin.getInstance().getCurrentGroup().getName());
    }//GEN-LAST:event_selectGroupActionPerformed

    private void userViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userViewActionPerformed
        currentUser.setText(Admin.getInstance().getUser(nameField.getText()).getName());
        Admin.getInstance().runUser();
    }//GEN-LAST:event_userViewActionPerformed

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        nameField.setText("");
    }//GEN-LAST:event_nameFieldMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroup;
    private javax.swing.JButton addUser;
    private javax.swing.JTextField currentGroup;
    private javax.swing.JTextField currentUser;
    private javax.swing.JLabel gCountLabel;
    private javax.swing.JLabel groupCount;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JScrollPane groupPanel;
    private javax.swing.JTree groupTree;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mCountLabel;
    private javax.swing.JLabel messageCount;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel percentPositive;
    private javax.swing.JLabel posPercentLabel;
    private javax.swing.JButton selectGroup;
    private javax.swing.JLabel statsHeader;
    private javax.swing.JLabel uCountLabel;
    private javax.swing.JLabel userCount;
    private javax.swing.JLabel userLabel;
    private javax.swing.JButton userView;
    // End of variables declaration//GEN-END:variables
}
