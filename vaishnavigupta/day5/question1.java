
class day5q1
{
    public static void main()
    {
        int a,b,c,i=1;
        a=0;
        b=1;
        System.out.print(a+", ");
        System.out.print(b+", ");
        while(i<=48)
        {
            
            c=(int)Math.abs(a+b);
            a=b;
            b=c;
        i++;     
                
       System.out.print(c+", ");
        }}}
            
            
