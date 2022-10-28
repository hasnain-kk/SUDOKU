/*
 * This Code is Developed by Adnan
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class MyButton extends JButton {

  MyButton() {
    this.setFont(new Font("Now Bold", Font.PLAIN, 40));
    this.setForeground(new Color(0,0,0));
    this.setFocusable(false);
    this.setBackground(Color.white);
  }
}
