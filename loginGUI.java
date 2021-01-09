import javax.swing.*;

public class loginGUI{

  public static void main(String[] args) {


    //create a frame object
    JFrame frame = new JFrame();
    //create a panel object
    JPanel panel = new JPanel();

    //set frame size and other features
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);//add the panel onto the frame

    panel.setLayout(null);

    //username and Password labels
    JLabel usernameLabel = new JLabel("Username");
    usernameLabel.setBounds(10, 20, 80, 25);
    panel.add(usernameLabel);

    JLabel pwLabel = new JLabel("Password");
    pwLabel.setBounds(10, 50, 80, 25);
    panel.add(pwLabel);

    //username password text boxes
    JTextField nameText = new JTextField();
    nameText.setBounds(100, 20, 165, 25);
    panel.add(nameText);

    JPasswordField userPw = new JPasswordField();
    userPw.setBounds(100, 50, 165, 25);
    panel.add(userPw);

    JButton loginButton = new JButton("Login");
    loginButton.setBounds(10, 80, 80, 25);
    panel.add(loginButton);



    frame.setVisible(true);
  }

}
