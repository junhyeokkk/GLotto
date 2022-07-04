package Choi;

import java.util.ArrayList;
import java.util.List;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserChoiceNumber extends JFrame {
	List<Integer> finalUserNumbersList1;
	List<Integer> finalUserNumbersList2;
	List<Integer> finalUserNumbersList3;
	List<Integer> finalUserNumbersList4;
	List<Integer> finalUserNumbersList5;
	/////// 연습추가 /////
	JButton nextButton;
	
	
	//////////1등버튼////////
	public JButton winnerButton;
	//////////1등버튼///////
	
	
	
	public JButton getNextButton() {
		return nextButton;
	}
	/////// 연습추가끝 /////
	public List<Integer> getFinalUserNumbersList1() {
		return finalUserNumbersList1;
	}
	public List<Integer> getFinalUserNumbersList2() {
		return finalUserNumbersList2;
	}
	public List<Integer> getFinalUserNumbersList3() {
		return finalUserNumbersList3;
	}
	public List<Integer> getFinalUserNumbersList4() {
		return finalUserNumbersList4;
	}
	public List<Integer> getFinalUserNumbersList5() {
		return finalUserNumbersList5;
	}
	public UserChoiceNumber() {
		super("GridLayout");
		setLayout(new GridLayout(3,3));
		NumberToImages numberToImages = new NumberToImages();
		
//		lottoChoice[] lottochoiceList = new lottoChoice[5];
		lottoChoice lottochoice1 = new lottoChoice();
		lottoChoice lottochoice2 = new lottoChoice();
		lottoChoice lottochoice3 = new lottoChoice();
		lottoChoice lottochoice4 = new lottoChoice();
		lottoChoice lottochoice5 = new lottoChoice();
		
//		List<Integer>[] finalUserNumbersListAll = new ArrayList<Integer>(lottochoice[].getUserGetLottoNumbers());
		
		finalUserNumbersList1 = new ArrayList<Integer>(lottochoice1.getUserGetLottoNumbers());
		finalUserNumbersList2 = new ArrayList<Integer>(lottochoice2.getUserGetLottoNumbers());
		finalUserNumbersList3 = new ArrayList<Integer>(lottochoice3.getUserGetLottoNumbers());
		finalUserNumbersList4 = new ArrayList<Integer>(lottochoice4.getUserGetLottoNumbers());
		finalUserNumbersList5 = new ArrayList<Integer>(lottochoice5.getUserGetLottoNumbers());
		
		JPanel pnl = new JPanel();
		
		// 연습추가 //
		nextButton = new JButton("연습버튼 => 클릭시  Lotto로 넘어감");
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌러짐!");
				System.out.println("***" + "UserChoicNumber창에서 클릭한 nextButton에서 생기는 이벤트입니다. 유저가 선택한 번호는 바로 = " + lottochoice1.getUserGetLottoNumbers() + "***");
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		
		// 연습추가 끝//
		
		JButton lottoChoiceButton1 = new JButton("lottoChoiceButton1");
		JButton lottoChoiceButton2 = new JButton("lottoChoiceButton2");
		JButton lottoChoiceButton3 = new JButton("lottoChoiceButton3");
		JButton lottoChoiceButton4 = new JButton("lottoChoiceButton4");
		JButton lottoChoiceButton5 = new JButton("lottoChoiceButton5");
		
		
		JLabel userChoiceNumbersImages1[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages1.length; i++) {
			userChoiceNumbersImages1[i] = new JLabel((i + 1) + "번");
			pnl.add(userChoiceNumbersImages1[i]);
		}
		
		JLabel userChoiceNumbersImages2[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages2.length; i++) {
			userChoiceNumbersImages2[i] = new JLabel((i + 1) + "번");
			pnl.add(userChoiceNumbersImages2[i]);
		}
		
		JLabel userChoiceNumbersImages3[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages3.length; i++) {
			userChoiceNumbersImages3[i] = new JLabel((i + 1) + "번");
			pnl.add(userChoiceNumbersImages3[i]);
		}
		
		JLabel userChoiceNumbersImages4[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages4.length; i++) {
			userChoiceNumbersImages4[i] = new JLabel((i + 1) + "번");
			pnl.add(userChoiceNumbersImages4[i]);
		}
		
		JLabel userChoiceNumbersImages5[] = new JLabel[6];
		for (int i = 0; i < userChoiceNumbersImages5.length; i++) {
			userChoiceNumbersImages5[i] = new JLabel((i + 1) + "번");
			pnl.add(userChoiceNumbersImages5[i]);
		}
		
//////////////////////////////////////////////////// lottoChoice창으로 넘어가기 //////////////////////////////////////////////////////////		

		lottoChoiceButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce창이 켜집니다");
				lottochoice1.setVisible(true);
			}
		});
		

		lottoChoiceButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce2창이 켜집니다");
				lottochoice2.setVisible(true);
				
			}
		});
		
		lottoChoiceButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce3창이 켜집니다");
				lottochoice3.setVisible(true);
				
			}
		});
		
		lottoChoiceButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce4창이 켜집니다");
				lottochoice4.setVisible(true);
				
			}
		});
		
		lottoChoiceButton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 lottoChioce5창이 켜집니다");
				lottochoice5.setVisible(true);
				
			}
		});
		
		
		
		pnl.add(lottoChoiceButton1);
		pnl.add(lottoChoiceButton2);
		pnl.add(lottoChoiceButton3);
		pnl.add(lottoChoiceButton4);
		pnl.add(lottoChoiceButton5);
		
