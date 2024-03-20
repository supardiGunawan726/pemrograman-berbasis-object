public class Student extends Person {
  private int numCourses = 0;
  private String[] courses = {};
  private int[] grades = {};

  Student(String name, String address) {
    super(name, address);
  }

  public void addCourseGrade(String course, int grade){
    numCourses += 1;

    String[] newCourses = new String[numCourses];
    int[] newGrades = new int[numCourses];

    for (int i = 0; i < courses.length; i++){
      newCourses[i] = courses[i];
    }
    newCourses[newCourses.length - 1] = course;

    for (int i = 0; i < grades.length; i++){
      newGrades[i] = grades[i];
    }
    newGrades[newGrades.length - 1] = grade;

    courses = newCourses;
    grades = newGrades;
  }

  public void printGrades(){
    System.out.println("Grades: ");

    for (int i = 0; i < grades.length; i++){
      String course = courses[i];
      int grade = grades[i];
      System.out.println(i + 1 +". Grade " + course + " = " + grade);
    }
  }

  public double getAverageGrade(){
    int gradeSum = 0;
    for (int i = 0; i < grades.length; i++){
      int grade = grades[i];
      gradeSum += grade;
    }
    double averageGrade = (double) gradeSum / (double) numCourses;
    return averageGrade;
  }

  @Override
  public String toString() {
    return "Student :" + super.toString();
  }

  @Override
  public void printData() {
    super.printData();
    System.out.println("Number of courses: " + numCourses);
    System.out.println("Average gradea: " + getAverageGrade());
    printGrades();
  }
}
