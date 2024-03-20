public class Person {
  private String name;
  private String address;

  Person(String name, String address){
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return name + "(" + address + ")";
  }

  public void printData(){
    System.out.print("==========");
    System.out.print("Biodata " + this.getName());
    System.out.print("==========\n");
    System.out.println("Name: " + this.getName());
    System.out.println("Address: " + this.getAddress());
  }
}
