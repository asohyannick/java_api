public class Grace
{
    public static void main(String[] args)
    {
        //  Dimensional arrays
        int nums[][][] = new int[3][4][5]; // jagged arrays
        // three dimensional arrays

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];



        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                // System.out.print(nums[i][j] + " ");
                nums[i][j] = (int)(Math.random() * 100);
                System.out.println(nums[i][j]);

            }
            System.out.println();
        }

        for(int n[] : nums)
        {
            for(int m: n)
            {
                System.out.print(m + "");
            }
            System.out.println();
        }
    }
}