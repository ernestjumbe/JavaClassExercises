// A program to draw four patterns

public class MyShapes {
 public static void main(String[] args){
  firstShape();
  secondShape();
  thirdShape();
  fourthShape();
 }

 public static void firstShape() {
  StdDraw.setPenColor(StdDraw.BLACK);
  StdDraw.filledSquare(.2, .2, .2);
  grayPoly(.0, .0);
  StdDraw.setPenColor(StdDraw.WHITE);
  double[] t1x = {.0, .1, .1};
  double[] t1y = {.1, .1, .0};
  StdDraw.filledPolygon(t1x, t1y);
  double[] t2x = {.0, .1, .1};
  double[] t2y = {.3, .4, .3};
  StdDraw.filledPolygon(t2x, t2y);
  double[] t3x = {.3, .4, .3};
  double[] t3y = {.4, .3, .3};
  StdDraw.filledPolygon(t3x, t3y);
  double[] t4x = {.3, .4, .3};
  double[] t4y = {.1, .1, .0};
  StdDraw.filledPolygon(t4x, t4y);
 }
 
 public static void secondShape() {
   StdDraw.setPenColor(StdDraw.BLACK);
   StdDraw.filledSquare(.7, .2, .2);
   StdDraw.setPenColor(StdDraw.WHITE);
   double [] r1x = {.5, .6, .9, .8};
   double [] r1y = {.3, .4, .1, .0};
   StdDraw.filledPolygon(r1x, r1y);
   double [] r2x = {.5, .8, .9, .6};
   double [] r2y = {.1, .4, .3, .0};
   StdDraw.filledPolygon(r2x, r2y);
   grayPoly(.5, .0);
 }
 
 public static void thirdShape() {
   StdDraw.setPenColor(StdDraw.BLACK);
   double [] r1x = {.1, .3, .3, .1};
   double [] r1y = {.9, .9, .5, .5};
   StdDraw.filledPolygon(r1x, r1y);
   double [] r2x = {.0, .0, .4, .4};
   double [] r2y = {.8, .6, .6, .8};
   StdDraw.filledPolygon(r2x, r2y);
   grayPoly(.0, .5);
 }
 
 public static void fourthShape() {
   StdDraw.setPenColor(StdDraw.BLACK);
   StdDraw.filledSquare(.7, .7, .2);
   StdDraw.setPenColor(StdDraw.WHITE);
   double [] r1x = {.5, .6, .9, .8};
   double [] r1y = {.8, .9, .6, .5};
   StdDraw.filledPolygon(r1x, r1y);
   double [] r2x = {.5, .8, .9, .6};
   double [] r2y = {.6, .9, .8, .5};
   StdDraw.filledPolygon(r2x, r2y);
   StdDraw.setPenColor(StdDraw.GRAY);
   StdDraw.filledSquare(.55, .55, .05);
   StdDraw.filledSquare(.55, .85, .05);
   StdDraw.filledSquare(.85, .85, .05);
   StdDraw.filledSquare(.85, .55, .05);
   grayPoly(.5, .5);
 }
 
 public static void grayPoly( double xOffSet, double yOffSet) {
   // Draws the gray polygon common to all four designs
   StdDraw.setPenColor(StdDraw.GRAY);
   double[] xd = {.0+xOffSet, .2+xOffSet, .4+xOffSet, .2+xOffSet};
   double[] yd = {.2+yOffSet, .4+yOffSet, .2+yOffSet, .0+yOffSet};
   StdDraw.filledPolygon(xd, yd);
 }
}
