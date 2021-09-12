import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
/*class MyApp {  //Basic class//
  public static void main(String[] args) {
    JFrame frame = new JFrame(); //JFrame class//
    frame.setTitle("My Application");
    frame.setSize(300,200);
    frame.setLocation(10,200);
    frame.setVisible(true);
  }
}*/

class MyApp extends JFrame implements ActionListener {
  final JLabel resultLabel;
  public MyApp() {
    setTitle("My Application");
    setSize(300,200);
    setLocation(10,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    final JLabel label = new JLabel("Hello Mor Nor");
    getContentPane().add(label);
    final JButton button = new JButton("Yes Flash?");
    getContentPane().add(button);
    final JButton punchbutton = new JButton("Punch");
    punchbutton.setActionCommand("punch");
    punchbutton.addActionListener(this);
    getContentPane().add(punchbutton);
    button.addActionListener(this);
    resultLabel = new JLabel("What do you call a three humped camel?");
    getContentPane().add(resultLabel);
  }
  public static void main(String[] args) {
    MyApp app = new MyApp();
    app.setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
    JButton button = (JButton) e.getSource();
    if (button.getActionCommand().equals("punch")) {
      resultLabel.setText("Pregnant!");
    }else {
      resultLabel.setText("What do you call a three humped camel?");
    }
  }
}
