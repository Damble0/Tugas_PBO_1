import java.util.ArrayList;
import java.util.List;

public class Klinik {
    private List<Ruangan> ruangan;
    private List<Dokter> dokter;

    public Klinik(int jumlah, List<Dokter> dokter) {
        this.dokter = dokter;
        ruangan = new ArrayList<>();


        for (int i = 0 ; i < jumlah; i++){
            ruangan.add(new Ruangan(i+1));
        }
    }
    public List<Ruangan> getRuangan() {
        return ruangan;
    }

}
