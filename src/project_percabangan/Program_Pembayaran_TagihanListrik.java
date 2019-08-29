package Project_percabangan;
import java.util.Scanner;
public class Program_Pembayaran_TagihanListrik {
        public static void main(String[] args) {
            //deklarasi
            int kWh;
            int biaya;
            int biayatotal;
            Double Total;
            Scanner moco = new Scanner(System.in);
            //input kWh
            System.out.println("---------Program Pembayaran Tagihan Listrik---------===");
            System.out.print("jumlah kWh/bulan: ");
            kWh = moco.nextInt();
            //penggolongan
            System.out.println("\n~Penggolongan~");
            if(kWh <= 450) {
                System.out.println("Anda termasuk pada golongan C(Menengah Kebawah)");
                biaya = 20000 + (1000 * kWh);
                System.out.println("\nBiaya " + "Rp." + biaya);
                biayatotal =(biaya + (biaya * 15/100));
                System.out.println("\nBiaya total: " + biayatotal);                
            } else if(kWh <=900) { 
                System.out.println("Anda termasuk pada golongan B(Standart)");
                biaya = 35000 + (2500 * kWh);
                System.out.println("\nBiaya " + "Rp." + biaya);                
            } else if(kWh <1200) {
                System.out.println("Anda termasuk pada golongan A(Superior)");
                biaya = 50000 + (3000 * kWh);
                System.out.println("\nBiaya " + "Rp." + biaya);                
            } else
                System.out.println("Mohon maaf untuk kategori kWh yang anda cari tidak ada, silahkan coba lagi!");                    
        }
    
}