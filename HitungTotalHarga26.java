import java.util.Scanner;

public class HitungTotalHarga26 {

    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }

    public static int HitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Menu();

        System.out.print("Masukkan pilihan menu (1-6): ");
        int pilihanMenu = input.nextInt();

        System.out.print("Masukkan banyak item: ");
        int banyakItem = input.nextInt();

        int totalBayar = HitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total harga yang harus dibayar: Rp " + totalBayar);
    }
}
