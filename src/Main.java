public class Main {
    public static void main(String[] args)
    {
        // Declare variables
        int numToExamine = 2;
        int remainder = 0;
        String evenOdd = " ";

        remainder = numToExamine % 2;

        if (remainder == 0)
        {
            evenOdd = "even";
        }
        else
        {
            evenOdd = "odd";
        }

        System.out.println("Your number is " + evenOdd);
    }
}