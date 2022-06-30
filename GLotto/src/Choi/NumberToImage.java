package Choi;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//// 숫자를 입력하면 숫자와 같은 이미지가 나오는 클래스를 만들었다.
public class NumberToImage extends JFrame {
	public HashMap numberImage = new HashMap();

	public NumberToImage() {
		JPanel pnl = new JPanel();

		Toolkit kit = Toolkit.getDefaultToolkit();

		URL[] urlAll = new URL[45];

		for (int i = 0; i < urlAll.length; i++) {
			urlAll[i] = Lotto.class.getClassLoader().getResource("resource/images/" + (i + 1) + ".png");
			ImageIcon image = new ImageIcon(kit.getImage(urlAll[i]).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
			numberImage.put(i, image);
		}

		// urlAll[0] = Lotto.class.getClassLoader().getResource(imagePng);
		// 숫자 -> 이미지 , 숫자값 받으면 이미지 가져오는 과정 시작//
		// 이미지를 반복해서 불러올수 있게 하는 방법은 뭘까....?

// 		String imagePng = "images/" + 1 + ".png";
//		URL url = Lotto.class.getClassLoader().getResource("images/1.png");
//		ImageIcon image = new ImageIcon(kit.getImage(url).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//		numberImage.put(1, image);
		// 숫자 -> 이미지 , 숫자값 받으면 이미지 가져오는 과정 끝//

//		URL url2 = Lotto.class.getClassLoader().getResource("images/2.png");
//		ImageIcon image2 = new ImageIcon(kit.getImage(url2).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//		numberImage.put(2, image2);
//		
//		URL url3 = Lotto.class.getClassLoader().getResource("images/3.png");
//		ImageIcon image3 = new ImageIcon(kit.getImage(url3).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//		numberImage.put(3, image3);
//		
//		URL url4 = Lotto.class.getClassLoader().getResource("images/4.png");
//		ImageIcon image4 = new ImageIcon(kit.getImage(url4).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//		numberImage.put(4, image4);
//		
//		URL url5 = Lotto.class.getClassLoader().getResource("images/5.png");
//		ImageIcon image5 = new ImageIcon(kit.getImage(url5).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//		numberImage.put(5, image5);
//		
//		URL url6 = Lotto.class.getClassLoader().getResource("images/6.png");
//		ImageIcon image6 = new ImageIcon(kit.getImage(url6).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//		numberImage.put(6, image6);
//		
//		URL url7 = Lotto.class.getClassLoader().getResource("images/7.png");
//		ImageIcon image7 = new ImageIcon(kit.getImage(url7).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//		numberImage.put(7, image7);
//		
//		URL url8 = Lotto.class.getClassLoader().getResource("images/8.png");
//		ImageIcon image8 = new ImageIcon(kit.getImage(url8).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//		numberImage.put(8, image8);
//		
//		URL url9 = Lotto.class.getClassLoader().getResource("images/9.png");
//		ImageIcon image9 = new ImageIcon(kit.getImage(url9).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//		numberImage.put(9, image9);
//		
//		URL url10 = Lotto.class.getClassLoader().getResource("images/10.png");
//		ImageIcon image10 = new ImageIcon(kit.getImage(url10).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
//		numberImage.put(10, image10);
//		
//		JLabel lbl = new JLabel((ImageIcon)numberImage.get(1));
//		JLabel lbl2 = new JLabel((ImageIcon)numberImage.get(2));
//		JLabel lbl3 = new JLabel((ImageIcon)numberImage.get(3));
//		JLabel lbl4 = new JLabel((ImageIcon)numberImage.get(4));
//		JLabel lbl5 = new JLabel((ImageIcon)numberImage.get(3));
//		JLabel lbl6 = new JLabel((ImageIcon)numberImage.get(3));
//		JLabel lbl7 = new JLabel((ImageIcon)numberImage.get(3));
//		
//		pnl.add(lbl);
//		pnl.add(lbl2);
//		pnl.add(lbl3);
//		pnl.add(lbl4);
//		pnl.add(lbl5);
//		pnl.add(lbl6);
//		pnl.add(lbl7);
//		add(pnl);
//		
//		setSize(500, 500);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new NumberToImages().setVisible(true);
	}

}
