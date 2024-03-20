public class Teacher extends Person {
  private int numCourses = 0;
  private String[] courses = {};
  
  Teacher(String name, String address) {
    super(name, address);
  }

  public boolean addCourse(String course){
    boolean isCourseExist = false;

    for (int i = 0; i < courses.length; i++){
      if (isCourseExist) break;

      isCourseExist = courses[i] == course;
    }

    if (!isCourseExist){
      numCourses += 1;

      String[] newCourses = new String[numCourses];
      for (int i = 0; i < courses.length; i++){
        newCourses[i] = courses[i];
      }
      newCourses[newCourses.length - 1] = course;

      courses = newCourses;
    }

    return isCourseExist;
  }

  public boolean removeCourse(String course){
    boolean isCourseExist = false;

    for (int i = 0; i < courses.length; i++){
      if (isCourseExist) break;

      isCourseExist = courses[i] == course;
    }

    if (isCourseExist) {
      numCourses -= 1;

      String[] newCourses = new String[numCourses];
      int newCoursesIndex = 0;
      for (int i = 0; i < courses.length; i++){
        if (courses[i] == course){
          continue;
        }

        newCourses[newCoursesIndex] = courses[i];
        newCoursesIndex++;
      }

      courses = newCourses;
    }

    return isCourseExist;
  }

  @Override
  public String toString() {
    return "Teacher: " + super.toString();
  }

  @Override
  public void printData() {
    super.printData();
    System.out.println("Courses: ");
    for (int i = 0; i < courses.length; i++){
      System.out.println(i + 1 + ". " + courses[i]);
    }
  }
}
