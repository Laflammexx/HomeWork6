//Gio Amirajibi

import java.text.*;

public class SecondProgram
{
    public static void main (String [] args)
    {
        DecimalFormat decimal = new DecimalFormat("#,###.00");
        double price [] = {10.62, 14.89, 13.21, 16.55, 18.62, 9.47, 6.58, 18.32, 12.15, 3.98};
        double quantity [] = {4, 8, 6, 7, 9, 15, 3, 5, 2, 4};
        double amount [] = new double[10];
        amount = extend(price,quantity,amount);
        for (int j = 0; j < amount.length; j++)
        {
            System.out.println(decimal.format(amount[j]));
        }
    }
    public static double [] extend (double p [], double q [], double a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = q[i] * p[i];
        }
        return a;
    }
}
