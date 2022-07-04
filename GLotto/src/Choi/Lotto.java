package Choi;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class LottoNumber {
	// 오름차순 랜덤 숫자 7개 배열을 반환하는 메소드를 만들었다.
	List<Integer> lottoList; // 당첨번호

	public LottoNumber() {
		Set<Integer> lottoNumber = new HashSet<Integer>();

		// 7개의 중복이 아닌 랜덤 수를 만들었다.
		while (lottoNumber.size() < 7) {
			int random = (int) (Math.random() * 45 + 1);
			lottoNumber.add(random);
		}
		// 랜덤 수 7개 뽑았다.
		// set 원소 7개를 필드의 arraylist에 넣었다
		lottoList = new ArrayList<>(lottoNumber);
		Collections.sort(lottoList); // set원소값을 가지는 arraylist를 오름차순으로 정렬했다.

		System.out.println(lottoList);
//        System.out.println(lottoList.get(0));   // 오름차순 된 list의 첫번째 원소 값을 보고 싶을때 
	}

}

public class Lotto extends JFrame {
	public JPanel pnl;
//	private JButton resultButton1; // 유저의 번호와 당첨번호 비교하는 버튼
//	private JButton resultButton2;
//	private JButton resultButton3;
//	private JButton resultButton4;
//	private JButton resultButton5;

	private JLabel[] userSelectNumberImages1; // 유저가 선택한 번호의 이미지가 들어오는 Label 배열
	private JLabel[] userSelectNumberImages2;
	private JLabel[] userSelectNumberImages3;
	private JLabel[] userSelectNumberImages4;
	private JLabel[] userSelectNumberImages5;


	private List<Integer> userSelectNumbers1; // 유저가 선택한 번호가 들어가는 int배열
	private List<Integer> userSelectNumbers2;
	private List<Integer> userSelectNumbers3;
	private List<Integer> userSelectNumbers4;
	private List<Integer> userSelectNumbers5;

	private JButton[] resultButtonList;

	private JLabel[] rankResultList;

	public List<Integer> getUserSelectNumbers1() {
		return userSelectNumbers1;
	}
	public List<Integer> getUserSelectNumbers2() {
		return userSelectNumbers2;
	}
	public List<Integer> getUserSelectNumbers3() {
		return userSelectNumbers3;
	}
	public List<Integer> getUserSelectNumbers4() {
		return userSelectNumbers4;
	}
	public List<Integer> getUserSelectNumbers5() {
		return userSelectNumbers5;
	}

	public JLabel[] getUserSelectNumberImages1() {
		return userSelectNumberImages1;
	}
	public JLabel[] getUserSelectNumberImages2() {
		return userSelectNumberImages2;
	}
	public JLabel[] getUserSelectNumberImages3() {
		return userSelectNumberImages3;
	}
	public JLabel[] getUserSelectNumberImages4() {
		return userSelectNumberImages4;
	}
	public JLabel[] getUserSelectNumberImages5() {
		return userSelectNumberImages5;
	}

	public JPanel getPnl() {
		return pnl;
	}

