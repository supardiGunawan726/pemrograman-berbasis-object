public class Pigman implements Human, Animal {

  @Override
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pigman says: wee wee");
  }

  @Override
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }

  @Override
  public void walk() {
    // The body of walk() is provided here
    System.out.println("The pigman walking");
  }
  
}
