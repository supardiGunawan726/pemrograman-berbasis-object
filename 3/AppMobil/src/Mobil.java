public class Mobil {
  protected String merk;
  protected int harga, kecepetan;

  Mobil(String merk, int harga, int kecepetan){
    this.merk = merk;
    this.harga = harga;
    this.kecepetan = kecepetan;
  }

  Mobil(){}

  public void setMerk(String brand) {
    merk = brand;
  } 

  public void setHargaKecepatan(int harga, int kecepetan) {
    this.harga = harga;
    this.kecepetan = kecepetan;
  }

  public String getMerk() {
    return merk;
  }

  public int getHarga() {
    return harga;
  }

  public int getKecepetan() {
    return kecepetan;
  }

  void infoMobil(){
    System.out.println("=================");
    System.err.println("Merk: " + getMerk());
    System.err.println("Harga: " + getHarga());
    System.err.println("Kecepatan: " + getKecepetan());
  }
}
