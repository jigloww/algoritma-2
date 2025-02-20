public class MataKuliah09 {
    

    public MataKuliah09() {
    }
    public MataKuliah09(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

        String kodeMK;
        String nama;
        int sks;
        int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam ditambahkan. Jumlah jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi. Jumlah jam sekarang: " + jumlahJam);
        }
    }
}
