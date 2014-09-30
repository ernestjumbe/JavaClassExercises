public class ISBN {
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i = 0; i<123456789.length(); i++){
            sum += Integer.parseInt("" + nineDigitNum.charAt(i))*(10-i);
    }
    
    return (sum % 11);
    }
}