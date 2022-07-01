import java.awt.EventQueue; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;

public class Main extends JFrame {
	 Login log = new Login();
   Login l2;
   List<Member> memberList3 = new ArrayList<>(Arrays.asList());
   public Main() {
      
      
      
      
         getContentPane().setBackground(Color.WHITE);
         setBounds(100, 100, 451, 610);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         getContentPane().setLayout(null);
         
         JPanel panel = new JPanel();
         panel.setBackground(Color.WHITE);
         panel.setBounds(12, 10, 411, 133);
         getContentPane().add(panel);
         panel.setLayout(null);
         
         JLabel lblNewLabel = new JLabel("New label");
         lblNewLabel.setBounds(34, 0, 349, 132);
         lblNewLabel.setIcon(new ImageIcon("D:\\GLotto\\GLotto\\Image\\초기화면 이미지.jpg"));
         panel.add(lblNewLabel);
         
         JPanel panel_1 = new JPanel();
         panel_1.setBackground(Color.WHITE);
         panel_1.setBounds(44, 153, 351, 418);
         getContentPane().add(panel_1);
         panel_1.setLayout(null);
         
         JButton btnNewButton = new JButton("구매");
         btnNewButton.setBackground(Color.WHITE);
         btnNewButton.setBounds(94, 10, 168, 57);
         panel_1.add(btnNewButton);
         
         JButton btnMypage = new JButton("MyPage");
         btnMypage.setBackground(Color.WHITE);
         btnMypage.setBounds(94, 109, 168, 57);
         panel_1.add(btnMypage);
         
         
        
         
         for (int i = 0; i < log.memberList2.size(); i++) {
            
            memberList3.add(new Member(
                    log.memberList2.get(i).getName(), 
                    log.memberList2.get(i).getID(), 
                    log.memberList2.get(i).getPw(),
                    log.memberList2.get(i).getFnum(),
                    log.memberList2.get(i).getBnum(),
                    log.memberList2.get(i).getFPhone(),
                    log.memberList2.get(i).getMPhone(),
                    log.memberList2.get(i).getLPhone()
                    ));
         }
         
         
         
         System.out.println(log.wantIndexNumber);
         System.out.println(log.saveId);
         
         btnMypage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              MyPage m = new MyPage();
             m.getFrame().setVisible(true);
               dispose();
            }
            
         });
         
         JButton btnLogout = new JButton("Logout");
         btnLogout.setBackground(Color.WHITE);
         btnLogout.setBounds(94, 211, 168, 57);
         panel_1.add(btnLogout);
         
         btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         
              for (int i = 0; i < log.memberList2.size(); i++) {
                  
                  memberList3.add(new Member(
                          log.memberList2.get(i).getName(), 
                          log.memberList2.get(i).getID(), 
                          log.memberList2.get(i).getPw(),
                          log.memberList2.get(i).getFnum(),
                          log.memberList2.get(i).getBnum(),
                          log.memberList2.get(i).getFPhone(),
                          log.memberList2.get(i).getMPhone(),
                          log.memberList2.get(i).getLPhone()
                          ));
               }
               
               log.setVisible(true);
               dispose();
            }
            
         });
         
         JButton Exitbtn = new JButton("종료");
         Exitbtn.setBackground(Color.WHITE);
         Exitbtn.setBounds(94, 315, 168, 57);
         panel_1.add(Exitbtn);
         
         JLabel qqq = new JLabel("New label");
         qqq.setBounds(12, 49, 57, 15);   
         qqq.setText(l2.m2.getName());
         panel_1.add(qqq);
         
         Exitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               for (int i = 0; i < log.memberList2.size(); i++) {
                  
                  memberList3.add(new Member(
                          log.memberList2.get(i).getName(), 
                          log.memberList2.get(i).getID(), 
                          log.memberList2.get(i).getPw(),
                          log.memberList2.get(i).getFnum(),
                          log.memberList2.get(i).getBnum(),
                          log.memberList2.get(i).getFPhone(),
                          log.memberList2.get(i).getMPhone(),
                          log.memberList2.get(i).getLPhone()
                          ));
               }
               
               log.setVisible(true);
               
                
            }
         });
   }

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Main window = new Main();
               window.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */

}