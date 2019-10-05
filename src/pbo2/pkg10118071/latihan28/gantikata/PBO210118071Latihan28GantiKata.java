/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan28.gantikata;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk mengubah
 *                     kata dari kalimat yang diinputkan user  
 * 
 */
public class PBO210118071Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("====Program Mengganti Kata====");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String kalimat =  input.nextLine();
        
        System.out.print("Ganti Kata : ");
        String ganti = input.next();
        
        System.out.print("Menjadi Kata : ");
        String kata = input.next();
        
        String kalimat1 = kalimat.replace(ganti,kata);
        
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : "+kalimat);
        System.out.println("Kalimat Baru : "+kalimat1);
    }
    
}
