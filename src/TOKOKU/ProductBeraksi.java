
package TOKOKU;


import java.util.Scanner;

public class ProductBeraksi {
    public static void main(String[] args) {
        try {
            //io sederhana
            Scanner input = new Scanner(System.in);
            // array
            ProductDetail[] daftarProduk = new ProductDetail[2];

            // perulangan
            for (int i = 0; i < daftarProduk.length; i++) {
                System.out.print("Nama Produk ke-" + (i + 1) + ": ");
                String nama = input.nextLine();
                System.out.print("Kode Produk ke-" + (i + 1) + ": ");
                String kode = input.nextLine();

                // object
                daftarProduk[i] = new ProductDetail(kode, nama);
            }

            System.out.println("\n=== Daftar Produk ===");
            for (ProductDetail p : daftarProduk) {
                System.out.println("-------------------");
                System.out.println(p.displayInfo());
            }

        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format angka: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kode produk tidak sesuai format: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}
