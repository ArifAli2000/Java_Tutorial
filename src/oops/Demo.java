package oops;

public class Demo {
    public static void main(String args[]){
        Student st1;
        st1=new Student();
        st1.studentName="Ram";
        st1.studentId=12;
        st1.studentCity="Guwahati";

        st1.study();
        st1.showFullDetails();
    }
}
