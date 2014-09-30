public class IsbnChecksum{
    //wrightmost digit is checksum digit that can uniquely determined from other 9 numbers
    //from the condition that d1 + 2d2 +...+10d10 must be a multiple of 11
    //Checksum digit di can be any value from 0 - 10
   
    
    public static void main(String[] args)
    
    {
        int N = Integer.parseInt(args[0]);
        
        int sum = 0;
        for (int i = 2; i<= 10; i++){
            int digit = N % 10;
            sum = sum + i * digit;
            N = N / 10;
                
        }
        
        System.out.print("The ISBN number is " + args[0]);
        if      (sum % 11 == 1) System.out.println("x");
        else if (sum % 11 == 0) System.out.println("0");
        else                    System.out.println(11 - (sum % 11));
        
    
    }
    
}