package oops;

public class Parent {
    //overriden method
    public void m1(){
        System.out.println("i am m1() of Parent");
        return ;
    }
}
// public > protected > deafault >private
class Child extends Parent{
    //overriding method
    //co-varient return types are allowed
    public void m1(){
        System.out.println("i am m1 of child ");
        return ;
    }

}

