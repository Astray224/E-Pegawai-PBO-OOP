// Sub Class Konsultan dari Super Class Pegawai Kontrak yang mengimplementasi Interface infopersonal, interface hitunggaji dan interface tugas dari superclass
class Konsultan extends PegawaiKontrak {
    String address;
    String phoneNumber;
    
    //constructor super
    public Konsultan(String nama, int idPegawai, double hourlyRate, int hoursWorked) {
        super(nama, idPegawai, hourlyRate, hoursWorked);

    }
    


    @Override
    void displayDetails() {
        System.out.println("Konsultan Details:");
        System.out.println("Nama: " + getNama());
        System.out.println("ID Pegawai: " + getIdPegawai());
        System.out.println("Hourly Rate: " + gethourlyRate());
        System.out.println("Hours Worked: " + gethoursWorked());
        System.out.println("Gaji Total: " + calculateSalary()); // Salary sudah dihitung berdasarkan per jam
        System.out.println("Alamat: " + address);
        System.out.println("Nomor HP: " + phoneNumber);
        System.out.println();
    }

    @Override
    public void setPersonalInformation(String address, String phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void tugaspegawai() {
        System.out.println(" Konsultan membantu dalam mengidentifikasi masalah, memberikan solusi, atau memberikan rekomendasi untuk meningkatkan kinerja atau efisiensi sesuai dengan bidang tertentu pada organisasi");
    }

    @Override
    public double calculateSalary() {
        return gethourlyRate() * gethoursWorked();
    }
}