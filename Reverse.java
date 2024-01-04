
class Reverse {
    public static void main(String args[])
    {
        String x = args[0];

        for(int i = x.length() - 1; i >= 0; i --)
        {
            System.out.print(x.charAt(i));

        }
        System.out.println("\nThe middle character is " + x.charAt(x.length()/2));
    }
}
