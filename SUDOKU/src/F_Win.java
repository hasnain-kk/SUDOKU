/*
 * This Code is Developed By Hasnain KK
 */
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F_Win implements ActionListener {

  MyFrame frame = new MyFrame();
  MyLabel label = new MyLabel();
  MyButton button = new MyButton();
  Sound buttonM = new Sound();

  F_Win() {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

    label.setText(" You Win");
    label.setFont(new Font("Now Bold", Font.PLAIN, 120));
    label.setBounds(
      ((size.width - 14) / 2) - 250,
      (size.height / 2) - 100,
      500,
      100
    );
    frame.add(label);

    button.setText("Main Menu");
    button.setBounds(
      ((size.width - 14) / 2) - 150,
      (size.height / 2) + 50,
      300,
      50
    );
    frame.add(button);

    frame.setLayout(null);

    button.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      buttonM.setFile("buttonM.wav");
      buttonM.play();
      new F_Menu();
      frame.dispose();
    }
  }
}
