package FrameRegisterLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterWindow extends requirements1 {
    public static void main(String[] args) {

       RegisterWindow frame = new RegisterWindow();

       frame.setTitle("Registration: ");

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel registration = new JLabel("Registration: ");

        JLabel emailLabel = new JLabel("E-mail:");
        JTextField emailTextField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Set Password:");
        JPasswordField passwordField = new JPasswordField(20);

        JLabel repeatPasswordLabel = new JLabel("Repeat Password:");
        JPasswordField repeatPasswordField = new JPasswordField(20);

        JLabel registrationRule1 = new JLabel("-passwords must be the same");
        JLabel registrationRule2 = new JLabel( "-password must contain 1 capital letter");
        JLabel registrationRule3 = new JLabel("-password must contain 1 number");
        JLabel registrationRule4 = new JLabel("-password must have 8 characters");

        JButton RegisterButton = new JButton("Register");


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(registration, gbc);

        gbc.gridx=0;
        gbc.gridy=1;
        gbc.anchor=GridBagConstraints.WEST;
        panel.add(emailLabel, gbc);

        gbc.gridy=2;
        panel.add(passwordLabel,gbc);

        gbc.gridy=3;
        panel.add(repeatPasswordLabel, gbc);

        gbc.gridx=1;
        gbc.gridy=1;
        gbc.anchor=GridBagConstraints.WEST;
        panel.add(emailTextField, gbc);

        gbc.gridy=2;
        panel.add(passwordField,gbc);

        gbc.gridy=3;
        panel.add(repeatPasswordField,gbc);

        gbc.gridy=4;
        panel.add(registrationRule1,gbc);
        gbc.gridy=5;
        panel.add(registrationRule2,gbc);
        gbc.gridy=6;
        panel.add(registrationRule3,gbc);
        gbc.gridy=7;
        panel.add(registrationRule4,gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(RegisterButton, gbc);


        RegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String YourEmail = emailTextField.getText();
                char[] YourPassword = passwordField.getPassword();
                String passwordString = new String(YourPassword);
                char[] repoeatedPassword = repeatPasswordField.getPassword();
                String repoeatedPasswordString = new String(repoeatedPassword);
                if (passwordString.equals(repoeatedPasswordString)&&passwordString.length()>=8
                &&hasDigit(passwordString)&&hasUpperCase(passwordString)){
                    System.out.println("Registration Succesfull, Welcome!");
                System.out.println("Your Email: " + YourEmail);
                System.out.println("Your Password: " + passwordString);

            }else System.out.println("You do not meet the registration requirements, please try again");
            }
        });
        RegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

            }
        });

        JPasswordField PasswordField = new JPasswordField(8);
        frame.add(PasswordField);

       PasswordField.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               System.out.println("New password: " + new String(PasswordField.getPassword()));

           }
       });
frame.add(panel);

    }


}

