class Calculator 
{
    public int add(int n1, int n2, int n3)
    {
        // int result = n1 + n2 + n3;
        return n1 + n2 + n3;
    }
    public int add(int b1, int b2)
    {
        // int output = n1 + n2;
        return b1 + b2;
    }
      public double add(double n4, int n5)
      // metthod overloading
    {
        // int output = n1 + n2;
        return n4 + n5;
    }
}

class CalcObj
{
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        int r1 = obj.add(3 , 4, 7);
        int r2 = obj.add(7, 5);
        System.out.println(r1);
        System.out.println(r2);
    }
}