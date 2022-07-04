package Wook;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Choi.Lotto;
import Choi.NumberToImage;
import Choi.lottoChoice;
import java.awt.Font;

public class Dialog {
	Lotto lotto = new Lotto();
	lottoChoice choice = new lottoChoice();
	NumberToImage toImage = new NumberToImage();
//	Main main = new Main();

	
	private JDialog dialog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dialog window = new Dialog();
					window.dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public Dialog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		dialog = new JDialog();
		dialog.setBounds(100, 100, 573, 499);
		dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		dialog.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 560, 460);
		dialog.getContentPane().add(panel);
		panel.setLayout(null);

//		---------- Title ----------

		JLabel lblTitle = new JLabel("인생역전! 조상님이 알려준 6개 숫자!");
		lblTitle.setFont(new Font("굴림", Font.PLAIN, 30));
		lblTitle.setBounds(12, 10, 535, 59);
		panel.add(lblTitle);

//		---------- MainPanel ----------

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 99, 535, 306);
		panel.add(panel_1);
		panel_1.setLayout(null);

//		---------- Lotto Number ----------
		Toolkit kit = Toolkit.getDefaultToolkit();

		JLabel[] lblAll = new JLabel[45];
		int x = 10;
		int y = 10;
		int count = 0;
		for (int i = 0; i < lblAll.length; i++) {
			lblAll[i] = new JLabel((ImageIcon) toImage.numberImage.get(i));
			lblAll[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					System.out.println("클릭");
				}
			});
			panel_1.add(lblAll[i]);
			
			lblAll[i].setBounds(x, y, 40, 40);
			x += 50;
			count++;
			if (count == 10) {
				x = 10;
				y += 50;
			} if (count == 20) {
				x = 10;
				y += 50;
			} if (count == 30) {
				x = 10;
				y += 50;
			} if (count == 40) {
				x = 10;
				y += 50;
			}
		}

