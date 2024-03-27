public class Mahasiswa <T, V> {
  T nama;
  V nilai;

  void setMahasiswa(T nama, V nilai){
    this.nama = nama;
    this.nilai = nilai;
  }

  T getNama() {
    return nama;
  }

  V getNilai() {
    return nilai;
  }

  @Override
  public String toString() {
    return "Nama : " + getNama() + "\n" + "Nilai: " + getNilai();
  }
}


