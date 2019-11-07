/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan42.tabungan;
import java.util.Scanner;
/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Tabungan

 * 
 */
public class IF110118028Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scn1 = new Scanner(System.in);
        Tabungan tab = new Tabungan();

        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan Saldo Awal : ");
        int x = tab.tabungan(scn1.nextInt());
        System.out.print("Jumlah Uang yang Diambil : ");
        int y = tab.ambilUang(scn1.nextInt());
       System.out.println("Saldo Anda Sekarang : "+(tab.tabungan(x)-tab.ambilUang(y)));

    }
    
}
