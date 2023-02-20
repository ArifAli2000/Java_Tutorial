package oops;

abstract public class                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  Myclass {
    //complet method
    public void cal(){
        System.out.println("calculating result");
    }
    abstract public  void launchRocket();

}
class Start
{
    public static void main(String[] args) {
        Mychild myChild = new Mychild();
        myChild.launchRocket();
        myChild.cal();

    }
}
