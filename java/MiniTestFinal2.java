import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MiniTestFinal2 extends JFrame implements ActionListener {
  JTextField text;
  JLabel word;
  JButton up, low; String str;
  MiniTestFinal2() {
    setLayout(new BorderLayout());
    setTitle("Uper & Lower");
    setSize(350, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel top = new JPanel();
    getContentPane().add(top, BorderLayout.PAGE_START);

    text = new JTextField(30);
  //  text.setForeground(Color.BLUE);
    top.add(text);

    JPanel mid = new JPanel();
    getContentPane().add(mid, BorderLayout.CENTER);

    word = new JLabel();
    mid.add(word);

    JPanel buttom = new JPanel();
    getContentPane().add(buttom, BorderLayout.PAGE_END);   

    up = new JButton("UpperCase");
    up.addActionListener(this);
    up.setActionCommand("UP");
    buttom.add(up);

    low = new JButton("LowerCase");
    low.addActionListener(this);
    buttom.add(low);
  }

  public void actionPerformed(ActionEvent e){
    if (e.getActionCommand().equals("UP")) {
      str = text.getText().toUpperCase();
      word.setText(str);
      //word.setForeground(Color.GREEN);
    }
    else {
      str = text.getText().toLowerCase();
      word.setText(str);
    //  word.setForeground(Color.RED);
    }
  }

  public static void main(String[] args) {
    MiniTestFinal2 app = new MiniTestFinal2();
    app.setVisible(true);
  }

}
