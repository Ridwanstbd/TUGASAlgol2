import java.util.Scanner;
class inputData {
    int tahunSekarang = 2023;
    public void nama (String isiNama){
        System.out.println("Nama Anda : "+isiNama);
    }
    public void tahun (int tahunLahir){
        int umur = tahunSekarang - tahunLahir;
        System.out.println("Jadi usia anda sekarang : "+tahunSekarang+" - "+tahunLahir+" = "+umur+" tahun");
    }
}
public class tugasProsedur {
    public static void main(String[] args) {
        inputData i = new inputData();
        try(Scanner input = new Scanner(System.in);){
            System.out.println("Masukkan Nama Anda : ");
            String nama = input.next();
            System.out.println("Masukkan Tahun Kelahiran Anda : ");
            int lahir = input.nextInt();
            i.nama(nama);
            i.tahun(lahir);
        };
    }
}
