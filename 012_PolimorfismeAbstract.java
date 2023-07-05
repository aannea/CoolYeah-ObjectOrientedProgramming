abstract class BangunDatar {
    abstract double hitungKeliling();
    abstract double hitungLuas();
}

class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungKeliling() {
        return 4 * sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4.0);
        System.out.println("Persegi dengan sisi " + persegi.sisi + " cm menghasilkan");
        System.out.println("Keliling " + persegi.hitungKeliling());
        System.out.println("Luas " + persegi.hitungLuas());
        System.out.println();

        PersegiPanjang persegiPanjang = new PersegiPanjang(10.0, 3.2);
        System.out.println("Persegi Panjang dengan panjang " + persegiPanjang.panjang + " cm dan lebar " + persegiPanjang.lebar + " cm menghasilkan");
        System.out.println("Keliling " + persegiPanjang.hitungKeliling());
        System.out.println("Luas " + persegiPanjang.hitungLuas());
        System.out.println();

        Lingkaran lingkaran = new Lingkaran(7.0);
        System.out.println("Lingkaran dengan jari-jari " + lingkaran.jariJari + " cm menghasilkan");
        System.out.println("Keliling " + lingkaran.hitungKeliling());
        System.out.println("Luas " + lingkaran.hitungLuas());
    }
}
