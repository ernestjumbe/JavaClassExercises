/* Author: Ernest Jumbe
 * Hand in 2
 * Creative Exercise 1.2.29
 * A program that reuturns the 
 * day of the week when given a date in the
 * Georgian calendar.
 * This program take 3 arguments day, month, year.
 * Execution example $java DayOfTheWeek 23 9 2014
 * This returns 'Tuesday'
 */


public class DayOfTheWeek {
  public static void main(String[] args) {
    // Assign user date input to corresponding variabless
    int d = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);
    
    // An arry of the days of the week in order to return human readable day.
    String[] daysofweek = {
      "Sunday",
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday"
    };
    
    // Calculate the day of the week
    // With a week beginning on a Sunday
    // This an integer where 0 = Sunday, 1 = Monday... 6 = Saturday
    y = y-(14-m)/12;
    int x = y + y/4 - y/100 + y/400;
    m = m + 12 * ((14-m)/12)-2;
    d = (d + x + (31*m)/12)%7;
    
    // Print the day of the week to the console. 
    System.out.println(daysofweek[d]);
  }
}
