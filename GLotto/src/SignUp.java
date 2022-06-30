import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class Member {
	private String Name;
	private String ID;
	private String Pw;
	private String Pw2;
	private String Fnum; // 주민 앞자리
	private String Bnum; // 주민 뒷자리
	private String FPhone;
	private String MPhone; // 중간 전화번호
	private String LPhone; // 뒷 전화번호
	

	

	public Member(String name, String iD, String pw, String pw2, String fnum, String bnum, String fPhone, String mPhone,
			String lPhone) {
		super();
		Name = name;
		ID = iD;
		Pw = pw;
		Pw2 = pw2;
		Fnum = fnum;
		Bnum = bnum;
		FPhone = fPhone;
		MPhone = mPhone;
		LPhone = lPhone;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getPw() {
		return Pw;
	}



	public void setPw(String pw) {
		Pw = pw;
	}



	public String getPw2() {
		return Pw2;
	}



	public void setPw2(String pw2) {
		Pw2 = pw2;
	}



	public String getFnum() {
		return Fnum;
	}



	public void setFnum(String fnum) {
		Fnum = fnum;
	}



	public String getBnum() {
		return Bnum;
	}



	public void setBnum(String bnum) {
		Bnum = bnum;
	}



	public String getFPhone() {
		return FPhone;
	}



	public void setFPhone(String fPhone) {
		FPhone = fPhone;
	}



	public String getMPhone() {
		return MPhone;
	}



	public void setMPhone(String mPhone) {
		MPhone = mPhone;
	}



	public String getLPhone() {
		return LPhone;
	}



	public void setLPhone(String lPhone) {
		LPhone = lPhone;
	}



	public boolean MatchPW() {
		if (getPw() == getPw2()) {
			return true;
		} else {
			return false;
		}
	}

}

public class SignUp extends JDialog {
	public SignUp() {
		
		setModal(true);
		setTitle("Green Lotto 회원가입");
		

		List<Member> memberList = new ArrayList<>(Arrays.asList());

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
		JTextField rrnText1 = new JTextField();
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
		JTextField idText = new JTextField();
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
		JTextField pwText = new JPasswordField();
		pwText.setBounds(95, 5, 120, 21);
		JPanel pwBand = new JPanel();
		pwBand.setBounds(0, 270, 384, 35);
		pwBand.setLayout(null);
		pwBand.add(pw);
		pwBand.add(pwText);

		pwBand.setBackground(Color.WHITE);

		JLabel pw2 = new JLabel("PW2");
		pw2.setBounds(12, 11, 60, 15);
		JTextField pwText2 = new JPasswordField();
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
		JTextField pText2 = new JTextField();
		pText2.setBounds(183, 5, 60, 21);
		JLabel hyphen3 = new JLabel("-");
		hyphen3.setBounds(255, 8, 6, 15);
		JTextField pText3 = new JTextField();
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

		JButton signUp = new JButton("가입하기");
		signUp.setBounds(90, 5, 200, 23);
		JPanel underBtn = new JPanel();
		underBtn.setBounds(0, 455, 384, 35);
		underBtn.setLayout(null);
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

		String[] firstPhoneNum = { "010", "011" };
		JComboBox comboBox = new JComboBox(firstPhoneNum);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(95, 5, 60, 21);
		phoneNumBand.add(comboBox);
		pnl.add(underBtn);
		pnl.add(image);

		getContentPane().add(pnl);

		setSize(400, 600);


		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				nameText.setText(null);
				idText.setText(null);
				pwText.setText(null);
				pwText2.setText(null);
				rrnText1.setText(null);
				rrnText2.setText(null);
				pText2.setText(null);
				pText3.setText(null);
			}
		});
		
		
		
		
		if (rrnText1.getText().length() >= 6) {
			rrnText2.requestFocus(true);
		}
			
		
		
		ActionListener litener = new ActionListener() {
			
			boolean memberPlusOk;
			String idCheck;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if (e.getActionCommand().equals("가입하기")) {
					System.out.println(pText2.getText().length());
	
					if (memberPlusOk == true && idCheck.equals(idText.getText())) {
						
						
						if (nameText.getText().equals("")) {
							JOptionPane.showMessageDialog(SignUp.this, "이름을 입력해 주세요.");
						}
						
						else if (!(rrnText1.getText().length() == 6 && rrnText2.getText().length() == 7)) {
							JOptionPane.showMessageDialog(SignUp.this, "주민번호를 확인해 주세요");
						} else if (!(pwText.getText().length() >= 8)) {
							JOptionPane.showMessageDialog(SignUp.this, "PW는 8자 이상이여야 합니다.");
						} else if (!pwText.getText().equals(pwText2.getText())){
							JOptionPane.showMessageDialog(SignUp.this, "PW1, PW2 가 다릅니다.");
						} else if (!((pText2.getText().length() == 3 || pText2.getText().length() == 4) && (pText3.getText().length() == 4))) {
							JOptionPane.showMessageDialog(SignUp.this, "전화번호를 확인해주세요");
						}
						
						else if (pwText.getText().equals(pwText2.getText())) {
							
							memberList.add(new Member(
									nameText.getText(), 
									idText.getText(), 
									pwText.getText(), 
									pwText2.getText(), 
									rrnText1.getText(), 
									rrnText2.getText(), 
									comboBox.getSelectedItem().toString(),
									pText2.getText(), 
									pText3.getText() ));
							JOptionPane.showMessageDialog(SignUp.this, "회원가입이 완료되었습니다.");
							nameText.setText(null);
							idText.setText(null);
							pwText.setText(null);
							pwText2.setText(null);
							rrnText1.setText(null);
							rrnText2.setText(null);
							pText2.setText(null);
							pText3.setText(null);
							
						} 
	
					} 
					else {
						JOptionPane.showMessageDialog(SignUp.this, "ID 중복확인을 해주세요.");
					}
				}
				
				else if (e.getActionCommand().equals("중복확인")) {
					
					if (idText.getText().length() >= 7) {
						boolean sameId = false;
						for (int i = 0; i < memberList.size(); i++) {
							if (memberList.get(i).getID().contains(idText.getText())) {
								sameId = true;
							} 
						}
						if (sameId == true){
								JOptionPane.showMessageDialog(SignUp.this, "이미 존재하는 ID 입니다.");
						} 
						else {
							JOptionPane.showMessageDialog(SignUp.this, "사용가능한 ID 입니다.");
							memberPlusOk = true;
							idCheck = idText.getText();
						}	
					} else {
						JOptionPane.showMessageDialog(SignUp.this, "ID를 7글자 이상 작성해 주세요.");
					}
				}
// 되라
			}
		};

		doubleCheck.addActionListener(litener);
		signUp.addActionListener(litener);

	}

	public static void main(String[] args) {
		new SignUp().setVisible(true);

	}
}
