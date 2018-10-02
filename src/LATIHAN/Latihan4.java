/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN;

/**
 *
 * @author Nita
 */
 class Latihan4 {
     public Latihan4() {
     }
     public static void main(String args []) {
         int nol = 0;
         int angka = 10;
         
       try{
           int hasil = angka/nol;
           System.out.println("Hasil = " +hasil);
       }
       catch(ArithmeticException e) {
           System.out.println("Terjadi pembagian dengan no.Exception ditangkap.");         
       }
       finally{
           System.out.println("Keluaran di blok finnaly");
       }
       System.out.println("Kalimat di luar blok try-catch-finally");
     }
}