	public Lotto() {
		pnl = new JPanel();
		// ----------------------------제목------------------------------------------------//
		JLabel winnerNumberTitle = new JLabel("<1등 번호>");
		pnl.add(winnerNumberTitle);
		// ----------------------------제목
		// 끝------------------------------------------------//

		// ----------------------------1등 랜덤 숫자
		// 출력------------------------------------------------//
		LottoNumber winnerNumbers = new LottoNumber();

		System.out.println("당첨번호 첫번째는" + (winnerNumbers.lottoList.get(0))); // LottoNumber의 당첨번호 확인할려고 출력함.
		Toolkit kit = Toolkit.getDefaultToolkit();
		HashMap map = new HashMap();
		NumberToImages numberToImages = new NumberToImages(); // 랜덤 45개 이미지 가지는 클래스. 필드로 HashMap numberImage을 가진다.

		// image == map.get("a"); 처음에 JLabel의 생성자에 ImageIcon을 Value로 가지는 map.get("a")를
		// 넣었더니 JLabel은 Object를
		// 가지는 생성자는 없다면서 오류가 났다. 그래서 map.get("a")를 형변환 (ImageIcon)map.get("a") 이걸로 변환했더니
		// 적용이 되었다.
		JLabel[] lblAll = new JLabel[7];
		for (int i = 0; i < lblAll.length; i++) {
			lblAll[i] = new JLabel((ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(i)));
			pnl.add(lblAll[i]);
		}
		// 배열 반복으로 가능하다.....!

		// ---------------------------1등 랜덤 숫자 출력
		// 마지막-----------------------------------------------------//

		// ---------------------------사용자 수 가져오기 시작
		// ----------------------------------------------------//
		userSelectNumbers1 = new ArrayList<>(); // 사용자가 선택한 수가 들어가는 ArrayList이다.
		userSelectNumbers2 = new ArrayList<>(); // 사용자가 선택한 수가 들어가는 ArrayList이다.
		userSelectNumbers3 = new ArrayList<>(); // 사용자가 선택한 수가 들어가는 ArrayList이다.
		userSelectNumbers4 = new ArrayList<>(); // 사용자가 선택한 수가 들어가는 ArrayList이다.
		userSelectNumbers5 = new ArrayList<>(); // 사용자가 선택한 수가 들어가는 ArrayList이다.

		userSelectNumberImages1 = new JLabel[6]; // 사용자가 선택한 수의 이미지 들어가는 라벨
		for (int i = 0; i < userSelectNumberImages1.length; i++) {
			userSelectNumberImages1[i] = new JLabel("[유저의 " + (i + 1) + "번째 번호]");
			pnl.add(userSelectNumberImages1[i]);
		}
		userSelectNumberImages2 = new JLabel[6]; // 사용자가 선택한 수의 이미지 들어가는 라벨
		for (int i = 0; i < userSelectNumberImages2.length; i++) {
			userSelectNumberImages2[i] = new JLabel("[유저의 " + (i + 1) + "번째 번호]");
			pnl.add(userSelectNumberImages2[i]);
		}
		userSelectNumberImages3 = new JLabel[6]; // 사용자가 선택한 수의 이미지 들어가는 라벨
		for (int i = 0; i < userSelectNumberImages3.length; i++) {
			userSelectNumberImages3[i] = new JLabel("[유저의 " + (i + 1) + "번째 번호]");
			pnl.add(userSelectNumberImages3[i]);
		}
		userSelectNumberImages4 = new JLabel[6]; // 사용자가 선택한 수의 이미지 들어가는 라벨
		for (int i = 0; i < userSelectNumberImages4.length; i++) {
			userSelectNumberImages4[i] = new JLabel("[유저의 " + (i + 1) + "번째 번호]");
			pnl.add(userSelectNumberImages4[i]);
		}
		userSelectNumberImages5 = new JLabel[6]; // 사용자가 선택한 수의 이미지 들어가는 라벨
		for (int i = 0; i < userSelectNumberImages5.length; i++) {
			userSelectNumberImages5[i] = new JLabel("[유저의 " + (i + 1) + "번째 번호]");
			pnl.add(userSelectNumberImages5[i]);
		}
		// 메인페이지를 작동시키면 userSelectNumbers[i]에 UserChoiceNumber의 번호이미지를 가져 올 것이다.
		// UserChoiceNumber의 번호는 userChoiceNumber.getFinalUserNumbersList().get(i)로
		// 가져온다.

		// ---------------------------사용자 수 가져오기 마지막
		// ----------------------------------------------------//
		//////////////////////////////////////// 맞은 번호 색칠되기
		//////////////////////////////////////// /////////////////////////////////////////////

		rankResultList = new JLabel[5];
		for (int i = 0; i < rankResultList.length; i++) {
			rankResultList[i] = new JLabel("나의 등수는?!");
		}
//		JLabel rankResult1 = new JLabel("나의 등수는 ???????");
//		JLabel rankResult2 = new JLabel("나의 등수는 ???????");
//		JLabel rankResult3 = new JLabel("나의 등수는 ???????");
//		JLabel rankResult4 = new JLabel("나의 등수는 ???????");
//		JLabel rankResult5 = new JLabel("나의 등수는 ???????");

		resultButtonList = new JButton[5];
		for (int i = 0; i < resultButtonList.length; i++) {
			resultButtonList[i] = new JButton((i + 1) + "번째 결과 버튼");
		}
//		resultButton1 = new JButton("결과알아보기버튼");
//		resultButton2 = new JButton("결과알아보기버튼");
//		resultButton3 = new JButton("결과알아보기버튼");
//		resultButton4 = new JButton("결과알아보기버튼");
//		resultButton5 = new JButton("결과알아보기버튼");
		for (int i = 0; i < 5; i++)
		resultButtonList[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // ***오류발생**** 보너스 번호를 비교하는 코드가 아에 없다.
				int count = 0;
				System.out.println("userSelectNumbers 의 사이즈는 = " + userSelectNumbers1.size());
				for (int i = 0; i < userSelectNumbers1.size(); i++) {
					System.out.println("userSelectNumbers의 " + i + "번째 번호는 = " + userSelectNumbers1.get(i));
					System.out.println("1등 번호의" + i + "번째 번호는 = " + winnerNumbers.lottoList.get(i));
					if (userSelectNumbers1.contains(winnerNumbers.lottoList.get(i))) { // 당첨 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
						System.out.println("맞은 번호 = " + winnerNumbers.lottoList.get(i)); // 사용자번호와 당첨번호가 같으면 당첨번호를 출력하게
																							// 했다.
						// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
						System.out.println(
								"맞은번호는 유저의 몇번째 번호인가? = " + userSelectNumbers1.indexOf(winnerNumbers.lottoList.get(i))); 
						// 당첨번호가 유저의 몇번째 번호인지 알아야지 유저의 몇번째 이미지를 바꾼다.
						// 결과버튼을 눌리면 당첨번호가 있는 유저의 이미지를 바꾼다.
						// 유저의 이미지(당첨번호가 있는 인덱스) 번호를 바꾼다 (당첨번호 + 45)로
//               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon(null);
						userSelectNumberImages1[userSelectNumbers1.indexOf(winnerNumbers.lottoList.get(i))].setIcon(
								(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(i) + 45));
//               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon((ImageIcon)numberToImages.numberImage.get(winnerNumbers.lottoList.get(i + 45)));  // **오류** lottoList.get(i + 45)는 lottoList의 (45 + i)번째 값을 보여준다는 뜻이다. 
						// 유저의 당첨번호 위치 인덱스 값 // 당첨번호 + 45의 값
						count++;
					}
					if (userSelectNumbers1.contains(winnerNumbers.lottoList.get(6))) { // 보너스 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
						System.out.println("보너스점수로 맞았다");
						userSelectNumberImages1[userSelectNumbers1.indexOf(winnerNumbers.lottoList.get(6))].setIcon(
								(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(6) + 90));
					}
					System.out.println("결과버튼이 눌러졌습니다.");
				}
				///////////////////////// 1등 ~6등 ///////////////////////////
					if (count == 6) {
						System.out.println("1등");
						rankResultList[0].setText("1등");
					}
					if (count == 5 && userSelectNumbers1.contains(winnerNumbers.lottoList.get(6))) {
						System.out.println("2등");
						rankResultList[0].setText("2등");
					}
					if (count == 5) {
						System.out.println("3등");
						rankResultList[0].setText("3등");
					}
					if (count == 4) {
						System.out.println("4등");
						rankResultList[0].setText("4등");
					}
					if (count == 3) {
						System.out.println("5등");
						rankResultList[0].setText("5등");
					}
					if (count <= 2) {
						System.out.println("낙첨");
						rankResultList[0].setText("낙첨");
					}
				
				///////////////////////// 1등 ~6등 ///////////////////////////
			}
		});
