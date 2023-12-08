// Sub Class Freelancer dari Super Class Pegawai Kontrak yang mengimplementasi Interface infopersonal, interface hitunggaji dan interface tugas dari superclass
class Freelancer extends PegawaiKontrak  {
    String address;
    String phoneNumber;
    
    //constructor super
    public Freelancer(String nama, int idPegawai, double hourlyRate, int hoursWorked) {
        super(nama, idPegawai, hourlyRate, hoursWorked);

    }
    

    @Override
    void displayDetails() {
        System.out.println("Freelancer Details:");
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
        System.out.println(" Freelancer menawarkan jasa atau keterampilan mereka kepada klien atau organisasi, seringkali dalam bidang seperti desain grafis, penulisan, pengembangan web, atau pekerjaan kreatif lainnya.");
    }

    @Override
    public double calculateSalary() {
        return gethourlyRate() * gethoursWorked();
    }
}