package project_percabangan;

import java.util.Scanner;

public class SaranBahan2Resep {
    public static void main(String[] args){
        String identitas = "Viko Achmat Vernanda / X RPL 2 / 39";
        System.out.println("Identitas : "+ identitas);
        System.out.println("\nSaran Resep dari Bahan Milik Anda");
       
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan anda :");
        int bahan1 = scanner.nextInt();
        
        if(bahan1 == 1 || bahan1 ==2)
        {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1) {
                System.out.println("1. susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
                 
            }else{
                 System.out.println("1. Minyak Goreng");
                 System.out.println("2. Roti");
                 System.out.println("3. Tidak Ada");
            }
             System.out.println("Masukkan no pilihan anda :");
             int bahan2 = scanner.nextInt();
        }else
             System.out.println("Mohon Maaf, Pilihan tidak ditemukan, " 
              + "tidak dapat memberikan saran resep");
             
        int bahan2 = scanner.nextInt();
        
        if(bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1 : System.out.println(
                            "Anda dapat membuat milk shake banana"); break;
                    case 2 : System.out.println(
                            "Anda dapat membuat pisang goreng"); break;  
                }   System.out.println(
                            "Anda dapat membuat telur rebus"); 
                    
        }else
            System.out.println("Mohon maaf,Pilihan tidak ditemukan, " 
            + "tidak dapat memberikan saran resep");
    
        
        
        
            
            }
            
            
            
        }
    
