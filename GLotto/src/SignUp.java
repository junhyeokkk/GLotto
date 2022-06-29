import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Member {
	   private String Name;
	   private String ID;
	   private String Pw; 
	   private String Pw2;
	   private int Fnum; // 주민 앞자리
	   private int Bnum; // 주민 뒷자리
	   private int FPhone; // 중간 전화번호
	   private int SPhone; // 뒷 전화번호
	   
	   public Member() {
	      new Member("최준혁","aaa","bbb","bbb",991111,1111111,3450,7418);
	      new Member("김정욱","bbb","bbb","bbb",992222,1111111,1234,7418);
	      new Member("이한주","ccc","bbb","bbb",993333,1111111,2345,7418);
	      new Member("최장호","ddd","bbb","bbb",994444,1111111,3456,7418);
	      new Member("전지현","eee","bbb","bbb",995555,1111111,4567,7418);
	   }
	   
	   /**
	    * @return the name
	    */
	   public String getName() {
	      return Name;
	   }

	   /**
	    * @param name the name to set
	    */
	   public void setName(String name) {
	      Name = name;
	   }

	   /**
	    * @return the iD
	    */
	   public String getID() {
	      return ID;
	   }

	   /**
	    * @param iD the iD to set
	    */
	   public void setID(String iD) {
	      ID = iD;
	   }

	   /**
	    * @return the pw
	    */
	   public String getPw() {
	      return Pw;
	   }

	   /**
	    * @param pw the pw to set
	    */
	   public void setPw(String pw) {
	      Pw = pw;
	   }

	   /**
	    * @return the pw2
	    */
	   public String getPw2() {
	      return Pw2;
	   }

	   /**
	    * @param pw2 the pw2 to set
	    */
	   public void setPw2(String pw2) {
	      Pw2 = pw2;
	   }

	   /**
	    * @return the fnum
	    */
	   public int getFnum() {
	      return Fnum;
	   }

	   /**
	    * @param fnum the fnum to set
	    */
	   public void setFnum(int fnum) {
	      Fnum = fnum;
	   }

	   /**
	    * @return the bnum
	    */
	   public int getBnum() {
	      return Bnum;
	   }

	   /**
	    * @param bnum the bnum to set
	    */
	   public void setBnum(int bnum) {
	      Bnum = bnum;
	   }

	   /**
	    * @return the fPhone
	    */
	   public int getFPhone() {
	      return FPhone;
	   }

	   /**
	    * @param fPhone the fPhone to set
	    */
	   public void setFPhone(int fPhone) {
	      FPhone = fPhone;
	   }

	   /**
	    * @return the sPhone
	    */
	   public int getSPhone() {
	      return SPhone;
	   }

	   /**
	    * @param sPhone the sPhone to set
	    */
	   public void setSPhone(int sPhone) {
	      SPhone = sPhone;
	   }

	   public Member(String name, String iD, String pw, String pw2, int fnum, int bnum, int fPhone, int sPhone) {
	      super();
	      Name = name;
	      ID = iD;
	      Pw = pw;
	      Pw2 = pw2;
	      Fnum = fnum;
	      Bnum = bnum;
	      FPhone = fPhone;
	      SPhone = sPhone;
	   }

	   public boolean MatchPW(){
	      if(getPw() == getPw2()) {
	         return true;
	      }
	      else {
	      return false;
	      }
	   }

	}




