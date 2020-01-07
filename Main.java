import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        boolean areMore = true;
        while (areMore)
        {
            double next = keyboard.nextDouble();
            if(next < 0)
                areMore = false;
            else
                sum = sum + next;
        }
        System.out.println("The sum os numbers is: " + + sum);
    }
}
