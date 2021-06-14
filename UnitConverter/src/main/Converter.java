// Kevin Jia

package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args){
    	
        Scanner userInput = new Scanner(System.in);
        
        userMenu(userInput);
        
        userInput.close();
    }
	
	//first menu
	private static void userMenu(Scanner s){
        System.out.println("Please select an option:" 
        		+ "\n1. Volume Conversions." 
        		+ "\n2. Distance Conversions." 
        		+ "\n3. Temperature Conversions." 
        		+ "\n0. Quit.");
            
            switch(selection(s)){
                case 1: volumeConversionMenu(s);
                break;
                case 2: distanceConversionMenu(s);
                break;
                case 3: temperatureConversionMenu(s);
                break;
                case 0: System.out.println("Quit.");
                break;
                default: userMenu(s);
            }    
    }
    
	// volume conversions menu
    private static void volumeConversionMenu(Scanner s){
    	System.out.println("Please select an option:"
                + "\n1. US Fluild oz to Imperial Fluild oz."
                + "\n2. Teaspoons to Cups"
                + "\n3. US Gallons to Imperial Gallons"
                + "\n0. Go Back.");
    	
    	switch(selection(s)) {
    	case 1:
    		usFluidozToImperialFluildoz();
    		volumeConversionMenu(s);
    		break;
    	case 2:
    		teaspoonsToCups();
    		volumeConversionMenu(s);
    		break;
    	case 3:
    		usGallonsToImperialGallons();
    		volumeConversionMenu(s);
    		break;
    	case 0:
    		userMenu(s);
    	default:
    		volumeConversionMenu(s);  		
    	}
    }
    
    // distance conversions menu
    private static void distanceConversionMenu(Scanner s){
        System.out.println("Please select an option:"
                    + "\n1. Inches to Centimeters."
                    + "\n2. Feet to Meters."
                    + "\n3. Miles to Kilometers."
                    + "\n0. Go Back.");
        
        switch(selection(s)){
            case 1: 
            	inchesToCentimeters();
            	distanceConversionMenu(s);
            	break;
            case 2: 
            	feetToMeters();
            	distanceConversionMenu(s);
            	break;
            case 3: 
            	milesToKilometers();
            	distanceConversionMenu(s);
            	break;
            case 0:
            	userMenu(s);
            	break;
            default: distanceConversionMenu(s);
        }
    }
    
    // temperature conversions menu
    private static void temperatureConversionMenu(Scanner s){
        System.out.println("Please select an option:"
                    + "\n1. Fahrenheit to Celsius."
                    + "\n2. Fahrenheit to Kelvin."
                    + "\n3. Celsius to Kelvin."
                    + "\n0. Go Back.");
        
        switch(selection(s)){
            case 1: 
            	fahrenheitToCelsius();
            	temperatureConversionMenu(s);
            	break;
            case 2:
            	fahrenheitToKelvin();
            	temperatureConversionMenu(s);
            	break;
            case 3:
            	celsiusToKelvin();
            	temperatureConversionMenu(s);
            	break;
            case 0: userMenu(s);
            	break;
            default: temperatureConversionMenu(s);
        }
    }
    
    private static int selection(Scanner scan){
       int selection = scan.nextInt();
       return selection;
    }
    
    // volume conversion methods
    
    // us fluid oz to imperial fluid oz
    private static void usFluidozToImperialFluildoz() {
    	Scanner c = new Scanner(System.in); 
    	System.out.println("How many US fluid oz do you have? (0 to go back)");
    	double in = c.nextDouble(); 
    	if(in == 0) return;
    	double conv = (in * 1.04084);  
    	System.out.println(in + " US fluid oz " + "is " + conv + " Imperial fluid oz.\n");
    	}
    
    // us gallons to imperial gallons
    private static void usGallonsToImperialGallons() {
    	Scanner c = new Scanner(System.in);
    	System.out.println("How many US Gallons do you have? (0 to go back)");
    	double in = c.nextDouble();
    	if(in == 0.0 )return;
    	double conv = (in * 3.78541);
    	System.out.println(in + " US Gallons " + "is " + conv + " Imperial Gallons\n");
    }
    
    // teaspoon to cups
    private static void teaspoonsToCups() {
    	Scanner c = new Scanner(System.in);
    	System.out.println("How many Teaspoons do you have? (0 to go back)");
    	double in = c.nextDouble();
    	if(in == 0.0 ) return;
    	double conv = (in * 0.0205372);
    	System.out.println(in + " Teaspoons " + "is " + conv + " Cups\n");
    }
    
    
    // distance conversion methods
    
    // inches to cm
    private static void inchesToCentimeters() {
    	Scanner c = new Scanner(System.in);
    	System.out.println("How many Inches do you have? (0 to go back)");
    	double in = c.nextDouble();
    	if(in == 0.0 ) return;
    	double conv = (in * 2.54);
    	System.out.println(in + " Inches " + "is " + conv + " Centimeters\n");
    }
    
    // feet to meters
    private static void feetToMeters() {
    	Scanner c = new Scanner(System.in);
    	System.out.println("How many Feet do you have? (0 to go back)");
    	double in = c.nextDouble();
    	if(in == 0.0 )return;
    	double conv = (in * 0.3048);
    	System.out.println(in + " Feet " + "is " + conv + " Meters\n");
    }
    
    
    // miles to km
    private static void milesToKilometers() {
    	Scanner c = new Scanner(System.in);
    	System.out.println("How many Miles do you have? (0 to go back)");
    	double in = c.nextDouble();
    	if(in == 0.0 )return;
    	double conv = (in * 1.60934);
    	System.out.println(in + " Miles " + "is " + conv + " Kilometers\n");
    }


    // temperature conversion methods
    
    // fahrenheit to celsius
    private static void fahrenheitToCelsius() {
    	Scanner c = new Scanner(System.in);
    	System.out.println("What temperature in Fahrenheit do you have? (9999 to go back)");
    	double in = c.nextDouble();
    	if(in == 9999.0) return;
    	double conv = ((in - 32) * (5.0/9.0));
    	System.out.println(in + "° Farenheit " + "is " + conv + "° Celsius\n");
    }
    
    // fahrenheit to kelvin
    private static void fahrenheitToKelvin() {
    	Scanner c = new Scanner(System.in);
    	System.out.println("What temperature in Fahrenheit do you have? (9999 to go back)");
    	double in = c.nextDouble();
    	if(in == 9999.0) return;
    	double conv = (((in - 32) * (5.0/9.0) + 273.15 ));
    	System.out.println(in + "° Farenheit " + "is " + conv + "° Kelvin\n");
    }
    
    // celsius to kelvin
    private static void celsiusToKelvin() {
    	Scanner c = new Scanner(System.in);
    	System.out.println("What temperature in Celsius do you have? (9999 to go back)");
    	double in = c.nextDouble();
    	if(in == 9999.0)return;
    	double conv = (in + 273.15 );
    	System.out.println(in + "° Celsius " + "is " + conv + "° Kelvin\n");
    }

}
