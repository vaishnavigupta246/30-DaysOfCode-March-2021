import java.util.*;
class day4q1
{
    public static void main()
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        n=sc.nextInt();
        for(i=2;i<=n; )
        {
            if(n%i==0)
            {
                System.out.print(i+",");
            n=n/i;
            }
            else
            {
                i++;
            }
        }}}
