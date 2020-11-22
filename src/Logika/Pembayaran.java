package Logika;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Pembayaran extends Komponen{

        JLabel kem,user_name, user_mkn,user_min,user_kode, user_jmi, user_jma ;
    
        int hasilfix;
        Pembayaran(int indexmakanan, String jumlahmakan, int indexminuman, String jumlahminum, String kode) {
        
        frame.setSize(800, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        pembayaran.setFont(new Font("Times New Roman", Font.BOLD, 30));
        pembayaran.setBounds(300, 10, 280, 50);
        frame.add(pembayaran);
        
        user.setFont(new Font("Times New Roman", Font.BOLD, 25));
        user.setBounds(80, 80, 280, 50);
        frame.add(user);
        
        Makan.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Makan.setBounds(80, 130, 280, 50);
        frame.add(Makan);
        
        minum.setFont(new Font("Times New Roman", Font.BOLD, 25));
        minum.setBounds(80, 190, 280, 50);
        frame.add(minum);
        
        KOde.setFont(new Font("Times New Roman", Font.BOLD, 25));
        KOde.setBounds(80, 240, 280, 50);
        frame.add(KOde);

//Bayar 
        Bayar.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Bayar.setBounds(80, 360, 280, 50);
        frame.add(Bayar);
        
        Textt.setFont(new Font("Times New Roman", Font.BOLD, 25));
        Textt.setBounds(350, 370, 300, 30);
        frame.add(Textt);

//kembalian        
        kembali.setFont(new Font("Times New Roman", Font.BOLD, 25));
        kembali.setBounds(80,480 , 280, 50);
        frame.add(kembali);

//Bayar 
        total.setFont(new Font("Times New Roman", Font.BOLD, 20));
        total.setBounds(80, 300, 200, 30);    
        total.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int totalmakanan = hargamakan[indexmakanan] * Integer.parseInt(jumlahmakan);
                int totalminuman = hargaminum[indexminuman] * Integer.parseInt(jumlahminum);
                int totalsemua = totalmakanan + totalminuman;
                
                String hasil = "";
                if(kode.equals("KHISOFTDISKON")){
                    
                    hasil = totalsemua + "( DISKON "+String.valueOf(totalsemua - 10000) + " )";
                    hasilfix= totalsemua-10000;
                }else{
                    hasil = String.valueOf(totalsemua);
                    hasilfix=totalsemua;
                }
                    
                
//                System.out.println(totalsemua);
                hasil_total.setText(hasil);
                
            }
        });
                  
        frame.add(total);    
                
        hasil_total.setFont(new Font("Times New Roman", Font.BOLD, 25));
        hasil_total.setBounds(350, 300, 300, 30);
        frame.add(hasil_total);
//output inputan data 

         
           
            user_name = new JLabel();
            user_name.setBounds(360, 80, 280, 50);
            frame.add(user_name);
            
            user_mkn = new JLabel(mkn[indexmakanan]);
            user_mkn.setBounds(360, 140, 280, 50);
            frame.add(user_mkn);
            
            user_jma = new JLabel(jumlahmakan);
            user_jma.setBounds(500, 140, 280, 50);
            frame.add(user_jma);
            
            user_min = new JLabel(min[indexminuman]);
            user_min.setBounds(360, 190, 280, 50);
            frame.add(user_min);
            
            user_jmi = new JLabel(jumlahminum);
            user_jmi.setBounds(500, 190, 280, 50);
            frame.add(user_jmi);
            
            user_kode = new JLabel(kode);
            user_kode.setBounds(360, 250, 280, 50);
            frame.add(user_kode);      
//        }
        
        
        byr.setFont(new Font("Times New Roman", Font.BOLD, 20));
        byr.setBounds(350, 430, 200, 50);
        byr.addActionListener(new ActionListener() {
            @Override
           public void actionPerformed(ActionEvent e){
               
               
               int b = Integer.parseInt(Textt.getText())-hasilfix;
             
                 ha.setText(String.valueOf(b));
                 
           }
        });
        frame.add(byr);
            
            
            ha.setBounds(350, 500, 280, 50);
            frame.add(ha);
            
        
        frame.setVisible(true);
    }

   
}
