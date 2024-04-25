package universitas;

import java.time.LocalDate;

public class Testcase {
    public static void main(String[] args) {
        
        Manusia manusiaA = new Manusia("A", true, "111", true);
        System.out.println("==========Class Manusia==========");
        System.out.println(manusiaA);
        System.out.println();


        MahasiswaFilkom mahasiswaFilkomB = new MahasiswaFilkom("165150300111100", 4.0, "B", false, "111", false);
        System.out.println("==========Class MahasiswaFilkom==========");
        System.out.println(mahasiswaFilkomB);
        System.out.println();

        Pekerja pekerjaC = new Pekerja("C", true, "111", true, 1000, LocalDate.of(2016, 3, 2), 4);
        System.out.println("==========Class Pekerja==========");
        System.out.println(pekerjaC);
        System.out.println();

        Manager managerD = new Manager("D", true, "111", true, 1000, LocalDate.of(2017, 1, 2), 3, "HRD");
        System.out.println("==========Class Manager==========");
        System.out.println(managerD);
    }
}