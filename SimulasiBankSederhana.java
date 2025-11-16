package tugasPROGDAS;
import java.util.Scanner;

public class SimulasiBankSederhana {
    public static void main(String[] args) {
        Scanner lk = new Scanner(System.in);
        System.out.println("====PROGRAM SIMULASI BANK====\n====KELOMPOK 01 PROGDAS====");
        System.out.print("Masukkan nama pemilik rekening: ");
        String pemilik = lk.nextLine();
        double uang = 0.0;

        while (true) {
            System.out.println("\nPilih Operasi\n1. Deposit\n2. Penarikan\n3. Cek Uang\n4. Keluar");
            System.out.print("Masukkan pilihan anda (1-4): ");
            int choice = lk.nextInt();

            if (choice == 1) {
                System.out.print("Masukkan jumlah deposit: ");
                double amount = lk.nextDouble();
                if (amount > 0) {
                    uang += amount;
                    System.out.println("Deposit berhasil. Saldo anda sekarang: " + uang);
                } else {
                    System.out.println("Jumlah deposit harus positif");
                }
            } else if (choice == 2) {
                System.out.print("Masukkan jumlah uang yang akan ditarik: ");
                double amount = lk.nextDouble();
                if (amount > 0 && amount <= uang) {
                    uang -= amount;
                    System.out.println("Penarikan saldo berhasil. Saldo anda sekarang: " + uang);
                } else if (amount > uang) {
                    System.out.println("Saldo anda tidak cukup untuk penarikan");
                } else {
                    System.out.println("Jumlah penarikan harus positif");
                }
            } else if (choice == 3) {
                System.out.println("Saldo rekening " + pemilik + ": " + uang);
            } else if (choice == 4) {
                System.out.println("Terima kasih telah menggunakan bank ini, Semoga berjumpa di lain waktu!");
                break;
            } else {
                System.out.println("Pilihan tidak valid, masukkan lagi!");
            }
        }
        lk.close();
    }
}
