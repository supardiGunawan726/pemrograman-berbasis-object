public class ObjectMahasiswa {
  public static void main(String[] args) {
    Mahasiswa<String, Integer> m1 = new Mahasiswa<>();
    Mahasiswa<String, Double> m2 = new Mahasiswa<>();
    Mahasiswa<String, Float> m3 = new Mahasiswa<>();
    
    m1.setMahasiswa("ADI", 80);
    m2.setMahasiswa("BUDI", 90.5);
    m3.setMahasiswa("CEPI", (float) 87.5);

    System.err.println(m1);
    System.err.println(m2);
    System.out.println(m3);
  }
}
