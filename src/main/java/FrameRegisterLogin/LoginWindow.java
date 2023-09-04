package FrameRegisterLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginWindow extends RegisterWindow {

    public LoginWindow() {

        LoginWindow frame1 = new LoginWindow();
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Po zamknięciu okna 1 otwórz nowe okno 2
                JFrame frame2 = new JFrame("Okno 2");
                frame2.setSize(300, 200);
                frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame2.setVisible(true);
            }
        });

        frame1.setVisible(true);
    }
}