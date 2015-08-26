/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csupomona.cs365.miniTwitter;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jon
 */
public class Admin implements Observer {
    
    private static final Admin INSTANCE = new Admin();
    private final UserGroup root = new UserGroup("root");
    private UserGroup currentGroup = root;
    private User currentUser;
    private AdminFrame adminView;
    private JTree tree = new JTree(root);
    
    
    private Admin() {}
    
    public static Admin getInstance(){
        return INSTANCE;
    }
    
    public void run() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                adminView = new AdminFrame();
                adminView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                adminView.setVisible(true);
            }
        });
    }
    
    public int userCount(){
        return root.accept(new UserVisitor());
    }
    
    public int groupCount(){
        return root.accept(new GroupVisitor());
    }
    
    public int messageCount(){
        return root.accept(new MessageVisitor());
    }
    
    public double positivity(){
        return ((double)root.accept(new PositiveVisitor()))/(double)messageCount();
    }
    
    public void runUser(){
        currentUser.run();
    }
    
    public User getUser(String name){
        currentUser = root.getUser(name);
        return currentUser;
    }
    
    public void getGroup(String name){
        currentGroup = root.getGroup(name);
    }
    
    public void addUser(String name){
        User temp = new User(name);
        currentUser = temp;
        currentGroup.add(currentUser);
        //MainFrame.groupUpdate();
    }
    
    public void addGroup(String name){
        UserGroup temp = new UserGroup(name);
        currentGroup.add(temp);       
        currentGroup = temp;
        adminView.statsUpdate();
    }
    
    public UserGroup getCurrentGroup(){
        return currentGroup;
    }
    
    public JTree getTree(){
        return tree;
    }

    @Override
    public void update(Observable o, Object arg) {
        adminView.statsUpdate();
    }
}
