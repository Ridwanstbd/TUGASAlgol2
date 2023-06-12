import java.util.Scanner;
public class ratarata{    
    public static void main(String[]args) {
        int jumlahNilai = 3;
        double nilai,total=0,rata;
        try (Scanner masuk = new Scanner(System.in)) {
            
            for(int i=1;i<=jumlahNilai;i++){
                // awal memasukan nilai dan total
                System.out.print("masukkan nilai ke "+i+" =");
                nilai=masuk.nextDouble();
                total += nilai;
                // akhir memasukan nilai dan total
            }
            // awal mengambil rata rata
            rata=total/jumlahNilai;
        }
        // akhir mengambil rata rata
        // awal menampilkan jumlah dan rata rata
        System.out.println("Jumlah dari semua nilai ="+total);
        System.out.println("rata-rata dari semua nilai ="+rata);
        // akhir menampilkan jumlah dan rata rata
    }
}
