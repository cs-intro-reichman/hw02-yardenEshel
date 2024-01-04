
class Reverse {
    public static void main(String args[])
    {
        String x = args[0];
        int len = 0;
        for(int i = x.length() - 1; i >= 0; i --)
        {
            System.out.print(x.charAt(i));

        }
        if(x.length()%2 == 0)
        {
            len = x.length()/2 - 1;
        }
        else
        {
            len = x.length()/2;
        }
        System.out.println("\nThe middle character is " + x.charAt(len));
    }
}
