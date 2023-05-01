class Loops
{
    public static void main(String[] args) 
    {
        // repeat these statements 4 times.
        // loops - while, do while , for.

        // 100 - conditions
        int i = 1;

        while(i <= 4)
        {
            System.out.println("Hi" + i);
            // This is a nested while loop
            int j = 1;
            while(j<= 3) {
            System.out.println("Hello" + j);
                j++;
            }
            i++;
        
        }

        System.out.println("Bye" + i);

    }
}