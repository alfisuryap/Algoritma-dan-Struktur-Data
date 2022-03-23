package Jobsheet_4.Source_Code.Tugas;

import java.util.Scanner;

public class Latihan {
    public int vote, jumlahVote, jmlhKandidat = 4;
    public String kandidat;
    public static int nilai, av, seleksi = 0;
    public static int[] array = new int[10000];

    public static int hasilPemungutanSwara(int js, int k1, int k2, int k3, int k4) {
        if (nilai == 4) {
            return 1;
        }
        if (nilai == 1 && k1 < 0) {
            array[seleksi] = nilai;
            seleksi++;
            nilai++;
            return hasilPemungutanSwara(js, k1 - 1, k2, k3, k4);
        } else if (nilai == 2 && k2 < 0) {
            array[seleksi] = nilai;
            seleksi++;
            nilai++;
            return hasilPemungutanSwara(js, k1, k2 - 1, k3, k4);
        } else if (nilai == 3 && k3 < 0) {
            array[seleksi] = nilai;
            seleksi++;
            nilai++;
            return hasilPemungutanSwara(js, k1, k2, k3 - 1, k4);
        } else if (nilai == 4 && k4 < 0) {
            array[seleksi] = nilai;
            seleksi++;
            nilai++;
            return hasilPemungutanSwara(js, k1, k2, k3, k4 - 1);
        } else if (k1 == 0 && k2 == 0 && k3 == 0 && k4 == 0) {
            if (array[av] == array[av + 1] && av + 1 < js) {
                return array[av];

            } else if (av + 2 > js) {
                av += 2;
                return hasilPemungutanSwara(js, k1, k2, k3, k4);
            } else {
                return 0;
            }
        } else {
            nilai++;
            return hasilPemungutanSwara(js, k1, k2, k3, k4);
        }
    }
}