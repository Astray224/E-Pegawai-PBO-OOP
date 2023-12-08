import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Membuat objek database
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();

        // Membuat scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            // Menampilkan menu
            System.out.println(" ___________________________________");
            System.out.println("|            E-Pegawai              |");
            System.out.println("|==========Pegawai Tetap============|");
            System.out.println("|1. Input data Staff IT             |");
            System.out.println("|2. Input data Staff Keuangan       |");
            System.out.println("|3. Input data Manager              |");
            System.out.println("|==========Pegawai Kontrak==========|");
            System.out.println("|4. Input data Konsultan            |");
            System.out.println("|5. Input data Freelancer           |");
            System.out.println("|6. Input data Security Guard       |");
            System.out.println("|===================================|");
            System.out.println("|7. Tampilkan daftar semua pegawai  |");
            System.out.println("|0. Keluar                          |");
            System.out.println(" -----------------------------------");
            System.out.print(">Pilih menu (0-7): ");
            
            
            // Meminta pengguna untuk memilih menu
            choice = scanner.nextInt();
            scanner.nextLine(); // Mengosongkan buffer scanner
            System.out.print("\n");


            switch (choice) {
                case 1:
                    // Input data pegawai Staff IT
                    System.out.print("Masukkan nama Staff IT: ");
                    String staffITName = scanner.nextLine();
                    System.out.print("Masukkan ID Staff IT: ");
                    int staffITId = scanner.nextInt();
                    System.out.print("Masukkan gaji pokok Staff IT: ");
                    double staffITGajiPokok = scanner.nextDouble();
                    System.out.print("Masukkan gaji Tunjangan bonus Staff IT: ");
                    double staffITGajiTunjangan = scanner.nextDouble();
                    scanner.nextLine(); // Mengosongkan buffer scanner

                    //pembuatan objek staffIT dari subclass StaffIT
                    StaffIT staffIT = new StaffIT(staffITName, staffITId, staffITGajiPokok, staffITGajiTunjangan);

                    // Meminta input alamat dan nomor telepon
                    System.out.print("Masukkan alamat Staff IT: ");
                    String staffITAddress = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon Staff IT: ");
                    String staffITPhoneNumber = scanner.nextLine();

                    staffIT.setPersonalInformation(staffITAddress, staffITPhoneNumber);
                    //memasukkan objek ke array database
                    employeeDatabase.addEmployeeTetap(staffIT);
                    break;

                case 2:
                    // Input data pegawai Staff Keuangan
                    System.out.print("Masukkan nama Staff Keuangan: ");
                    String staffKeuanganName = scanner.nextLine();
                    System.out.print("Masukkan ID Staff Keuangan: ");
                    int staffKeuanganIdPegawai = scanner.nextInt();
                    System.out.print("Masukkan gaji Staff Keuangan: ");
                    double staffKeuanganGajiPokok = scanner.nextDouble();
                    System.out.print("Masukkan gaji Tunjangan bonus Staff Keuangan: ");
                    double staffKeuanganGajiTunjangan = scanner.nextDouble();
                    scanner.nextLine(); // Mengosongkan buffer scanner

                    //pembuatan objek staffkeuangan dari subclass StaffKeuangan
                    StaffKeuangan staffKeuangan = new StaffKeuangan(staffKeuanganName, staffKeuanganIdPegawai, staffKeuanganGajiPokok, staffKeuanganGajiTunjangan);

                    // Meminta input alamat dan nomor telepon
                    System.out.print("Masukkan alamat Staff Keuangan: ");
                    String staffKeuanganAddress = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon Staff Keuangan: ");
                    String staffKeuanganPhoneNumber = scanner.nextLine();

                    staffKeuangan.setPersonalInformation(staffKeuanganAddress, staffKeuanganPhoneNumber);
                    //memasukkan objek ke array database
                    employeeDatabase.addEmployeeTetap(staffKeuangan);
                    break;

                case 3:
                    // Input data pegawai Manager
                    System.out.print("Masukkan nama Manager: ");
                    String managerName = scanner.nextLine();
                    System.out.print("Masukkan ID Manager: ");
                    int managerIdPegawai = scanner.nextInt();
                    System.out.print("Masukkan gaji Manager: ");
                    double managerGajiPokok = scanner.nextDouble();
                    System.out.print("Masukkan gaji Tunjangan bonus Manajer: ");
                    double managerGajiTunjangan = scanner.nextDouble();
                    scanner.nextLine(); // Mengosongkan buffer scanner

                    //pembuatan objek manager dari subclass Manajer
                    Manajer manager = new Manajer(managerName, managerIdPegawai, managerGajiPokok, managerGajiTunjangan);

                    // Meminta input alamat dan nomor telepon
                    System.out.print("Masukkan alamat Manager: ");
                    String managerAddress = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon Manager: ");
                    String managerPhoneNumber = scanner.nextLine();

                    manager.setPersonalInformation(managerAddress, managerPhoneNumber);
                    //memasukkan objek ke array database
                    employeeDatabase.addEmployeeTetap(manager);
                    break;

                case 4:
                    // Input data pegawai kontrak konsultan
                    System.out.print("Masukkan nama Konsultan: ");
                    String konsultanNama = scanner.nextLine();
                    System.out.print("Masukkan ID Konsultan: ");
                    int konsultanIdPegawai = scanner.nextInt();
                    System.out.print("Masukkan Hourly rate konsultan: ");
                    double konsultanhourlyRate = scanner.nextDouble();
                    System.out.print("Masukkan jam kerja Konsultan: ");
                    int konsultanhoursWorked = scanner.nextInt();
                    scanner.nextLine(); // Mengosongkan buffer scanner
            
                    //pembuatan objek konsultan dari subclass Konsultan
                    Konsultan konsultan = new Konsultan(konsultanNama, konsultanIdPegawai, konsultanhourlyRate, konsultanhoursWorked);

                    // Meminta input alamat dan nomor telepon
                    System.out.print("Masukkan alamat Konsultan: ");
                    String konsultanAddress = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon Konsultan: ");
                    String konsultanPhoneNumber = scanner.nextLine();

                    konsultan.setPersonalInformation(konsultanAddress, konsultanPhoneNumber);
                    //memasukkan objek ke array database
                    employeeDatabase.addEmployeeKontrak(konsultan);
                    break;

                case 5:
                    // Input data pegawai kontrak freelancer
                    System.out.print("Masukkan nama Freelancer: ");
                    String freelancerNama = scanner.nextLine();
                    System.out.print("Masukkan ID Freelancer: ");
                    int freelancerIdPegawai = scanner.nextInt();
                    System.out.print("Masukkan Hourly rate Freelancer: ");
                    double freelancerhourlyRate = scanner.nextDouble();
                    System.out.print("Masukkan jam kerja Freelancer: ");
                    int freelancerhoursWorked = scanner.nextInt();
                    scanner.nextLine(); // Mengosongkan buffer scanner
            
                    //pembuatan objek freelancer dari subclass Freelancer
                    Freelancer freelancer = new Freelancer(freelancerNama, freelancerIdPegawai, freelancerhourlyRate, freelancerhoursWorked);

                    // Meminta input alamat dan nomor telepon
                    System.out.print("Masukkan alamat Freelancer: ");
                    String freelancerAddress = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon Freelancer: ");
                    String freelancerPhoneNumber = scanner.nextLine();

                    freelancer.setPersonalInformation(freelancerAddress, freelancerPhoneNumber);
                    //memasukkan objek ke array database
                    employeeDatabase.addEmployeeKontrak(freelancer);
                    break;

                case 6:
                    // Input data Security guard
                    System.out.print("Masukkan nama Security guard: ");
                    String secguardNama = scanner.nextLine();
                    System.out.print("Masukkan ID Security guard: ");
                    int secguardIdPegawai = scanner.nextInt();
                    System.out.print("Masukkan Hourly rate Security guard: ");
                    double secguardhourlyRate = scanner.nextDouble();
                    System.out.print("Masukkan jam kerja Security guard: ");
                    int secguardhoursWorked = scanner.nextInt();
                    scanner.nextLine(); // Mengosongkan buffer scanner
            
                    //pembuatan objek secguard dari subclass Securityguard
                    Securityguard secguard = new Securityguard(secguardNama, secguardIdPegawai, secguardhourlyRate, secguardhoursWorked);

                    // Meminta input alamat dan nomor telepon
                    System.out.print("Masukkan alamat pegawai Security Guard: ");
                    String secguardAddress = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon Security Guard: ");
                    String secguardPhoneNumber = scanner.nextLine();

                    secguard.setPersonalInformation(secguardAddress, secguardPhoneNumber);
                    //memasukkan objek ke array database
                    employeeDatabase.addEmployeeKontrak(secguard);
                    break;


                case 7:
                    // Menampilkan semua pegawai dalam database
                    System.out.println("\nDAFTAR PEGAWAI:");
                    System.out.println("=================");
                    //memanggil method display all employees pada database pegawai
                    employeeDatabase.displayAllEmployeesTetap();
                    employeeDatabase.displayAllEmployeesKontrak();
                    break;

                case 0:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }

            System.out.println(); // Membuat baris baru antara iterasi menu
        } while (choice != 0);

        // Menutup scanner
        scanner.close();
    }
}
