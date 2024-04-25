package universitas;

public class MahasiswaFilkom extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFilkom(String nim, double ipk, String nama, boolean jenisKelamin, String nik, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodi = Integer.parseInt(nim.substring(6, 7));
        String prodiString;
        switch (prodi) {
            case 2:
                prodiString = "Teknik Informatika";
                break;
            case 3:
                prodiString = "Teknik Komputer";
                break;
            case 4:
                prodiString = "Sistem Informasi";
                break;
            case 6:
                prodiString = "Pendidikan Teknologi Informasi";
                break;
            case 7:
                prodiString = "Teknologi Informasi";
                break;
            default:
                prodiString = "Prodi Tidak Diketahui";
        }
        return prodiString + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) {
            return 75;
        } else if (ipk >= 3.0) {
            return 50;
        } else {
            return 0;
        }
    }

    
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    
    public String toString() {
        return super.toString() +
                "\nnim\t\t: " + nim + "\nipk\t\t: " + ipk + "\nstatus\t\t: " + getStatus();
    }
}