//		JLabel lblNum_1 = new JLabel("1");
//		lblNum_1.setBounds(12, 10, 40, 40);
//		panel_1.add(lblNum_1);
//
//		JLabel lblNum_2 = new JLabel("2");
//		lblNum_2.setBounds(64, 10, 40, 40);
//		panel_1.add(lblNum_2);
//
//		JLabel lblNum_3 = new JLabel("3");
//		lblNum_3.setBounds(116, 10, 40, 40);
//		panel_1.add(lblNum_3);
//
//		JLabel lblNum_4 = new JLabel("4");
//		lblNum_4.setBounds(168, 10, 40, 40);
//		panel_1.add(lblNum_4);
//
//		JLabel lblNum_5 = new JLabel("5");
//		lblNum_5.setBounds(220, 10, 40, 40);
//		panel_1.add(lblNum_5);
//
//		JLabel lblNum_6 = new JLabel("6");
//		lblNum_6.setBounds(272, 10, 40, 40);
//		panel_1.add(lblNum_6);
//
//		JLabel lblNum_7 = new JLabel("7");
//		lblNum_7.setBounds(324, 10, 40, 40);
//		panel_1.add(lblNum_7);
//
//		JLabel lblNum_8 = new JLabel("8");
//		lblNum_8.setBounds(376, 10, 40, 40);
//		panel_1.add(lblNum_8);
//
//		JLabel lblNum_9 = new JLabel("9");
//		lblNum_9.setBounds(428, 10, 40, 40);
//		panel_1.add(lblNum_9);
//
//		JLabel lblNum_10 = new JLabel("10");
//		lblNum_10.setBounds(480, 10, 40, 40);
//		panel_1.add(lblNum_10);
//
//		JLabel lblNum_11 = new JLabel("11");
//		lblNum_11.setBounds(12, 60, 40, 40);
//		panel_1.add(lblNum_11);
//
//		JLabel lblNum_12 = new JLabel("12");
//		lblNum_12.setBounds(64, 60, 40, 40);
//		panel_1.add(lblNum_12);
//
//		JLabel lblNum_13 = new JLabel("13");
//		lblNum_13.setBounds(116, 60, 40, 40);
//		panel_1.add(lblNum_13);
//
//		JLabel lblNum_14 = new JLabel("14");
//		lblNum_14.setBounds(168, 60, 40, 40);
//		panel_1.add(lblNum_14);
//
//		JLabel lblNum_15 = new JLabel("15");
//		lblNum_15.setBounds(220, 60, 40, 40);
//		panel_1.add(lblNum_15);
//
//		JLabel lblNum_16 = new JLabel("16");
//		lblNum_16.setBounds(272, 60, 40, 40);
//		panel_1.add(lblNum_16);
//
//		JLabel lblNum_17 = new JLabel("17");
//		lblNum_17.setBounds(324, 60, 40, 40);
//		panel_1.add(lblNum_17);
//
//		JLabel lblNum_18 = new JLabel("18");
//		lblNum_18.setBounds(376, 60, 40, 40);
//		panel_1.add(lblNum_18);
//
//		JLabel lblNum_19 = new JLabel("19");
//		lblNum_19.setBounds(428, 60, 40, 40);
//		panel_1.add(lblNum_19);
//
//		JLabel lblNum_20 = new JLabel("20");
//		lblNum_20.setBounds(480, 60, 40, 40);
//		panel_1.add(lblNum_20);
//
//		JLabel lblNum_21 = new JLabel("21");
//		lblNum_21.setBounds(12, 110, 40, 40);
//		panel_1.add(lblNum_21);
//
//		JLabel lblNum_22 = new JLabel("22");
//		lblNum_22.setBounds(64, 110, 40, 40);
//		panel_1.add(lblNum_22);
//
//		JLabel lblNum_23 = new JLabel("23");
//		lblNum_23.setBounds(116, 110, 40, 40);
//		panel_1.add(lblNum_23);
//
//		JLabel lblNum_24 = new JLabel("24");
//		lblNum_24.setBounds(168, 110, 40, 40);
//		panel_1.add(lblNum_24);
//
//		JLabel lblNum_25 = new JLabel("25");
//		lblNum_25.setBounds(220, 110, 40, 40);
//		panel_1.add(lblNum_25);
//
//		JLabel lblNum_26 = new JLabel("26");
//		lblNum_26.setBounds(272, 110, 40, 40);
//		panel_1.add(lblNum_26);
//
//		JLabel lblNum_27 = new JLabel("27");
//		lblNum_27.setBounds(324, 110, 40, 40);
//		panel_1.add(lblNum_27);
//
//		JLabel lblNum_28 = new JLabel("28");
//		lblNum_28.setBounds(376, 110, 40, 40);
//		panel_1.add(lblNum_28);
//
//		JLabel lblNum_29 = new JLabel("29");
//		lblNum_29.setBounds(428, 110, 40, 40);
//		panel_1.add(lblNum_29);
//
//		JLabel lblNum_30 = new JLabel("30");
//		lblNum_30.setBounds(480, 110, 40, 40);
//		panel_1.add(lblNum_30);
//
//		JLabel lblNum_31 = new JLabel("31");
//		lblNum_31.setBounds(12, 160, 40, 40);
//		panel_1.add(lblNum_31);
//
//		JLabel lblNum_32 = new JLabel("32");
//		lblNum_32.setBounds(64, 160, 40, 40);
//		panel_1.add(lblNum_32);
//
//		JLabel lblNum_33 = new JLabel("33");
//		lblNum_33.setBounds(116, 160, 40, 40);
//		panel_1.add(lblNum_33);
//
//		JLabel lblNum_34 = new JLabel("34");
//		lblNum_34.setBounds(168, 160, 40, 40);
//		panel_1.add(lblNum_34);
//
//		JLabel lblNum_35 = new JLabel("35");
//		lblNum_35.setBounds(220, 160, 40, 40);
//		panel_1.add(lblNum_35);
//
//		JLabel lblNum_36 = new JLabel("36");
//		lblNum_36.setBounds(272, 160, 40, 40);
//		panel_1.add(lblNum_36);
//
//		JLabel lblNum_37 = new JLabel("37");
//		lblNum_37.setBounds(324, 160, 40, 40);
//		panel_1.add(lblNum_37);
//
//		JLabel lblNum_38 = new JLabel("38");
//		lblNum_38.setBounds(376, 160, 40, 40);
//		panel_1.add(lblNum_38);
//
//		JLabel lblNum_39 = new JLabel("39");
//		lblNum_39.setBounds(428, 160, 40, 40);
//		panel_1.add(lblNum_39);
//
//		JLabel lblNum_40 = new JLabel("40");
//		lblNum_40.setBounds(480, 160, 40, 40);
//		panel_1.add(lblNum_40);
//
//		JLabel lblNum_41 = new JLabel("41");
//		lblNum_41.setBounds(12, 210, 40, 40);
//		panel_1.add(lblNum_41);
//
//		JLabel lblNum_42 = new JLabel("42");
//		lblNum_42.setBounds(64, 210, 40, 40);
//		panel_1.add(lblNum_42);
//
//		JLabel lblNum_43 = new JLabel("43");
//		lblNum_43.setBounds(116, 210, 40, 40);
//		panel_1.add(lblNum_43);
//
//		JLabel lblNum_44 = new JLabel("44");
//		lblNum_44.setBounds(168, 210, 40, 40);
//		panel_1.add(lblNum_44);
//
//		JLabel lblNum_45 = new JLabel("45");
//		lblNum_45.setBounds(220, 210, 40, 40);
//		panel_1.add(lblNum_45);

//		---------- Sub Label ----------

		JLabel btnClear = new JLabel("초기화");
		btnClear.setBounds(324, 266, 81, 30);
		panel_1.add(btnClear);

		JLabel btnRandom = new JLabel("랜덤");
		btnRandom.setBounds(428, 266, 81, 30);
		panel_1.add(btnRandom);

//		---------- Button ----------

		JButton btnCancel = new JButton("취소");
		btnCancel.setBounds(318, 415, 106, 35);
		panel.add(btnCancel);

		JButton btnBuy = new JButton("확인");
		btnBuy.setBounds(436, 415, 106, 35);
		panel.add(btnBuy);

		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(false);
			}
		});
		
		
	}

}
