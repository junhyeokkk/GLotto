import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame{

   
   private JTextField IDtext;
   private JPasswordField PWtext;
   Member m1;
   static Member m2;
   int wantIndexNumber = 0;
   String saveId;
   /**
    * Launch the application.
    */
   List<Member> memberList2 = new ArrayList<>(Arrays.asList());
   
   public Login() {

      SignUp sign = new SignUp();
      
      for (int i = 0; i < sign.memberList.size(); i++) {
      memberList2.add(new Member(
            sign.memberList.get(i).getName(), 
            sign.memberList.get(i).getID(), 
            sign.memberList.get(i).getPw(),
            sign.memberList.get(i).getFnum(),
            sign.memberList.get(i).getBnum(),
            sign.memberList.get(i).getFPhone(),
            sign.memberList.get(i).getMPhone(),
            sign.memberList.get(i).getLPhone()
            ));
      
      System.out.println(memberList2.get(i).getID());
      }
      
      
   
     
      getContentPane().setBackground(Color.CYAN);
      setBounds(100, 100, 452, 531);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.CYAN);
      panel.setBounds(0, 0, 436, 40);
      getContentPane().add(panel);
      
      JLabel lblNewLabel = new JLabel("Green Lotto");
     lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
     lblNewLabel.setForeground(Color.DARK_GRAY);
     panel.add(lblNewLabel);
     
     JPanel panel_1 = new JPanel();
     panel_1.setBackground(Color.CYAN);
     panel_1.setBounds(10, 50, 414, 243);
     getContentPane().add(panel_1);
     
     JLabel lblNewLabel_1 = new JLabel("");
     lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\\uB85C\uB610\uC774\uBBF8\uC9C0.png"));
     panel_1.add(lblNewLabel_1);
     
     JPanel panel_2 = new JPanel();
     panel_2.setBackground(Color.CYAN);
     panel_2.setBounds(10, 325, 414, 63);
     getContentPane().add(panel_2);
     panel_2.setLayout(null);
     
     JLabel lblNewLabel_2 = new JLabel("ID");
     lblNewLabel_2.setBounds(58, 8, 28, 18);
     lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 15));
     lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
     panel_2.add(lblNewLabel_2);
     
     IDtext = new JTextField();
     IDtext.setBounds(98, 5, 226, 21);
     panel_2.add(IDtext);
     IDtext.setColumns(20);
     
     JLabel lblNewLabel_2_1 = new JLabel("Password");
     lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
     lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 15));
     lblNewLabel_2_1.setBounds(12, 37, 76, 18);
     panel_2.add(lblNewLabel_2_1);
     
     PWtext = new JPasswordField();
     PWtext.setBounds(98, 36, 226, 21);
     panel_2.add(PWtext);
     
     JPanel panel_3 = new JPanel();
     panel_3.setBackground(Color.CYAN);
     panel_3.setBounds(10, 431, 414, 40);
     getContentPane().add(panel_3);
     panel_3.setLayout(null);
     
     JButton LoginBtn = new JButton("로그인");
     LoginBtn.setBackground(Color.WHITE);
     LoginBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        }
     });
     LoginBtn.setBounds(87, 5, 81, 23);
     panel_3.add(LoginBtn);
     
     JButton SUBtn = new JButton("회원가입");
     SUBtn.setBackground(Color.WHITE);
     SUBtn.setBounds(252, 5, 92, 23);
     panel_3.add(SUBtn);

  
     SUBtn.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
       
        sign.setVisible(true);
     }
  });
  
  
  
  
  for (int i = 0; i < sign.memberList.size(); i++) {
     if (sign.memberList.get(i).getID().equals(IDtext.getText())) {
        wantIndexNumber = i;
     }
  }
  
  LoginBtn.addActionListener(new ActionListener() {
     boolean logCheck;
     @Override
     public void actionPerformed(ActionEvent e) {
        
        for (int i = 0; i < sign.memberList.size(); i++) {
           if (sign.memberList.get(i).getID().equals(IDtext.getText()) && sign.memberList.get(i).getPw().equals(PWtext.getText())) {
      
           logCheck = true;   

           m2 = new Member(sign.memberList.get(i).getName(),sign.memberList.get(i).getID(),sign.memberList.get(i).getPw(),
                 sign.memberList.get(i).getFnum(),sign.memberList.get(i).getBnum(),sign.memberList.get(i).getFPhone(),
                 sign.memberList.get(i).getMPhone(),sign.memberList.get(i).getLPhone());
           }
           
        }
        
        if (logCheck == true) {
           System.out.println("로그인성공");
           String saveId = IDtext.getText();
           
 
           Main m = new Main();
           m.setVisible(true);
           //frame.dispose();

    } else {
       System.out.println("로그인실패");
            }
            
         }
         
      });
      
      System.out.println(IDtext.getText());
   }

   
   public static void main(String[] args) {
      
      
      
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Login window = new Login();
               window.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }


public Member getM1() {
   return m1;
}

/**
 * @param m1 the m1 to set
 */
public void setM1(Member m1) {
   this.m1 = m1;
}

/**
 * @return the iDtext
 */
public JTextField getIDtext() {
   return IDtext;
}

/**
 * @param iDtext the iDtext to set
 */
public void setIDtext(JTextField iDtext) {
   IDtext = iDtext;
}

/**
 * @return the pWtext
 */
public JPasswordField getPWtext() {
   return PWtext;
}

/**
 * @param pWtext the pWtext to set
 */
public void setPWtext(JPasswordField pWtext) {
   PWtext = pWtext;
}

public String getSaveId() {
   return saveId;
}

public void setSaveId(String saveId) {
   this.saveId = saveId;
}

public int getWantIndexNumber() {
   return wantIndexNumber;
}

public void setWantIndexNumber(int wantIndexNumber) {
   this.wantIndexNumber = wantIndexNumber;
}


}