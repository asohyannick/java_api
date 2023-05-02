public class Long
{
    public static void main(String[] args) 
    {
        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        for(int i = 0; i < 4; i++) 
        {
            System.out.println(nums[i]);
        }

        int numss[] = {10, 20, 30, 40};

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(numss[0]);
        System.out.println(numss[1]);
        System.out.println(numss[2]);
        System.out.println(numss[3]);

        for(int y = 0; y < 4; y++)
        {
            System.out.println(numss[y]);
        }

    }
}

