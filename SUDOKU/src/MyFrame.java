/*
 * This code is Developed by Usman Mugal
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

  MyFrame() {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    this.setBounds(-7, 0, size.width + 14, size.height);
    this.setTitle(" SUDOKU Game");
    ImageIcon image = new ImageIcon("Logo2.png");
    this.setIconImage(image.getImage());
    this.getContentPane().setBackground(new Color(15,156,123 ));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
}
