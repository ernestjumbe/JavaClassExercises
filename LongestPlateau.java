public class LongestPlateau
    //Ernest Jumbe & Zachariah Khadudu
{
    public static void main(String[] args)
    {
        int count = 1;
        int longest = 0;
        int position = 0;
        int[] a = {1,2,2,3,4,4,4,4,4,5,6,6,6,6,7,8,9};
        int[] b = {};
        
        for (int i = 0; i< a.length-1; i++)
            if (a[i] == a[i+1]){
            count++;
        }
        
        else {
            int pl = count;
            if (pl > longest) {
                longest = pl;
                position = i - (longest-1);
            }; 
           count = 1; 
        }
        
        System.out.println("Longest plateau is "+ longest + " and starts at position " + position +".");
            
   }
}