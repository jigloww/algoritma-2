public class MataKuliahMain09 {
    public static void main(String[] args) {
        MataKuliah09 mk1 = new MataKuliah09();
        mk1.kodeMK = "PrakASD";
        mk1.nama = "Praktikum Algoritma dan Struktur Data";
        mk1.sks = 1;
        mk1.jumlahJam = 6;
        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();
        System.out.println();

        MataKuliah09 mk2 = new MataKuliah09("BD", "Basis Data", 2, 5);
        mk2.tampilInformasi();
        
    }
}
