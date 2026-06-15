import java.util.*;
class q31
{
    public static void main(String args[])
    {
        int i,j,c;
        for(i=1;i<=5;i++)
        {
            c=65;
            for(j=1;j<=i;j++)
            {
                System.out.print((char)c);
                c++;
            }
            System.out.println();
        }
    }
}