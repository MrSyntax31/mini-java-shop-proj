import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class login {
	int ctr = 3;
	private JFrame frame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 505, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\oxgnfashion-20200313-121844-0.GIF"));
		lblNewLabel.setBounds(10, 11, 549, 221);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsernamel = new JLabel("Username");
		lblUsernamel.setForeground(Color.WHITE);
		lblUsernamel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsernamel.setBounds(96, 270, 144, 20);
		frame.getContentPane().add(lblUsernamel);
		
		JLabel lblUsernamel_1 = new JLabel("Password");
		lblUsernamel_1.setForeground(Color.WHITE);
		lblUsernamel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsernamel_1.setBounds(96, 321, 144, 20);
		frame.getContentPane().add(lblUsernamel_1);
		
		username = new JTextField();
		username.setBorder(null);
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setBounds(96, 293, 314, 30);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setToolTipText("");
		password.setBorder(null);
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setBounds(96, 345, 314, 30);
		frame.getContentPane().add(password);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 487, 499, 34);
		frame.getContentPane().add(panel);
		
		JLabel lblArllanPaul = new JLabel("Arllan & Paul Apparel ");
		lblArllanPaul.setForeground(Color.WHITE);
		panel.add(lblArllanPaul);
		JButton login = new JButton("Login");
		login.setForeground(Color.WHITE);
		login.setBackground(Color.BLACK);
		login.setBorder(null);
		login.setToolTipText("Login");
		login.setBounds(96, 386, 314, 49);
		frame.getContentPane().add(login);
		
		JLabel error = new JLabel("");
		error.setForeground(Color.WHITE);
		error.setBounds(22, 446, 260, 20);
		frame.getContentPane().add(error);
		
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = username.getText();
				@SuppressWarnings("deprecation")
				String pass = password.getText();
				
					if (arg0.getSource() == login) {
						if(user.isEmpty() && pass.isEmpty()) {
							if(ctr == 0) {
								error.setText("Please Rerun the App! ");
								error.setText("");
							}else {
								error.setText("Please Enter Username and Password !");
							}
						}else {
							if(user.equals("admin")&&pass.equals("123")){
								JOptionPane.showMessageDialog(null, "Login Successfully " );
								menu window = new menu();
								window.frame.setVisible(true);
								frame.setState(JFrame.ICONIFIED);
					            frame.dispose();
					            username.setText("");
								password.setText("");
						}else {
							username.setText("");
							password.setText("");
							error.setText("");
							error.setText("");
							ctr--;
							if(ctr == 0) {
								username.setEnabled(false);
								password.setEnabled(false);
								error.setText("");
								JOptionPane.showMessageDialog(null, "Your Account was Locked! " + " Please Rerun teh app");
								username.setText("");
								password.setText("");
								error.setText("");
								login.setEnabled(true);
								error.setText("");
							}else {
								System.out.println(ctr);
								error.setText("You only have "+ ctr + " more tries! ");
								}
							}
						}
					}
			}
		});
		
	}
}
