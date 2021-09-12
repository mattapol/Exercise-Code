import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MiniTestFinal1 extends JFrame implements ActionListener {
  JButton button; String str;
  MiniTestFinal1() {
    setLayout(new GridLayout(1, 1));
    setTitle("Swicth");
    setSize(350, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    button = new JButton("ON");
  //  button.setFont(new Font("Courier New", Font.BOLD, 50));
    button.addActionListener(this);
    button.setActionCommand(str);
    getContentPane().add(button);
  }

  public void actionPerformed(ActionEvent e){
    str = button.getText();
    if (e.getActionCommand().equals("ON")) {
    //  button.setFont(new Font("Courier New", Font.BOLD, 50));
    //  button.setForeground(Color.RED);
      button.setText("OFF");
      str = "OFF";
    }
    else {
    //  button.setFont(new Font("Courier New", Font.BOLD, 50));
    //  button.setForeground(Color.GREEN);
      button.setText("ON");
      str = "ON";
    }
  }

  public static void main(String[] args) {
    MiniTestFinal1 app = new MiniTestFinal1();
    app.setVisible(true);
  }
}
