package edu.cnm.deepdive.temperature;

public class C2F {
  public static final String USAGE_MESSAGE = "Usage : java %s tempcelsius%n%n"
      + "where tempCelsius is temperature in Celsius degrees";
 public static final String OUTPUT_MESSAGE = "%8.3f \u00B0 celsius = %f\u00b0 Farhrenheit"; 
  public static void main(String[] args) {
 
    if (args.length >0){
     
      try {
        double c = Double.parseDouble(args [0]);
        double f = 32 + c * 9 / 5 ;
        System.out.printf(OUTPUT_MESSAGE, c,f);
      } // end try clause
      catch (NumberFormatException ex) {
        ex.printStackTrace ();
        System.out.printf(USAGE_MESSAGE,C2F.class.getName());
      } // end catch clause
      
    } // end if
      else {
        System.out.printf(USAGE_MESSAGE,C2F.class.getName());
    } // else out
    
  } // end main

}// end C2F
