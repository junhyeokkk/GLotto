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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyPage {

	private JFrame frame;
	private JTextField MPID;
	private JPasswordField MPPW;
	private JTextField MPTEL;

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPage window = new MyPage();
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
	public MyPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 456, 678);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(24, 10, 410, 59);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("My Page");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 47));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(12, 79, 423, 482);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\GLotto\\GLotto\\Image\\사람아이콘.PNG"));
		lblNewLabel_1.setBounds(22, 10, 62, 80);
		panel_1.add(lblNewLabel_1);
		
		JLabel namelbl = new JLabel("New label");
		namelbl.setBounds(110, 20, 182, 57);
		panel_1.add(namelbl);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(325, 19, 84, 57);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ID");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_4.setBounds(62, 141, 22, 26);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Password");
		lblNewLabel_4_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(2, 192, 82, 24);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Tel");
		lblNewLabel_4_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_4_2.setBounds(51, 247, 33, 24);
		panel_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("LuckNum");
		lblNewLabel_4_3.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(2, 292, 82, 41);
		panel_1.add(lblNewLabel_4_3);
		
		MPID = new JTextField();
		MPID.setBounds(98, 141, 204, 21);
		panel_1.add(MPID);
		MPID.setColumns(10);
		
		MPPW = new JPasswordField();
		MPPW.setBounds(96, 195, 206, 21);
		panel_1.add(MPPW);
		
		MPTEL = new JTextField();
		MPTEL.setColumns(10);
		MPTEL.setBounds(98, 251, 204, 21);
		panel_1.add(MPTEL);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(96, 292, 302, 70);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(2, 9, 40, 40);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setBounds(49, 10, 40, 40);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("New label");
		lblNewLabel_5_2.setBounds(97, 11, 40, 40);
		panel_2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("New label");
		lblNewLabel_5_3.setBounds(146, 10, 40, 40);
		panel_2.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("New label");
		lblNewLabel_5_4.setBounds(196, 9, 40, 40);
		panel_2.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("New label");
		lblNewLabel_5_5.setBounds(245, 9, 40, 40);
		panel_2.add(lblNewLabel_5_5);
		
		JButton InputBtn = new JButton("입력하기");
		InputBtn.setBackground(Color.WHITE);
		InputBtn.setBounds(0, 324, 84, 23);
		panel_1.add(InputBtn);
		
		InputBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		
		JButton button = new JButton("수정");
		button.setBackground(Color.WHITE);
		button.setBounds(54, 587, 122, 42);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("초기화면");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(261, 587, 122, 42);
		frame.getContentPane().add(button_1);
	}








}
