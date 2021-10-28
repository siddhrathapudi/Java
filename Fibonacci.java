import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        System.out.println("Enter a Number:");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        Fibonacci1 obj1=new Fibonacci1();
        int b=obj1.method(a);
        System.out.println("The "+a+"th number of the fibonacci series is: "+b);
    }
}

class Fibonacci1 
{
    
    int a=1;
    int b=1;
    int c=0;
    int count;
    int method(int a)
    {
        count=a;
        count=recursivemethod(count);
        return count;
    }
    
    int recursivemethod(int count)
    {
        if(count!=2)
        {
            c=a+b;
            a=b;
            b=c;
            recursivemethod(--count);
        }
        return c;
    }
}