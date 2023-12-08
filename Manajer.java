// Sub Class Manajer dari Super Class Pegawai Tetap yang mengimplementasi Interface infopersonal, interface hitunggaji dan interface tugas dari superclass
class Manajer extends PegawaiTetap {
    String address;
    String phoneNumber;

    //constructor super
    public Manajer(String nama, int idPegawai, double GajiPokok, double GajiTunjangan) {
        super(nama, idPegawai, GajiPokok, GajiTunjangan);
    }

    @Override
    void displayDetails() {
        System.out.println("Manager Details:");
        System.out.println("Nama: " + getNama());
        System.out.println("ID Pegawai: " + getIdPegawai());
        System.out.println("Gaji Pokok: " + getGajiPokok());
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
        System.out.println("Manajer bertanggung jawab atas pengelolaan dan pengawasan suatu tim, departemen, atau proyek");
    }

}
