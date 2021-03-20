import java.util.*;
class day4q2
{
    public static void main()
    {
        int n,i,j,c=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no.");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
               
                System.out.print(c);
                c++;
        }
            System.out.println();
        }}}
