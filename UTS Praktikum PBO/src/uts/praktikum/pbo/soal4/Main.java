package uts.praktikum.pbo.soal4;

public class Main {
        public static void main(String[] args) {
        LimasSegiEmpat LimasSegiEmpat1 = new LimasSegiEmpat();
        System.out.println("Limas Segi Empat 1:");
        System.out.println("Luas = " + LimasSegiEmpat1.getLuas());
        System.out.println("Keliling = " + LimasSegiEmpat1.getVolume());

        LimasSegiEmpat LimasSegiEmpat2 = new LimasSegiEmpat(30, 40, 50);
        System.out.println("\nLimas Segi Empat 2:");
        System.out.println("Luas = " + LimasSegiEmpat2.getLuas());
        System.out.println("Keliling = " + LimasSegiEmpat2.getVolume());

        LimasSegiEmpat LimasSegiEmpat3 = new LimasSegiEmpat(25, 35, 45);
        System.out.println("\nLimas Segi Empat 3:");
        System.out.println("Luas = " + LimasSegiEmpat3.getLuas());
        System.out.println("Keliling = " + LimasSegiEmpat3.getVolume());
    }
}
