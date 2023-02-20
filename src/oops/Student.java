package oops;

public class Student {
    //data members :instance varriable
    int studentId;
    String studentName;
    String studentCity;
    //behaviour :methods
    public void study(){
        System.out.println(studentName+ " is studying");
    }
    public void showFullDetails(){
        System.out.println("My name is " + studentName);
        System.out.println("My Id is " + studentId);
        System.out.println("My City is " + studentCity);
    }

}
