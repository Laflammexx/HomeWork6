//Gio Amirajibi

import java.util.*;
import java.text.*;

public class FirstProgram
{
    public static void main (String[] args)
    {
        double price [] = new double[10], total [] = new double[10];
        int amount [] = new int [10];

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("$#,###.00");

        for (int i = 0; i < price.length; i++)
        {
            System.out.println("Please enter price for the item #" + (i+1));
            price[i] = keyboard.nextDouble();
        }
        for (int j = 0; j < amount.length; j++)
        {
            System.out.println("Please enter amount for the item #" + (j+1));
            amount [j] = keyboard.nextInt();
        }
        for (int k = 0; k < total.length; k++)
        {
            total[k] = price[k] * amount[k];
        }

        System.out.println("Price\t\tAmount\t\tTotal");

        for (int m = 0; m < total.length; m++)
        {
            System.out.println(decimal.format(price[m]) + "\t\t" + amount[m] + "\t\t\t" + decimal.format(total[m]));
        }
    }

}
