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
public class PositiveVisitor implements Visitor {

    @Override
    public int visit(UserGroup current) {
        return current.getCount(this);
    }

    @Override
    public int visit(User current) {
        return current.positiveCounter();
    }
    
}
