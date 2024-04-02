import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean programRunning = true;

    do{
      System.out.println("============Pilih laptop============");
      System.out.println("1. Lenovo");
      System.out.println("2. Toshiba");
      System.out.println("3. Macbook");
      System.out.println("q. keluar");

      System.out.print("Masukan input: ");
      String menuInput = scanner.nextLine();

      Laptop laptop;

      if (menuInput.equals("1")){
        laptop = new Lenovo();
      } else if (menuInput.equals("2")){
        laptop = new Toshiba();
      } else if (menuInput.equals("3")){
        laptop = new Macbook();
      } else if (menuInput.equals("q")){
        break;
      } else {
        clearScreen();
        System.out.println("Input tidak dikenali");
        continue;
      }

      clearScreen();

      LaptopUser supardi = new LaptopUser(laptop);

      boolean laptopMenu = true;
      do{
        System.out.println("============" + laptop.toString() +"============");
        System.out.println("ON: menyalakan laptop");
        System.out.println("OFF: mematikan laptop");
        System.out.println("UP: menambah volume");
        System.out.println("DOWN: mengurangi volume");
        System.out.println("q: kembali ke pilihan laptop");
        System.out.print("input: ");

        String laptopMenuInput = scanner.nextLine();

        clearScreen();

        if (laptopMenuInput.equals("ON")){
          supardi.turnOnLaptop();
        } else if (laptopMenuInput.equals("OFF")){
          supardi.turnOffLaptop();
        } else if (laptopMenuInput.equals("UP")){
          supardi.makeLaptopLouder();
        } else if (laptopMenuInput.equals("DOWN")){
          supardi.makeLaptopSilence();
        } else if (laptopMenuInput.equals("q")){
          break;
        } else {
          System.out.println("Input tidak dikenali");
          continue;
        }

      }while(laptopMenu);


    }while(programRunning);

    scanner.close();
  }

  static void clearScreen(){
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }
}