//====================================================================	2번	=======================================//
		
			resultButtonList[1].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) { // ***오류발생**** 보너스 번호를 비교하는 코드가 아에 없다.
					int count = 0;
					System.out.println("userSelectNumbers2 의 사이즈는 = " + userSelectNumbers2.size());
					for (int i = 0; i < userSelectNumbers2.size(); i++) {
						System.out.println("userSelectNumbers2의 " + i + "번째 번호는 = " + userSelectNumbers2.get(i));
						System.out.println("1등 번호의" + i + "번째 번호는 = " + winnerNumbers.lottoList.get(i));
						if (userSelectNumbers2.contains(winnerNumbers.lottoList.get(i))) { // 당첨 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
							System.out.println("맞은 번호 = " + winnerNumbers.lottoList.get(i)); // 사용자번호와 당첨번호가 같으면 당첨번호를 출력하게
																								// 했다.
							// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
							System.out.println(
									"맞은번호는 유저의 몇번째 번호인가? = " + userSelectNumbers2.indexOf(winnerNumbers.lottoList.get(i))); 
							// 당첨번호가 유저의 몇번째 번호인지 알아야지 유저의 몇번째 이미지를 바꾼다.
							// 결과버튼을 눌리면 당첨번호가 있는 유저의 이미지를 바꾼다.
							// 유저의 이미지(당첨번호가 있는 인덱스) 번호를 바꾼다 (당첨번호 + 45)로
//	               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon(null);
							userSelectNumberImages2[userSelectNumbers2.indexOf(winnerNumbers.lottoList.get(i))].setIcon(
									(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(i) + 45));
//	               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon((ImageIcon)numberToImages.numberImage.get(winnerNumbers.lottoList.get(i + 45)));  // **오류** lottoList.get(i + 45)는 lottoList의 (45 + i)번째 값을 보여준다는 뜻이다. 
							// 유저의 당첨번호 위치 인덱스 값 // 당첨번호 + 45의 값
							count++;
						}
						if (userSelectNumbers2.contains(winnerNumbers.lottoList.get(6))) { // 보너스 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
							System.out.println("보너스점수로 맞았다");
							userSelectNumberImages2[userSelectNumbers2.indexOf(winnerNumbers.lottoList.get(6))].setIcon(
									(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(6) + 90));
						}
						System.out.println("결과버튼이 눌러졌습니다.");
					}
					///////////////////////// 1등 ~6등 ///////////////////////////
						if (count == 6) {
							System.out.println("1등");
							rankResultList[1].setText("1등");
						}
						if (count == 5 && userSelectNumbers2.contains(winnerNumbers.lottoList.get(6))) {
							System.out.println("2등");
							rankResultList[1].setText("2등");
						}
						if (count == 5) {
							System.out.println("3등");
							rankResultList[1].setText("3등");
						}
						if (count == 4) {
							System.out.println("4등");
							rankResultList[1].setText("4등");
						}
						if (count == 3) {
							System.out.println("5등");
							rankResultList[1].setText("5등");
						}
						if (count <= 2) {
							System.out.println("낙첨");
							rankResultList[1].setText("낙첨");
						}
					
					///////////////////////// 1등 ~6등 ///////////////////////////
				}
			});
			
			resultButtonList[2].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) { // ***오류발생**** 보너스 번호를 비교하는 코드가 아에 없다.
					int count = 0;
					System.out.println("userSelectNumbers3 의 사이즈는 = " + userSelectNumbers3.size());
					for (int i = 0; i < userSelectNumbers3.size(); i++) {
						System.out.println("userSelectNumbers3의 " + i + "번째 번호는 = " + userSelectNumbers3.get(i));
						System.out.println("1등 번호의" + i + "번째 번호는 = " + winnerNumbers.lottoList.get(i));
						if (userSelectNumbers3.contains(winnerNumbers.lottoList.get(i))) { // 당첨 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
							System.out.println("맞은 번호 = " + winnerNumbers.lottoList.get(i)); // 사용자번호와 당첨번호가 같으면 당첨번호를 출력하게
																								// 했다.
							// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
							System.out.println(
									"맞은번호는 유저의 몇번째 번호인가? = " + userSelectNumbers3.indexOf(winnerNumbers.lottoList.get(i))); 
							// 당첨번호가 유저의 몇번째 번호인지 알아야지 유저의 몇번째 이미지를 바꾼다.
							// 결과버튼을 눌리면 당첨번호가 있는 유저의 이미지를 바꾼다.
							// 유저의 이미지(당첨번호가 있는 인덱스) 번호를 바꾼다 (당첨번호 + 45)로
//	               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon(null);
							userSelectNumberImages3[userSelectNumbers3.indexOf(winnerNumbers.lottoList.get(i))].setIcon(
									(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(i) + 45));
//	               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon((ImageIcon)numberToImages.numberImage.get(winnerNumbers.lottoList.get(i + 45)));  // **오류** lottoList.get(i + 45)는 lottoList의 (45 + i)번째 값을 보여준다는 뜻이다. 
							// 유저의 당첨번호 위치 인덱스 값 // 당첨번호 + 45의 값
							count++;
						}
						if (userSelectNumbers3.contains(winnerNumbers.lottoList.get(6))) { // 보너스 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
							System.out.println("보너스점수로 맞았다");
							userSelectNumberImages3[userSelectNumbers3.indexOf(winnerNumbers.lottoList.get(6))].setIcon(
									(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(6) + 90));
						}
						System.out.println("결과버튼이 눌러졌습니다.");
					}
					///////////////////////// 1등 ~6등 ///////////////////////////
						if (count == 6) {
							System.out.println("1등");
							rankResultList[2].setText("1등");
						}
						if (count == 5 && userSelectNumbers3.contains(winnerNumbers.lottoList.get(6))) {
							System.out.println("2등");
							rankResultList[2].setText("2등");
						}
						if (count == 5) {
							System.out.println("3등");
							rankResultList[2].setText("3등");
						}
						if (count == 4) {
							System.out.println("4등");
							rankResultList[2].setText("4등");
						}
						if (count == 3) {
							System.out.println("5등");
							rankResultList[2].setText("5등");
						}
						if (count <= 2) {
							System.out.println("낙첨");
							rankResultList[2].setText("낙첨");
						}
					
					///////////////////////// 1등 ~6등 ///////////////////////////
				}
			});
			
			resultButtonList[3].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) { // ***오류발생**** 보너스 번호를 비교하는 코드가 아에 없다.
					int count = 0;
					System.out.println("userSelectNumbers4 의 사이즈는 = " + userSelectNumbers4.size());
					for (int i = 0; i < userSelectNumbers4.size(); i++) {
						System.out.println("userSelectNumbers4의 " + i + "번째 번호는 = " + userSelectNumbers4.get(i));
						System.out.println("1등 번호의" + i + "번째 번호는 = " + winnerNumbers.lottoList.get(i));
						if (userSelectNumbers4.contains(winnerNumbers.lottoList.get(i))) { // 당첨 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
							System.out.println("맞은 번호 = " + winnerNumbers.lottoList.get(i)); // 사용자번호와 당첨번호가 같으면 당첨번호를 출력하게
																								// 했다.
							// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
							System.out.println(
									"맞은번호는 유저의 몇번째 번호인가? = " + userSelectNumbers4.indexOf(winnerNumbers.lottoList.get(i))); 
							// 당첨번호가 유저의 몇번째 번호인지 알아야지 유저의 몇번째 이미지를 바꾼다.
							// 결과버튼을 눌리면 당첨번호가 있는 유저의 이미지를 바꾼다.
							// 유저의 이미지(당첨번호가 있는 인덱스) 번호를 바꾼다 (당첨번호 + 45)로
//	               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon(null);
							userSelectNumberImages3[userSelectNumbers4.indexOf(winnerNumbers.lottoList.get(i))].setIcon(
									(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(i) + 45));
//	               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon((ImageIcon)numberToImages.numberImage.get(winnerNumbers.lottoList.get(i + 45)));  // **오류** lottoList.get(i + 45)는 lottoList의 (45 + i)번째 값을 보여준다는 뜻이다. 
							// 유저의 당첨번호 위치 인덱스 값 // 당첨번호 + 45의 값
							count++;
						}
						if (userSelectNumbers4.contains(winnerNumbers.lottoList.get(6))) { // 보너스 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
							System.out.println("보너스점수로 맞았다");
							userSelectNumberImages4[userSelectNumbers4.indexOf(winnerNumbers.lottoList.get(6))].setIcon(
									(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(6) + 90));
						}
						System.out.println("결과버튼이 눌러졌습니다.");
					}
					///////////////////////// 1등 ~6등 ///////////////////////////
						if (count == 6) {
							System.out.println("1등");
							rankResultList[3].setText("1등");
						}
						if (count == 5 && userSelectNumbers4.contains(winnerNumbers.lottoList.get(6))) {
							System.out.println("2등");
							rankResultList[3].setText("2등");
						}
						if (count == 5) {
							System.out.println("3등");
							rankResultList[3].setText("3등");
						}
						if (count == 4) {
							System.out.println("4등");
							rankResultList[3].setText("4등");
						}
						if (count == 3) {
							System.out.println("5등");
							rankResultList[3].setText("5등");
						}
						if (count <= 2) {
							System.out.println("낙첨");
							rankResultList[3].setText("낙첨");
						}
					
					///////////////////////// 1등 ~6등 ///////////////////////////
				}
			});
			
			resultButtonList[4].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) { // ***오류발생**** 보너스 번호를 비교하는 코드가 아에 없다.
					int count = 0;
					System.out.println("userSelectNumbers5 의 사이즈는 = " + userSelectNumbers5.size());
					for (int i = 0; i < userSelectNumbers5.size(); i++) {
						System.out.println("userSelectNumbers4의 " + i + "번째 번호는 = " + userSelectNumbers5.get(i));
						System.out.println("1등 번호의" + i + "번째 번호는 = " + winnerNumbers.lottoList.get(i));
						if (userSelectNumbers5.contains(winnerNumbers.lottoList.get(i))) { // 당첨 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
							System.out.println("맞은 번호 = " + winnerNumbers.lottoList.get(i)); // 사용자번호와 당첨번호가 같으면 당첨번호를 출력하게
																								// 했다.
							// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
							System.out.println(
									"맞은번호는 유저의 몇번째 번호인가? = " + userSelectNumbers5.indexOf(winnerNumbers.lottoList.get(i))); 
							// 당첨번호가 유저의 몇번째 번호인지 알아야지 유저의 몇번째 이미지를 바꾼다.
							// 결과버튼을 눌리면 당첨번호가 있는 유저의 이미지를 바꾼다.
							// 유저의 이미지(당첨번호가 있는 인덱스) 번호를 바꾼다 (당첨번호 + 45)로
//	               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon(null);
							userSelectNumberImages5[userSelectNumbers5.indexOf(winnerNumbers.lottoList.get(i))].setIcon(
									(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(i) + 45));
//	               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon((ImageIcon)numberToImages.numberImage.get(winnerNumbers.lottoList.get(i + 45)));  // **오류** lottoList.get(i + 45)는 lottoList의 (45 + i)번째 값을 보여준다는 뜻이다. 
							// 유저의 당첨번호 위치 인덱스 값 // 당첨번호 + 45의 값
							count++;
						}
						if (userSelectNumbers5.contains(winnerNumbers.lottoList.get(6))) { // 보너스 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
							System.out.println("보너스점수로 맞았다");
							userSelectNumberImages5[userSelectNumbers5.indexOf(winnerNumbers.lottoList.get(6))].setIcon(
									(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(6) + 90));
						}
						System.out.println("결과버튼이 눌러졌습니다.");
					}
					///////////////////////// 1등 ~6등 ///////////////////////////
						if (count == 6) {
							System.out.println("1등");
							rankResultList[4].setText("1등");
						}
						if (count == 5 && userSelectNumbers5.contains(winnerNumbers.lottoList.get(6))) {
							System.out.println("2등");
							rankResultList[4].setText("2등");
						}
						if (count == 5) {
							System.out.println("3등");
							rankResultList[4].setText("3등");
						}
						if (count == 4) {
							System.out.println("4등");
							rankResultList[4].setText("4등");
						}
						if (count == 3) {
							System.out.println("5등");
							rankResultList[4].setText("5등");
						}
						if (count <= 2) {
							System.out.println("낙첨");
							rankResultList[4].setText("낙첨");
						}
					
					///////////////////////// 1등 ~6등 ///////////////////////////
				}
			});
