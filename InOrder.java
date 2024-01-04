
class InOrder {
    public static void main(String args[])
    {
        int max = 10;
        int min = 0;
        int num = (int)(Math.random() * (double)max);;
        int preNum = 0;
        do
        {
            System.out.println(num);
            preNum = num;
            num = (int)(Math.random() * (double)max);
        }while(preNum<=num);
    }
}