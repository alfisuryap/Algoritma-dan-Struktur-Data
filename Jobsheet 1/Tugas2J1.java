import java.util.Scanner;

public class Tugas2J1 {
    static double hitungKecepatan(double jarak, double waktu) {
        double kecepatan;
        kecepatan = jarak / waktu;
        return kecepatan;
    }

    static double hitungJarak(double kecepatan, double waktu) {
        double jarak;
        jarak = kecepatan * waktu;
        return jarak;
    }

    static double hitungWaktu(double jarak, double kecepatan) {
        double waktu;
        waktu = jarak / kecepatan;
        return waktu;
    }

    static boolean isUlang(boolean parameter) {
        Scanner sc = new Scanner(System.in);
        boolean ulangError = true;
        while (ulangError) {
            System.out.println("\n--------------------------------------------------");
            System.out.print("Apakah Anda Ingin Keluar Program (Y/N)? ");
            String ulangInput = sc.next();
            if (ulangInput.equalsIgnoreCase("y")) {
                sc.close();
                parameter = false;
                ulangError = false;
            } else if (ulangInput.equalsIgnoreCase("n")) {
                parameter = true;
                ulangError = false;
            } else {
                System.out.println("Error : Input bukan Y atau N");
                ulangError = true;
            }
        }
        return parameter;
    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        int menu;
        boolean ulang = true;
        double jarakInput, waktuInput, kecepatanInput, jarak, kecepatan, waktu;
        while (ulang) {
            System.out.println("==================================================");
            System.out.println("Program Menghitung Kecepatan, Jarak, atau Waktu");
            System.out.println("==================================================");
            System.out.println("\t\tMENU\n");
            System.out.println("1. Hitung Kecepatan(v)");
            System.out.println("2. Hitung Jarak(s)");
            System.out.println("3. Hitung Waktu(t)\n");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("\t\tHitung Kecepatan(v)");
                    System.out.println("--------------------------------------------------");
                    System.out.print("Masukkan Jarak(s) : ");
                    jarakInput = sc.nextDouble();
                    System.out.print("Masukkan Waktu(t) : ");
                    waktuInput = sc.nextDouble();
                    kecepatan = hitungKecepatan(jarakInput, waktuInput);
                    System.out.printf("\nKecepatan(v) = %.2f", kecepatan);
                    ulang = isUlang(ulang);
                    break;
                case 2:
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("\t\tHitung Jarak(s)");
                    System.out.println("--------------------------------------------------");
                    System.out.print("Masukkan Kecepatan(v) : ");
                    kecepatanInput = sc.nextDouble();
                    System.out.print("Masukkan Waktu(t) : ");
                    waktuInput = sc.nextDouble();
                    jarak = hitungJarak(kecepatanInput, waktuInput);
                    System.out.printf("\nJarak(s) = %.2f", jarak);
                    ulang = isUlang(ulang);
                    break;
                case 3:
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("\t\tHitung Waktu(t)");
                    System.out.println("--------------------------------------------------");
                    System.out.print("Masukkan Jarak(s) : ");
                    jarakInput = sc.nextDouble();
                    System.out.print("Masukkan Kecepatan(v) : ");
                    kecepatanInput = sc.nextDouble();
                    waktu = hitungWaktu(jarakInput, kecepatanInput);
                    System.out.printf("\nWaktu(t) = %.2f", waktu);
                    ulang = isUlang(ulang);
                    break;
                default:
                    System.out.print("\nError : Menu Tidak Tersedia");
                    ulang = isUlang(ulang);
                    break;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        menu();
    }
}
