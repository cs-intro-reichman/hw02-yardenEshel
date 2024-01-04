
class divisors {
    public static void main(String args[])
    {
        int x = Integer.parseInt(args[0]);

        int d = 1;//divisor * k = integer. cant divide in zero.
        while(d < (x/2 + 1))
        {

            if( x % d == 0)
            {
                System.out.println(d + "\n");
            }
            d++;
        }
        System.out.println(x + "\n");
    }
}