import java.util.Scanner;

public class Tugas307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Toko : ");
        int toko = sc.nextInt();

        while (toko < 1){
            System.out.println("Jumlah toko minimal 1");
            System.out.print("Masukkan kembali jumlah toko = ");
            toko = sc.nextInt();
        }
        int totalPelanggan = 0;
        int totalBarang = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        int i = 1;
        while (i <= toko){
            System.out.println("Toko ke-"+ i);
            System.out.print("Masukkan jumlah pelanggan = ");
            int pelanggan = sc.nextInt();

            while (pelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif");
                System.out.print("Masukkan kembali jumlah pelanggan = ");
                pelanggan = sc.nextInt();
            }
            int totalBarangToko = 0;
        
            int j = 1;
            while (j <= pelanggan){
                System.out.println("Jumlah barang pelanggan ke- "+ j +" = ");
                int barang = sc.nextInt();

                while (barang <= 0){
                    System.out.println("Barang tidak boleh negatif");
                    System.out.print("Masukkan kembali jumlah barang = ");
                    barang = sc.nextInt();
                }
                totalBarangToko += pelanggan;
                j++;
            }
            totalPelanggan += pelanggan;
            totalBarang += totalBarangToko;

            System.out.println("Total pelanggan toko " + i + " = " + pelanggan);
            System.out.println("Total barang toko " + i + " = " + totalBarangToko);

            if (totalBarangToko > barangTerbanyak){
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
            i++;
        }
        System.out.println("\n===== HASIL AKHIR =====");
        System.out.println("Total pelanggan seluruh toko = " + totalPelanggan);
        System.out.println("Total barang seluruh toko = " + totalBarang);
        System.out.println("Toko dengan jumlah barang terbanyak = Toko " + tokoTerbanyak);
        System.out.println("Jumlah barang terbanyak = " + barangTerbanyak);
        sc.close();
    }
}
