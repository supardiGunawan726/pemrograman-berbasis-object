import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String csvFile = "/Users/pardi/Developer/University/pemrograman-berbasis-object/11/FileHandling/src/new_students.csv";


    do{
      try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))){
        System.out.print("NIM: ");
        String nim = input.nextLine();
  
        System.out.print("Nama: ");
        String nama = input.nextLine();
  
        System.out.print("Umur: ");
        String umur = input.nextLine();
  
        System.out.print("Prodi: ");
        String prodi = input.nextLine();

        String line = nim + ", " + nama + ", " + umur + ", " + prodi;
        bw.write(line);
        bw.newLine();

        System.out.print("input lagi? (y/n): ");
        String reinput = input.nextLine();

        if (!reinput.equals("y")){
          break;
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }while(true);
    
    input.close();
  }
}
