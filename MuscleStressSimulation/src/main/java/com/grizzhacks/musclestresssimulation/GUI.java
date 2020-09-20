package com.grizzhacks.musclestresssimulation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame {

  public void window(String lyrics) throws IOException {
    //String lyrics = "Test";

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout(10, 10));

    JLabel label = new JLabel(lyrics);
    label.setFont(new Font("Georgia", Font.PLAIN, 14));
    label.setForeground(new Color(50, 50, 25));

    panel.add(label, BorderLayout.CENTER);
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    
    BufferedImage myPicture = ImageIO.read(new File("arm.jpg"));
    JLabel picLabel = new JLabel(new ImageIcon(myPicture));
   
    
    JFrame f = new JFrame();
    f.add(panel);
    f.add(picLabel);
    f.pack();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}