/**
 * Created by jc321443 on 29/08/16.
 */
public class CountByThrees
{
    public static void main (String args[])
    {
        final int START = 3;
        final int STOP = 300;
        final int multiple = 30;
        for(int i = START; i <= STOP; i += START)
        {
            System.out.print(i + "  ");
            if(i % multiple == 0)
                System.out.println();
        }
    }
}