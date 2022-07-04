package Choi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage extends JFrame{
	public MainPage() {
		NumberToImages numberToImages = new NumberToImages();
		
		JPanel pnl = new JPanel();
		JButton inputOpenButton = new JButton("inputOpenButton");
		JButton test = new JButton("test");
		
		UserChoiceNumber userChoiceNumber = new UserChoiceNumber();	// 이벤트 발생전에 호출을 하면 시간이 걸리지만 userChoiceNumber의 nextbutton이벤트 메소드를 설정하기 위해선 밖에 있어야 한다..
		
		inputOpenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌려서 UserChoiceNumber창이 켜집니다");
				System.out.println("*******************UserChoiceNumber창이 켜집니다*****************");
				userChoiceNumber.setVisible(true);
			}
		});
		
		userChoiceNumber.nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("userChoiceNumber에서 얻은 finalUserNumbersList 의 값은 = " + userChoiceNumber.getFinalUserNumbersList1());
				
				System.out.println("메인페이지에서 연 UserChoiceNumber의 nextButton에서만 지금 이벤트가 발생합니다.");
				System.out.println("*******************lotto창이 켜집니다*****************");
				Lotto resultLotto = new Lotto(); // 이벤트 발생전에 호출을 하면 자동으로 랜덤 당첨번호를 만들어서 들어가는데 시간이 걸린다.
				System.out.println("메인창에서 연  UserChoiceNumber의 nextButton를 눌려서 getUserNumbersCheck의 글자가 바뀜");
				for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList1().size(); i++) {
					resultLotto.getUserSelectNumberImages1()[i].setText("유저의 천원치 로또의 " + i + "번째 수는" + userChoiceNumber.getFinalUserNumbersList1().get(i));
					resultLotto.getUserSelectNumberImages1()[i].setIcon((ImageIcon)numberToImages.numberImage.get(userChoiceNumber.getFinalUserNumbersList1().get(i)));
					resultLotto.getUserSelectNumbers1().add(userChoiceNumber.getFinalUserNumbersList1().get(i));
					System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers1().get(i));
				}
				for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList2().size(); i++) {
					resultLotto.getUserSelectNumberImages2()[i].setText("유저의 천원치 로또의 " + i + "번째 수는" + userChoiceNumber.getFinalUserNumbersList2().get(i));
					resultLotto.getUserSelectNumberImages2()[i].setIcon((ImageIcon)numberToImages.numberImage.get(userChoiceNumber.getFinalUserNumbersList2().get(i)));
					resultLotto.getUserSelectNumbers2().add(userChoiceNumber.getFinalUserNumbersList2().get(i));
					System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers2().get(i));
				}
				for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList3().size(); i++) {
					resultLotto.getUserSelectNumberImages3()[i].setText("유저의 천원치 로또의 " + i + "번째 수는" + userChoiceNumber.getFinalUserNumbersList3().get(i));
					resultLotto.getUserSelectNumberImages3()[i].setIcon((ImageIcon)numberToImages.numberImage.get(userChoiceNumber.getFinalUserNumbersList3().get(i)));
					resultLotto.getUserSelectNumbers3().add(userChoiceNumber.getFinalUserNumbersList3().get(i));
					System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers3().get(i));
				}
				for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList4().size(); i++) {
					resultLotto.getUserSelectNumberImages4()[i].setText("유저의 천원치 로또의 " + i + "번째 수는" + userChoiceNumber.getFinalUserNumbersList4().get(i));
					resultLotto.getUserSelectNumberImages4()[i].setIcon((ImageIcon)numberToImages.numberImage.get(userChoiceNumber.getFinalUserNumbersList4().get(i)));
					resultLotto.getUserSelectNumbers4().add(userChoiceNumber.getFinalUserNumbersList4().get(i));
					System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers4().get(i));
				}
				for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList5().size(); i++) {
					resultLotto.getUserSelectNumberImages5()[i].setText("유저의 천원치 로또의 " + i + "번째 수는" + userChoiceNumber.getFinalUserNumbersList5().get(i));
					resultLotto.getUserSelectNumberImages5()[i].setIcon((ImageIcon)numberToImages.numberImage.get(userChoiceNumber.getFinalUserNumbersList5().get(i)));
					resultLotto.getUserSelectNumbers5().add(userChoiceNumber.getFinalUserNumbersList5().get(i));
					System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers5().get(i));
				}
				resultLotto.pnl.add(test);
				resultLotto.setVisible(true);
			}
		});
		
//		userChoiceNumber.nextButton.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("userChoiceNumber에서 얻은 finalUserNumbersList 의 값은 = " + userChoiceNumber.getFinalUserNumbersList2());
//				
//				System.out.println("메인페이지에서 연 UserChoiceNumber의 nextButton에서만 지금 이벤트가 발생합니다.");
//				System.out.println("*******************lotto창이 켜집니다*****************");
//				Lotto resultLotto = new Lotto(); // 이벤트 발생전에 호출을 하면 자동으로 랜덤 당첨번호를 만들어서 들어가는데 시간이 걸린다.
//				System.out.println("메인창에서 연  UserChoiceNumber의 nextButton를 눌려서 getUserNumbersCheck의 글자가 바뀜");
//				for (int i = 0; i < userChoiceNumber.getFinalUserNumbersList2().size(); i++) {
//					resultLotto.getUserSelectNumberImages2()[i].setText("유저의 천원치 로또의 " + i + "번째 수는" + userChoiceNumber.getFinalUserNumbersList2().get(i));
//					resultLotto.getUserSelectNumberImages2()[i].setIcon((ImageIcon)numberToImages.numberImage.get(userChoiceNumber.getFinalUserNumbersList2().get(i)));
//					resultLotto.getUserSelectNumbers2().add(userChoiceNumber.getFinalUserNumbersList2().get(i));
//					System.out.println("메인창에서 연 Lotto에 가져온 유저가 선택한" + i + "번째 번호는 " + resultLotto.getUserSelectNumbers2().get(i));
//				}
//				resultLotto.pnl.add(test);
//				resultLotto.setVisible(true);
//			}
//		});
		
		
		
		
		
		pnl.add(inputOpenButton);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new MainPage().setVisible(true);
	}

}

