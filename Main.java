
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Dokter> jmldokter = new ArrayList<>();

        Dokter d1 = new Dokter("Dr. Ma'ruf");
        Dokter d2 = new Dokter("Dr. Amin");
        Dokter d3 = new Dokter("Dr. Pindo");

        jmldokter.add(d1);
        jmldokter.add(d2);
        jmldokter.add(d3);

        Pasien ps1 = new Pasien("rifky");
        Pasien ps2 = new Pasien("maalik");
        Pasien ps3 = new Pasien("annan");
        

        Klinik klk = new Klinik(3, jmldokter);

        d1.periksaPasien(ps1);
        System.out.println("\n");
        d2.periksaPasien(ps2);
        System.out.println("\n");
        d3.periksaPasien(ps3);
    }
}
