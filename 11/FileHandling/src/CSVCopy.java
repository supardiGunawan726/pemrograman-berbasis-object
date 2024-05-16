import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVCopy {
  public static void main(String[] args) {
    String csvfile = "/Users/pardi/Developer/University/pemrograman-berbasis-object/11/FileHandling/src/students.csv";
    String csvCopyfile = "/Users/pardi/Developer/University/pemrograman-berbasis-object/11/FileHandling/src/copy_students.csv";
    System.out.println("NIM, NAMA, UMUR, PRODI");
    try (
      BufferedReader br = new BufferedReader (new FileReader(csvfile));
      BufferedWriter bw = new BufferedWriter(new FileWriter(csvCopyfile))
    ){
      String lines = "";
      String line;
      while ((line = br.readLine()) != null) {
        lines += line + "\n";
      }
      bw.write(lines);
    } catch(IOException e){
      e.printStackTrace();
    }
  }
}