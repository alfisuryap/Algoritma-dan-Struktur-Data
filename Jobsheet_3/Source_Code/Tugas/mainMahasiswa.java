package Jobsheet_3.Source_Code.Tugas;

import java.util.Scanner;

public class mainMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        mahasiswa[] mhs = new mahasiswa[10];

        for(int i = 0; i < 3; i++){
            System.out.println("Masukkan data Mahasiswa ke-" + (i+1));
            mhs[i] = new mahasiswa();
            System.out.print("Masukkan Nama         : ");
            mhs[i].nama = input.next();
            System.out.print("Masukkan NIM          : ");
            mhs[i].nim = input.nextInt();
            System.out.print("Masukkan Jenis Kelamin: ");
            mhs[i].jenisKelamin = input.next().charAt(0);
            System.out.print("Masukkan IPK          : ");
            mhs[i].ipk = input.nextDouble();
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama         : " + mhs[i].nama);
            System.out.println("NIM          : " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jenisKelamin);
            System.out.println("IPK          : " + mhs[i].ipk);
        }
    }
}
