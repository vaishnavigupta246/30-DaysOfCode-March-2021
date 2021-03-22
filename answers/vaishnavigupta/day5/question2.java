import java.util.*;
  
 class day5q2
   {
    public static void main()
    {
        int n,c=0,t=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur no.");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for( int j=1;j<=i;j++)
            {
                c++;
               
                if(c!=1)
                {
                    for(int k=1;k<=c;k++)
                    {
                        if(c%k==0)
                        {
                            t=t+1;
                            System.out.println(t);
                        }
                    }
                    if(t==2)
                    {
                        System.out.print("#");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    System.out.print("*");
                }}
                System.out.println();
            }
        }
    }                        
