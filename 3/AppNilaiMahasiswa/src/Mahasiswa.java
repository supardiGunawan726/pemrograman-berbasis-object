public class Mahasiswa {
  private String nim;
  private String nama;
  private int nilai;

  Mahasiswa(String nim, String nama, int nilai) throws Exception {
    if (nilai < 0 || nilai > 100){
      throw new Exception("Input nilai anda salah");
    }

    this.nim = nim;
    this.nama = nama;
    this.nilai = nilai;
  }

  public void setNim(String nim) {
    this.nim = nim;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setNilai(int nilai) throws Exception {
    if (nilai < 0 || nilai > 100){
      throw new Exception("Input nilai anda salah");
    }
    this.nilai = nilai;
  }

  public String getNim() {
    return nim;
  }

  public String getNama() {
    return nama;
  }

  public int getNilai() {
    return nilai;
  }

  public String getGrade(){
    if (this.nilai < 50){
      return "E";
    } else if (this.nilai < 60){
      return "D";
    } else if (this.nilai < 70){
      return "C";
    } else if (this.nilai < 80){
      return "B";
    } else {
      return "A";
    }
  }

  public boolean getLulus(){
    return this.nilai >= 60;
  }
}
