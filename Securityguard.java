// Sub Class Security Guard dari Super Class Pegawai Kontrak yang mengimplementasi Interface infopersonal, interface hitunggaji dan interface tugas dari superclass
class Securityguard extends PegawaiKontrak {
    String address;
    String phoneNumber;
    
    
    //constructor super
    public Securityguard(String nama, int idPegawai, double hourlyRate, int hoursWorked) {
        super(nama, idPegawai, hourlyRate, hoursWorked);

    }
    


    @Override
    void displayDetails() {
        System.out.println("Security Guard Details:");
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
        System.out.println("Security Guard bertanggung jawab untuk menjaga keamanan, seperti patroli, pemantauan CCTV, pemeriksaan identitas pegawai lain, dan penanganan situasi keamanan yang mungkin muncul.");
    }

    @Override
    public double calculateSalary() {
        // Gaji konsultan berdasarkan tarif per jam dan jumlah jam kerja
        return gethourlyRate() * gethoursWorked();
    }
}