/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csupomona.cs365.miniTwitter;

import javax.swing.tree.MutableTreeNode;

/**
 *
 * @author Jon
 */
public interface member extends MutableTreeNode {
    
    public String getName();
    
    public int accept(Visitor visitor);
    
    public User getUser(String name);
    
    public UserGroup getGroup(String name);
}
