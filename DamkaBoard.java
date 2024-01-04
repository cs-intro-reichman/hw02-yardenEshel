
class DamkaBoard {
    public static void main(String args[])
    {
        int squareSize = Integer.parseInt(args[0]);
        String newLine = "\n";//divisor * k = integer. cant divide in zero, and 1 is known to be a dividers
        String damkaBoard = "";
        for(int i = 0; i < squareSize; i ++)
        {
            for(int j = 0; j< squareSize; j ++)
            {
                damkaBoard += "* ";
            }

            if(i%2 == 0)
            {
                damkaBoard+= newLine;
                damkaBoard+= " ";
            }
            else
            {
                damkaBoard = damkaBoard.substring(0, damkaBoard.length()-1);
                damkaBoard+= newLine;
            }

        }
        System.out.print(damkaBoard);
    }
}