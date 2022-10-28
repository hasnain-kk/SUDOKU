/*
 * This Code is Developed By Hasnain KK
 */
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F_Lost implements ActionListener {

  MyFrame frame = new MyFrame();
  MyLabel label = new MyLabel();
  MyButton button2 = new MyButton();
  Sound buttonM = new Sound();

  F_Lost() {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

    label.setText("You Lost");
    label.setFont(new Font("Now Bold", Font.PLAIN, 120));
    label.setBounds(
      ((size.width - 14) / 2) - 250,
      (size.height / 2) - 100,
      500,
      100
    );
    frame.add(label);

    button2.setText("Main Menu");
    button2.setBounds(
      ((size.width - 14) / 2) - 150,
      (size.height / 2) + 100,
      300,
      50
    );
    frame.add(button2);

    frame.setLayout(null);

    button2.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button2) {
      buttonM.setFile("buttonM.wav");
      buttonM.play();
      new F_Menu();
      frame.dispose();
    }
  }
}
