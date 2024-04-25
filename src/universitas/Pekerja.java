package universitas;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
       this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    
    public double getBonus() {
        int tahunBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
       
        if (tahunBekerja <= 5) {
            return 0.05 * gaji;
        } else if (tahunBekerja <= 10) {
            return 0.10 * gaji;
        } else {
            return 0.15 * gaji;
        }
        
    }

    public double getPendapatan() {
        return super.getPendapatan() + getGaji() + getBonus() + (20* getJumlahAnak());
    }

    
    public String toString() {
        return super.toString() + "\nTahun Masuk\t: " + tahunMasuk.getDayOfMonth() + " " + tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() + "\nJumlah Anak\t: " + jumlahAnak + "\nGaji\t\t: " + gaji;
    }
}
