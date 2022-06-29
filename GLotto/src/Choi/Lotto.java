package Choi;

import java.awt.Image;
import java.awt.Toolkit;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.javafx.collections.MappingChange.Map;

class LottoNumber {
	// 오름차순 랜덤 숫자 7개 배열을 반환하는 메소드를 만들었다.
	List<Integer> lottoList;
	public LottoNumber() {
		Set<Integer> lottoNumber = new HashSet<Integer>();
		
		// 7개의 중복이 아닌 랜덤 수를 만들었다.
		while (lottoNumber.size() < 7) {
			int random = (int) (Math.random()*44 + 1);
			lottoNumber.add(random);
		}
		//랜덤 수 7개 뽑았다.
		// set 원소 7개를 필드의 arraylist에 넣었다
        lottoList = new ArrayList<>(lottoNumber);
        Collections.sort(lottoList);	// set원소값을 가지는 arraylist를 오름차순으로 정렬했다.
 
        System.out.println(lottoList);
        System.out.println(lottoList.get(0));	// 오름차순 된 list의 첫번째 원소 값을 보고 싶을때 
	}
	
}

public class Lotto extends JFrame {
	public Lotto() {
	//----------------------------제목------------------------------------------------//
		JLabel title = new JLabel("출력 확인");
	//----------------------------제목 끝------------------------------------------------//
		
	//----------------------------1등 랜덤 숫자 출력------------------------------------------------//
	LottoNumber lN = new LottoNumber();

	System.out.println("랜덤수" + lN.lottoList.get(0));
	System.out.println("랜덤수" + lN.lottoList.get(1));
	JPanel pnl = new JPanel();
	Toolkit kit = Toolkit.getDefaultToolkit();
	HashMap map = new HashMap();
	NumberToImage numbersImage = new NumberToImage();	// 랜덤 45개 이미지 가지는 클래스. 필드로 HashMap numberImage을 가진다.
	
	//	image == map.get("a"); 처음에 JLabel의 생성자에 ImageIcon을 Value로 가지는 map.get("a")를 넣었더니 JLabel은 Object를 
	// 가지는 생성자는 없다면서 오류가 났다. 그래서 map.get("a")를 형변환 (ImageIcon)map.get("a") 이걸로 변환했더니 적용이 되었다.
	JLabel[] lblAll = new JLabel[7];
	for (int i = 0; i < lblAll.length; i++) {
		lblAll[i] = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(i)));
		pnl.add(lblAll[i]);
	}
	// 배열 반복으로 가능하다.....!
//	JLabel lbl1 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(0)));	// 1등 첫번째 수.
//	pnl.add(lbl1);
//	JLabel lbl2 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(1)));	// 1등 두번째 수.
//	pnl.add(lbl2);
//	JLabel lbl3 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(2)));	// 1등 세번째 수.
//	pnl.add(lbl3);
//	JLabel lbl4 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(3)));	// 1등 네번째 수.
//	pnl.add(lbl4);
//	JLabel lbl5 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(4)));	// 1등 다섯번째 수.
//	pnl.add(lbl5);
//	JLabel lbl6 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(5)));	// 1등 여섯번째 수.
//	pnl.add(lbl6);
//	JLabel lbl7 = new JLabel((ImageIcon)numbersImage.numberImage.get(lN.lottoList.get(6)));	// 1등 보너스 수.
//	pnl.add(lbl7);

	//---------------------------1등 랜덤 숫자 출력 마지막-----------------------------------------------------//
	
	//---------------------------사용자 수 가져오기 ----------------------------------------------------//
	
	
	
	//---------------------------사용자 수 가져오기 마지막 ----------------------------------------------------//
	
	
	add(pnl);
	
	setSize(500, 500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	}
	
	public static void main(String[] args) {
		new Lotto().setVisible(true);
	
        
	}
}
