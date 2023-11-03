package ArsitekturOrganisasiKomputer;
import java.util.*;

public class kalkulatorDesimalBinerHexa {
    public static void main(String[] args) {
        int pilihan = -1;
        while(pilihan != 0){
            Scanner In = new Scanner(System.in);
            System.out.println("==========================================================");
            System.out.println("Pilih Opsi :");
            System.out.println("1.Desimal ke Biner");
            System.out.println("2.Biner ke desimal");
            System.out.println("3.Desimal ke Hexa");
            System.out.println("4.Hexa ke Desimal");
            System.out.println("5.Biner ke Hexa");
            System.out.println("6.Hexa ke Biner");
            System.out.println("\n0.Keluar");
            System.out.println("==========================================================");
            pilihan = In.nextInt();
            int operasiBiner;
            int desimal;
            int n;
            double k = 0;
            double l = 0;
            double hasil = 0;
            String inputBiner;
            String biner = "";
            String heksadesimal;
            long bin; 
            switch(pilihan){
                case 1: 
                    System.out.println("==========================================================");
                    System.out.println("Masukan Angka desimal :");
                    desimal = In.nextInt();
                    if(desimal == 0){
                        biner = "0";
                        System.out.println(biner);
                    }else{
                        while(desimal != 0){
                            operasiBiner = desimal % 2 ; 
                            biner = operasiBiner + biner ;
                            desimal /= 2;
                        }    
                     System.out.println("Bilangan Biner : " + biner);
                    }
                    System.out.println("==========================================================");
                break;
                case 2:
                    System.out.println("==========================================================");
                    System.out.println("Masukan bilangan biner :");
                    bin = In.nextLong();
                    inputBiner = bin + biner;
                    int[] angkaArray = new int[inputBiner.length()];
                    for (int i = 0; i < inputBiner.length(); i++) {
                        char digitChar = inputBiner.charAt(i);
                        angkaArray[i] = Character.getNumericValue((int)digitChar);                 
                    }
                    for (int j = inputBiner.length() - 1; j >= 0; j--) {
                        int digit = angkaArray[j];
                        k = digit * (int) Math.pow(2, inputBiner.length() - 1 - j);
                        hasil = k + l;
                        l = hasil;
                    }
                    System.out.println("Bilangan Desimal : " + (int)l);
                    System.out.println("==========================================================");
                 break;
                case 3:
                    System.out.println("==========================================================");
                    System.out.println("Masukan Angka Desimal :");
                    desimal = In.nextInt();
                    heksadesimal = Integer.toHexString(desimal);
                    System.out.println("Bilangan heksadesimal : " + heksadesimal);
                    System.out.println("==========================================================");
                break;
                case 4:
                    System.out.println("==========================================================");
                    System.out.println("Masukan Bilangan Heksadesimal :");
                    heksadesimal = In.next();
                    desimal = Integer.parseInt(heksadesimal, 16);
                    System.out.println("Bilangan Desimal : " + desimal);
                    System.out.println("==========================================================");
                break;
                case 5:
                    System.out.println("==========================================================");
                    System.out.println("Masukan bilangan biner :");
                    bin = In.nextLong();
                    inputBiner = bin + biner;
                    angkaArray = new int[inputBiner.length()];
                    for (int i = 0; i < inputBiner.length(); i++) {
                        char digitChar = inputBiner.charAt(i);
                        angkaArray[i] = Character.getNumericValue((int)digitChar);                 
                    }
                    for (int j = inputBiner.length() - 1; j >= 0; j--) {
                        int digit = angkaArray[j];
                        k = digit * (int) Math.pow(2, inputBiner.length() - 1 - j);
                        hasil = k + l;
                        l = hasil;
                    }
                    desimal = (int)l;
                    heksadesimal = Integer.toHexString(desimal);
                    System.out.println("Bilangan heksadesimal : " + heksadesimal);
                    System.out.println("==========================================================");
                break;
                case 6:
                    System.out.println("==========================================================");
                    System.out.println("Masukan Bilangan Heksadesimal :");
                    heksadesimal = In.next();
                    desimal = Integer.parseInt(heksadesimal, 16);
                    if(desimal == 0){
                        biner = "0";
                        System.out.println(biner);
                    }else{
                        while(desimal != 0){
                            operasiBiner = desimal % 2 ; 
                            biner = operasiBiner + biner ;
                            desimal /= 2;
                        }    
                     System.out.println("Bilangan Biner : " + biner);
                    }
                    System.out.println("==========================================================");
                break;
                case 0:
                    System.out.println("==========================================================");
                    System.out.println("Terimakasih Telah Menggunakan Program ini");
                    System.out.println("==========================================================");
                break;
                default:
                    System.out.println("==========================================================");
                    System.out.println("Opsi yang anda pilih tidak ada");
                    System.out.println("==========================================================");
                break;
            }
        }
    }
}
