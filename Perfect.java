
class Perfect {
    public static void main(String args[])
    {
        int x = Integer.parseInt(args[0]);
        int d = 2;//divisor * k = integer. cant divide in zero, and 1 is known to be a divider.
        int counter = 1;
        String S = args[0] + " is a perfect number since "+args[0]+" = 1";

        while(d < (x/2 + 1))
        {
            if( x % d == 0)
            {
                counter += d;
                S += "+" + String.valueOf(d);
            }
            d++;
        }
        if(counter == x)
        {
            System.out.println(S);
        }
        else
        {
            System.out.println(args[0]+" is not a perfect number");

        }
    }
}