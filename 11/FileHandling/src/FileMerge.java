import java.io.*;

public class FileMerge {
  public static void main(String[] args) {
    String[] files = {
      "/Users/pardi/Developer/University/pemrograman-berbasis-object/11/FileHandling/src/file1.txt", 
      "/Users/pardi/Developer/University/pemrograman-berbasis-object/11/FileHandling/src/file1.txt"
    };
    String mergedFile = "/Users/pardi/Developer/University/pemrograman-berbasis-object/11/FileHandling/src/merge.txt";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {
      for (String file : files){
        try (BufferedReader br = new BufferedReader (new FileReader(file))) {
          String line;
          while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
          }
        } catch(IOException e){
          e.printStackTrace();
        }
      }
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}
