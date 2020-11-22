package Logika;

import javax.swing.*;
import Data.*;

public class Komponen extends JFrame{
    
    protected int harga, kem = 0, b, o = 0;
    Thread t = Thread.currentThread();
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel("KHISOFT FOOD ORDER");
    JLabel user = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    JTextField username = new JTextField();
    JTextField pas= new JTextField();
    JButton login = new JButton("Login");
    JButton daftar = new JButton("Daftar");

    JLabel Daftar = new JLabel("DAFTAR");
    JLabel Nama = new JLabel("NAMA");
    JTextField nama = new JTextField();
    JLabel NoHp = new JLabel("No HP");
    JTextField noHp = new JTextField();
    JButton Buat = new JButton("BUAT");
    
    String  mkn[] = {null, "Sosis   Rp. 10.000","Bakso   Rp. 12.000", "Soto    RP. 15.000","Cimol   Rp. 7.000",  "Cireng  Rp. 7.000"};
    String min [] = {null, "Es Teh     Rp. 3.000","Es Jeruk   Rp. 4.000","AirMineral Rp. 2.500","Es Degan   Rp. 5.000"};
    int hargamakan[] = {0,10000,12000,15000,7000,7000} ;
    int hargaminum[] = {0,3000,4000,2500,5000};
    
    JTextPane use = new JTextPane();
    JLabel order = new JLabel("FROM ORDER");
    JLabel Makan = new JLabel("Makanan");
    JComboBox makan = new JComboBox(mkn);
    JLabel Jmlmakan = new JLabel("Jumlah Makanan");
    JTextField jmlmakan = new JTextField();
    JLabel minum = new JLabel("Mainuman");
    JComboBox Minum = new JComboBox(min);
    JLabel Jmlminum = new JLabel("Jumlah Minuman");
    JTextField jmlminum = new JTextField();
    JLabel KOde = new JLabel("Kode Voucher");
    JTextField kode = new JTextField();    
    JButton Bay = new JButton("BAYAR");
    

    JLabel pembayaran = new JLabel(" PEMBAYARAN ");
    JLabel Bayar = new JLabel(" Bayar ");
    JTextField Textt = new JTextField();
    JTextField hasil_total = new JTextField();
    JLabel kembali = new JLabel(" Kembalian ");
    JButton byr = new JButton("Bayar");
    JButton total = new JButton("TOTAL HARGA");
    JLabel ha = new JLabel();
}


