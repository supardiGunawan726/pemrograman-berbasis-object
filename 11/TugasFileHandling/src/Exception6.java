// ANALISA ADA PADA SETIAP BARIS 

public class Exception6 {
  static void demo(){
    NullPointerException t;
    t=new NullPointerException("Coba Throw");
    throw t; // LANGSUNG THROW EXCEPTION YANG DIBUAT, SEHINGGA KODE DIBAWAH TIDAK AKAN DI EKSEKUSI
    
    // Baris ini tidak lagi dikerjakan;
    System.out.println("Ini tidak lagi dicetak");
  }
  public static void main(String[] args) {
    try{
      demo(); // ERROR YANG DI THROW TERDETEKSI BLOCK TRY
      System.out.println("Selesai"); // KODE INI TIDAK AKAN DI EKSEKUSI
    } catch(NullPointerException e) {
      System.out.println("Ada pesan error: "+e); // PESAN ERROR DITAMPILKAN
    }
  }
}

// MESKIPUN BEGITU, KODE DIATAS TIDAK AKAN BISA DI COMPILE, KARENA BARIS ERROR PADA BARIS 10. JAVA MENDETEKSI UNREACHABLE CODE SAAT KOMPILASI.