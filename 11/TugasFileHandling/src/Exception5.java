// ANALISA ADA PADA SETIAP BARIS KODE

public class Exception5 {
  public static void main(String[] args) {
    int bil=10;
    try{
      System.out.println(bil/0); // INI TERJADI ERROR, KARENA TIDAK BISA DIBAGI DENGAN 0
    }catch(ArithmeticException e){
      // SEHINGGA, KODE YANG ADA PADA CATCH ArithmeticException AKAN DIJALANKAN
      System.out.println("Pesan error: ");
      System.out.println(e.getMessage());
      System.out.println("Info stack erase");
      e.printStackTrace();
      e.printStackTrace(System.out);
    }catch(Exception e){
      System.out.println("Ini menghandle error yang terjadi");
    }
  }
}

