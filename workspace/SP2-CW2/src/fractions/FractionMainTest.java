package fractions;


import java.math.*;

/**
 * Simple test class for the Fraction class.
 *
 * @author Carsten Fuhs
 */
public class FractionMainTest {

    /**
     * @param args Ignored.
     */
    public static void main(String[] args) {
        Fraction[] allFractions = {
            new Fraction(12,5),    // 0
            new Fraction(-1,2),    // 1
            new Fraction(BigInteger.ONE,new BigInteger("123456789012345678901234567890")),  // 2
            new Fraction(1),       // 3
            new Fraction(5,3),     // 4
            new Fraction(-10,-6),  // 5
            new Fraction(5,-10),   // 6
            new Fraction(-12,24),  // 7
            new Fraction(4,2),     // 8
            new Fraction(BigInteger.valueOf(-2)),   // 9
            new Fraction(BigInteger.valueOf(-2), BigInteger.ONE),  // 10
            new Fraction(0),       // 11
            new Fraction(0,3),     // 12
            new Fraction(4,0),     // 13
            new Fraction(0)        // 14
        };

        Fraction[] someFractionsNull = {
            new Fraction(5,7),  // 0
            null,               // 1
            new Fraction(2,8),  // 2
        };

        Fraction[] allFractionsNonNull = {
            new Fraction(5,-10),  // 0
            new Fraction(5,3),    // 1
            new Fraction(12,5),   // 2
     
        };
        
        System.out.println(allFractions[0]);

        System.out.println("(01) add:");
        System.out.println("ACTUAL:   " + allFractions[0].add(allFractions[1]));
        System.out.println("EXPECTED: " + "(19 / 10)");

        System.out.println("(02) add:");
        System.out.println("ACTUAL:   " + allFractions[0].add(allFractions[10]));
        System.out.println("EXPECTED: " + "(2 / 5)");
        
        System.out.println("(03) subtract:");
        System.out.println("ACTUAL:   " + allFractions[9].subtract(allFractions[4]));
        System.out.println("EXPECTED: " + "(-11 / 3)");

        System.out.println("(04) multiply:");
        System.out.println(allFractions[2]);
        System.out.println(allFractions[6]);
        System.out.println("ACTUAL:   " + allFractions[2].multiply(allFractions[6]));
        System.out.println("EXPECTED: " + "(-1 / 246913578024691357802469135780)");


    	}
	}
