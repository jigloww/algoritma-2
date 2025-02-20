public class DosenMain09 {
    public static void main(String[] args) {
        Dosen09 dosen1 = new Dosen09("D001", "Dr. Budi Santoso", true, 2010, "Kecerdasan Buatan");
        Dosen09 dosen2 = new Dosen09();
        dosen2.idDosen = "D002";
        dosen2.nama = "Prof. Siti Aminah";
        dosen2.statusAktif = false;
        dosen2.tahunBergabung = 2005;
        dosen2.bidangKeahlian = "Sistem Informasi";

        dosen1.tampilInformasi();
        System.out.println("Masa Kerja: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Machine Learning");
        dosen1.tampilInformasi();

        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.tampilInformasi();
    }
}