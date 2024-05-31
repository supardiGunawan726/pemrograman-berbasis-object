package com.example.learnswing;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;

public class PanelForm {
  BufferedImage image;
  
  PanelForm(){
    try {
      image = ImageIO.read(new File(""));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void paintComponent(Graphics g){
    g.drawImage(image, 0, 0, (ImageObserver) this);
  }
}
