// Sub Class Staff Keuangan dari Super Class Pegawai Tetap yang mengimplementasi Interface infopersonal, interface hitunggaji dan interface tugas dari superclass
class StaffKeuangan extends PegawaiTetap {
    String address;
    String phoneNumber;

    //constructor super
    public StaffKeuangan(String nama, int idPegawai, double GajiPokok, double GajiTunjangan) {
        super(nama, idPegawai, GajiPokok, GajiTunjangan);
    }

    @Override
    void displayDetails() {
        System.out.println("Staff Keuangan Details:");
        System.out.println("Nama: " + getNama());
        System.out.println("ID pegawai: " + getIdPegawai());
        System.out.println("Gaji pokok: " + getGajiPokok());
        System.out.println("Gaji Total: " + calculateSalary());
        System.out.println("Alamat: " + address);
        System.out.println("Nomor HP: " + phoneNumber);
    }

    @Override
    public void setPersonalInformation(String address, String phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public double calculateSalary() {
        return getGajiPokok() + getGajiTunjangan();
    }

    @Override
    public void tugaspegawai(){
        System.out.println("Staff bagian ini mengurus manajemen keuangan, pengelolaan anggaran, pelaporan keuangan, dan aktivitas keuangan lainnya dalam organisasi");
    }
}

