class Task4
{
   
 
    boolean[] either = new boolean[4];
    
    public static void main(String[] args) 
    {
        String[] Phrase = {"Det","er","meget","sjovt"};

        int[] numb = new int[4];

        int[] numb2 = {23, 14, 12, 100, 12};

        Phrases(Phrase);
        numbs(numb);
        average(numb2);
        
    }

    public static void Phrases(String[] Phrase) 
    {
        
        for(int i = 0; i < Phrase.length; i++)
        {
            System.out.printf(Phrase[i] + " ");   
        }
        System.out.println("");
    }

    public static void numbs(int[] numb)
    {
        int sum = 0;
        numb[0] = 1;
        numb[1] = 1;
        numb[2] = 1;
        numb[3] = 1;
        
        for(int i = 0; i < 4; i++)
        {
            sum = sum + numb[i];
        }
        System.out.println("Sum = "+sum);


    }

    public static void average(int[] numb2) 
    {
        
        int total = 0;

        for(int i=0; i<numb2.length; i++){
        	total = total + numb2[i];
        }

        int average = total / numb2.length;
   
        System.out.println("average = " + average);
    }

   


}