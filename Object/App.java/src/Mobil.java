public class Mobil {
    String warna;
    String merek;
    int kecepatan;
    int jarak;

    // konstraktor
    Mobil(String warna, String merek, int kecepatan, int jarak){
        this.warna = warna;
        this.merek = merek;
        this.kecepatan = kecepatan;
        this.jarak = jarak; 
    }

    // function
    void bergerak() {
        System.out.println(
                "Mobil " + this.merek + " " + this.warna + " bergerak dengan kecepatan " + this.kecepatan + "km/jam");
    }

    void berhenti() {
        System.out.println("Dengan jarak tempuh " + this.jarak + "km");
    }
}
