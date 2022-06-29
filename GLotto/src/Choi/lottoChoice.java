package Choi;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class lottoChoice extends JFrame {
	public lottoChoice() {
		JPanel pnl = new JPanel();
		JLabel titleLabel = new JLabel("번호입력");
		NumberToImage numbersImage = new NumberToImage();
		
		// 45개 객체 만들려다가 너무 오래 걸려서 배열로 만들었다.
		JLabel[] lblAll = new JLabel[45];
		for (int i = 0; i < 45; i++) {
		lblAll[i] = new JLabel((ImageIcon)numbersImage.numberImage.get(i)); 
		pnl.add(lblAll[i]);
		}
		//JLabel lbl1 = new JLabel((ImageIcon)numbersImage.numberImage.get(1));	// 1부터 45까지~.
		//pnl.add(lbl1);
		
		
		
		pnl.add(titleLabel);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new lottoChoice().setVisible(true);
	}

}
