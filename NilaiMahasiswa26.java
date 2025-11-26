import java.util.Scanner;

public class NilaiMahasiswa26 {

    static void isianArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
    }

    static void tampilArray(int[] arr) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + arr[i]);
        }
    }

    static int hitTot(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        int[] nilai = new int[N];

        isianArray(nilai);      
        tampilArray(nilai);     
        int totalNilai = hitTot(nilai);  

        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);

        input.close();
    }
}
