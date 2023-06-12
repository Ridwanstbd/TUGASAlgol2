import java.util.Scanner;

class hitungLuas {
    public double trapesium(double a , double b, double t){
        double trapesium = 0.5 * (a + b) * t;
        System.out.print("Luas trapesium = "+trapesium);
        return trapesium;
    }
    public double jajarGenjang(double a, double t){
        double jajarGenjang = a*t;
        System.out.print("Luas Jajar Genjang = "+jajarGenjang);
        return jajarGenjang;
    }
}
public class functionLain {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);){

            hitungLuas hl = new hitungLuas();
            System.out.println("Menu-menu\n 1. Hitung Luas Trapesium \n 2. Hitung Luas Jajar Genjang");
        System.out.print("Masukkan Pilihan 1..2 :");
        int pilihan = input.nextInt();
        
        switch(pilihan){
            case 1 :
            System.out.print("Masukkan panjang a : ");
            double isiA = input.nextDouble();
            System.out.print("Masukkan panjang b : ");
            double isiB = input.nextDouble();
            System.out.print("Masukkan tinggi : ");
            double isiT = input.nextDouble();
            hl.trapesium(isiA, isiB, isiT);
            break;
            case 2 :
            System.out.println("Masukkan alas : ");
            double isiAlas = input.nextDouble();
            System.out.println("Masukkan tinggi : ");
            double isiTinggi = input.nextDouble();
            hl.jajarGenjang(isiAlas, isiTinggi);
            break;
            default :
            System.out.println("Bukan Termasuk Pilihan");
        }
        }
    }
}