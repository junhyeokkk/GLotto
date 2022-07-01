package Choi;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class lottoChoice extends JFrame {
	HashSet<Integer> choiceLottoNumbers = new HashSet<>();	// 유저가 선택하는 숫자
	int clickNumber;	// 유저가 선택한 이미지객체의 숫자가 맞을때 까지 반복하기
	List<Integer> UserGetLottoNumbers = new ArrayList<Integer>(choiceLottoNumbers);	// 유저가 선택 or 자동으로 선택한 숫자들 리스트
	JPanel pnl;
	JPanel selectPnl;

	public JPanel getPnl() {
		return pnl;
	}

	public JPanel getSelectPnl() {
		return selectPnl;
	}

	public lottoChoice() {
		super("GridLayout");
		setLayout(new GridLayout(3,3));
		pnl = new JPanel();
		selectPnl = new JPanel();
		JLabel titleLabel = new JLabel("번호입력");
		JLabel UserNumberImage[] = new JLabel[6];
		for (int i = 0; i < UserNumberImage.length; i++) {
			UserNumberImage[i] = new JLabel("번호 이미지" + (i));
	//		pnl.add(UserNumberImage[i]);
			selectPnl.add(UserNumberImage[i]);
		}
		NumberToImages numberToImage = new NumberToImages();
		JButton autoButton = new JButton("자동버튼");
		JButton resetButton = new JButton("RESET");
		JButton checkButton = new JButton("확인");

		// 45개 객체 만들려다가 너무 오래 걸려서 배열로 만들었다.
//////////////////////////////////////////////////// 로또 번호 정하는 파트//////////////////////////////////////////////
		JLabel[] lblAll = new JLabel[45];
		for (int i = 0; i < lblAll.length; i++) {
			lblAll[i] = new JLabel((ImageIcon) numberToImage.numberImage.get(i + 1));	// 0부터 44까지 되기때문에 +1을 했다.
			pnl.add(lblAll[i]);
			////////////Label 이벤트 45개 만들었다 + 라벨 클릭하면 번호 담는 메소드 추가함/////////////////
			lblAll[i].addMouseListener(new MouseAdapter() {
				int clickcount = 0; // 해당 라벨을 클릭 하는 횟수 	// 밖에 넣은 이유는 안에 넣으면 계속 클릭횟수 1번으로만 인식한다.
				@Override
				public void mousePressed(MouseEvent e) {
					JLabel clickLabel = (JLabel) e.getSource(); // 이벤트가 발생하는 라벨을 clickLabel라는 새로운 Label을 만들었다.
					if (choiceLottoNumbers.size() == 0) {	// Reset했을때 clickcount는 리셋이 안되어서 리셋하는 조건문을 만들었다.
						clickcount = 0;
					}
					if (choiceLottoNumbers.size() < 7 && UserGetLottoNumbers.size() < 6) {	//	6개 다찼을때는 조건문이 바로 나가져서 Label 취소가 안된다. 그래서 size를 6에서 7로 바꾸었다. 번호 추가는 6개만 되게 했다.
														// UserGetLottoNumber < 6 한 이유는  자동버튼으로 번호 다 채웠는데 숫자 클릭하면 모든 값이 초기화 되고 선택한 값이 들어갔기 때문이다. 

						for (int i = 0; i < lblAll.length; i++) {
							
							if (clickLabel.equals(lblAll[i])) { // 클릭 이벤트가 발생한 객체의 source와 label이미지객체의 source가 같으면 click 횟수가 증가한다. 나중에 삭제할때 쓸려고
								clickcount++;					// 횟수 알게했다.
								clickNumber = (i + 1);			// 클릭라벨과 (lblAll 라벨의 숫자 + 1) 값 같으면 그 숫자가 나오게 했다. 
								System.out.println("클릭한 이미지 번호 = " + clickNumber + ", 클릭 횟수 = " + clickcount);
							}
						}
						if (clickcount % 2 != 0 && choiceLottoNumbers.size() < 6) {
							lblAll[clickNumber - 1].setIcon((ImageIcon) numberToImage.numberImage.get(clickNumber + 45));	//수정 할꺼!!!!
							choiceLottoNumbers.add(clickNumber); // set을 사용한 이유는 제거함에 있어서 원소값만 제거하면 되므로 과정이 더 편해서 이걸
																	// 선택했다.
						} else if (clickcount % 2 == 0) {	// 짝수번 클릭했을때 그 원소 삭제하게 했다.
							choiceLottoNumbers.remove(clickNumber);
							System.out.println("삭제됨!");
							lblAll[clickNumber - 1].setIcon((ImageIcon) numberToImage.numberImage.get((clickNumber)));
						} else {
							System.out.println("6개 다참");
						}
						System.out.println("set" + choiceLottoNumbers.toString());
						// set으로 가져온 값들을 오름차순 정렬했다.
						
						UserGetLottoNumbers = new ArrayList<Integer>(choiceLottoNumbers);		// 참조값이 바뀌는거 같다. 아마 set을 생성자로 가지는 ArrayList를 생성해서 참조값이 바뀐것 같다.
						
						Collections.sort(UserGetLottoNumbers);
						System.out.println("내가 선택한 로또 숫자는 = " + UserGetLottoNumbers);
					} else {
						System.out.println("6개 숫자 다 선택되었습니다.");
					}
					// System.out.println(lblTest);
					// System.out.println(numbersImage.numberImage.keySet().toArray()[0]); // 45개
					// 이미지 맵의 키를 순서대로 가져오는 방법 키를 가져오면 map쓴 이유가 없다...
				}
			});
			////////////Label 이벤트 45개 끝/////////////////
		}
////////////////////////////////////////////////////로또 번호 정하는 파트 + 라벨 클릭하면 번호 담는 메소드 끝//////////////////////////////////////////////
		// JLabel lbl1 = new JLabel((ImageIcon)numbersImage.numberImage.get(1)); // 1부터
		// 45까지~.
		// pnl.add(lbl1);
		
		
		/////////////////////////////////////////// 자동 버튼 만들기 시작///////////////////////////////////////////////////////
		autoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String result = null;
				if (UserGetLottoNumbers.size() == 0) {
					result = "자동";
				} if (UserGetLottoNumbers.size() >= 1 && UserGetLottoNumbers.size() < 6) {
					result = "반자동";
				}
				while (UserGetLottoNumbers.size() < 6) {
					int random = (int) (Math.random()*45 + 1);
					choiceLottoNumbers.add(random);
					UserGetLottoNumbers = new ArrayList<Integer>(choiceLottoNumbers);		// 랜덤 숫자 이미지 삽입 이랑 순서 바뀌어서 중복숫자가 뽑혔다...
					lblAll[random - 1].setIcon((ImageIcon) numberToImage.numberImage.get((random) + 45));
					Collections.sort(UserGetLottoNumbers);
				}
				System.out.println(result + "로또 숫자는 = " + UserGetLottoNumbers);
				
//				if (SequenceChoiceLottoNumbers.size() < 1) {
//					System.out.println("자동");
//					for (int i = 0; i < 6; i++) {
//						int random = (int) (Math.random()*44 + 1);
//						SequenceChoiceLottoNumbers.add(random);
//					}
//					Collections.sort(SequenceChoiceLottoNumbers);
//					System.out.println("자동 로또 숫자는 = " + SequenceChoiceLottoNumbers);
//				} else if (SequenceChoiceLottoNumbers.size() >= 1 && SequenceChoiceLottoNumbers.size() < 6) {
//					System.out.println("반자동");
//					for (int i = 0; i < (7 - SequenceChoiceLottoNumbers.size()); i++) {	//size는 채워지면 1부터 시작이니깐 마지막 범위를 7까지 해야함.
//						int random = (int) (Math.random()*44 + 1);
//						SequenceChoiceLottoNumbers.add(random);
//					}
//					Collections.sort(SequenceChoiceLottoNumbers);
//					System.out.println("반자동 로또 숫자는 = " + SequenceChoiceLottoNumbers);
//				} else {
//					System.out.println("6개 다찼습니다~~");
//				}
			}
		});	
		/////////////////////////////////////////// 자동 버튼 만들기 마지막///////////////////////////////////////////////////////

		
		//////////////////////////////////////////////////확인 버튼 시작/////////////////////////////////////////////////////
		checkButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (UserGetLottoNumbers.size() == 6) {
					for (int i = 0; i < 6; i++) {
						UserNumberImage[i].setIcon((ImageIcon)numberToImage.numberImage.get(UserGetLottoNumbers.get(i)));		// URL에서 숫자 0 이 이미지 1이다. 즉 숫자와 이미지가 완전히 대응되는게 아닌 이미지가 숫자 + 1의 값이 되었다.
					}
				}  
				else {
					System.out.println("번호 입력하세요");
				}
			}
		});
		
		//////////////////////////////////////////////////확인 버튼 끝/////////////////////////////////////////////////////
		
		
		
		/////////////////////////////////////////// Reset버튼 만들기 시작 ////////////////////////////////////////////////////
		resetButton.addActionListener(new ActionListener() {		// *오류가 났다 RESET을 하면 자동으로 받은 번호는 지워지지만 유저가 선택한 번호는 지워지지 않는다. **이거 오늘 꼭 해결한다
																	// 의심가는거 1번 UserGetLottoNumbers의 remove에서 값을 잘못 넣은것 (x) choiceLottoNumbers.clear(); -> List모든 값을 없애는 메소드를 썼지만 오류가 났다.
																	// 2번 69번째 줄에서 new를 만들었기 때문에 참조가 바뀌었나?
																	// 확실한건 Random으로 받아 넣은 List참조값과 클릭해서 즉 Select으로 받아 넣은 List참조값
																	// 3번 논리 자체가 잘못되어서 갈아야 하나...? 제발.... 아니길
																	// *****해결***** SET값도 없애야지만 초기화가 됐다.
																	// RESET버튼을 눌리면 List값은 다 지워지지만 Set값은 남아있다. 그상태에서 숫자를 선택하면 지워지지않은 Set의 숫자와 클릭해서 생긴 Set숫자가 다 List안에 추가되게 된다.
			@Override
			public void actionPerformed(ActionEvent e) {
				if (UserGetLottoNumbers.size() > 0) {
	//				choiceLottoNumbers.remove(choiceLottoNumbers);
	//				choiceLottoNumbers.remove(choiceLottoNumbers);
					for (int i = 0; i < 6; i++) {	// clear하고 난 뒤 이미지를 지우면 데이터 값이 없으므로 index가 없어 index 오류가 나타난다.
						lblAll[UserGetLottoNumbers.get(i) - 1].setIcon((ImageIcon) numberToImage.numberImage.get(UserGetLottoNumbers.get(i)));
						UserNumberImage[i].setIcon(null);	// URL에서 숫자 0 이 이미지 1이다. 즉 숫자와 이미지가 완전히 대응되는게 아닌 이미지가 숫자 + 1의 값이 되었다.
					}
					choiceLottoNumbers.clear();				// Set을 지우니깐 해결되었다!!!!					
					UserGetLottoNumbers.clear();
			//		UserGetLottoNumbers.removeAll(choiceLottoNumbers);		// 자동으로 받은 번호만 지워졌다.
					System.out.println("리셋되면" + UserGetLottoNumbers.size());
					//	lblAll[UserGetLottoNumbers.get(i) - 1].setIcon((ImageIcon) numberToImage.numberImage.get(UserGetLottoNumbers.get(i)));
				}
				else {
					System.out.println("리셋할 값이 없습니다.");
				} 
			}
		});
		/////////////////////////////////////////// Reset버튼 만들기 마지막 ////////////////////////////////////////////////////


		pnl.add(checkButton);
		pnl.add(autoButton);
		pnl.add(resetButton);
		pnl.add(titleLabel);

		add(selectPnl);
		add(pnl);

		setSize(1000, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new lottoChoice().setVisible(true);
	}

}