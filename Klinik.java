public class Klinik {
    private Ruangan[] ruangan;
    private Dokter[] dokter;

    public Klinik(Dokter[] dokter) {
        this.dokter = dokter;
        this.ruangan = new Ruangan[dokter.length];
        for (int i = 0; i < dokter.length; i++) {
            this.ruangan[i] = new Ruangan(i + 1);
        }
    }

    public Ruangan[] getRuangan() {
        return ruangan;
    }

    public Dokter[] getDokter() {
        return dokter;
    }
}
