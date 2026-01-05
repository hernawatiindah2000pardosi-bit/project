import java.util.Scanner;

public class TokoSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaProduk = {"Buku", "Pulpen", "Pensil", "Penghapus", "Penggaris"};
        int[] harga = {10000, 5000, 3000, 2000, 4000};
        int[] keranjang = {0, 0, 0, 0, 0};

        int pilihan, index, total = 0;

        do {
            System.out.println("\n=== MENU TOKO ===");
            System.out.println("1. Tampilkan Produk");
            System.out.println("2. Tambah Produk");
            System.out.println("3. Hapus Produk");
            System.out.println("4. Hitung Total");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println((i + 1) + ". " + namaProduk[i] + " - Rp " + harga[i]);
                    }
                    break;

                case 2:
                    System.out.print("Pilih nomor produk: ");
                    index = input.nextInt();
                    keranjang[index - 1]++;
                    System.out.println("Produk ditambahkan ke keranjang.");
                    break;

                case 3:
                    System.out.print("Pilih nomor produk: ");
                    index = input.nextInt();
                    if (keranjang[index - 1] > 0) {
                        keranjang[index - 1]--;
                        System.out.println("Produk dihapus dari keranjang.");
                    } else {
                        System.out.println("Keranjang kosong.");
                    }
                    break;

                case 4:
                    total = 0;
                    for (int i = 0; i < 5; i++) {
                        total += keranjang[i] * harga[i];
                    }
                    System.out.println("Total belanja: Rp " + total);
                    break;

                case 5:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        input.close();
    }
}