//		resultButton1.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) { // ***오류발생**** 보너스 번호를 비교하는 코드가 아에 없다.
//				int count = 0;
//				System.out.println("userSelectNumbers 의 사이즈는 = " + userSelectNumbers1.size());
//				for (int i = 0; i < userSelectNumbers1.size(); i++) {
//					System.out.println("userSelectNumbers의 " + i + "번째 번호는 = " + userSelectNumbers1.get(i));
//					System.out.println("1등 번호의" + i + "번째 번호는 = " + winnerNumbers.lottoList.get(i));
//					if (userSelectNumbers1.contains(winnerNumbers.lottoList.get(i))) { // 당첨 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
//						System.out.println("맞은 번호 = " + winnerNumbers.lottoList.get(i)); // 사용자번호와 당첨번호가 같으면 당첨번호를 출력하게
//																							// 했다.
//						// 당첨번호가 유저의 인덱스 몇번째인지 알아야 하고 그 번호를 이미지로 바꿀것이다.
//						System.out.println(
//								"맞은번호는 유저의 몇번째 번호인가? = " + userSelectNumbers1.indexOf(winnerNumbers.lottoList.get(i))); 
//						// 당첨번호가 유저의 몇번째 번호인지 알아야지 유저의 몇번째 이미지를 바꾼다.
//						// 결과버튼을 눌리면 당첨번호가 있는 유저의 이미지를 바꾼다.
//						// 유저의 이미지(당첨번호가 있는 인덱스) 번호를 바꾼다 (당첨번호 + 45)로
////               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon(null);
//						userSelectNumberImages1[userSelectNumbers1.indexOf(winnerNumbers.lottoList.get(i))].setIcon(
//								(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(i) + 45));
////               userSelectNumberImages[userSelectNumbers.indexOf(winnerNumbers.lottoList.get(i))].setIcon((ImageIcon)numberToImages.numberImage.get(winnerNumbers.lottoList.get(i + 45)));  // **오류** lottoList.get(i + 45)는 lottoList의 (45 + i)번째 값을 보여준다는 뜻이다. 
//						// 유저의 당첨번호 위치 인덱스 값 // 당첨번호 + 45의 값
//						count++;
//					}
//					if (userSelectNumbers1.contains(winnerNumbers.lottoList.get(6))) { // 보너스 번호 맞으면 사용자의 당첨번호 라벨 이미지 바뀜
//						System.out.println("보너스점수로 맞았다");
//						userSelectNumberImages1[userSelectNumbers1.indexOf(winnerNumbers.lottoList.get(6))].setIcon(
//								(ImageIcon) numberToImages.numberImage.get(winnerNumbers.lottoList.get(6) + 90));
//					}
//					System.out.println("결과버튼이 눌러졌습니다.");
//				}
//				///////////////////////// 1등 ~6등 ///////////////////////////
//				for (int i = 0; i < 5; i++) {
//					if (count == 6) {
//						System.out.println("1등");
//						rankResultList[i].setText("1등");
//					}
//					if (count == 5 && userSelectNumbers1.contains(winnerNumbers.lottoList.get(6))) {
//						System.out.println("2등");
//						rankResultList[i].setText("2등");
//					}
//					if (count == 5) {
//						System.out.println("3등");
//						rankResultList[i].setText("3등");
//					}
//					if (count == 4) {
//						System.out.println("4등");
//						rankResultList[i].setText("4등");
//					}
//					if (count == 3) {
//						System.out.println("5등");
//						rankResultList[i].setText("5등");
//					}
//					if (count <= 2) {
//						System.out.println("낙첨");
//						rankResultList[i].setText("낙첨");
//					}
//				}
//				///////////////////////// 1등 ~6등 ///////////////////////////
//			}
//		});
		for (int i = 0; i < 5; i++) {
			pnl.add(rankResultList[i]);
			pnl.add(resultButtonList[i]);
		}
		

		//////////////////////////////////////// 맞은 번호 색칠되기 끝
		//////////////////////////////////////// /////////////////////////////////////////////

		// ----------------------------- 등수 매기기 마지막
		// ---------------------------------------//
		add(pnl);

		setSize(1000, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Lotto().setVisible(true);

	}
}
