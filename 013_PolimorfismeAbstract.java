public abstract class Employee {
    protected String nama;
    protected String nip;

    public Employee(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public abstract double hitungGaji();

    public abstract void cetakInformasi();
    
    public static String formatUang(double nilai) {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return "Rp " + formatter.format(nilai);
    }
}

public class SalariedEmployee extends Employee {
    private double upahMingguan;

    public SalariedEmployee(String nama, String nip, double upahMingguan) {
        super(nama, nip);
        this.upahMingguan = upahMingguan;
    }

    @Override
    public double hitungGaji() {
        return upahMingguan;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Salaried Employee");
        System.out.println("Nama    : " + nama);
        System.out.println("NIP     : " + nip);
        System.out.println("Gaji    : " + formatUang(hitungGaji()));
        System.out.println();
    }
}

public class CommissionEmployee extends Employee {
    private double gajiPokok;
    private double komisi;
    private double totalPenjualan;

    public CommissionEmployee(String nama, String nip, double gajiPokok, double komisi, double totalPenjualan) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (komisi * totalPenjualan);
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Commission Employee");
        System.out.println("Nama    : " + nama);
        System.out.println("NIP     : " + nip);
        System.out.println("Gaji    : " + formatUang(hitungGaji()));
        System.out.println();
    }
}

public class ProjectPlanner extends Employee {
    private double gajiPokok;
    private double komisi;
    private double totalHasilProyek;

    public ProjectPlanner(String nama, String nip, double gajiPokok, double komisi, double totalHasilProyek) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalHasilProyek = totalHasilProyek;
    }

    @Override
    public double hitungGaji() {
        double pajak = 0.05 * gajiPokok;
        return gajiPokok + (komisi * totalHasilProyek) - pajak;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Project Planner");
        System.out.println("Nama    : " + nama);
        System.out.println("NIP     : " + nip);
        System.out.println("Gaji    : " + formatUang(hitungGaji()));
        System.out.println();
    }
}

public class SalariedEmployee extends Employee {
    private double upahMingguan;

    public SalariedEmployee(String nama, String nip, double upahMingguan) {
        super(nama, nip);
        this.upahMingguan = upahMingguan;
    }

    @Override
    public double hitungGaji() {
        return upahMingguan;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("Salaried Employee");
        System.out.println("Nama    : " + nama);
        System.out.println("NIP     : " + nip);
        System.out.println("Gaji    : " + formatUang(hitungGaji()));
        System.out.println();
    }
}
