package Logika;

import Data.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Daftar extends Komponen{

public Daftar(){    
        frame.setSize(700, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
            
        Daftar.setFont(new Font("Times New Roman", Font.BOLD, 30));
        Daftar.setBounds(250, 10, 280, 50);
        frame.add(Daftar);

//nama        
        Nama.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Nama.setBounds(80, 90, 280, 20);
        frame.add(Nama);
        
        nama.setBounds(220, 90, 300, 30);
        frame.add(nama);
        
//noHp        
        NoHp.setFont(new Font("Times New Roman", Font.BOLD, 25));
        NoHp.setBounds(80, 120, 280, 50);
        frame.add(NoHp);
        
        noHp.setBounds(220, 130, 300, 30);
        frame.add(noHp);
      
//User        
        user.setFont(new Font("Times New Roman", Font.BOLD, 25));
        user.setBounds(80, 160, 280, 50);
        frame.add(user);
        
        username.setBounds(220, 170, 300, 30);
        frame.add(username);

//Pass        
        pass.setFont(new Font("Times New Roman", Font.BOLD, 25));
        pass.setBounds(80, 200, 280, 50);
        frame.add(pass);
        
        pas.setBounds(220, 210, 300, 30);
        frame.add(pas);

//Buat        
        Buat.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Buat.setBounds(400, 360, 200, 50);
        Buat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                
                Induk induk = new Induk();
                induk.setNama(nama.getText());
                induk.setNohp(noHp.getText());
                induk.setUsername(username.getText());
                induk.setPswrd(pas.getText());
                
                AllObject.indukarr.add(induk);
                
                new Login().setVisible(true);      
            }  
        });
      frame.add(Buat);  
      frame.setVisible(true);
    }
}
