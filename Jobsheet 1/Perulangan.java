import java.util.Scanner;

public class Perulangan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String hari, nim;
        int n, j = 1;
        System.out.print("Masukkan NIM : ");
        nim = sc.next();
        sc.close();
        n = Integer.parseInt(nim, 9, 10, 10);
        if (n < 10){
            n += 10;
        }
        System.out.println("===========================");

        for (int i = 1; i <= n; i++){
            if (j == 1){
                hari = "senin";
            }else if (j == 2){
                hari = "selasa";
            }else if (j == 3){
                hari = "rabu";
            }else if (j == 4){
                hari = "kamis";
            }else if (j == 5){
                hari = "jumat";
            }else if (j == 6){
                hari = "sabtu";
            }else{
                hari = "minggu";
            }

            j++;
            if (i % 7 == 0){
                j = 1;
            }

            System.out.printf("%s ", hari);
        }
    }
}