public class App {
    public static void main(String[] args) throws Exception {
        Mobil porsche = new Mobil("porsche", 1000000, 400);
        porsche.infoMobil();

        Mobil bmw = new Mobil();
        bmw.setMerk("BMW");
        bmw.setHargaKecepatan(75000, 300);
        bmw.infoMobil();

        MobilDiesel suzuki = new MobilDiesel("Suzuki", 500000, 200, "Solar");
        suzuki.infoMobilDiesel();

        MobilBensin avanza = new MobilBensin("Avanza", 200000, 100, "Bensin");
        avanza.infoMobilBensin();
    }
}
