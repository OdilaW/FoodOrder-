package Logika;

import Data.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Pesan extends Komponen{
     
    Induk induk = new Induk();
    
    public Pesan(){
        frame.setSize(800,700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    
        order.setFont(new Font("Times New Roman", Font.BOLD, 30));
        order.setBounds(220, 10, 380, 50);
        frame.add(order);

//Makanan        
        Makan.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Makan.setBounds(90, 60, 380, 50);
        frame.add(Makan);
        
        makan.setFont(new Font ("Times New Roman", Font.BOLD,20));
        makan.setBounds(350, 70,300, 30);
        frame.add(makan);
        
        Jmlmakan.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Jmlmakan.setBounds(90, 100, 380, 50);
        frame.add(Jmlmakan);
        
        jmlmakan.setFont(new Font ("Times New Roman", Font.BOLD,20));
        jmlmakan.setBounds(350, 110, 300, 30);
        frame.add(jmlmakan);

//Minuman        
        minum.setFont(new Font("Times New Roman", Font.BOLD, 25));
        minum.setBounds(90, 140, 380, 50);
        frame.add(minum);
        
        Minum.setFont(new Font ("Times New Roman", Font.BOLD,20));
        Minum.setBounds(350, 150,300, 30);
        frame.add(Minum);
        
        Jmlminum.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Jmlminum.setBounds(90, 180, 380, 50);
        frame.add(Jmlminum);
        
        jmlminum.setFont(new Font ("Times New Roman", Font.BOLD,20));
        jmlminum.setBounds(350, 190, 300, 30);
        frame.add(jmlminum);


//Kode Voucher        
        KOde.setFont(new Font("Times New Roman", Font.BOLD, 25));
        KOde.setBounds(90, 220, 380, 50);
        frame.add(KOde);
        
        kode.setFont(new Font ("Times New Roman", Font.BOLD,20));
        kode.setBounds(350, 230, 300, 30);
        frame.add(kode);

//bayar        
        Bay.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Bay.setBounds(400, 400, 200, 50);
        Bay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               
//                induk.setMakan(makan.getSelectedItem().toString());
//                induk.setJummakan(jmlmakan.getText());
//                induk.setMinum(Minum.getSelectedItem().toString());
//                induk.setJumminum(jmlminum.getText());
//                induk.setKode(kode.getText());
//                
//                AllObject.indukarr.add(induk);
//                
//                for(int a=0; a<AllObject.indukarr.size(); a++){
//                use.setText(AllObject.indukarr.get(a).getUsername());
//                }
                new Pembayaran(makan.getSelectedIndex(), jmlmakan.getText(), Minum.getSelectedIndex(),
                    jmlminum.getText(), kode.getText()).setVisible(true);                
//                frame.setVisible(true);
                
            }
        });
        frame.add(Bay);
   
    frame.setVisible(true);
    }
    
}
