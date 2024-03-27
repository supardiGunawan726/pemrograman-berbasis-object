public class Macbook implements Laptop {

  private int volume;
  boolean is_power_on;

  public Macbook(){
    this.volume = 50;
  }

  @Override
  public void powerOn() {
    is_power_on = true;
    System.out.println("Laptop is On");
    System.out.println("Apple");
  }

  @Override
  public void powerOff() {
    is_power_on = false;
    System.out.println("Shutdown is process ...");
  }

  @Override
  public void volumeUp() {
    if (is_power_on){
      if (this.volume == MAX_VOL){
        System.out.println("Volume is Full ");
      } else {
        this.volume += 10;
        System.out.println("Volume is : " + this.getVolume());
      }
    } else {
      System.out.println("Laptop is Off, please turn On the laptop first");
    }
  }

  @Override
  public void volumeDown() {
    if (is_power_on){
      if (this.volume == MIN_VOL){
        System.out.println("Volume is 0% ");
      } else {
        this.volume -= 10;
        System.out.println("Volume is : " + this.getVolume());
      }
    } else {
      System.out.println("Laptop is Off, please turn On the laptop first");
    }
  }
  
  public int getVolume() {
    return volume;
  }

  @Override
  public String toString() {
    return "Macbook";
  }
}
