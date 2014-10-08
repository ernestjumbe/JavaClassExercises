public class ISBN {
    public static void main(String[] args)
    {
        int sum = 0;
		int n = Integer.parseInt(args[0]);
		int k, r,d;
		
        for(int i  = 0; i<9; i++){
			k = n % 10;
			sum = sum+k*(i+2);
			n = n/10;
			
		
         
    }
    
   r = n % 11;
   d = 11-r;
   System.out.println(d);
    
}