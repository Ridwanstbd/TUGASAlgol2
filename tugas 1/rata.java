import java.util.Scanner;
public class rata {
    public static void main(String[] args) {
        int i=1,n;
        float jum=0,x,rata;
        try(Scanner masuk = new Scanner(System.in)){;
            System.out.println("Banyaknya Data =");
            n=masuk.nextInt();
                while(i<=n){
                    System.out.print("data ke"+i+":");
                    x=masuk.nextFloat();
                    jum+=x;
                    i++;
                }
            rata=jum/n;
            System.out.println("rata= "+rata);
            System.out.println("jumlah= "+jum);
        }
    }
}
