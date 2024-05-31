public class Exception7 {
  public static void main(String[] args) {
    try {
      throw new Exception("Here's my Exception"); // MANUALLY THROWING THE ERROR, 
    }catch(Exception e){
      // THIS BLOCK OF CODE WILL BE EXECUTED
      System.out.println("Caught Exception");
      System.out.println("e.getMessage():"+e.getMessage());
      System.out.println("e.toString():"+e.toString());
      System.out.println("e.printStackTrace():");
      e.printStackTrace();
    }
  }
}