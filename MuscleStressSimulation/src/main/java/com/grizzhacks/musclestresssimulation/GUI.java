package com.grizzhacks.musclestresssimulation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class GUI extends JFrame {

  public void window(String lyrics) throws IOException {
    //lyrics = "TEST TESTT TEST ";

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout(10, 10));

    JLabel label = new JLabel(lyrics);
    label.setFont(new Font("Georgia", Font.PLAIN, 14));
    label.setForeground(new Color(50, 50, 25));

    panel.add(label, BorderLayout.CENTER);
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    
    BufferedImage myPicture = ImageIO.read(new File("arm.jpg"));
    JLabel picLabel = new JLabel(new ImageIcon(myPicture));
   
    LayoutManager overlay = new OverlayLayout(panel);
    panel.setLayout(overlay);
    
    panel.add(picLabel);
    
    JFrame f = new JFrame();
    f.add(panel);
    
    
    f.pack();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}