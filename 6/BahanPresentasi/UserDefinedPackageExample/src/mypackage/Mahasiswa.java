package mypackage;

public class Mahasiswa {
  String nama;
  String nim;

  public Mahasiswa(String nama, String nim){
    this.nama = nama;
    this.nim = nim;
  }

  public void printInfo(){
    System.out.println("Nama: " + this.nama);
    System.out.println("NIM: " + this.nim);
  }
}