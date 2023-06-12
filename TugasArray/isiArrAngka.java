import java.util.Scanner;

public class isiArrAngka {
    public static void main(String []args) {
        try (Scanner input = new Scanner(System.in);){
        int isiAngka[] = new int[4];
        for (int i = 0 ; i <= isiAngka.length;i++){
            System.out.print("Masukan  Angka ke : "+i +" :");
            isiAngka[i]= input.nextInt();
        } 
        System.out.println("----------------");
        for (int a=0;a < isiAngka.length;a++){
            System.out.println(a);
        }
     }
    }
}
