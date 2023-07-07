public class Bank {
    public String namaBank;
    public String[] namaKaryawan;
    public int jmlKaryawan;

    // Mutator
    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        if (this.namaKaryawan == null) {
            this.namaKaryawan = new String[]{namaKaryawan};
        } else {
            String[] newArray = new String[this.namaKaryawan.length + 1];
            System.arraycopy(this.namaKaryawan, 0, newArray, 0, this.namaKaryawan.length);
            newArray[this.namaKaryawan.length] = namaKaryawan;
            this.namaKaryawan = newArray;
        }
        this.jmlKaryawan = this.namaKaryawan.length;
    }

    //Accessor
    public String getNamaBank() {
        return this.namaBank;
    }

    public int getJmlKaryawan() {
        return this.jmlKaryawan;
    }

    public String getNamaKaryawan(int i) {
        return this.namaKaryawan[i];
    }
}

public class Karyawan {
    public String nama;

    // Mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    // Accessor
    public String getNama(){
        return this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Karyawan employee1 = new Karyawan();
        employee1.setNama("Farhan");
        Karyawan employee2 = new Karyawan();
        employee2.setNama("Aryo");
        Karyawan employee3 = new Karyawan();
        employee3.setNama("Pangestu");

        Bank bank = new Bank();
        bank.setNamaBank("Bank Sunday");

        //Relasi antar Kelas bentuk Asosiasi(bisa menggunakan [array]
        bank.setNamaKaryawan(employee1.getNama());
        bank.setNamaKaryawan(employee2.getNama());
        bank.setNamaKaryawan(employee3.getNama());

        System.out.println("Bank        : " + bank.getNamaBank());
        System.out.println("Memiliki karyawan dengan");

        int Karyawan = bank.getJmlKaryawan();
        for(int i=0; i < Karyawan; i++){
            System.out.println("Nama        : " + bank.getNamaKaryawan(i));
        }
    }
}
