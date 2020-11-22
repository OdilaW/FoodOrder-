package Logika;

import Data.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.InputMismatchException;




public class Login extends Komponen {
    public Login() {
        frame.setSize(700, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.black);
        frame.setLayout(null);
        
        label.setFont(new Font("Times New Roman", Font.BOLD, 30));
        label.setBounds(180, 10, 380, 50);
        frame.add(label);
        
//Username
        user.setFont(new Font("Times New Roman", Font.BOLD, 25));
        user.setBounds(100, 100, 180, 30);
        frame.add(user);
        
        username.setFont(new Font("Times New Roman", Font.BOLD, 20));
        username.setBounds(220, 100, 300, 30);
        frame.add(username);
        
//Password
        pass.setFont(new Font("Times New Roman", Font.BOLD, 25));
        pass.setBounds(100, 150, 150, 30);
        frame.add(pass);

        pas.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pas.setBounds(220, 150, 300, 30);
        frame.add(pas);

//login        
        login.setFont(new Font("Arial", Font.PLAIN, 20));
        login.setBounds(120, 250, 180, 30);
        login.setForeground(Color.BLUE);
        login.setBackground(Color.GREEN);
        Induk induk = new Induk();
                induk.setNama("tes");
                induk.setNohp("tes");
                induk.setUsername("tes");
                induk.setPswrd("tes");
                
                AllObject.indukarr.add(induk);
                
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int i=0; i<AllObject.indukarr.size(); i++){
                if(username.getText().equals(AllObject.indukarr.get(i).getUsername())&&
                        pas.getText().equals(AllObject.indukarr.get(i).getPswrd())){
                    new Pesan().setVisible(true);
                    
                }
                else{
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong Atau Inputan yang anda masukkan salah");
                }}
            }
              
        });
        frame.add(login);

//daftar        
        daftar.setFont(new Font("Arial", Font.PLAIN, 20));
        daftar.setBounds(340, 250, 180, 30);
        daftar.setBackground(Color.LIGHT_GRAY);
        daftar.setForeground(Color.MAGENTA);
        daftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Daftar().setVisible(true); 
             
            }
        });
        
        
        frame.add(daftar);
        
        
  frame.setVisible(true);
   }
}
