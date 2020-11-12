/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanbarang;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class PenjualanBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menmpilkan barang yang dijual + deskripsi + harga
        System.out.println("<<<                       T STROSE                        >>>");
        System.out.println("                 Skin Care Oriflame Sweden                   ");
        System.out.println("            Jl. Guyub Rukun Bulusari Kedungwaru              ");
        System.out.println("                        Tulungagung                          ");
        System.out.println("-------------------------------------------------------------");
        
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        
//Memasukkan nama pembeli
        System.out.print("Nama : ");
        String nama = input.nextLine();
        
        System.out.println("\n");
        
        //Harga sewa laptop perhari
        int harga1 = 29900,  
            harga2 = 49900,  
            harga3 = 1049000,
            harga4 = 949000,
            hasil;
        //Daftar barang
        System.out.println("                               Daftar Harga Skin Care                              ");
        String[] produk = {" ", " Vitality Sheet Mask    ", " Tender Care            ", " Optimals Even Out      ", " Optimals Hydra Radiance "};
        String[] desc = {" ", " (Membuat kulit lebih halus dan lembut)  ", " (Merawat kulit kering)                  ", " (Membuat kulit tampak cerah merata)     ", "(Merawat hidrasi kulit)                 "};
        int [] harga = {0, 29900, 49900, 1049000, 949000};
        for (int i = 1; i < harga.length; i++)
            System.out.println("Kode "+i+produk[i]+"              "+desc[i]+"      Rp. "+harga[i]);

        
        System.out.println("\n");
        System.out.println("---------------------------------------------");
       
        //Memasukkan kode
        hasil = 0;
        boolean ulangi = true;
        while (ulangi){
        System.out.print("Masukkan Kode barang : ");
        int kode = input.nextInt();
        switch(kode){
            case 1 :
                System.out.println("Barang yang anda beli : Vitality Sheet Mask");
                System.out.println("Harga sewa perhari : Rp. "+harga1);
                System.out.print("Jumlah            : ");
                int jumlah = input.nextInt();
                int total = harga1*jumlah;
                System.out.println("Total           : "+total);
                hasil += total;
                System.out.println("\n");
                break;
            case 2 :
                System.out.println("Barang yang anda beli : Tender Care");
                System.out.println("Harga sewa perhari : Rp. "+harga2);
                System.out.print("Jumlah            : ");
                jumlah = input.nextInt();
                total = harga2*jumlah;
                System.out.println("Total           : "+total);
                hasil += total;
                System.out.println("\n");
                break;
            case 3 :
                System.out.println("Barang yang anda beli : Optimals Even Out");
                System.out.println("Harga sewa perhari : Rp. "+harga3);
                System.out.print("Jumlah            : ");
                jumlah = input.nextInt();
                total = harga3*jumlah;
                System.out.println("Total           : "+total);
                hasil += total;
                System.out.println("\n");
                break;
            case 4 :
                System.out.println("Barang yang anda beli : Optimals Hydra Radiance");
                System.out.println("Harga sewa perhari : Rp. "+harga4);
                System.out.print("Jumlah            : ");
                jumlah = input.nextInt();
                total = harga4*jumlah;
                System.out.println("Total           : "+total);
                hasil += total;
                System.out.println("\n");
                break;
        }        
        //Menambah barang
        System.out.println("Apakah anda ingin memesan lagi ? (ya/tidak)");
            String pilih = input.next();
            ulangi = pilih.equals("ya");
            System.out.println("---------------------------------------------");
    }
        //Total pembayaran
        int total = 0;
        System.out.println("TOTAL PEMBAYARAN : "+hasil);
        boolean uang = true;
        while(uang){
        System.out.print("Nominal uang : Rp ");
        int bayar = input.nextInt();
        if (bayar == hasil){
            uang = false;
            System.out.println("Uang Anda Pas ");
        }else if (bayar >= hasil){
            int kembalian = bayar - hasil;
            uang = false;
            System.out.println("Kembalian : "+kembalian);
        }else if (bayar <= hasil){
            uang = true;
            System.out.println("Uang Anda Kurang, Silahkan masukkan ulang uang anda");}
        }
        
        System.out.println("\n");
        System.out.println("          Terima Kasih Telah Berkunjung Di T STORE           ");
        System.out.println("       Barang Yang Sudah Dibeli Tdk Dpt Dikembalikan         ");
        System.out.println("\n");
        System.out.println("                                               Kasir : Tasya ");
        
        
                    
            
    }
    
}
