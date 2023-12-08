// Abstract class sebagai Super Class 2
abstract class PegawaiKontrak implements PersonalInformation, SalaryManagement, Tugas {
    //menggunakkan modifier private pada atribut untuk enkapsulasi
    private String nama;
    private int idPegawai;
    private double hourlyRate;
    private int hoursWorked;

    //constructor
    public PegawaiKontrak(String nama, int idPegawai, double hourlyRate, int hoursWorked) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

     // Getter untuk atribut private
     public String getNama() {
        return nama;
    }
    public int getIdPegawai() {
        return idPegawai;
    }
    public double gethourlyRate(){
        return hourlyRate;
    }
    public int gethoursWorked(){
        return hoursWorked;
    }

    //method abstrak untuk menampilkan detail pegawai yang diwariskan ke subclass
    abstract void displayDetails();
}
