/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 * Nama     : Azis komara
 * Kelas    : IF-1
 * Nim      : 10118029
 * deskiripsi program   : Kambing
 * 
 * @author Azis komara
 */
public class Kambing {

    /**
     * @param args the command line arguments
     */
    public void tambahKambing(){
        // deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing =jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah di tambah: " + jumlahKambing);
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