public class SignUp extends JFrame {
	public SignUp() {
		JPanel pnl = new JPanel();
		pnl.setBackground(Color.WHITE);
		
		JLabel title = new JLabel("Lotto Member");
		title.setBounds(100, 50, 195, 36);
		title.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 33));

		JLabel name = new JLabel("이름  ");
		name.setBounds(12, 8, 60, 15); 
		JTextField nameText = new JTextField();
		nameText.setBounds(95, 5, 116, 21); 
		JPanel nameBand = new JPanel();
		nameBand.setBounds(0, 120, 384, 35);
		nameBand.setLayout(null);
		nameBand.add(name);
		nameBand.add(nameText);
		nameBand.setBackground(Color.WHITE);
		
		JLabel rrn = new JLabel("주민번호");
		rrn.setBounds(12, 11, 60, 15);
		JTextField rrnText1 = new JTextField(10);
		rrnText1.setBounds(95, 5, 116, 21);
		JLabel hyphen1 = new JLabel("-");
		hyphen1.setBounds(215, 8, 6, 15);
		JTextField rrnText2 = new JPasswordField(10);
		rrnText2.setBounds(226, 5, 116, 21);
		JPanel rrnBand = new JPanel();
		rrnBand.setBounds(0, 170, 384, 35);
		rrnBand.setLayout(null);
		rrnBand.add(rrn);
		rrnBand.add(rrnText1);
		rrnBand.add(hyphen1);
		rrnBand.add(rrnText2);
		
		rrnBand.setBackground(Color.WHITE);
		
		JLabel id = new JLabel("ID");
		id.setBounds(12, 11, 60, 15);
		JTextField idText = new JTextField(3);
		idText.setBounds(95, 5, 120, 21);
		JButton doubleCheck = new JButton("중복확인");
		doubleCheck.setBounds(220, 5, 87, 21);
		JPanel idBand = new JPanel();
		idBand.setBounds(0, 220, 384, 35);
		idBand.setLayout(null);
		idBand.add(id);
		idBand.add(idText);
		idBand.add(doubleCheck);
		
		idBand.setBackground(Color.WHITE);
		
		
		JLabel pw = new JLabel("PW");
		pw.setBounds(12, 11, 60, 15);
		JTextField pwText = new JPasswordField(10);
		pwText.setBounds(95, 5, 120, 21);
		JPanel pwBand = new JPanel();
		pwBand.setBounds(0, 270, 384, 35);
		pwBand.setLayout(null);
		pwBand.add(pw);
		pwBand.add(pwText);
		
		pwBand.setBackground(Color.WHITE);
		
		
		JLabel pw2 = new JLabel("PW2");
		pw2.setBounds(12, 11, 60, 15);
		JTextField pwText2 = new JPasswordField(10);
		pwText2.setBounds(95, 5, 120, 21);
		JPanel pwBand2 = new JPanel();
		pwBand2.setBounds(0, 320, 384, 35);
		pwBand2.setLayout(null);
		pwBand2.add(pw2);
		pwBand2.add(pwText2);
		pwBand2.setBackground(Color.WHITE);
		
		
		JLabel phoneNum = new JLabel("전화번호");
		phoneNum.setBounds(12, 11, 60, 15);
		JLabel hyphen2 = new JLabel("-");
		hyphen2.setBounds(166, 8, 6, 15);
		JTextField pText2 = new JTextField(5);
		pText2.setBounds(183, 5, 60, 21);
		JLabel hyphen3 = new JLabel("-");
		hyphen3.setBounds(255, 8, 6, 15);
		JTextField pText3 = new JTextField(5);
		pText3.setBounds(271, 5, 60, 21);
		JPanel phoneNumBand = new JPanel();
		phoneNumBand.setBounds(0, 370, 384, 35);
		phoneNumBand.setLayout(null);
		phoneNumBand.add(phoneNum);
		phoneNumBand.add(hyphen2);
		phoneNumBand.add(pText2);
		phoneNumBand.add(hyphen3);
		phoneNumBand.add(pText3);
		phoneNumBand.setBackground(Color.WHITE);
		
		
		JButton prev = new JButton("이전");
		prev.setBounds(80, 5, 70, 23);
		JButton signUp = new JButton("가입");
		signUp.setBounds(200, 5, 70, 23);
		JPanel underBtn = new JPanel();
		underBtn.setBounds(0, 455, 384, 35);
		underBtn.setLayout(null);
		underBtn.add(prev);
		underBtn.add(signUp);
		underBtn.setBackground(Color.WHITE);
		
		
		ImageIcon icon = new ImageIcon("images.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(70, 70, Image.SCALE_AREA_AVERAGING);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel image = new JLabel(changeIcon);
		image.setBounds(5, 13, 100, 100);
		

		
		
		pnl.setLayout(null);

		
		pnl.add(title);
		pnl.add(nameBand);
		pnl.add(rrnBand);
		pnl.add(idBand);
		pnl.add(pwBand);
		pnl.add(pwBand2);
		pnl.add(phoneNumBand);
		
		String[] firstPhoneNum = {"010", "011"};
		JComboBox comboBox = new JComboBox(firstPhoneNum);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(95, 5, 60, 21);
		phoneNumBand.add(comboBox);
		pnl.add(underBtn);
		pnl.add(image);
		
		getContentPane().add(pnl);
		
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		
		new SignUp().setVisible(true);
		
	}
}
