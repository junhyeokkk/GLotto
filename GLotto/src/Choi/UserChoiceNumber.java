package Choi;

import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserChoiceNumber extends JFrame {
	List<Integer> finalUserNumbersList;
	/////// 연습추가 /////
	JButton nextButton;
	
	
	//////////1등버튼////////
	public JButton winnerButton;
	//////////1등버튼///////
	
	
	
	public JButton getNextButton() {
		return nextButton;
	}
	/////// 연습추가끝 /////
	public List<Integer> getFinalUserNumbersList() {
		return finalUserNumbersList;
	}

	public UserChoiceNumber() {
		NumberToImages numberToImages = new NumberToImages();
		
		lottoChoice lottochoice = new lottoChoice();
		finalUserNumbersList = new ArrayList<Integer>(lottochoice.getUserGetLottoNumbers());
		JPanel pnl = new JPanel();
		
		// 연습추가 //
		nextButton = new JButton("연습버튼 => 클릭시  Lotto로 넘어감");
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌러짐!");
				System.out.println("***" + "UserChoicNumber창에서 클릭한 nextButton에서 생기는 이벤트입니다. 유저가 선택한 번호는 바로 = " + lottochoice.getUserGetLottoNumbers() + "***");
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		pnl.add(nextButton);
		// 연습추가 끝//
		
		
		JLabel userChoiceNumbersImages[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages.length; i++) {
			userChoiceNumbersImages[i] = new JLabel("천원치 lottoChoice 숫자" + i + "번이 들어갈 자리");
			pnl.add(userChoiceNumbersImages[i]);
		}
	//	JLabel lbl = new JLabel("ddd");
//		JLabel lbl1 = new JLabel("ddd");
//		JLabel lbl2 = new JLabel("ddd");
//		JLabel lbl3 = new JLabel("ddd");
//		JLabel lbl4 = new JLabel("ddd");
//		JLabel lbl5 = new JLabel("ddd");
		
//////////////////////////////////////////////////// lottoChoice창으로 넘어가기 //////////////////////////////////////////////////////////		
		JButton lottoChoiceButton = new JButton("lottoChoiceButton");

		lottoChoiceButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce창이 켜집니다");
				lottochoice.setVisible(true);
			}
		});
		
		JButton lottoChoiceButton2 = new JButton("lottoChoiceButton2");

		lottoChoiceButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce2창이 켜집니다");
				lottochoice.setVisible(true);
			}
		});
		
		pnl.add(lottoChoiceButton);
		pnl.add(lottoChoiceButton2);
		
////////////////////////////////////////////////////lottoChoice창으로 넘어가기 끝 //////////////////////////////////////////////////////////			
		
		lottochoice.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice.getUserGetLottoNumbers().size(); i++) {
					finalUserNumbersList.add(lottochoice.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList에 값이 들어갔을까?" + finalUserNumbersList);
				for (int i = 0; i < lottochoice.getUserGetLottoNumbers().size(); i++) {
					userChoiceNumbersImages[i].setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice.getUserGetLottoNumbers().get(i)));
				}
				
//				lbl1.setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(1));
//				lbl2.setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(2));
//				lbl3.setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(3));
//				lbl4.setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(4));
//				lbl4.setText(" lottoChoice 숫자 = " + lottochoice.getUserGetLottoNumbers().get(5));

	//			lbl.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(0)));
//				lbl1.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(1)));
//				lbl2.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(2)));
//				lbl3.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(3)));
//				lbl4.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(4)));
//				lbl5.setIcon((ImageIcon)numberToImage.numberImage.get(lottochoice.getUserGetLottoNumbers().get(5)));

			}
		});
		
//		lottochoice.getPractice().addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println( "lottochoic에서 가져온 숫자는 = " + lottochoice.getUserGetLottoNumbers());
//			}
//		});
		
	winnerButton = new JButton("1등 번호받기");
		pnl.add(winnerButton);
		
	/////////////////////////////1등 버튼 끝///////////////////////	
		
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new UserChoiceNumber().setVisible(true);
	}
}