////////////////////////////////////////////////////lottoChoice창으로 넘어가기 끝 //////////////////////////////////////////////////////////			
		
		lottochoice1.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice1.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice1.getUserGetLottoNumbers().size(); i++) {
					finalUserNumbersList1.add(lottochoice1.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList1에 값이 들어갔을까?" + finalUserNumbersList1);
				for (int i = 0; i < lottochoice1.getUserGetLottoNumbers().size(); i++) {
//					userChoiceNumbersImages1[i].setText(" lottoChoice 숫자 = " + lottochoice1.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages1[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice1.getUserGetLottoNumbers().get(i)));
				}
			}
		});
		
		lottochoice2.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice2.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice2.getUserGetLottoNumbers().size(); i++) {
					getFinalUserNumbersList2().add(lottochoice2.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList2에 값이 들어갔을까?" + getFinalUserNumbersList2());
				for (int i = 0; i < lottochoice2.getUserGetLottoNumbers().size(); i++) {
//					userChoiceNumbersImages2[i].setText(" lottoChoice 숫자 = " + lottochoice2.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages2[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice2.getUserGetLottoNumbers().get(i)));
				}
			}
		});
		
		lottochoice3.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice3.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice3.getUserGetLottoNumbers().size(); i++) {
					getFinalUserNumbersList3().add(lottochoice3.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList3에 값이 들어갔을까?" + getFinalUserNumbersList3());
				for (int i = 0; i < lottochoice3.getUserGetLottoNumbers().size(); i++) {
//					userChoiceNumbersImages3[i].setText(" lottoChoice 숫자 = " + lottochoice3.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages3[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice3.getUserGetLottoNumbers().get(i)));
				}
			}
		});
		
		lottochoice4.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice4.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice4.getUserGetLottoNumbers().size(); i++) {
					getFinalUserNumbersList4().add(lottochoice4.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList4에 값이 들어갔을까?" + getFinalUserNumbersList4());
				for (int i = 0; i < lottochoice4.getUserGetLottoNumbers().size(); i++) {
//					userChoiceNumbersImages4[i].setText(" lottoChoice 숫자 = " + lottochoice4.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages4[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice4.getUserGetLottoNumbers().get(i)));
				}
			}
		});
		
		lottochoice5.getCheckButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lottoChoice에서 선택한 값을 어떻게 가져올까? UserChoiceNumber에서 연 lottoChoice의 [확인]버튼을 눌릴때 이벤트 설정해주면 된다.");
				System.out.println("UserChoiceNumber에서 [확인]버튼 눌려야만 나오는 결과값으로 " + lottochoice5.getUserGetLottoNumbers());
				for (int i = 0; i < lottochoice5.getUserGetLottoNumbers().size(); i++) {
					finalUserNumbersList5.add(lottochoice5.getUserGetLottoNumbers().get(i));
				}
				System.out.println("과연 finalUserNumbersList5에 값이 들어갔을까?" + finalUserNumbersList5);
				for (int i = 0; i < lottochoice5.getUserGetLottoNumbers().size(); i++) {
//					userChoiceNumbersImages5[i].setText(" lottoChoice 숫자 = " + lottochoice5.getUserGetLottoNumbers().get(i));
					userChoiceNumbersImages5[i].setIcon((ImageIcon)numberToImages.numberImage.get(lottochoice5.getUserGetLottoNumbers().get(i)));
				}
			}
		});
		
	winnerButton = new JButton("1등 번호받기");
		pnl.add(winnerButton);
		
		
	/////////////////////////////1등 버튼 끝///////////////////////	
		pnl.add(nextButton); // 연습버튼
		
		
		add(pnl);
		
		setSize(1000, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new UserChoiceNumber().setVisible(true);
	}
	
	
}
