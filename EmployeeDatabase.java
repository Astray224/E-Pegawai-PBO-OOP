import java.util.ArrayList; //import library java array list

class EmployeeDatabase {
    ArrayList<PegawaiTetap> pegawaiTetaps;
    ArrayList<PegawaiKontrak> pegawaiKontraks;

    public EmployeeDatabase() {
        pegawaiTetaps = new ArrayList<>();
        pegawaiKontraks = new ArrayList<>();
    }

    // Method untuk menambahkan objek pegawai tetap ke array pegawaiTetaps
    void addEmployeeTetap(PegawaiTetap pegawaiTetap) {
        pegawaiTetaps.add(pegawaiTetap);
    }

    // Method untuk menambahkan objek pegawai kontrak ke array pegawaiKontraks
    void addEmployeeKontrak(PegawaiKontrak pegawaiKontrak) {
        pegawaiKontraks.add(pegawaiKontrak);
    }

    // Method untuk menampilkan seluruh data pegawai tetap
    void displayAllEmployeesTetap() {
        for (PegawaiTetap pegawaiTetap : pegawaiTetaps) {
            pegawaiTetap.displayDetails();
            pegawaiTetap.tugaspegawai();
            System.out.println("\n");
        }
    }

    // Method untuk menampilkan seluruh data pegawai kontrak
    void displayAllEmployeesKontrak() {
        for (PegawaiKontrak pegawaiKontrak : pegawaiKontraks) {
            pegawaiKontrak.displayDetails();
            pegawaiKontrak.tugaspegawai();
            System.out.println("\n");
        }
    }
}
