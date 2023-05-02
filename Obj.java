class Calculator 
{

    int a;

    public int add(int n1, int n2)

    {
        int r = n1   + n2;
        return r;
    }
}

public class Obj
{
    public static void main(String[] args)
    {
      
        int num1 = 4;
        int num2 = 5;
        
        //int result = num1 + num2;
        Calculator calc = new Calculator();


        int result = calc.add(num1, num2);

        System.out.println(result);

    }
}
    // Object Oriented Programming.
    // Objects: - Properties and Behavior
    // Every  objects have  a property and behavior

    // How do we create objects
    // First we have to create a class
    // Who creates objects for us in java? It is our Java Virtual Machine JVM.
    // In Java whatever you want to do, you have to do it inside a class.