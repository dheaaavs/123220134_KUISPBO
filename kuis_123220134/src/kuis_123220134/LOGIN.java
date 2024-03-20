/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220134;

/**
 *
 * @author Lab Informatika
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LOGIN extends JFrame implements ActionListener {
    
    //deklarasi 
    JLabel lnama, lpassword, pesan;
    JTextField fnama, password;
    JButton login;
    
    public LOGIN(){
        //set judul frame
        setTitle("LOGIN");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lnama = new JLabel("Nama");
        lpassword = new JLabel("Password");
        pesan = new JLabel("");
        fnama = new JTextField(10);
        password = new JTextField(10);
        login = new JButton("LOGIN");
        login.addActionListener(this);
        
        setLayout (new GridLayout(3,2));
        //menambahkan ke dalam JFrame
        add(lnama);
        add(fnama);
        add(lpassword);
        add(password);
        add(login);
        add(pesan);
        
        //menampilkan JFrame
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent e){
        if(e.getSource()== login){
            String nama = fnama.getText();
            String ppassword = password.getText();
            if(nama.equals("tukang_134") && ppassword.equals("tukang_134")){
                siku nextpage = new siku();
            }
            else { 
                pesan.setText("LOGIN GAGAL KAK! :)"); //menampilkan kesalahan jika terjadi kesalahan
            }
        }
    }
    
    public static void main(String[] args) {
        new LOGIN();
    }
}
