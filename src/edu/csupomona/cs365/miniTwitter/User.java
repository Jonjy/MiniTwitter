/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csupomona.cs365.miniTwitter;

import java.util.Enumeration;
import java.util.List;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Jon
 */
public class User extends Observable implements member, Observer {
    private String name;
    private List<String> following = new LinkedList();
    private List<String> status = new LinkedList();
    private int positiveCount = 0;
    private List<String> feed = new LinkedList();
    private TreeNode parent;
   
    public User(String name){
        this.name = name;
        addObserver(Admin.getInstance());
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public void setParent(TreeNode parent){
        this.parent = parent;
    }
    
    public boolean isUser(){
        return true;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public void makeStatus(String newStatus){
        status.add(newStatus);
        if(isPositive(newStatus))
              positiveCount++;  
        setChanged();
        notifyObservers(newStatus);
        
        update(this, newStatus);
    }
    
    public void newFollower(User follower){
        addObserver(follower);
    }
    
    public void newfollow(User follow){
        follow.newFollower(this);
        following.add(follow.getName());
    }
   
    @Override
    public void update(Observable o, Object arg) {
        User follow = (User) o;
        feed.add(follow.getName()+ ": " + arg);  
    } 
    
    @Override
    public User getUser(String name){
        if(this.name.equals(name)){
            return this;
        }
        return null;
    }
    
    @Override
    public UserGroup getGroup(String name){
        return null;
    }
    
    public void run(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame adminView = new UserUI(User.this);
                adminView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                adminView.setVisible(true);
            }
        });
    }
    
    public int messageCount(){
        return status.size();
    }
    
    public int positiveCounter(){
        return positiveCount;
    }
    
    public String[] getFollowing(){
        return following.toArray(new String[0]);
    }
    
    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

    private boolean isPositive(String newStatus) {
        if(newStatus.contains("happy")){
            return true;
        }
        if(newStatus.contains("good")){
            return true;
        }
        if(newStatus.contains("joy")){
            return true;
        }
        if(newStatus.contains("awesome")){
            return true;
        }
        
        return false;
    }

    public String[] getNewsFeed() {
        return feed.toArray(new String[0]);
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public TreeNode getParent() {
        return parent;
    }

    @Override
    public int getIndex(TreeNode node) {
        return -1;
    }

    @Override
    public boolean getAllowsChildren() {
        return false;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public Enumeration children() {
        return null;
    }

    @Override
    public void insert(MutableTreeNode child, int index) {
        throw new UnsupportedOperationException("This is a Leaf");
    }

    @Override
    public void remove(int index) {
        throw new UnsupportedOperationException("This is a Leaf");
    }

    @Override
    public void remove(MutableTreeNode node) {
        throw new UnsupportedOperationException("This is a Leaf");
    }

    @Override
    public void setUserObject(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void removeFromParent() {
         throw new UnsupportedOperationException("Not supported yet."); 
        
    }

    @Override
    public void setParent(MutableTreeNode newParent) {
        parent = newParent; 
    }

    @Override
    public TreeNode getChildAt(int childIndex) {
        return null;
    }
}
