import java.util.Scanner;

public class tugasWhile {
    public static void main(String []args) {
        try(Scanner input = new Scanner(System.in);){
            System.out.print("Masukkan  Nilai Awal : ");
            int valueStart = input.nextInt();
            System.out.print("Masukkan Nilai Akhir : ");
            int valueEnd = input.nextInt();
            char huruf = 'f';

            while (valueEnd>=valueStart){
                System.out.println("Nilai "+huruf+" : "+valueStart);
                valueStart++;
                huruf--;
            }
        }
    }

}