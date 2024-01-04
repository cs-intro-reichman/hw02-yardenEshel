
class OneOfEachStats1 {
    public static void main(String args[])
    {

        int families = Integer.parseInt(args[0]);// values above 1 - girl, else boy
        int twoChildren = 0;
        int threeChildren = 0;
        int fourChildrenPlus = 0;
        int tempo = 0;
        double average = 0;
        String biggestGroup = " 4 or more";
        for(int i = 0; i < families ; i++)
        {
            tempo = familyBuild();

            average += tempo;
            switch (tempo){
                case 2:
                    twoChildren ++;
                    break; 
                case 3:
                    threeChildren ++;
                    break;
                default:
                    fourChildrenPlus++;
            }

        }
        if(twoChildren>threeChildren && twoChildren> fourChildrenPlus)
        {
            biggestGroup = " 2 ";
        }
        else if(threeChildren> twoChildren && threeChildren > fourChildrenPlus)
        {
            biggestGroup = " 3 ";
        }
        System.out.println("Average: "+ average/families +" children to get at least one of each gender.\n" +
                "Number of families with 2 children: " + twoChildren +
                "\nNumber of families with 3 children: " + threeChildren +
                "\nNumber of families with 4 or more children: " +fourChildrenPlus +
                "\nThe most common number of children is" + biggestGroup );

    }
    public static int familyBuild()
    {
        int randomSex = (int)(Math.random()*2);// values above 1 - girl, else boy
        boolean isTwoSexFlag = false;
        int childrenCounter = 1;
        do
        {
            childrenCounter++;
            if(randomSex != (int)(Math.random()*2))
            {
                isTwoSexFlag = true;//we got another sex
            }
        }while(!isTwoSexFlag);
        return childrenCounter;
    }
}