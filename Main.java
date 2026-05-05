public class Main {
    public static void main(String[] args) {
        Pasien pasien1 = new Pasien("Agus");

        Dokter dokter1 = new Dokter("Dr. Ma'ruf");
        Dokter dokter2 = new Dokter("Dr. Amin");
        Dokter dokter3 = new Dokter("Dr. Pindo");

        Dokter[] daftarDokter = {dokter1, dokter2, dokter3};

        Klinik klinik = new Klinik(daftarDokter);

        for (Dokter dokter : klinik.getDokter()) {
            dokter.periksaPasien(pasien1);
        }
    }
}
