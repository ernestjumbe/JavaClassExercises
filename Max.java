public class Max {
    public static void main(String[] args)
    {
        int[] numbers = {4,6,8,2,9,22,55,245};
        int counter,max;

        max = numbers[0];
        for(counter=0; counter<numbers.length;counter++){
            if(max<numbers[counter]);
            max = numbers[counter];
              
        }
    System.out.println("max " + max);
    }

}