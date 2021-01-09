
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.awt.event.*;

public class loginGUI implements ActionListener{

	private static JLabel usernameLabel;
	private static JTextField nameText;
	private static JLabel pwLabel;
	private static JPasswordField userPw;
	private static JButton loginButton;
	private static JLabel success;


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
    usernameLabel = new JLabel("Username");
    usernameLabel.setBounds(10, 20, 80, 25);
    panel.add(usernameLabel);

    pwLabel = new JLabel("Password");
    pwLabel.setBounds(10, 50, 80, 25);
    panel.add(pwLabel);

    //username password text boxes
    nameText = new JTextField();
    nameText.setBounds(100, 20, 165, 25);
    panel.add(nameText);

    userPw = new JPasswordField();
    userPw.setBounds(100, 50, 165, 25);
    panel.add(userPw);

    //login button
    loginButton = new JButton("Login");
    loginButton.setBounds(10, 80, 80, 25);
    loginButton.addActionListener(new loginGUI());
    panel.add(loginButton);

    //success message
    success = new JLabel("");
    success.setBounds(10, 110, 300, 25);
    panel.add(success);

    frame.setVisible(true);
  }//main


  public void actionPerformed(ActionEvent e){
	  
	 success.setText("You've logged in!");


  }//actionPerformed method

}//longGUI CLass
