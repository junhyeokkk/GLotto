package Wook;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Entry {
	
	private JFrame frame;
	HashMap numberImage = new HashMap();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entry window = new Entry();
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
	public Entry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Lotto 입력화면");
		frame.setBounds(100, 100, 502, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

//				---------- Panel ----------
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 462, 625);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

//				---------- Main Label ----------
		JLabel lblMain = new JLabel("부자가 되려면");
		lblMain.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		lblMain.setBounds(12, 10, 438, 51);
		panel.add(lblMain);

		JLabel lblSub = new JLabel("6개의 번호를 골라~");
		lblSub.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblSub.setBounds(230, 71, 220, 51);
		panel.add(lblSub);

		JLabel lblA = new JLabel("A");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setForeground(Color.DARK_GRAY);
		lblA.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblA.setBounds(12, 140, 66, 60);
		panel.add(lblA);

		JLabel lblB = new JLabel("B");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setForeground(Color.DARK_GRAY);
		lblB.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblB.setBounds(12, 210, 66, 60);
		panel.add(lblB);

		JLabel lblC = new JLabel("C");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setForeground(Color.DARK_GRAY);
		lblC.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblC.setBounds(12, 280, 66, 60);
		panel.add(lblC);

		JLabel lblD = new JLabel("D");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setForeground(Color.DARK_GRAY);
		lblD.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblD.setBounds(12, 350, 66, 60);
		panel.add(lblD);

		JLabel lblE = new JLabel("E");
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		lblE.setForeground(Color.DARK_GRAY);
		lblE.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblE.setBounds(12, 420, 66, 60);
		panel.add(lblE);

//				---------- Sub Label ----------
//				---------- ImageIcon 에 이미지 주소 넣을것 -----------
//		JLabel lbl_a = new JLabel("이미지 넣어주세용");
//		lbl_a.setBounds(90, 140, 360, 37);
//		ImageIcon a_Input = new ImageIcon();
//		panel.add(lbl_a);
//		
//		JLabel lbl_b = new JLabel("이미지 넣어주세용");
//		lbl_b.setBounds(90, 187, 360, 37);
//		ImageIcon b_Input = new ImageIcon();
//		panel.add(lbl_b);
//		
//		JLabel lbl_c = new JLabel("이미지 넣어주세용");
//		lbl_c.setBounds(90, 234, 360, 37);
//		ImageIcon c_Input = new ImageIcon();
//		panel.add(lbl_c);
//		
//		JLabel lbl_d = new JLabel("이미지 넣어주세용");
//		lbl_d.setBounds(90, 281, 360, 37);
//		ImageIcon d_Input = new ImageIcon();
//		panel.add(lbl_d);
//		
//		JLabel lbl_e = new JLabel("이미지 넣어주세용");
//		lbl_e.setBounds(90, 328, 360, 37);
//		ImageIcon e_Input = new ImageIcon();
//		panel.add(lbl_e);

//		---------- Panel_A ----------
//		---------- lbl ----------

		JPanel panelA = new JPanel();
		panelA.setBounds(90, 140, 360, 60);
		panel.add(panelA);
		panelA.setLayout(null);

		JLabel lblA_1 = new JLabel("New label");
		lblA_1.setBounds(12, 10, 40, 40);
		panelA.add(lblA_1);

		JLabel lblA_2 = new JLabel("New label");
		lblA_2.setBounds(61, 10, 40, 40);
		panelA.add(lblA_2);

		JLabel lblA_3 = new JLabel("New label");
		lblA_3.setBounds(107, 10, 40, 40);
		panelA.add(lblA_3);

		JLabel lblA_4 = new JLabel("New label");
		lblA_4.setBounds(156, 10, 40, 40);
		panelA.add(lblA_4);

		JLabel lblA_5 = new JLabel("New label");
		lblA_5.setBounds(202, 10, 40, 40);
		panelA.add(lblA_5);

		JLabel lblA_6 = new JLabel("New label");
		lblA_6.setBounds(248, 10, 40, 40);
		panelA.add(lblA_6);

		JLabel lblA_Bonus = new JLabel("New label");
		lblA_Bonus.setBounds(308, 10, 40, 40);
		panelA.add(lblA_Bonus);

//		---------- Panel_B ----------
//		---------- lbl ----------

		JPanel panelB = new JPanel();
		panelB.setBounds(90, 210, 360, 60);
		panel.add(panelB);
		panelB.setLayout(null);

		JLabel lblB_1 = new JLabel("New label");
		lblB_1.setBounds(12, 10, 40, 40);
		panelB.add(lblB_1);

		JLabel lblB_2 = new JLabel("New label");
		lblB_2.setBounds(61, 10, 40, 40);
		panelB.add(lblB_2);

		JLabel lblB_3 = new JLabel("New label");
		lblB_3.setBounds(107, 10, 40, 40);
		panelB.add(lblB_3);

		JLabel lblB_4 = new JLabel("New label");
		lblB_4.setBounds(156, 10, 40, 40);
		panelB.add(lblB_4);

		JLabel lblB_5 = new JLabel("New label");
		lblB_5.setBounds(202, 10, 40, 40);
		panelB.add(lblB_5);

		JLabel lblB_6 = new JLabel("New label");
		lblB_6.setBounds(248, 10, 40, 40);
		panelB.add(lblB_6);

		JLabel lblB_Bonus = new JLabel("New label");
		lblB_Bonus.setBounds(308, 10, 40, 40);
		panelB.add(lblB_Bonus);

//		---------- Panel_C ----------
//		---------- lbl ----------

		JPanel panelC = new JPanel();
		panelC.setBounds(90, 280, 360, 60);
		panel.add(panelC);
		panelC.setLayout(null);

		JLabel lblC_1 = new JLabel("New label");
		lblC_1.setBounds(12, 10, 40, 40);
		panelC.add(lblC_1);

		JLabel lblC_2 = new JLabel("New label");
		lblC_2.setBounds(61, 10, 40, 40);
		panelC.add(lblC_2);

		JLabel lblC_3 = new JLabel("New label");
		lblC_3.setBounds(107, 10, 40, 40);
		panelC.add(lblC_3);

		JLabel lblC_4 = new JLabel("New label");
		lblC_4.setBounds(156, 10, 40, 40);
		panelC.add(lblC_4);

		JLabel lblC_5 = new JLabel("New label");
		lblC_5.setBounds(202, 10, 40, 40);
		panelC.add(lblC_5);

		JLabel lblC_6 = new JLabel("New label");
		lblC_6.setBounds(248, 10, 40, 40);
		panelC.add(lblC_6);

		JLabel lblC_Bonus = new JLabel("New label");
		lblC_Bonus.setBounds(308, 10, 40, 40);
		panelC.add(lblC_Bonus);

//		---------- Panel_D ----------
//		---------- lbl ----------

		JPanel panelD = new JPanel();
		panelD.setBounds(90, 350, 360, 60);
		panel.add(panelD);
		panelD.setLayout(null);

		JLabel lblD_1 = new JLabel("New label");
		lblD_1.setBounds(12, 10, 40, 40);
		panelD.add(lblD_1);

		JLabel lblD_2 = new JLabel("New label");
		lblD_2.setBounds(61, 10, 40, 40);
		panelD.add(lblD_2);

		JLabel lblD_3 = new JLabel("New label");
		lblD_3.setBounds(107, 10, 40, 40);
		panelD.add(lblD_3);

		JLabel lblD_4 = new JLabel("New label");
		lblD_4.setBounds(156, 10, 40, 40);
		panelD.add(lblD_4);

		JLabel lblD_5 = new JLabel("New label");
		lblD_5.setBounds(202, 10, 40, 40);
		panelD.add(lblD_5);

		JLabel lblD_6 = new JLabel("New label");
		lblD_6.setBounds(248, 10, 40, 40);
		panelD.add(lblD_6);

		JLabel lblD_Bonus = new JLabel("New label");
		lblD_Bonus.setBounds(308, 10, 40, 40);
		panelD.add(lblD_Bonus);

//		---------- Panel_E ----------
//		---------- lbl ----------

		JPanel panelE = new JPanel();
		panelE.setBounds(90, 420, 360, 60);
		panel.add(panelE);
		panelE.setLayout(null);

		JLabel lblE_1 = new JLabel("New label");
		lblE_1.setBounds(12, 10, 40, 40);
		panelE.add(lblE_1);

		JLabel lblE_2 = new JLabel("New label");
		lblE_2.setBounds(61, 10, 40, 40);
		panelE.add(lblE_2);

		JLabel lblE_3 = new JLabel("New label");
		lblE_3.setBounds(107, 10, 40, 40);
		panelE.add(lblE_3);

		JLabel lblE_4 = new JLabel("New label");
		lblE_4.setBounds(156, 10, 40, 40);
		panelE.add(lblE_4);

		JLabel lblE_5 = new JLabel("New label");
		lblE_5.setBounds(202, 10, 40, 40);
		panelE.add(lblE_5);

		JLabel lblE_6 = new JLabel("New label");
		lblE_6.setBounds(248, 10, 40, 40);
		panelE.add(lblE_6);

		JLabel lblE_Bonus = new JLabel("New label");
		lblE_Bonus.setBounds(308, 10, 40, 40);
		panelE.add(lblE_Bonus);

		// ---------- Sub_Panel_ImageIcon ----------

		ImageIcon A_1 = new ImageIcon();
		ImageIcon A_2 = new ImageIcon();
		ImageIcon A_3 = new ImageIcon();
		ImageIcon A_4 = new ImageIcon();
		ImageIcon A_5 = new ImageIcon();
		ImageIcon A_6 = new ImageIcon();
		ImageIcon A_Bonus = new ImageIcon();

		ImageIcon B_1 = new ImageIcon();
		ImageIcon B_2 = new ImageIcon();
		ImageIcon B_3 = new ImageIcon();
		ImageIcon B_4 = new ImageIcon();
		ImageIcon B_5 = new ImageIcon();
		ImageIcon B_6 = new ImageIcon();
		ImageIcon B_Bonus = new ImageIcon();

		ImageIcon C_1 = new ImageIcon();
		ImageIcon C_2 = new ImageIcon();
		ImageIcon C_3 = new ImageIcon();
		ImageIcon C_4 = new ImageIcon();
		ImageIcon C_5 = new ImageIcon();
		ImageIcon C_6 = new ImageIcon();
		ImageIcon C_Bonus = new ImageIcon();

		ImageIcon D_1 = new ImageIcon();
		ImageIcon D_2 = new ImageIcon();
		ImageIcon D_3 = new ImageIcon();
		ImageIcon D_4 = new ImageIcon();
		ImageIcon D_5 = new ImageIcon();
		ImageIcon D_6 = new ImageIcon();
		ImageIcon D_Bonus = new ImageIcon();

		ImageIcon E_1 = new ImageIcon();
		ImageIcon E_2 = new ImageIcon();
		ImageIcon E_3 = new ImageIcon();
		ImageIcon E_4 = new ImageIcon();
		ImageIcon E_5 = new ImageIcon();
		ImageIcon E_6 = new ImageIcon();
		ImageIcon E_Bonus = new ImageIcon();

		// ---------- Button ----------

		JButton btnPrevious = new JButton("이전");
		btnPrevious.setBounds(90, 547, 110, 37);
		panel.add(btnPrevious);

		JButton btnNext = new JButton("다음");
		btnNext.setBounds(257, 547, 110, 37);

		panel.add(btnNext);

	}
}
