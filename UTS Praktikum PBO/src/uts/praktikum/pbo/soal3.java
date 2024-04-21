package uts.praktikum.pbo;

import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        long n = scanner.nextLong();

        int jumlahDigit = sumDigits(n);
        System.out.println("Jumlah digit dalam " + n + " adalah " + jumlahDigit);

        scanner.close();
    }

    public static int sumDigits(long n) {
      int sum = 0;
      while (n > 0) {
        sum += n % 10;
        n /= 10;
      }
      return sum;
    }

}
