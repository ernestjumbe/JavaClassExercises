/* This program converts an RGB digital color
 * value to a CMYK color value.
 * The program takes 3 arguments red, green and blue
 * as integers and returns C, M, Y, K
 * example execution $ RgbToCmyk 0 0 0
 * returns 0.0 0.0 0.0 1.0
 * Use must enter RGB values from 0 to 255.
 */

public class RgbToCmyk {
  public static void main(String[] args) {
    // Assign user RGB color input to corresponding values,
    int r = Integer.parseInt(args[0]);
    int g = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);
    
    // Convert RGB to CMYK
    double w = Math.max(Math.max(r/255, g/255), b/255);
    System.out.println(w);
    double c = (w - (r/255))/w;
    double m = (w - (g/255))/w;
    double y = (w - (b/255))/w;
    double k = 1 - w;
    
    // Print CMYK value to console
    
    System.out.println(c + " " + m + " " + y + " " + k);
  }
}
