/*
 * This Programe was Developed by Hasnain KK
 * ******Menu Page********
 */
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class F_Menu implements ActionListener {

  MyFrame frame = new MyFrame();
  MyLabel label = new MyLabel();
  MyButton button1 = new MyButton();
  MyButton button2 = new MyButton();
  MyButton button3 = new MyButton();
  MyButton button4 = new MyButton();
  Sound buttonM = new Sound();

  F_Menu() {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

    label.setText(" Main Menu");
    label.setFont(new Font("Now Bold", Font.PLAIN, 70));
    label.setBounds(((size.width - 14) / 2) - 190, 100, 380, 100);
    frame.add(label);

    button1.setText("Level 1");
    button1.setBounds(((size.width - 14) / 2) - 100, 250, 200, 50);
    frame.add(button1);

    button2.setText("Level 2");
    button2.setBounds(((size.width - 14) / 2) - 100, 350, 200, 50);
    frame.add(button2);

    button3.setText("Level 3");
    button3.setBounds(((size.width - 14) / 2) - 100, 450, 200, 50);
    frame.add(button3);

    button4.setText("Exit");
    button4.setBounds(size.width - 200, 50, 110, 50);
    frame.add(button4);

    frame.setLayout(null);
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button1) {
      buttonM.setFile("buttonM.wav");
      buttonM.play();
      new F_Level1();
      frame.dispose();
    }
    if (e.getSource() == button2) {
      buttonM.setFile("buttonM.wav");
      buttonM.play();
      new F_Level2();
      frame.dispose();
    }
    if (e.getSource() == button3) {
      buttonM.setFile("buttonM.wav");
      buttonM.play();
      new F_Level3();
      frame.dispose();
    }
    if (e.getSource() == button4) {
      buttonM.setFile("buttonM.wav");
      buttonM.play();
      frame.dispose();
    }
  }
}
