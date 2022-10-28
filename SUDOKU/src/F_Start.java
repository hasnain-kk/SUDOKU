/*
 * This Programe was Developed by Hasnain KK
 * ******Starting Page********
 */

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class F_Start implements ActionListener {

  MyFrame frame = new MyFrame();
  MyLabel label = new MyLabel();
  MyLabel label2 = new MyLabel();
  MyButton button = new MyButton();
  Sound bmusic = new Sound();

  F_Start() {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

    label.setText("Sudoku");
    label.setFont(new Font("Now Bold", Font.PLAIN, 120));
    label.setBounds(
      ((size.width - 14) / 2) - 210,
      (size.height / 2) - 100,
      420,
      100
    );
    frame.add(label);

    button.setText("Play");
    button.setBounds(
      ((size.width - 14) / 2) - 100,
      (size.height / 2) + 50,
      200,
      50
    );
    frame.add(button);

    frame.setLayout(null);

    button.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      bmusic.setFile("buttonM.wav");
      bmusic.play();
      new F_Menu();
      frame.dispose();
    }
  }
}
