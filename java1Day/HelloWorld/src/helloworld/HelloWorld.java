/** 
 * This is another comment
 * This is also a comment
*/

package helloworld;

import java.util.Arrays;


public class HelloWorld {
    public static void main(final String[] args) throws Exception {
        /**
        // Print the words  hello world on the screen
        int lenghtMessage = "Hello Java".length();
        System.out.println(lenghtMessage); //Print lenghMessage variable
        // Primitive Type
        byte userAge = 39; // 1 byte storage, integers from -128 to 127 => -(2^7) to 2^7-1
        short numberOfStrudents= 45;  // 2 bytes storage, -32768 to 32767 =>-(2^15) to (2^15-1)
        int numberOfEmployees= 500; // 4 bytes, -2^31 to 2^31-1
        long numberOfInhabitants= 21021313012678L; // 8 bytes -2^63 to 2^63-1, Long value
        
        float hourlyRate = 60.5F; // 4 bytes -3.40282347 x 10^38 to positive 3.40282347 x 10^38 precision of about 7 digits
        double numberOfHours = 5120.5; // 8 bytes 1.79769313486231570 x 10 308 to positive 1.79769313486231570 x 10 308 , precision of 15 digits.
        char grade = 'A'; // 2 bytes
        boolean promote = true;
        byte level = 2, userExperience= 5; // 
        // (short) Math.pow(2, 15);
        System.out.println(numberOfStrudents++);
        System.out.println(numberOfStrudents);
        short vestaSize;
        vestaSize = 530; // kilometers
        int vestaSizeDam = (int) vestaSize*100;
        System.out.println(vestaSizeDam);
        
        int lenghtMaunaKea = message.length();
        String stringConvertions = message.substring(0,10).toUpperCase().toLowerCase();
        char myChar;
        myChar = message.substring(0,10).charAt(8);
        boolean equalsOrnot = "Mauna Kea is the tallest mountain on Earth".equals("Mauna Kea is the tallest mountain on Earth");
        boolean equalsOrnot2 = "Mauna Kea is the tallest mountain on Earth".equals("Mauna Kea");
        System.out.println(equalsOrnot);
        String message;
        message = "Mauna Kea is the tallest mountain on Earth from base to peak at more than 33,500 fee";
        String[] splitMessage = message.split("\\s");
        System.out.println(Arrays.toString(splitMessage));
        System.out.println(Arrays.toString(splitMessage).length());;
        
        int[] planetAges;
        String systemSolarPlanets[];
        systemSolarPlanets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus","Neptune"};
        int [] aYearInOthersPlanets = new int[] {88, 225,365, 687, 4333,10759,30687,60190};
        int [] aYearInEarthDays = {88, 225,365, 687, 4333,10759,30687,60190};
        String[] neptuneRings = new String [5];
        neptuneRings[0] = "Galle";
        neptuneRings[1] = "Leverrier";
        neptuneRings[2] = "Lassell";
        neptuneRings[3] = "Arago";
        neptuneRings[4] = "Adams";
        // Neptune's rings
        int [] distanceFromPlanetCenter = {41900, 53200, 55400, 57600, 62930};
        int [] distanceFromPlanetCenter1 = {41900, 53200, 55400, 57600, 62930};
        int [] distanceFromPlanetCenter2 = {62930, 57600, 55400, 53200, 41900};
        
        boolean testing1 = Arrays.equals(distanceFromPlanetCenter, distanceFromPlanetCenter1);
        boolean testing2 = Arrays.equals(distanceFromPlanetCenter, distanceFromPlanetCenter2);
        int [] lucasNumber;
        lucasNumber = new int [] {2, 1, 3, 4, 7, 11, 18, 29, 47, 76, 123, 199, 322, 521, 843, 1364, 2207};
        int [] extract = Arrays.copyOfRange(lucasNumber, 4, 9);
        int [] geometrySecuence = {1,-3,9,-27,81,-243};
        System.out.println(Arrays.toString(geometrySecuence));
        Arrays.sort(geometrySecuence);
        System.out.println(Arrays.toString(geometrySecuence));
        //bynarySearch
        int[] pellNumbers = {0, 1, 2, 5, 12, 29, 70, 169, 408, 985};
        int foundIndex = Arrays.binarySearch(pellNumbers, 29);
        System.out.println(foundIndex);
        System.out.println(Arrays.binarySearch(pellNumbers, 990));
        System.out.println(pellNumbers.length);
        
        // Neptune's rings
        int [] distanceFromPlanetCenter = {41900, 53200, 55400, 57600, 62930};
        System.out.println("Neptune planet has " + distanceFromPlanetCenter.length + " rings");
        
        String[] neptuneRings = new String [5];
        neptuneRings[0] = "Galle";
        neptuneRings[1] = "Leverrier";
        neptuneRings[2] = "Lassell";
        neptuneRings[3] = "Arago";
        neptuneRings[4] = "Adams";
        System.out.println("One of the five Neptune's ring is:\t\n\t\t"+"\\\'"+neptuneRings[0]+"\'");
        System.out.println("The answer for 5.45 divided by 3 is: \n\t\t\t\t" +(5.45/3));
        System.out.printf("The answer for %.3f divided by %d is %.2f.", 5.45, 3, 5.45/3);
        System.out.printf("%n%d%n%.2f%n", 27,1.5); 
        System.out.printf("%d%n", 10);
        System.out.printf("%3d%n", 10);
        System.out.printf("%4d%n", 10);
        System.out.printf("%5d%n", 10);
        System.out.printf("%8.1f%n", 12.45678);
        System.out.printf("%8.2f%n", 12.45678);
        System.out.printf("%8.3f%n", 12.45678);
        System.out.printf("%8.4f%n", 12.45678);
        System.out.printf("%8.5f%n", 12.456789);
        */
        System.out.printf("%d%n", 12345);
        System.out.printf("%,d%n", 12345);
        System.out.printf("%,.2f", 12345.56789);
        }
}