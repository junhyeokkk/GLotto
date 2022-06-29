import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;

public class Main {

	private JFrame frame;
	

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
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 451, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 411, 133);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(34, 0, 349, 132);
		lblNewLabel.setIcon(new ImageIcon("D:\\GLotto\\GLotto\\Image\\초기화면 이미지.jpg"));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(44, 153, 351, 418);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("구매");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(94, 10, 168, 57);
		panel_1.add(btnNewButton);
		
		JButton btnMypage = new JButton("MyPage");
		btnMypage.setBackground(Color.WHITE);
		btnMypage.setBounds(94, 109, 168, 57);
		panel_1.add(btnMypage);
		
		btnMypage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MyPage m = new MyPage();
				m.getFrame().setVisible(true);
				frame.dispose();
			}
			
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(94, 211, 168, 57);
		panel_1.add(btnLogout);
		
		btnLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.getFrame().setVisible(true);
				frame.dispose();
			}
			
		});
		
		JButton Exitbtn = new JButton("종료");
		Exitbtn.setBackground(Color.WHITE);
		Exitbtn.setBounds(94, 315, 168, 57);
		panel_1.add(Exitbtn);
		
		Exitbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 frame.setVisible(false);
			}
		});
	}
}
