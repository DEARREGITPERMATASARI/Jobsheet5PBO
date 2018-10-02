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
    public class TugasRumah {
      public static void main(String[] args) {
        try {
            int a[]=new int [7];
            a[4]=30/0;
            System.out.println("Hasil Benar"+
                    "Hasil : 6");
        }
        catch(ArithmeticException e) {
            System.out.println("Peringatan !!! : ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Peringatan !! : ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Warning : Exception lain");
        }
        System.out.println("Eksepsi Terakhir");
        }
    
}
