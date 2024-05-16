public class ExceptionHandling {
  public static void main(String[] args) {
    
    try {
      int angka_pertama = 21;
      int angka_kedua = 0;
      int hasil_bagi = angka_pertama / angka_kedua; // baris ini akan error
      System.out.println(hasil_bagi);
    } catch (Exception e) {
      System.out.println("Tidak bisa dibagi dengan 0");
    }

  }
}