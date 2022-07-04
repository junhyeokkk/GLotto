package Choi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class RankingSystem extends JFrame{

	public static void main(String[] args) {
		LottoNumber winnerNumber = new LottoNumber();
//	Set<Integer> randomNumber = new HashSet<Integer>();
//		while (randomNumber.size() < 6) {
//			int random = (int) (Math.random()*45 + 1);
//			randomNumber.add(random);
//		}
        List<Integer> myNumber = new ArrayList<>(winnerNumber.lottoList);
        Collections.sort(myNumber);
//       myNumber = winnerNumber.lottoList;
       myNumber.remove(6);
       myNumber.remove(5);
       myNumber.remove(4);
       myNumber.remove(3);
       myNumber.remove(2);
       myNumber.remove(1);
       myNumber.add(11);
       myNumber.add(10);
       myNumber.add(9);
       myNumber.add(0);
       myNumber.add(0);
       int count = 0;
       System.out.println(myNumber);
        for(int i = 0; i < myNumber.size(); i++) {
			if(myNumber.contains(winnerNumber.lottoList.get(i))) {
				System.out.println("맞는숫자는 = " + winnerNumber.lottoList.get(i));
				count++;
			}
        }
        if(count == 6) {
        	System.out.println("1등");
        }
        if(count == 5 && myNumber.contains(winnerNumber.lottoList.get(6))) {
        	System.out.println("2등");
        }
        if(count == 5) {
        	System.out.println("3등");
        }
        if(count == 4) {
        	System.out.println("4등");
        }
        if(count == 3) {
        	System.out.println("5등");
        }
        if(count <= 2) {
        	System.out.println("낙첨");
        }
	}
}
