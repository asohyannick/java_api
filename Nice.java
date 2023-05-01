class Nice 
{
    public static void main(String[] args)

    {
        int x = 8;
        int y = 17;
        int z = 9;

        int n = 4;

        int result = 0;

        int ternary = 0;


        // ternary operators ?:
        ternary = n%2==0  ? 10 : 20;


         
        if(n%2 == 0)
            result = 10;
        else
            result = 20;

        System.out.println(result);
        if(x>y && x > y)
            System.out.println(x);
        else if(y>x && y > z)
            System.out.println(y);
        else 
            System.out.println(z);
        System.out.println(ternary)
    }
}