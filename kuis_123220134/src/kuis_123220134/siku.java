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

public class siku extends JFrame implements ActionListener{
    
    //deklarasi
    JLabel la, lb, resultLabel;
    JTextField fa, fb;
    JButton hitung, selesai;
    
    public siku(){
        setTitle("Hitung Siku");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(4,2));
        //label
        la = new JLabel("Masukkan Nilai A : ");
        lb = new JLabel("Masukkan Nilai B : ");
        
        //untuk memasukkan inputan
        fa = new JTextField(3);
        fb = new JTextField(3);
        
        //untuk menambahkan button
        hitung = new JButton("Hitung");
        hitung.addActionListener(this);
        
        //menambahkan ke frame
        add(la);
        add(fa);
        add(lb);
        add(fb);
        add(hitung);
        //untuk menuju ke halaman hasil hitung
        hitung.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tampilhitung();
            }
        });
        //menampilkan JFrame
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //handling error
        try{
            double a = Double.parseDouble(fa.getText());
            double b = Double.parseDouble(fb.getText());
            //menghitung
            double aa = a * a;
            double bb = b * b;
            double cc = aa + bb;
            //untuk menghitung kuadrat menggunakan sqrt
            double squareRoot = Math.sqrt(cc);
            //menampilkan hasil perhitunga sisi miring
            resultLabel.setText("Sisi Miring : " + squareRoot);   
        }catch (NumberFormatException ex){
            //jika salah menginput 
            JOptionPane.showMessageDialog(this, "Integer kak");
        }
    }
    
    public void tampilhitung(){
        //set judul JFrame
        JFrame hasilframe =  new JFrame("Hasil Hitung");
        hasilframe.setLayout(new GridLayout(5,1));
        hasilframe.setSize(300, 200);
        
        //mendeklarasikan JLabel
        JLabel nilaiA = new JLabel("Nilai A : "+ fa.getText());
        JLabel nilaiB = new JLabel("Nilai B : "+ fb.getText());
        resultLabel = new JLabel();
        
        //button selesai untuk mengakhiri yang kemudian layar akan di tutup
        selesai = new JButton("Selesai");
        selesai.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                hasilframe.dispose();
            }
        });
        //menambahkan ke JFrame
        hasilframe.add(nilaiA);
        hasilframe.add(nilaiB);
        hasilframe.add(resultLabel);
        hasilframe.add(selesai);
        hasilframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hasilframe.setLocationRelativeTo(null);
        //menampilkan JFrame
        hasilframe.setVisible(true);
    }    
}
