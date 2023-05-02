class Arrays 
{
    public static void main(String a[])
    {
        // This is an array of elements.
        int nums[] = {3, 7, 2, 4};
        nums[1] = 6;
        nums[2] = 15;
        // A different array.
        int num1[] = new int[4];
        num1[0] = 4;
        num1[1] = 8;
        num1[2] = 15;
        num1[3] = 20;
    
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        for(int i=0; i<3; i++)
        {
            System.out.println(num1[i]);
        }
        System.out.println(num1[0]);
        System.out.println(num1[1]);
        System.out.println(num1[2]);
        System.out.println(num1[3]);
    }
}