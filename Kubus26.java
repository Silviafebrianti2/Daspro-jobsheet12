import java.util.Scanner;

public class Kubus26 {

    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;  
        return volume;
    }

    static int hitungLuasPermukaan(int sisi) {
        int luas = 6 * sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int s = input.nextInt();

        int volumeKubus = hitungVolume(s);
        int luasPermukaanKubus = hitungLuasPermukaan(s);

        System.out.println("Volume kubus: " + volumeKubus);
        System.out.println("Luas permukaan kubus: " + luasPermukaanKubus);

        input.close();
    }
}
