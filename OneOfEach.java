
class OneOfEach {
    public static void main(String args[])
    {
        int randomSex = (int)(Math.random()*2);// values above 1 - girl, else boy
        char sexToBreak;
        boolean isTwoSexFlag = false;
        int childrenCounter = 1;
        if(randomSex == 1)
        {
            sexToBreak = 'g';
        }
        else
        {
            sexToBreak = 'b';
        }
        do
        {
            childrenCounter++;
            System.out.print(sexToBreak+" ");
            if(randomSex != (int)(Math.random()*2))
            {
                System.out.println((char)(103+98-(int)sexToBreak) + "\n");// ascii substraction to get b or g when needed.
                isTwoSexFlag = true;//we got another sex
            }
        }while(!isTwoSexFlag);
        System.out.println("You made it... and you now have " +childrenCounter+" children.");
    }

}