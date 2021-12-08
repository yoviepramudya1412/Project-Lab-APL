

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        //Strategy pattern
        System.out.println("Pilih Salah Satu Sumber Yodium  : \n1. Garam\n2. Ikan Tuna\n3. Rumput Laut");
        scanner = new Scanner(System.in);
        int pilih = scanner.nextInt();

        StrategyPattern Yodium = new StrategyPattern();

        if (pilih == 1) {
            Yodium.setYodiumRingan(new RumputLaut());
        } else if (pilih == 2) {
            Yodium.setYodiumRingan(new Garam());
        } else if (pilih == 3) {
            Yodium.setYodiumRingan(new IkanTuna());
        }

        System.out.println("Sumber Yodium pilihan anda adalah " + Yodium.getYodiumRingan() + "\n");

        // Adapter Pattern
        Berat mineral = new Mineral();

        System.out.print(Yodium.getYodiumRingan() + " adalah ");
        Yodium.ringan();

        Ringan RinganAdapter = new AdapterPattern(mineral);
        System.out.print(Yodium.getYodiumRingan() + " sekarang sudah menjadi ");
        RinganAdapter.ringan();
    }
}
