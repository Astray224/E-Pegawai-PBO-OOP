// Abstract class sebagai Super Class 1, mengimplementasi interface Tugas
abstract class PegawaiTetap implements PersonalInformation, SalaryManagement, Tugas {
    //menggunakkan modifier private pada atribut untuk enkapsulasi
    private String nama;
    private int idPegawai;
    private double GajiPokok;
    private double GajiTunjangan;

    //Constructor
    public PegawaiTetap(String nama, int idPegawai, double GajiPokok, double GajiTunjangan) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.GajiPokok = GajiPokok;
        this.GajiTunjangan = GajiTunjangan;
    }

     // Getter untuk atribut private
     public String getNama() {
        return nama;
    }
    public int getIdPegawai() {
        return idPegawai;
    }
    public double getGajiPokok() {
        return GajiPokok;
    }
    public double getGajiTunjangan(){
        return GajiTunjangan;
    }

    //method abstrak untuk menampilkan detail pegawai yang diwariskan ke subclass
    abstract void displayDetails();
}
