class A
{
A()
{
System.out.println("default constructor");
}
A(int x)
{
this();
System.out.println(x);
}
}
class constructor
{
public static void main(String args[])
{
A a=new A(10);
}
}