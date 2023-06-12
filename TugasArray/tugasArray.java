import java.util.Scanner;

public class tugasArray {
    public static void main(String []args) {
        try(Scanner input = new Scanner(System.in);){
            String[]nama = new String[5];

            for(int i = 0 ;i<nama.length;i++){
                System.out.print("Nama ke "+i+" : ");
                nama[i]=input.next();
            }
            System.out.println("-------------");
            for (int x = nama.length -1;x>=0;x++){
                System.out.println(nama[x]);
            }
        };
    }
}
