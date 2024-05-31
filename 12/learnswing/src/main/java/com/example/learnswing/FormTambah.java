package com.example.learnswing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormTambah extends JFrame implements ActionListener {
  JButton b1 = new JButton("1");
  JButton b2 = new JButton("2");
  JTextField t1 = new JTextField();

  public FormTambah(){
    super("Tambah Data");

    JPanel p = new JPanel();
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    
    b2.addActionListener(this);

    GridLayout gl = new GridLayout(3, 2, 10, 10);
    BorderLayout bl = new BorderLayout(5, 5);
    p.setLayout(bl);

    p.add(BorderLayout.NORTH,t1);
    p.add(BorderLayout.SOUTH, b2);
    p.add(BorderLayout.EAST,b3);
    p.add(BorderLayout.WEST,b4);
    p.add(BorderLayout.CENTER,b5);
    // p.add(b6);
    add(p);

    setSize(400, 400);
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    pack();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b2){
      String msg = t1.getText();
      JOptionPane.showMessageDialog(null, msg);
    }
  }
}