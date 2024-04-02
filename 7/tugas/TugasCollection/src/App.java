import java.util.ArrayDeque;

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
        Person person = new Person("Budi");
        person.addLastChild(new Person("Heru"));
        person.addLastChild(new Person("Sinta"));
        person.addLastChild(new Person("Setia"));
        person.addFirstChild(new Person("Neng"));

        System.out.println("Nama: " + person.getName());
        System.out.println("Anak pertama: " + person.getFirstChild().getName());
        System.out.println("Anak terakhir: " + person.getLastChild().getName());
    }
}
