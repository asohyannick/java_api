class Cool
{
    public static void main(String sar[])
    {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;
        boolean result = x > y && a < b;
        boolean output = x > y || a < b || a > 1 || b < 8;
        boolean fun = a > b;
        System.out.println(!fun);
        System.out.println(output);
        System.out.println(result);
    }
}
