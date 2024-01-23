import java.util.Scanner;
/*AIT-RT, cohort 42-1,
Java Basic , homework #3
@author Ruslana Dovganits
@version 22.01.24
*/

public class Lesson4Homework {
    public static void main(String[] args) {

        Scanner s;
        s = new Scanner(System.in);
        
        System.out.println("firstName:");
        String firstName = s.next();
        System.out.println("lastName:");
        String lastName = s.next();
        System.out.println("youCity:");
        String youCity = s.next();
        System.out.println("age:");
        int age = s.nextInt();
        System.out.println("height:");
        double height = s.nextDouble();
        System.out.println("My name is " + firstName + " " + lastName + "." + " I am" + " " + age + "years old" + "." +
                " " + "My city is" + " " + youCity + "." + " " + "My height is"+ " " + height);