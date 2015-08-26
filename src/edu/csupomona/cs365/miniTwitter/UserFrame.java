/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csupomona.cs365.miniTwitter;

//import java.awt.BorderLayout;
//import java.awt.Container;
//import java.awt.Dimension;
//import java.awt.GridBagConstraints;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.List;
//import javax.swing.BorderFactory;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;

///**
// *
// * @author Jon
// */
public class UserFrame {
    
//    private User owner;
//    
    public UserFrame(User owner){
//        super(owner.getName());
//        this.owner = owner;
//        
//        JPanel tp = new JPanel();
//        JPanel fp = new JPanel();
//        JPanel feed = new JPanel();
//        
//        followerPanel(fp);
//        feedPanel(feed);
//        textPanels(tp);
//        
//        
//        setLayout(new BorderLayout());
//        
//        Container view = getContentPane();
//        
//        view.add(tp, BorderLayout.NORTH);
//        view.add(fp, BorderLayout.SOUTH);
//        view.add(feed, BorderLayout.CENTER);
//        
    }
//    
//    private void followerPanel(JPanel fp){
//        Dimension size = getPreferredSize();
//        size.height =300;
//        fp.setPreferredSize(size);
//        
//        fp.setBorder(BorderFactory.createTitledBorder("Following"));
//        
//        JLabel following;
//        GridBagConstraints gc = new GridBagConstraints();
//        gc.anchor = GridBagConstraints.NORTHWEST;
//        
//        for(int i = 0; i < owner.followingCount(); i++, gc.gridy++){
//            following = new JLabel(owner.getFollowing(i).getName());
//            fp.add(following, gc);
//        } 
//    }
//    
//    private void feedPanel(JPanel feed){
//        JLabel feedPosts;
//        Dimension size = getPreferredSize();
//        size.height =550;
//        feed.setPreferredSize(size);
//        
//        feed.setBorder(BorderFactory.createTitledBorder("News Feed"));
//        
//        GridBagConstraints gc = new GridBagConstraints();
//        gc.anchor = GridBagConstraints.NORTHWEST;
//        
//        for(int i = owner.getFeedSize() -1 ; i >= 0; i--, gc.gridy++){
//            feedPosts = new JLabel(owner.getFeed(i));
//            feed.add(feedPosts, gc);
//        }
//    }
//    
//    private void textPanels(JPanel tp){
//        Dimension size = getPreferredSize();
//        size.height =150;
//        tp.setPreferredSize(size);
//        
//        tp.setBorder(BorderFactory.createTitledBorder(owner.getName()));
//        
//        GridBagConstraints gc = new GridBagConstraints();
//        
//        JTextField nameField = new JTextField(20);
//        JButton followUser = new JButton("Follow User");
//        
//        JTextField tweet = new JTextField(40);
//        JButton post = new JButton("Post");
//        
//        gc.gridx=0;
//        gc.gridy=0;
//        tp.add(nameField, gc);
//        
//        gc.gridx=1;
//        gc.gridy=0;
//        tp.add(followUser, gc);
//        
//        gc.gridx=1;
//        gc.gridy=2;
//        tp.add(post, gc);
//        
//        gc.gridx=0;
//        gc.gridy=1;
//        tp.add(tweet, gc);
//        
//        followUser.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                User temp= Admin.getInstance().getUser(nameField.getText());
//                temp.newFollower(owner);
//                owner.newfollow(temp);
//                nameField.setText("");
//            }
//        });
//        
//        post.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                owner.makeStatus(tweet.getText());
//                tweet.setText("");
//            }
//        });
//    }
//    
//    
//    
}
