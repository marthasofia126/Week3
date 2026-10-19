import java.util.Scanner;
public class RegistrationRecord {
    public static void main (String[] args){
        String cleaned_name;
        String cleaned_course;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = input.nextLine();
        cleaned_name=name.trim();
        int name_length = cleaned_name.length();
        System.out.println("Enter your course: ");
        String course = input.nextLine();
        cleaned_course=course.trim().toUpperCase();
        System.out.println("Cleaned name: " + cleaned_name + "\nName length: " + name_length + "\nCleaned course name: " + cleaned_course);
        boolean matches = cleaned_course.equals("COP1800C");
        System.out.println("Course code matches: " + matches);


        }

        }


