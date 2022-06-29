import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login {

	private JFrame frame;
	private JTextField IDtext;
	private JTextField PWtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 452, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 436, 40);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Green Lotto");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(10, 50, 414, 243);
		frame.getContentPane().add(panel_1);
		
		JLabel Imagelbl = new JLabel("");
		Imagelbl.setIcon(new ImageIcon("D:\\GLotto\\GLotto\\Image\\로또이미지.png"));
		panel_1.add(Imagelbl);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(10, 325, 414, 63);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(58, 8, 28, 18);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		panel_2.add(lblNewLabel_2);
		
		IDtext = new JTextField();
		IDtext.setBounds(98, 5, 226, 21);
		panel_2.add(IDtext);
		IDtext.setColumns(20);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password");
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(12, 37, 76, 18);
		panel_2.add(lblNewLabel_2_1);
		
		PWtext = new JTextField();
		PWtext.setColumns(20);
		PWtext.setBounds(98, 36, 226, 21);
		panel_2.add(PWtext);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.CYAN);
		panel_3.setBounds(10, 431, 414, 40);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton LoginBtn = new JButton("로그인");
		LoginBtn.setBackground(Color.WHITE);
		LoginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LoginBtn.setBounds(87, 5, 81, 23);
		panel_3.add(LoginBtn);
		
		JButton SUBtn = new JButton("회원가입");
		SUBtn.setBackground(Color.WHITE);
		SUBtn.setBounds(252, 5, 92, 23);
		panel_3.add(SUBtn);
		
		LoginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SignUp();
			}
			
		});
	
	}
}
