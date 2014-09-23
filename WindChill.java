/* Author Ernest Jumbe, Zach Khadudu
 * This program calculates wind chill
 * temprature. The program takes two
 * arguments of type double the first
 * is the temprature 't' and the second is
 * the wind speed 'w' and returns the wind
 * chil temperature 'w' example usage:
 * $ java WindChill 50.0 4.0
 * returns 48.87024835953933
 */

public class WindChill {
  public static void main(String[] args){
    double t = Double.parseDouble(args[0]);
    double v = Double.parseDouble(args[1]);
    
    if (t > 50.0 || v > 120.0 || v < 3.0) {
      System.out.println("Please make sure your tempreture value is" +
                         "\n not greater than 50.0 and you wind speed value is" +
                         "\n greater than 3.0 and not greater 120.0");
    }
    else {
      double w = 35.74 + 0.6215*(t) + (0.4275*(t) - 35.75)*(Math.pow(v, 0.16));
      System.out.println("The wind chill temprature is " + w);
    }
  }
}