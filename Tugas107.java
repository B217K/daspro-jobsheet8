import java.util.Scanner;

public class Tugas107{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 1;
        int totalAngka =0;
        while (i <= n){
            int j = 1;
            while (j <= i){
                System.out.print(j);
                j++;
                totalAngka++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Total Angka Tercetak: "+totalAngka);
        sc.close();
    }
}