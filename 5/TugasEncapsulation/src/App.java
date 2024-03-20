import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher;
        Student student;

        System.out.println("\nInput Teacher Biodata");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Address: ");
        String teacherAddress = scanner.nextLine();
        teacher = new Teacher(teacherName, teacherAddress);


        System.out.println("\nInput Student Biodata");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Address: ");
        String studentAddress = scanner.nextLine();
        student = new Student(studentName, studentAddress);

        boolean mainMenu = true;
        do {
            clearScreen();
            System.out.println("1. Show teacher data");
            System.out.println("2. Show student data");
            
            System.out.println("3. add teacher's course");
            System.out.println("4. add student's course grade");

            System.out.print("input (1/2/3/4/q): ");
            String inputMainMenu = scanner.nextLine();

            clearScreen();
            if (inputMainMenu.equals("1")){
                teacher.printData();
                System.out.print("Press enter to go back");
                scanner.nextLine();
            } else if (inputMainMenu.equals("2")){
                student.printData();
                System.out.print("Press enter to go back");
                scanner.nextLine();
            } else if (inputMainMenu.equals("3")){
                boolean inputTeachersCourseMenu = true;

                do{
                    clearScreen();
                    System.out.println("Input teacher's course");
                    System.out.print("Course name: ");
                    String course = scanner.nextLine();
                    teacher.addCourse(course);

                    System.out.print("Input another course (y/n): ");
                    String inputOtherCourse = scanner.nextLine();
                    inputTeachersCourseMenu = inputOtherCourse.equals("y");
                } while (inputTeachersCourseMenu);

            } else if (inputMainMenu.equals("4")){
                boolean inputStudentCourseGradeMenu = true;

                do{
                    clearScreen();
                    System.out.println("input student's course grade");
                    System.out.print("Course name: ");
                    String course = scanner.nextLine();
                    System.out.print("Grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine();

                    student.addCourseGrade(course, grade);

                    System.out.print("Input another course grade (y/n): ");
                    String inputOtherCourse = scanner.nextLine();
                    inputStudentCourseGradeMenu = inputOtherCourse.equals("y");
                } while (inputStudentCourseGradeMenu);

            }

            mainMenu = !inputMainMenu.equals("q");
        } while (mainMenu);
    }

    static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
