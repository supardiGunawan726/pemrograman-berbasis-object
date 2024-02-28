public class MobilDiesel extends Mobil {
  String bahan_bakar;

  MobilDiesel(String merk, int harga, int kecepetan, String bahan_bakar){
    super(merk, harga, kecepetan);
    this.bahan_bakar = bahan_bakar;
  }

  void setBahanBakar(String bahan_bakar) {
    this.bahan_bakar = bahan_bakar;
  }

  String getBahanBakar() {
    return bahan_bakar;
  }

  void infoMobilDiesel(){
    super.infoMobil();
    System.err.println("Bahan bakar: " + getBahanBakar());
  }
}
