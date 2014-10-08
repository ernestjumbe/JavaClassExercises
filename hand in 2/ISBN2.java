public class ISBM {
public static int ISBN(String nineDigitNum){
    int sum = 0;
    for(int i = 0; i<nineDigitNum.length(); i++){
        sum += Integer.parseInt(""+nineDigitNum.charAt(i))*(10-i);
    }
    return (sum%11);
}
}