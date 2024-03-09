import java.util.ArrayList;

public class KelasMahasiswa {
  private ArrayList<Mahasiswa> listMahasiswa;

  KelasMahasiswa(int kapasitasAwal){
    listMahasiswa = new ArrayList<Mahasiswa>(kapasitasAwal);
  }

  KelasMahasiswa(){
    listMahasiswa = new ArrayList<Mahasiswa>();
  }

  void tambahMahasiswa(Mahasiswa mahasiswa){
    listMahasiswa.add(mahasiswa);
  }

  void printInfo(){
    int jumlahMahasiswa = listMahasiswa.size();
    ArrayList<Mahasiswa> mahasiswaLulus = new ArrayList<Mahasiswa>();
    ArrayList<Mahasiswa> mahasiswaTidakLulus = new ArrayList<Mahasiswa>();
    ArrayList<Mahasiswa> mahasiswaNilaiA = new ArrayList<Mahasiswa>();
    ArrayList<Mahasiswa> mahasiswaNilaiB = new ArrayList<Mahasiswa>();
    ArrayList<Mahasiswa> mahasiswaNilaiC = new ArrayList<Mahasiswa>();
    ArrayList<Mahasiswa> mahasiswaNilaiD = new ArrayList<Mahasiswa>();
    ArrayList<Mahasiswa> mahasiswaNilaiE = new ArrayList<Mahasiswa>();
    int[] nilaiMahasiswa = new int[jumlahMahasiswa];

    // hitung info dan print data masing-masing mahasiswa
    for (int i = 0; i < jumlahMahasiswa; i++){
      Mahasiswa mahasiswa = listMahasiswa.get(i);

      // lulus atau tidak lulus
      if (mahasiswa.getLulus()){
        mahasiswaLulus.add(mahasiswa);
      }else {
        mahasiswaTidakLulus.add(mahasiswa);
      }

      // grade nilai
      switch (mahasiswa.getGrade()) {
        case "A":
          mahasiswaNilaiA.add(mahasiswa);
          break;
        case "B":
          mahasiswaNilaiB.add(mahasiswa);
          break;
        case "C":
          mahasiswaNilaiC.add(mahasiswa);
          break;
        case "D":
          mahasiswaNilaiD.add(mahasiswa);
          break;
        case "E":
          mahasiswaNilaiE.add(mahasiswa);
          break;
      }

      // nilai mahasiswa
      nilaiMahasiswa[i] = mahasiswa.getNilai();

      System.out.println("NIM\t: " + mahasiswa.getNim());
      System.out.println("Nama\t: " + mahasiswa.getNama());
      System.out.println("Nilai\t: " + mahasiswa.getNilai());
      System.out.println("Grade\t: " + mahasiswa.getGrade());
      System.out.println("==================================");
    }

    // print info mahasiswa
    System.out.println("Jumlah Mahasiswa : " + jumlahMahasiswa);

    // print mahasiswa yang lulus
    System.out.print("Jumlah Mahasiswa yang lulus : " + mahasiswaLulus.size() + " yaitu ");
    for (int i = 0; i < mahasiswaLulus.size(); i++){
      Mahasiswa mahasiswa = mahasiswaLulus.get(i);
      System.out.print(mahasiswa.getNama());
      if (i != mahasiswaLulus.size() - 1){
        System.out.print(", ");
      }
    }

    // print mahasiswa yang tidak lulus
    System.out.print("\nJumlah Mahasiswa yang tidak lulus : " + mahasiswaTidakLulus.size() + " yaitu ");
    for (int i = 0; i < mahasiswaTidakLulus.size(); i++){
      Mahasiswa mahasiswa = mahasiswaTidakLulus.get(i);
      System.out.print(mahasiswa.getNama());
      if (i != mahasiswaTidakLulus.size() - 1){
        System.out.print(", ");
      }
    }

    // print mahasiswa grade A
    if (mahasiswaNilaiA.size() > 0){
      System.out.print("\nJumlah Mahasiswa yang Nilai A : " + mahasiswaNilaiA.size() + " yaitu ");
      for (int i = 0; i < mahasiswaNilaiA.size(); i++){
        Mahasiswa mahasiswa = mahasiswaNilaiA.get(i);
        System.out.print(mahasiswa.getNama());
        if (i != mahasiswaNilaiA.size() - 1){
          System.out.print(", ");
        }
      }
    }

    // print mahasiswa grade B
    if (mahasiswaNilaiB.size() > 0){
      System.out.print("\nJumlah Mahasiswa yang Nilai B : " + mahasiswaNilaiB.size() + " yaitu ");
      for (int i = 0; i < mahasiswaNilaiB.size(); i++){
        Mahasiswa mahasiswa = mahasiswaNilaiB.get(i);
        System.out.print(mahasiswa.getNama());
        if (i != mahasiswaNilaiB.size() - 1){
          System.out.print(", ");
        }
      }
    }

    // print mahasiswa grade C
    if (mahasiswaNilaiC.size() > 0){
      System.out.print("\nJumlah Mahasiswa yang Nilai C : " + mahasiswaNilaiC.size() + " yaitu ");
      for (int i = 0; i < mahasiswaNilaiC.size(); i++){
        Mahasiswa mahasiswa = mahasiswaNilaiC.get(i);
        System.out.print(mahasiswa.getNama());
        if (i != mahasiswaNilaiC.size() - 1){
          System.out.print(", ");
        }
      }
    }

    // print mahasiswa grade D
    if (mahasiswaNilaiD.size() > 0){
      System.out.print("\nJumlah Mahasiswa yang Nilai D : " + mahasiswaNilaiD.size() + " yaitu ");
      for (int i = 0; i < mahasiswaNilaiD.size(); i++){
        Mahasiswa mahasiswa = mahasiswaNilaiD.get(i);
        System.out.print(mahasiswa.getNama());
        if (i != mahasiswaNilaiD.size() - 1){
          System.out.print(", ");
        }
      }
    }

    // print mahasiswa grade E
    if (mahasiswaNilaiE.size() > 0) {
      System.out.print("\nJumlah Mahasiswa yang Nilai E : " + mahasiswaNilaiE.size() + " yaitu ");
      for (int i = 0; i < mahasiswaNilaiE.size(); i++){
        Mahasiswa mahasiswa = mahasiswaNilaiE.get(i);
        System.out.print(mahasiswa.getNama());
        if (i != mahasiswaNilaiE.size() - 1){
          System.out.print(", ");
        }
      }
    }

    // print nilai rata-rata
    System.out.print("\nRata-rata nilai mahasiswa adalah : ");
    int totalNilai = 0;
    for (int i = 0; i < nilaiMahasiswa.length; i++){
      int nilai = nilaiMahasiswa[i];
      totalNilai += nilai;

      System.out.print(nilai);

      if (i != nilaiMahasiswa.length - 1){
        System.out.print("+");
      }
    }
    float rataRataNilai = (float) totalNilai / (float) nilaiMahasiswa.length ;
    System.out.print(" / " + nilaiMahasiswa.length + " = " + rataRataNilai);
    System.out.println();
  }
}
