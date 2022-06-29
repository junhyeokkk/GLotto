package Choi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> lottoNumber = new HashSet<Integer>();
		// 6개의 중복이 아닌 랜덤 수를 만들었다.
		while (lottoNumber.size() < 6) {
			int random = (int) (Math.random()*44 + 1);
			lottoNumber.add(random);
		}
		System.out.println(lottoNumber);	
		// set 원소 6개를 arraylist에 넣었다
        List<Integer> list = new ArrayList<>(lottoNumber);
        Collections.sort(list);	// set원소값을 가지는 arraylist를 오름차순으로 정렬했다.

        System.out.println(list);
        System.out.println(list.get(0));	// 오름차순 된 list의 첫번째 원소 값을 보고 싶을때 
        System.out.println("" + list.get(0) + list.get(1) + list.get(2) + list.get(3) + list.get(4) + list.get(5));
	}

}
