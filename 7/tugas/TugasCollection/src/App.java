import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

class Person {
    private String name;
    private ArrayDeque<Person> childs;

    public Person(String name){
        this.name = name;
        childs = new ArrayDeque<>();
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void addFirstChild(Person child){
        childs.addFirst(child);
    }

    public void addLastChild(Person child){
        childs.addLast(child);
    }

    public Person getFirstChild() {
        return childs.getFirst();
    }

    public Person getLastChild(){
        return childs.getLast();
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Person> warga = new ArrayList<>();

        boolean menuWarga = true;
        do{
            clearScreen();

            System.out.println("Menu warga");
            System.out.println("1. Input warga");
            System.out.println("2. Pilih warga");
            System.out.println("q. quit");

            System.out.print("Input (1/2/q): ");
            String menuWargaInput = scanner.nextLine();

            if (menuWargaInput.equals("1")){
                System.out.print("Nama: ");
                String nama = scanner.nextLine();

                Person person = new Person(nama);
                warga.add(person);

                System.out.print(person.getName() + " berhasil ditambahkan, enter");
                scanner.nextLine();
            }else if(menuWargaInput.equals("2")){

                boolean menuPilihWarga = true;
                while(menuPilihWarga){
                    clearScreen();
                    listWarga(warga);

                    System.out.print("pilih no warga (no/q): ");
                    String personNum = scanner.nextLine();

                    try {
                        if (personNum.equals("q")){
                            menuPilihWarga = false;
                            continue;
                        }

                        Person selectedPerson = warga.get(Integer.parseInt(personNum));

                        boolean menuAnak = true;
                        do{
                            clearScreen();
                            System.out.println("Nama: " + selectedPerson.getName());
                            System.out.println("1. Tambah anak");
                            System.out.println("2. Tambah anak pertama");
                            System.out.println("3. Lihat anak pertama");
                            System.out.println("4. Lihat anak terakhir");
                            System.out.println("q. quit");

                            System.out.print("input (1/2/3/q): ");
                            String menuAnakInput = scanner.nextLine();

                            try {
                                if (menuAnakInput.equals("1")){
                                    System.out.print("Nama: ");
                                    String namaAnak = scanner.nextLine();
    
                                    Person anak = new Person(namaAnak);
                                    selectedPerson.addLastChild(anak);
    
                                    System.out.print(anak.getName() + " berhasil ditambahkan, enter");
                                } else if (menuAnakInput.equals("2")) {
                                    System.out.print("Nama: ");
                                    String namaAnak = scanner.nextLine();
    
                                    Person anak = new Person(namaAnak);
                                    selectedPerson.addFirstChild(anak);
    
                                    System.out.print(anak.getName() + " berhasil ditambahkan, enter");
                                } else if (menuAnakInput.equals("3")){
                                    System.out.print("Anak pertama: " + selectedPerson.getFirstChild().getName());
                                    scanner.nextLine();
                                } else if (menuAnakInput.equals("4")){
                                    System.out.print("Anak terakhir: " + selectedPerson.getLastChild().getName());
                                    scanner.nextLine();
                                } else if (menuAnakInput.equals("q")){
                                    menuAnak = false;
                                }
                            } catch (Exception e) {
                                System.out.print("Belum punya anak, enter");
                                scanner.nextLine();
                            }

                        }while(menuAnak);

                    } catch (Exception e) {
                        System.out.print("Input salah, enter");
                        scanner.nextLine();
                    }
                }

            }else if (menuWargaInput.equals("q")){
                menuWarga = false;
            }


        }while(menuWarga);

        scanner.close();
    }

    static void listWarga(ArrayList<Person> warga){
        for(int i = 0; i < warga.size(); i++){
            System.out.println(i + ". " + warga.get(i).getName());
        }
    }

    static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
