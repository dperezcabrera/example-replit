import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;

public class GraphPanel extends javax.swing.JPanel  {
 
  public GraphPanel(){
    setPreferredSize(new Dimension(800, 500));
  }

  @Override
  public synchronized void paintComponent(Graphics g) {
        Graphics2D graphics2d = (Graphics2D) g;
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.setColor(new Color(0x66a3d2));
        graphics2d.fillRect(0,0,800, 800);
  }

}