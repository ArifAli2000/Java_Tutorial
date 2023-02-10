//object creation
class Fan
{   //user defined data_type
    String name;
    int cost;
}
class LunchFan
{
    public static void main(String args[])
{
    Fan f1;
    f1=new Fan();
    f1.name="bajaj";
    f1.cost=800;
    Fan f2;
    f2=new Fan();
    f2.name="usha";
    f2.cost=1000;
        System.out.println(f1.name+" "+f1.cost);
        System.out.println(f2.name+" "+f2.cost);
}
}