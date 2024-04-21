package uts.praktikum.pbo;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan = 1;
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        double total = 0;
        int count = 0;

        System.out.print("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0: ");
        while (bilangan != 0) {
        bilangan = input.nextInt ();
        
        if (bilangan != 0) {
            total+= bilangan;
            count++;
            
            if (bilangan > 0) {
                jumlahPositif++;
            }else{
                jumlahNegatif++;
            }
        }
    }

        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata-rata adalah " + (total / count));
    }
}
