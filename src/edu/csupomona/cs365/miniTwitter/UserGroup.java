/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csupomona.cs365.miniTwitter;

import javax.swing.tree.DefaultMutableTreeNode;
/**
 *
 * @author Jon
 */
public class UserGroup extends DefaultMutableTreeNode implements member {
    
    String name;

    public UserGroup(String name){
        super(name); 
        this.name = name;
    }
        
    public int getCount(Visitor visitor){
        int count = 0;
        if (isLeaf()){
            return 0;
        }
        for (int i= 0; i < children.size(); i++) {
            member node = (member) getChildAt(i);
            count = count + node.accept(visitor);
        }
        return count;
    }
    
    @Override
    public User getUser(String name){
        if (isLeaf()){
            return null;
        }
        for (int i = 0; i < children.size();i++){
            member node = (member) getChildAt(i);
            node = node.getUser(name);
            if( node != null){
                return (User) node;
            }
        }
        return null;
    }
    
    @Override
    public UserGroup getGroup(String name){
        if(this.name.equals(name)){
            return this;
        }
        
        if (isLeaf()){
            return null;
        }
        
        for (int i = 0; i < children.size();i++){
            member node = (member) getChildAt(i);
            node = node.getGroup(name);
            if( node != null){
                return (UserGroup) node;
            }
        }
        return null;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
