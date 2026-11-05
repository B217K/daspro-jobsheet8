
import java.util.Scanner;

public class Tugas207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3) = ");
        int n = sc.nextInt();
        int total = 0;

        while (n < 3){
            System.out.println("Nilai tidak valid, nilai n minimal 3");
            System.out.print("Masukkan kembali nilai n = ");
            n = sc.nextInt();
        }
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j<= n){
                int hasil = i*j;
                System.out.print(hasil);
                total += hasil;
                j++;
            }
            System.out.println();
            i++;
            
            
        }
        System.out.println("Jumlah seluruh angka = "+ total);
        sc.close();
    }
}
