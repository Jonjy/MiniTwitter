/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csupomona.cs365.miniTwitter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Jon
 */
public class MiniTwitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("MiniTwit Login");
	frame.setSize(300, 150);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JPanel panel = new JPanel();
	frame.add(panel);
	placeComponents(panel, frame);

	frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel, JFrame frame) {
        
        final String userName;
	panel.setLayout(null);

	JLabel userLabel = new JLabel("User");
	userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);
        userText.setText("Press Login to run");

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(125, 80, 80, 25);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Driver();
                frame.setVisible(false);
            }
        });
    }
    
    public static void Driver(){
        Admin.getInstance().run();        
    }

}


