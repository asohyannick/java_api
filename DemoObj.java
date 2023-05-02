class Calculator 
{
    int num  = 10;

    public int add(int n1, int n2)
    {
        //System.out.println(num);
        return n1 + n2;
    }
}

class DemoObj
{
    public static void main(String[] args)
    {
        
        // obj.num1 = 15;


        Calculator obj = new Calculator();
        // Calculator obj1 = new Calculator();

        int r1 = obj.add(3, 4);
        System.out.println(r1);
        System.out.println(obj.num);
        // System.out.println(obj1.num);
    }
}