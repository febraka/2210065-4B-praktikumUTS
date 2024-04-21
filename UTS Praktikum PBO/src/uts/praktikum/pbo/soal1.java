package uts.praktikum.pbo;

import java.util.Random;

public class soal1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int bulan = rand.nextInt(12) + 1;
        String namaBulan = "";

        if (bulan == 1) {
            namaBulan = "Januari";
        } else if (bulan == 2) {
            namaBulan = "Februari";
        } else if (bulan == 3) {
            namaBulan = "Maret";
        } else if (bulan == 4) {
            namaBulan = "April";
        } else if (bulan == 5) {
            namaBulan = "Mei";
        } else if (bulan == 6) {
            namaBulan = "Juni";
        } else if (bulan == 7) {
            namaBulan = "Juli";
        } else if (bulan == 8) {
            namaBulan = "Agustus";
        } else if (bulan == 9) {
            namaBulan = "September";
        } else if (bulan == 10) {
            namaBulan = "Oktober";
        } else if (bulan == 11) {
            namaBulan = "November";
        } else if (bulan == 12) {
            namaBulan = "Desember";
        }

        System.out.println("Bulan ke " + bulan + " adalah " + namaBulan);
    }
}
