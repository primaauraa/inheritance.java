package universitas;

import java.time.LocalDate;

public class Testcase {
    public static void main(String[] args) {
        
        System.out.println("==========Class Manusia==========");
        Manusia manusiaA = new Manusia("Andi", true, "111", true);
        System.out.println(manusiaA);
        System.out.println();
        Manusia manusiaB = new Manusia("Clara", false, "864", true);
        System.out.println(manusiaB);
        System.out.println();
        Manusia manusiaC = new Manusia("Lovely", false, "355", false );
        System.out.println(manusiaC);
        System.out.println();

        System.out.println("==========Class MahasiswaFilkom==========");
        MahasiswaFilkom mahasiswaFilkomA = new MahasiswaFilkom("235150407111043", 2.98, "Prima Aura", false, "123", false);
        System.out.println(mahasiswaFilkomA);
        System.out.println();
        MahasiswaFilkom mahasiswaFilkomB = new MahasiswaFilkom("235150407111043", 3.48, "Prima Aura", false, "123", false);
        System.out.println(mahasiswaFilkomB);
        System.out.println();
        MahasiswaFilkom mahasiswaFilkomC = new MahasiswaFilkom("235150407111043", 4.00, "Prima Aura", false, "123", false);
        System.out.println(mahasiswaFilkomC);
        System.out.println();

        System.out.println("==========Class Pekerja==========");
        Pekerja pekerjaA = new Pekerja("Yellow", true, "675", true, 1000, LocalDate.of(2022, 1, 1), 2);
        System.out.println(pekerjaA);
        System.out.println();
        Pekerja pekerjaB = new Pekerja("Cania", false, "555", true, 1000, LocalDate.of(2015, 2, 1), 0);
        System.out.println(pekerjaB);
        System.out.println();
        Pekerja pekerjaC = new Pekerja("Rendy", true, "456", true, 1000, LocalDate.of(2004, 1, 1), 10);
        System.out.println(pekerjaC);
        System.out.println();

        System.out.println("==========Class Manager==========");
        Manager managerA = new Manager("Graham Bell", true, "111", true, 7500, LocalDate.of(2009, 1, 2), 3, "HRD");
        System.out.println(managerA);
    }
}