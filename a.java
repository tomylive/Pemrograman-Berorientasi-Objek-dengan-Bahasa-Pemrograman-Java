Code
Formula
Area of a Circle
class CalculateCircleAreaExample
{

    public static void main(String[] args)
    {

        int radius = 3;
        System.out.println("The radius of the circle is " + radius);

	/*
         * Area of a circle is pi * r * r where r is a radius of a circle.
	 */

        // NOTE : use Math.PI constant to get value of pi
        double area = Math.PI * radius * radius;

        System.out.println("Area of a circle is " + area);
    }
}
Output
The radius of the circle is 3
Area of a circle is 28.274333882308138

Calculate Mean
import java.util.Scanner;

class CalculateMean
{

    public static void main(String[] args)
    {

        int sum = 0, inputNum;
        int counter;
        float mean;
        Scanner NumScanner = new Scanner(System.in);

        System.out.println("Enter the total number of terms whose mean you want to calculate");

        counter = NumScanner.nextInt();

        System.out.println("Please enter " + counter + " numbers:");

        for (int x = 1; x <= counter; x++)
        {
            inputNum = NumScanner.nextInt();
            sum = sum + inputNum;
            System.out.println();
        }

        mean = sum / counter;
        System.out.println("The mean of the " + counter + " numbers you entered is " + mean);
    }
}
Output
Enter the total number of terms whose mean you want to calculate
3
Please enter 3 numbers:
11

7

5

The mean of the 3 numbers you entered is 7.0

Calculator
import java.io.*;

class Calculator
{

    public static void main(String[] args)
    {

        int choice;
        int x = 0;
        int y = 0;
        int sum;

        PrintStream out;

        Scanner input;

        Calculator calc = new Calculator();

        try
        {
            out = new PrintStream("calclog.txt");

            do
            {
                System.out.println("Calculator Program");
                System.out.println("--------------------\n");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Mod");
                System.out.println("6. Power");
                System.out.println("99. End Program\n");
                System.out.println("Enter Choice: ");

                input = new Scanner(System.in);
                choice = input.nextInt();

                while ((choice < 1 || choice > 6) && choice != 99)
                {

                    System.out.println("Please enter 1, 2, 3, 4, 5, or 6: ");
                    choice = input.nextInt();

                }

                if (choice != 99)
                {

                    System.out.println("Please enter 2 numbers only: ");
                    x = input.nextInt();
                    y = input.nextInt();

                }

                switch (choice)
                {

                    case 1:

                        sum = calc.add(x, y);
                        System.out.printf("The sum is %d\n\n", sum);
                        out.println(x + "+" + y + "=" + sum);

                        break;

                    case 2:

                        sum = calc.sub(x, y);
                        System.out.printf("The answer is %d\n\n", sum);
                        out.println(x + "-" + y + "=" + sum);

                        break;

                    case 3:

                        sum = calc.multi(x, y);
                        System.out.printf("The answer is %d\n\n", sum);
                        out.println(x + "*" + y + "=" + sum);

                        break;

                    case 4:

                        try
                        {

                            sum = calc.div(x, y);
                            System.out.printf("The answer is %d\n\n", sum);
                            out.println(x + "/" + y + "=" + sum);

                        }
                        catch (Exception e)
                        {

                            System.out
                                    .println("\nError: Cannot Divide by zero\n\n");

                        }

                        break;

                    case 5:

                        sum = calc.mod(x, y);
                        System.out.printf("The mod is %d\n\n", sum);
                        out.println(x + "%" + y + "=" + sum);

                        break;

                    case 6:

                        sum = calc.pow(x, y);
                        System.out.printf("The answer is %d\n\n", sum);
                        out.println(x + "^" + y + "=" + sum);

                        break;
                }


            }

            while (choice != 99);
            input.close();
            System.out.println("Ending program...");

        }

        catch (Exception e)
        {
            System.out.println("ERROR: Some error occured");
            e.printStackTrace();
        }

    }

    public int add(int num1, int num2)
    {

        int sum;
        sum = num1 + num2;

        return sum;
    }

    public int sub(int num1, int num2)
    {

        int sum;
        sum = num1 - num2;

        return sum;
    }

    public int multi(int num1, int num2)
    {

        int sum;
        sum = num1 * num2;

        return sum;
    }

    public int div(int num1, int num2)
    {

        int sum;
        sum = num1 / num2;

        return sum;
    }

    public int mod(int num1, int num2)
    {

        int sum;
        sum = num1 % num2;

        return sum;
    }

    public int pow(int base, int exp)
    {

        int sum = 1;

        if (exp == 0)
        {
            sum = 1;
        }

        while (exp > 0)
        {
            sum = sum * base;
            exp--;

        }

        return sum;

    }

}
Output
Calculator Program
--------------------

1. Add
2. Subtract
3. Multiply
4. Divide
5. Mod
6. Power
99. End Program

Enter Choice: 
4
Please enter 2 numbers only: 
4

Harmonic Series
import java.util.*;

class HarmonicSeries
{

    public static void main(String args[])
    {

        int num, i = 1;
        double rst = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for length of series");
        num = in.nextInt();

        while (i <= num)
        {

            System.out.print("1/" + i + " +");
            rst = rst + (double) 1 / i;

            i++;
        }

        System.out.println("\n\nSum of Harmonic Series is " + rst);
    }
}
Output
Enter the number for length of series
5
1/1 +1/2 +1/3 +1/4 +1/5 +

Sum of Harmonic Series is 2.283333333333333

Quadratic Equation
class QuadraticEquation
{

    public static void main(String[] args)
    {
        /*
	 * Suppose our Quadratic Equation to be solved is 2x2 + 6x + 4 = 0 .
	 * (Assuming that both roots are real valued)
	 * 
	 * General form of a Quadratic Equation is ax2 + bx + c = 0 where 'a' is
	 * not equal to 0
	 * 
	 * Hence a = 2, b = 6 and c = 4.
	 */

        int a = 2;
        int b = 6;
        int c = 4;

        // Finding out the roots
        double temp1 = Math.sqrt(b * b - 4 * a * c);

        double root1 = (-b + temp1) / (2 * a);
        double root2 = (-b - temp1) / (2 * a);

        System.out
                .println("The roots of the Quadratic Equation \"2x2 + 6x + 4 = 0\" are "
                                 + root1 + " and " + root2);

    }
}
Output
The roots of the Quadratic Equation "2x2 + 6x + 4 = 0" are -1.0 and -2.0

Fahrenheit to Celsius
import java.util.*;

class FahrenheitToCelsius
{

    public static void main(String[] args)
    {

        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit : ");
        temperature = in.nextInt();

        temperature = (temperature - 32) * 5 / 9;

        System.out.println("Temperature in Celsius = " + temperature);
    }
}
Output
Enter temperature in Fahrenheit : 33
Temperature in Celsius = 0.5555556

Multiplication Table

class MultiplicationTable
{

    public static void main(String args[])
    {

        int n, c;
        System.out
                .println("Enter an integer to print it's multiplication table");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of " + n + " is :-");

        for (c = 1; c <= 10; c++)
        {
            System.out.println(n + "*" + c + " = " + (n * c));
        }

    }
}
Output
Enter an integer to print it's multiplication table
5
Multiplication table of 5 is :-
5*1 = 5
5*2 = 10
5*3 = 15
5*4 = 20
5*5 = 25
5*6 = 30
5*7 = 35
5*8 = 40
5*9 = 45
5*10 = 50

Multiplication Tables
import java.util.Scanner;

class Tables {
	
	public static void main(String args[]) {
		
		int a, b, c, d;

		System.out
				.println("Enter range of numbers to print their multiplication table");
		Scanner in = new Scanner(System.in);

		a = in.nextInt();
		b = in.nextInt();

		for (c = a; c <= b; c++) {
			System.out.println("Multiplication table of " + c);

			for (d = 1; d <= 10; d++) {
				System.out.println(c + "*" + d + " = " + (c * d));
				
			}
		}
	}
}
Output
Enter range of numbers to print their multiplication table
5 7
Multiplication table of 5
5*1 = 5
5*2 = 10
5*3 = 15
5*4 = 20
5*5 = 25
5*6 = 30
5*7 = 35
5*8 = 40
5*9 = 45
5*10 = 50

Binary To Octal
import java.io.*;

class BinaryToOctal
{
    public static void main(String[] args) throws Exception
    {
        String num = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter binary number : ");
        num = br.readLine();
        int dec = Integer.parseInt(num, 2);

        String oct = Integer.toOctalString(dec);

        System.out.println("Binary " + num + " in Octal is " + oct);

    }
}
Output
Enter binary number : 101010
Binary 101010 in Octal is 52

Fraction Addition

class FractionAdding
{
    public static void main(String args[])
    {
        float a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = scanner.nextFloat();
        System.out.print("Enter b : ");
        b = scanner.nextFloat();
        System.out.print("Enter c : ");
        c = scanner.nextFloat();
        System.out.print("Enter d : ");
        d = scanner.nextFloat();

        // fraction addition formula ((a*d)+(b*c))/(b*d)
        System.out.print("Fraction Addition : [( " + a + " * " + d + " )+( " + b + " * " + c + " ) / ( " + b + " * " + d + " )] = " + (((a * d) + (b * c)) / (b * d)));
    }
}
Output
Enter a : 5
Enter b : 6
Enter c : 7
Enter d : 8
Fraction Addition : [( 5.0 * 8.0 )+( 6.0 * 7.0 ) / ( 6.0 * 8.0 )] = 1.7083334

Fraction Subtraction
import java.util.*;

class FractionSubtraction
{
	public static void main(String args[])
	{
		float a,b,c,d;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = scanner.nextFloat();
		System.out.print("Enter b : ");
		b = scanner.nextFloat();
		System.out.print("Enter c : ");
		c = scanner.nextFloat();
		System.out.print("Enter d : ");
		d = scanner.nextFloat();

		// fraction addition formula ((a*d)-(b*c))/(b*d)
		System.out.print("Fraction subtraction : [( "+a+" * "+d+" )-( "+b+" * "+c+" ) / ( "+b+" * "+d+" )] = "+(((a*d)-(b*c))/(b*d)));
	}
}
Output
Enter a : 1
Enter b : 2
Enter c : 3
Enter d : 4
Fraction subtraction : [( 1.0 * 4.0 )-( 2.0 * 3.0 ) / ( 2.0 * 4.0 )] = -0.25

Hexadecimal To Decimal
import java.io.*;

class HexToDecimal
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter hex no. to convert in Decimal : ");
        String strHexNumber = br.readLine();
               
        /*
         * to convert hexadecimal number to decimal number use,
         * int parseInt method of Integer wrapper class.
         *
         * Pass 16 as redix second argument.
         */

        int decimalNumber = Integer.parseInt(strHexNumber, 16);
        System.out.println("Hexadecimal number converted to decimal number");
        System.out.println("Decimal number is : " + decimalNumber);

    }
}
Output
Enter hex no. to convert in Decimal : b
Hexadecimal number converted to decimal number
Decimal number is : 11

Octal To Decimal
import java.io.*;

class OctalToDecimal
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Octal no. to convert in Decimal : ");
        String number = br.readLine();
               
        /*
          to convert Octal number to decimal number use,
          int parseInt method of Integer wrapper class.
         
          Pass 8 as redix second argument.
         */

        int decimalNumber = Integer.parseInt(number, 8);
        System.out.println("Octal number converted to decimal number");
        System.out.println("Decimal number is : " + decimalNumber);

    }
}
Output
Enter Octal no. to convert in Decimal : 70
Octal number converted to decimal number
Decimal number is : 56

Binary To Decimal
import java.io.*;

class BinaryToDecimal
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Binary no. to convert in Decimal : ");
        String number = br.readLine();
               
        /*
          to convert Binary number to decimal number use,
          int parseInt method of Integer wrapper class.
         
          Pass 2 as redix second argument.
         */

        int decimalNumber = Integer.parseInt(number, 2);
        System.out.println("Binary number converted to decimal number");
        System.out.println("Decimal number is : " + decimalNumber);

    }
}
Output
Enter Binary no. to convert in Decimal : 1010
Binary number converted to decimal number
Decimal number is : 10

GCD of two number using Euclid's method
import java.util.*;

class GCDExample
{
    public static void main(String args[])
    {

        //Enter two number whose GCD needs to be calculated.      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number to find GCD : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number to find GCD : ");
        int number2 = scanner.nextInt();

        System.out.println("GCD of two numbers " + number1 + " and " + number2 + " is :" + findGCD(number1, number2));
    }

    //find GCD of two number using Euclid's method
    private static int findGCD(int number1, int number2)
    {
        //base case
        if (number2 == 0)
            return number1;

        return findGCD(number2, number1 % number2);
    }

}
Output
Enter first number to find GCD : 80
Enter second number to find GCD : 50
GCD of two numbers 80 and 50 is :10

SquareRoot
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SquareRoot
{

    public static void main(String[] args) throws IOException
    {

        int number = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number");

        //read a string entered by user
        String line = br.readLine();

        //Handle exception when a string does not contain a number
        try
        {
            //Convert a string into number
            number = Integer.parseInt(line);
        }
        catch (NumberFormatException exception)
        {

            System.out.println("Please enter a valid number");

        }
        //Find square root of a number
        double squareRoot = Math.sqrt(number);

        //print square root
        System.out.println("Square root of a number " + number + "=" + squareRoot);
    }
}
Output
Enter a number
100
Square root of a number 100=10.0

Calculate the simple and compound interest
import java.lang.*;
import java.util.Scanner;

class CalculateInterest
{
    public static void main(String[] args)
    {
        double p, n, r, si, ci;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        p = s.nextDouble();

        System.out.print("Enter the No.of years : ");
        n = s.nextDouble();

        System.out.print("Enter the Rate of interest : ");
        r = s.nextDouble();

        si = (p * n * r) / 100;
        ci = p * Math.pow(1.0 + r / 100.0, n) - p;

        System.out.println("\nAmount : " + p);
        System.out.println("No. of years : " + n);
        System.out.println("Rate of interest : " + r);
        System.out.println("Simple Interest : " + si);
        System.out.println("Compound Interest : " + ci);
    }
}
Output
Enter the amount : 5000
Enter the No.of years : 3
Enter the Rate of interest : 9

Amount : 5000.0
No. of years : 3.0
Rate of interest : 9.0
Simple Interest : 1350.0
Compound Interest : 1475.1450000000013

Decimal To Binary
import java.util.Scanner;

class DecimalToBinary
{

    public String toBinary(int n)
    {
        if (n == 0)
        {
            return "0";
        }

        String binary = "";
        while (n > 0)
        {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }

        return binary;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int decimal = scanner.nextInt();

        DecimalToBinary decimalToBinary = new DecimalToBinary();
        String binary = decimalToBinary.toBinary(decimal);

        System.out.println("The binary representation is " + binary);
    }
}
Output
Enter a number: 25
The binary representation is 11001

Volume and Area of Cylinder
import java.util.*;

class Cylinder
{
    public static void main(String[] args)
    {
        double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter Height: ");
        double h = sc.nextDouble();

        double volume = PI * r * r * h;
        double area = 2 * PI * r * (r + h);
        System.out.println("Volume of Cylinder: " + volume);
        System.out.println("Area of Cylinder: " + area);
    }
}
Output
Enter Radius: 1
Enter Height: 2
Volume of Cylinder: 6.28
Area of Cylinder: 18.84

Pythagorean Triplet
/*
Pythagorean Triplet: 
c*c = a*a + b*b
*/

class PythagoreanTriplet
{
    public static void main(String s[]) throws Exception
    {
        System.out.println("Pythagorean Triplet: ");
        for (int a = 1; a <= 50; a++)
        {
            for (int b = 1; b <= 50; b++)
            {
                int csquared = a * a + b * b;
                double croot = Math.sqrt(csquared);

                if (croot == Math.ceil(croot))
                {
                    System.out.println(a + " " + b + " " + (int) croot);
                }
            }
        }
    }
}
Output

Pythagorean Triplet:
3 4 5
4 3 5
5 12 13
6 8 10
7 24 25
8 6 10
8 15 17
9 12 15
9 40 41
10 24 26
12 5 13
12 9 15
12 16 20

Area of Rectangle
/*
Pythagorean Triplet: 
c*c = a*a + b*b
*/

class PythagoreanTriplet
{
    public static void main(String s[]) throws Exception
    {
        System.out.println("Pythagorean Triplet: ");
        for (int a = 1; a <= 50; a++)
        {
            for (int b = 1; b <= 50; b++)
            {
                int csquared = a * a + b * b;
                double croot = Math.sqrt(csquared);

                if (croot == Math.ceil(croot))
                {
                    System.out.println(a + " " + b + " " + (int) croot);
                }
            }
        }
    }
}
Output

Pythagorean Triplet:
3 4 5
4 3 5
5 12 13
6 8 10
7 24 25
8 6 10
8 15 17
9 12 15
9 40 41
10 24 26
12 5 13
12 9 15
12 16 20

Area Calculator
import java.util.Scanner;

class AreaCalculator
{

    float l, b, h, r, ba, s, c;
    float result = 0f;
    float pi = 3.14f;
    int var;
    public static void main(String[] args)
    {
        AreaCalculator ar = new AreaCalculator();
        ar.options();
    }

    public void options()
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the Object of which Area is to be calculated \n1:square \n2:rectangle \n3:Triangle\n4:circle\n5:Trapezoid\n6:Repeat\n7:Exit");

        var = a.nextInt();
        Area a1 = new Area();

        if (var == 1)
        {
            System.out.println("Enter the Side of Square");
            s = a.nextFloat();
            a1.square(s);
            options();
        }

        else if (var == 2)
        {
            System.out.println("Enter the Length of Rectangle");
            l = a.nextFloat();
            System.out.println("Enter the Breadth of Rectangle");
            b = a.nextFloat();
            a1.rectangle(l, b);
            options();
        }

        else if (var == 3)
        {
            System.out.println("Enter the Height of Triangle");
            h = a.nextFloat();
            System.out.println("Enter the Base of Triangle");
            ba = a.nextFloat();
            a1.triangle(h, ba);
            options();
        }

        else if (var == 4)
        {
            System.out.println("Enter the Radius of Circle");
            r = a.nextFloat();
            a1.circle(r);
            options();
        }

        else if (var == 5)
        {
            System.out.println("Enter the A side of Trapezoid");
            b = a.nextFloat();
            System.out.println("Enter the B side of Trapezoid");
            c = a.nextFloat();
            System.out.println("Enter the Height of Trapezoid");
            h = a.nextFloat();
            a1.trapezoid(b, c, h);
            options();
        }
    }
}

class Area
{
    public void square(float s)
    {
        float result = 0f;
        result = s * s;
        System.out.println("The Area of Square is :" + result);
    }

    public void rectangle(float l, float b)
    {
        float result = 0f;
        result = l * b;
        System.out.println("The Area of Rectangle is :" + result);
    }

    public void triangle(float h, float ba)
    {
        float result = 0f;
        result = 0.5f * h * ba;
        System.out.println("The Area of Triangle is :" + result);
    }

    public void circle(float r)
    {
        float result = 0f;
        result = 3.14f * (r * r);
        System.out.println("The Area of Circle is :" + result);
    }

    public void trapezoid(float b, float c, float h)
    {
        float result = 0f;
        result = (((b + c) / 2) * h);
        System.out.println("The Area of Trapezoid is :" + result);
    }
}
Output

Enter the Object of which Area is to be calculated
1:square
2:rectangle
3:Triangle
4:circle
5:Trapezoid
6:Repeat
7:Exit
5
Enter the A side of Trapezoid
2
Enter the B side of Trapezoid
3
Enter the Height of Trapezoid
5
The Area of Trapezoid is :12.5
Enter the Object of which Area is to be calculated
1:square

Celsius to Fahreneit
import java.util.*;

class CelsiustoFahrenheit
{
    public static void main(String[] args)
    {
        double temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius");
        temperature = in.nextInt();

        temperature = (temperature * 9 / 5.0) + 32;
        System.out.println("Temperature in Fahrenheit = " + temperature);
    }
}
Output

Enter temperature in Celsius
37
Temperature in Fahrenheit = 98.6

Area of Square
import java.util.*;

class AreaOfSquare
{
    public static void main(String args[])
    {
        int side, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of the sides of square");
        side = sc.nextInt();

        area = side * side;

        System.out.println("Area of Square : " + area);
    }
}
Output

Enter value of the sides of square
5
Area of Square : 25

GCDLCM
import java.util.Scanner;

class GCDLCM
{
    public static void main(String args[])
    {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("GCD of two numbers is : " + gcd(x, y));
        System.out.println("LCM of two numbers is : " + lcm(x, y));
    }

    static int gcd(int x, int y)
    {
        int r = 0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number

        r = b;
        while (a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

    static int lcm(int x, int y)
    {
        int a;
        a = (x > y) ? x : y; // a is greater number
        while (true)
        {
            if (a % x == 0 && a % y == 0)
            {
                return a;
            }
            ++a;
        }
    }
}
Output
Enter the two numbers:
6
3
GCD of two numbers is : 3
LCM of two numbers is : 6

Binary number calculation
import java.util.*;

class BinaryCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("First Binary:  ");
        String binOne = in.next();

        System.out.print("Second Binary: ");
        String binTwo = in.next();

        int left = Integer.parseInt(binOne, 2);
        int right = Integer.parseInt(binTwo, 2);

        System.out.println("Sum of the binary numbers : " + Integer.toBinaryString(left + right));
        System.out.println("Difference of the binary numbers : " + Integer.toBinaryString(left - right));
        System.out.println("Product of the binary numbers : " + Integer.toBinaryString(left * right));
        System.out.println("Quotient of the binary numbers : " + Integer.toBinaryString(left / right));
    }
}
Output

First Binary:  1100
Second Binary: 1100
Sum of the binary numbers : 11000
Difference of the binary numbers : 0
Product of the binary numbers : 10010000
Quotient of the binary numbers : 1

Number
Armstrong Number
import java.util.*;

class PrimeNumbers
{
    public static void main(String args[])
    {
        int n, status = 1, num = 3;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want");
        n = in.nextInt();

        if (n >= 1)
        {
            System.out.println("First " + n + " prime numbers are :-");
            System.out.println(2);
        }

        for (int count = 2; count <= n; )
        {
            for (int j = 2; j <= Math.sqrt(num); j++)
            {
                if (num % j == 0)
                {
                    status = 0;
                    break;
                }
            }
            if (status != 0)
            {
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }
    }
}
Output
Enter the number of prime numbers you want
12
First 12 prime numbers are :-
2
3
5
7
11
13
17
19
23
29
31
37

Prime Number
import java.util.*;

class PrimeNumbers
{
    public static void main(String args[])
    {
        int n, status = 1, num = 3;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want");
        n = in.nextInt();

        if (n >= 1)
        {
            System.out.println("First " + n + " prime numbers are :-");
            System.out.println(2);
        }

        for (int count = 2; count <= n; )
        {
            for (int j = 2; j <= Math.sqrt(num); j++)
            {
                if (num % j == 0)
                {
                    status = 0;
                    break;
                }
            }
            if (status != 0)
            {
                System.out.println(num);
                count++;
            }
            status = 1;
            num++;
        }
    }
}
Output
Enter the number of prime numbers you want
12
First 12 prime numbers are :-
2
3
5
7
11
13
17
19
23
29
31
37

Compare Two Strings
import java.util.Scanner;

class CompareStrings
{
    public static void main(String args[])
    {
        String s1, s2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first string");
        s1 = in.nextLine();

        System.out.println("Enter the second string");
        s2 = in.nextLine();

        if (s1.compareTo(s2) > 0)
            System.out.println("First string is greater than second.");
        else if (s1.compareTo(s2) < 0)
            System.out.println("First string is smaller than second.");
        else
            System.out.println("Both strings are equal.");
    }
}
Output
Output

Enter the first string
xyz
Enter the second string
abc
First string is greater than second.

Factorial of a number
import java.util.Scanner;

class Factorial
{
    public static void main(String args[])
    {
        int fact = 1;
        int number = 0;

        System.out.println("Enter a number to print its factorial");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        for (int i = 1; i <= number; i++)
        {
            fact = i * fact;
        }

        System.out.println("The factorial of " + number + " is " + fact);

    }
} 
Output
Enter a number to print its factorial
6
The factorial of 6 is 720

Fibonacci Series
import java.io.*;
import java.lang.*;

class Fibonacci
{
    public static void main(String args[]) throws IOException
    {
        if (args.length == 1)
        {
            int n = Integer.parseInt(args[0]);
            int a = 0, b = 1, c = 0, i = 0;
            while (i < n)
            {
                System.out.print(c + "\t");

                a = b;
                b = c;
                c = a + b;
                i++;
            }
        }
        else
        {
            System.out.println("You havent supplied the arguments: {Usage : java fibonacci 34 } to print the first 34 fibonacci numbers.");
        }
    }
}
Output
E:freeitjava>java fibonacci 5
0       1       1       2       3

Find Even or Odd

class OddOrEven
{
    public static void main(String args[])
    {
        int x;
        System.out.println("Enter an integer to check if it is odd or even ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}
Output
Enter an integer to check if it is odd or even
57
You entered an odd number.

Largest of Three Numbers
import java.util.Scanner;

class LargestOfThreeNumbers
{
    public static void main(String args[])
    {
        int x, y, z;
        System.out.println("Enter three integers ");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z)
            System.out.println("First number is largest.");
        else if (y > x && y > z)
            System.out.println("Second number is largest.");
        else if (z > x && z > y)
            System.out.println("Third number is largest.");
        else
            System.out.println("Entered numbers are not distinct.");
    }
}
Output
Enter three integers
4 75 66
Second number is largest.

Palindrome
//A palindrome is a word, phrase, number, or other sequence of symbols or elements,
//whose meaning may be interpreted the same way in either forward or reverse direction.

import java.util.Scanner;

class Palindrome
{
    public static void main(String args[])
    {
        int number = 0;
        int reverse = 0;
        int numCopy = 0;

        System.out.println("Enter a number to check if it is a Palindrome");

        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        numCopy = number;

        while (numCopy > 0)
        {
            int digit = numCopy % 10;
            numCopy = numCopy / 10;
            reverse = (reverse * 10) + digit;
        }

        if (number == reverse)
            System.out.println("The number " + number + " is a Palindrome.");
        else
            System.out.println("The number " + number + " is not a Palindrome.");

    }
} 
Output
Enter a number to check if it is a Palindrome
121
The number 121 is a Palindrome.

Random Number
//Generate random number in between the given value

import java.util.*;

class RandomNumber
{
    public static void main(String args[])
    {
        Random r = new Random();

        //Printing 10 Random number between 0 to 1000
        for (int i = 0; i < 9; i++)
        {
            System.out.println(r.nextInt(1000));
        }
    }
} 
Output
137
774
591
997
575
786
464
224
472

Swapping Two Numbers
import java.util.Scanner;

class SwapNumbers
{
    public static void main(String args[])
    {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before Swapping\nx = " + x + "\ny = " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping\nx = " + x + "\ny = " + y);
    }
}
Output
Enter x and y
10 25
Before Swapping
x = 10
y = 25
After Swapping
x = 25
y = 10

HCF and LCM
import java.util.*;

class HCFandLCM
{

    public static void main(String Args[])
    {

        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int h = 1;
        int p = m * n;

        for (int i = 2; i < p; i++)
        {
            if ((m % i == 0) && (n % i == 0))
            {
                h = i;
            }
        }

        int l = p / h;
        System.out.println("HCF=" + h + " and LCM=" + l);

    }
}
Output
Enter 2 numbers
3 7
HCF=1 and LCM=21

Palindrome Primes / PalPrimes
class PalindromePrime
{

    public static void main(String[] args)
    {
        int count = 1;

        System.out.println("Palindrome Primes are:\n");

        for (int i = 2; ; i++)
        {
            if ((isPrime(i)) && (isPalindrome(i)))
            {
                System.out.print(i + " ");

                if (count % 10 == 0)
                {
                    System.out.println();

                }
                if (count == 20)
                {
                    break;

                }
                count++;
            }
        }
    }

    public static boolean isPrime(int num)
    {
        if ((num == 1) || (num == 2))
        {
            return true;
        }

        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                return false;

            }
        }

        return true;
    }

    static int reversal(int num)
    {
        int result = 0;

        while (num != 0)
        {
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num /= 10;
        }
        return result;
    }

    static boolean isPalindrome(int num)
    {
        return num == reversal(num);
    }
}
Output
Palindrome Primes are:

2 3 5 7 11 101 131 151 181 191 
313 353 373 383 727 757 787 797 919 929 

Twin Primes
class TwinPrimes
{
    public static void main(String args[])
    {
        String primeNo = "";
        int j = 0;
        int LastPrime = 1;

        System.out.println("Twin Primes are:");

        for (int i = 1; i < 100; i++)
        {
            for (j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    break;
                }

            }

            if (i == j)
            {
                primeNo += i + " ";

                if ((i - LastPrime) == 2)
                {
                    System.out.println("(" + (i - 2) + "," + i + ")");
                }
                LastPrime = i;
            }
        }
        System.out.println("Prime Numbers are: " + primeNo);
    }
}
Output
Twin Primes are:
(3,5)
(5,7)
(11,13)
(17,19)
(29,31)
(41,43)
(59,61)
(71,73)
Prime Numbers are: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

Buzz Number
/*Buzz number is such a number which is either completely
 divisible by 7 or extreme right side digit of the number is 7*/

import java.io.*;

class BuzzNumber
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a;
    public void show() throws Exception
    {
        System.out.print("Enter the number:");
        a = Integer.parseInt(br.readLine());
        
		/*Checks if the entered number is divisible
		by 7 or extreme right is 7*/
        if (a % 10 == 7 || a % 7 == 0)
            System.out.println("Entered number is a Buzz number.");

        else
            System.out.println("Entered number is not a Buzz number.");
    }

    public static void main(String args[]) throws Exception
    {
        BuzzNumber bn = new BuzzNumber();
        bn.show();
    }
}
Output
Output 1
Enter the number:49
Entered number is a Buzz number.

Output 2
Enter the number:97
Entered number is a Buzz number.

Output 3
Enter the number:186
Entered number is not a Buzz number.

Special Number
import java.io.*;

class SpecialNumber
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int num;

    private void input() throws Exception
    {
        System.out.print("Enter the Number to check for Special Number : ");
        num = Integer.parseInt(br.readLine());
    }

    public boolean isSpecial(int n)
    {
        int spec = 0, temp = n;
        while (temp % 10 != 0)
        {
            spec += factorial(temp % 10);
            temp /= 10;
        }
        if (spec == n)
            return true;
        else
            return false;
    }

    private int factorial(int n)
    {
        if ((n == 1) || (n == 0))
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String args[]) throws Exception
    {
        SpecialNumber obj = new SpecialNumber();
        obj.input();
        if (obj.isSpecial(num))
            System.out.print(num + " is a Special Number");
        else
            System.out.print(num + " is not a Special Number");
    }
}
Output
Output 1
Enter the Number to check for Special Number : 145
145 is a Special Number

Output 2
Enter the Number to check for Special Number : 155
155 is not a Special Number

Happy Number
import java.io.*;

class HappyNumber
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n;
    HappyNumber()
    {
        n = 0;
    }

    void getnum(int num)
    {
        n = num;
    }

    int sum_sq_digits(int x)
    {
        if (x == 0)
            return 0;
        else
        {
            int d = x % 10;
            return (d * d + sum_sq_digits(x / 10));
        }
    }

    void isHappyNumber()
    {
        int a = sum_sq_digits(n);
        while (a > 9)
        {
            a = sum_sq_digits(a);
        }
        if (a == 1)
            System.out.print(n + " is a Happy Number");
        else
            System.out.print(n + " is not a Happy Number");
    }

    public static void main(String args[]) throws IOException
    {
        HappyNumber ob = new HappyNumber();
        System.out.print("Enter any number: ");
        int b = Integer.parseInt(br.readLine());
        ob.getnum(b);
        ob.isHappyNumber();
    }
}
Output
Output 1
Enter any number: 32
32 is a Happy Number

Output 2
Enter any number: 65
65 is not a Happy Number

Greatest of 'n' numbers
import java.util.Scanner;

class Greatest
{
    public static void main(String argn[])
    {

        Scanner data = new Scanner(System.in);
        int num, i, temp, max;

        // Reading numbers want to be read
        System.out.print("Enter the range:");
        num = data.nextInt();

        System.out.println("Enter " + num + " number");
        // Reading 1st number
        max = data.nextInt();

        // Reading other number
        for (i = 1; i < num; i++)
        {
            temp = data.nextInt();
            if (temp < max)
                continue;
            else
                // largest number
                max = temp;
        }

        System.out.println("Largest Number is " + max);
    }
}
Output
Enter number you want to enter: 4
Enter 4 number
1 55 66 3
Largest Number is 66

Unique Number
import java.io.*;

class UniqueNumber
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        int n = Integer.parseInt(br.readLine());
        String s = Integer.toString(n); //converting the number into String form 
        int l = s.length();
        int flag = 0; /* loop for checking whether there are repeated digits */
        for (int i = 0; i < l - 1; i++)
        {
            for (int j = i + 1; j < l; j++)
            {
                if (s.charAt(i) == s.charAt(j)) //if any digits match, then we know it is not a Unique Number 
                {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.println(s + " is a Unique Number");
        else
            System.out.println(s + " is Not a Unique Number");
    }
}
Output
Output 1

Enter any number : 12345
12345 is a Unique Number

Output 2

Enter any number : 12312
12312 is Not a Unique Number

Neon Number
import java.io.*;

class NeonNumber
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int square;
        int sum = 0;

        System.out.print("Enter any number : ");
        num = Integer.parseInt(br.readLine());
        square = num * num; //squaring the number 

        String sqs = Integer.toString(square);

        for (int i = 0; i < sqs.length(); i++)
        {
            sum += Integer.parseInt(sqs.substring(i, i + 1));
        }

        if (sum == num) //checking if the sum of the square is equal to the number entered 
            System.out.println(num + " is a Neon Number");
        else
            System.out.println(num + " is not a Neon number");

    }

}
Output
Output 1

Enter any number : 5
5 is not a Neon number

Output 2

Enter any number : 9
9 is a Neon Number

Magic Number

import java.io.*;

class MagicNumber
{
    private int input() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");

        return Integer.parseInt(br.readLine());
    }

    public boolean isMagic(int n)
    {
        int sum = 0, flag, d = 0;
        do
        {
            flag = 0;
            while (n % 10 == 0)
            {
                n /= 10;
            }

            while (n % 10 != 0 || n > 0)
            {
                sum += (n % 10);
                n /= 10;
            }

            if (sum >= 10)
            {
                n = sum;
                sum = 0;
            }
            else
                flag = 1;
        }
        while (flag == 0);

        if (sum == 1)
            return true;
        else
            return false;
    }

    public static void main(String args[]) throws Exception
    {
        MagicNumber mn = new MagicNumber();
        int num = mn.input();

        if (mn.isMagic(num))
            System.out.println(num + " is a Magic Number");
        else
            System.out.println(num + " is not a Magic Number");
    }
}
Output
Enter any number : 64
64 is a Magic Number

Enter any number : 262
262 is a Magic Number

Enter any number : 89
89 is not a Magic Number

Fibonacci using Recursion
import java.util.Scanner;

class Fibonacci
{
    static int fibo(int n)
    {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fibonacci Term :");

        int n = sc.nextInt();

        System.out.println("Fibonacci Series is :\n");

        for (int i = 0; i < n; i++)
        {
            System.out.print(fibo(i) + "\t");
        }
    }
}
Output
Enter fibonacci Term :7
Fibonacci Series is :

0       1       1       2       3       5       8

Find Resultant Palindrome of Number
import java.io.*;
import java.math.*;

class ResultantPalindrome
{
    static int i = 1;
    public void addNum(String num)
    {
        BigInteger a, b, c;
        a = new BigInteger(num);
        b = new BigInteger(reverse(num));

        System.out.println("Step " + (i++) + "\t->\t" + a + " + " + b + " = " + (a.add(b)));

        resultantPalindrome(a.add(b) + "");
    }
    public void resultantPalindrome(String num)
    {
        if (num.equals(reverse(num)))
        {
            System.out.println("\nResultant Palindrome : " + num);
        }
        else
        {
            addNum(num);
        }
    }
    public String reverse(String num)
    {
        StringBuffer sb = new StringBuffer(num);
        return sb.reverse().toString();
    }
    public static void main(String args[])
    {
        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader num = new BufferedReader(istream);
        String palindrome = null;

        System.out.print("Enter number for Resultant Palindrome : ");
        try
        {
            palindrome = num.readLine();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("");

        ResultantPalindrome rp = new ResultantPalindrome();
        rp.resultantPalindrome(palindrome);
    }
}
Output
Enter number for Resultant Palindrome : 89

Step 1  ->      89 + 98 = 187
Step 2  ->      187 + 781 = 968
Step 3  ->      968 + 869 = 1837
Step 4  ->      1837 + 7381 = 9218
Step 5  ->      9218 + 8129 = 17347
Step 6  ->      17347 + 74371 = 91718
Step 7  ->      91718 + 81719 = 173437
Step 8  ->      173437 + 734371 = 907808
Step 9  ->      907808 + 808709 = 1716517
Step 10 ->      1716517 + 7156171 = 8872688
Step 11 ->      8872688 + 8862788 = 17735476
Step 12 ->      17735476 + 67453771 = 85189247

Roman Number to Decimal
import java.io.*;

class RomanToDecimal
{
    public static void romanToDecimal(java.lang.String romanNumber)
    {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();

        for (int x = romanNumeral.length() - 1; x >= 0; x--)
        {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal)
            {
                case 'M':
                    decimal = processDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = processDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = processDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;

                case 'L':
                    decimal = processDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        System.out.println("Decimal number : " + decimal);
    }

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal)
    {
        if (lastNumber > decimal)
        {
            return lastDecimal - decimal;
        }
        else
        {
            return lastDecimal + decimal;
        }
    }

    public static void main(java.lang.String args[])
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Roman Number : ");

        String roman = null;
        try
        {
            roman = br.readLine();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        romanToDecimal(roman);
    }
}
Output
Enter Roman Number : XI
Decimal number : 11

Duck Number
import java.io.*;

class DuckNumber
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        String n = br.readLine();

        int l = n.length();
        int c = 0;
        char ch;

        for (int i = 1; i < l; i++)
        {
            ch = n.charAt(i);
            if (ch == '0')
                c++;
        }

        char f = n.charAt(0);

        if (c > 0 && f != '0')
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }
}
Output
Output 1
Enter any number : 56065
It is a duck number

Output 2
Enter any number : 000558
It is not a duck number

Output 3
Enter any number : 5565
It is not a duck number

HailStone Sequence
import java.util.Scanner;

class HailStone
{
    static Scanner MyScanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("This program will generate the HailStone sequence. ");
        System.out.print("Enter a number: ");
        int num = MyScanner.nextInt();
        while (num > 1)
        {
            if (num % 2 == 0)
            {
                num /= 2; //Dividing num by 2 if it is even
                System.out.print(num + "\t");
            }
            else
            {
                num = (num * 3) + 1;    // Adding num*3 + 1 to num if the num is odd
                System.out.print(num + "\t");
            }
        }
    }
}
Output
This program will generate the HailStone sequence.
Enter a number: 3
10      5       16      8       4       2       1

Perfect Number
import java.io.*;

class PerfectNumber
{
    public static void main(String args[]) throws IOException
    {
        int n, s = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Entre a number : ");
        n = Integer.parseInt(br.readLine());

        for (int x = 1; x < n; x++)
        {
            if (n % x == 0)
                s = s + x;
        }

        if (s == n)
            System.out.println("It is perfect number");
        else
            System.out.println("It is not perfect number");
    }
}
Output
Entre a number : 28
It is perfect number

Prime Factors of a Number
import java.io.*;

class PrimeFactors
{
    private boolean prime(int a)
    {
        boolean b = true;
        for (int i = 2; i <= (a / 2); i++)
        {
            if (a % i == 0)
                b = false;
        }
        return b;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Number: ");
        int a = Integer.parseInt(in.readLine());

        PrimeFactors o = new PrimeFactors();

        System.out.print("Prime Factors of " + a + " are : ");
        for (int i = 1; i <= (a / 2); i++)
        {
            if (a % i == 0)
            {
                boolean b = o.prime(i);
                if (b == true)
                    System.out.print(i + " ");
            }
        }
    }
}
Output
Enter the Number: 60
Prime Factors of 60 are : 1 2 3 5

Convert Number to Words
import java.text.DecimalFormat;
import java.io.*;

class EnglishNumberToWords
{

    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private static String convertLessThanOneThousand(int number)
    {
        String soFar;

        if (number % 100 < 20)
        {
            soFar = numNames[number % 100];
            number /= 100;
        }
        else
        {
            soFar = numNames[number % 10];
            number /= 10;

            soFar = tensNames[number % 10] + soFar;
            number /= 10;
        }
        if (number == 0)
            return soFar;
        return numNames[number] + " hundred" + soFar;
    }


    public static String convert(long number)
    {
        // 0 to 999 999 999 999
        if (number == 0)
        {
            return "zero";
        }

        String snumber = Long.toString(number);

        // pad with "0"
        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        snumber = df.format(number);

        // XXXnnnnnnnnn
        int billions = Integer.parseInt(snumber.substring(0, 3));
        // nnnXXXnnnnnn
        int millions = Integer.parseInt(snumber.substring(3, 6));
        // nnnnnnXXXnnn
        int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
        // nnnnnnnnnXXX
        int thousands = Integer.parseInt(snumber.substring(9, 12));

        String tradBillions;
        switch (billions)
        {
            case 0:
                tradBillions = "";
                break;
            case 1:
                tradBillions = convertLessThanOneThousand(billions)
                        + " billion ";
                break;
            default:
                tradBillions = convertLessThanOneThousand(billions)
                        + " billion ";
        }
        String result = tradBillions;

        String tradMillions;
        switch (millions)
        {
            case 0:
                tradMillions = "";
                break;
            case 1:
                tradMillions = convertLessThanOneThousand(millions)
                        + " million ";
                break;
            default:
                tradMillions = convertLessThanOneThousand(millions)
                        + " million ";
        }
        result = result + tradMillions;

        String tradHundredThousands;
        switch (hundredThousands)
        {
            case 0:
                tradHundredThousands = "";
                break;
            case 1:
                tradHundredThousands = "one thousand ";
                break;
            default:
                tradHundredThousands = convertLessThanOneThousand(hundredThousands)
                        + " thousand ";
        }
        result = result + tradHundredThousands;

        String tradThousand;
        tradThousand = convertLessThanOneThousand(thousands);
        result = result + tradThousand;

        // remove extra spaces!
        return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }

    public static void main(String[] args) throws Exception
    {
        String number = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number to display in words : ");
        number = br.readLine();
        System.out.println("\n\t" + number + " IN WORDS\n\n" + EnglishNumberToWords.convert(Integer.parseInt(number)));
    }
}
Output
Enter number to display in words : 123456789

        123456789 IN WORDS

one hundred twenty three million four hundred fifty six thousand seven hundred e
ighty nine

Disarium Number
import java.io.*;

class Disarium
{
    public void show(int n)
    {
        int c = 1, rev, sum, x;
        x = n;
        sum = 0;
        rev = 0;

        while (n > 0)
        {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        while (rev > 0)
        {
            sum = sum + (int) Math.pow(rev % 10, c);
            c++;
            rev = rev / 10;
        }

        if (sum == x)
            System.out.println(x + " is DISARIUM number");
        else
            System.out.println(x + " is not DISARIUM number");
    }

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number to check its DISARIUM no. or not : ");
        Disarium ob = new Disarium();
        ob.show(Integer.parseInt(br.readLine()));
    }
}
Output
Enter number to check its DISARIUM no. or not : 135
135 is DISARIUM number

Factorial using Recursion
import java.util.*;

class FactorialExample
{
    public static void main(String args[])
    {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. for factorial : ");
        a = scanner.nextInt();
        System.out.println("Factorial of " + a + " is " + fact(a));

    }
    static int fact(int n)
    {
        int result;
        if (n == 0 || n == 1)
            return 1;

        result = fact(n - 1) * n;
        return result;
    }
}
Output
Enter no. for factorial : 5
Factorial of 5 is 120

Check whether two numbers are Amicable Numbers
import java.io.*;

class AmicableNumber
{
    static boolean check(int a, int b)
    {
        int s = 0, i;
        for (i = 1; i < a; i++)
        {
            if (a % i == 0)
            {
                s = s + i;
            }
        }

        if (s == b)
        {
            s = 0;
            for (i = 1; i < b; i++)
            {
                if (b % i == 0)
                {
                    s = s + i;
                }
            }

            if (s == a)
                return true;
            else
                return false;
        }

        return false;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter 1st no. : ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter 2nd no. : ");
        int b = Integer.parseInt(br.readLine());

        if (check(a, b))
        {
            System.out.print(a + " and " + b + " are Amicable Number");
        }
        else
        {
            System.out.print(a + " and " + b + " are not Amicable Number");
        }
    }
}
Output
Enter 1st no. : 220
Enter 2nd no. : 284
220 and 284 are Amicable Number

Kaprekar Number or Not
import java.util.*;

class KaprekarNumber
{
    int digitcount(int x)
    {
        int digit = 0;
        while (x != 0)
        {
            digit++;
            x /= 10;
        }
        return digit;
    }

    public static void main(String args[])
    {
        int n, quo, rem, sq, temp;
        int digits;
        Scanner sc = new Scanner(System.in);
        KaprekarNumber ob = new KaprekarNumber();
        System.out.print("Enter number : ");
        n = sc.nextInt();

        sq = n * n;

        digits = ob.digitcount(n * n);

        quo = sq / (int) Math.pow(10, digits / 2);
        rem = sq % (int) Math.pow(10, digits / 2);

        temp = quo + rem;
        if (temp == n)
            System.out.print("\nIt is a Kaprekar number \n");
        else
            System.out.print("\nNot a kaprekar number");
    }
}
Output
Enter number : 9

It is a Kaprekar number

Swap numbers with two variables only
import java.io.IOException;
import java.io.InputStreamReader;

class Swapping
{

    public static void main(String ars[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 10;
        int b = 15;

        System.out.println("Values before swipe :");
        System.out.println("a=" + a + " and b=" + b);

        //------Method 1 Using add and subtract -----

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("---- Using Method 1 ----");
        System.out.println("a=" + a + " and b=" + b);

        //------Method 2 Using XOR operation------

        a = 10;
        b = 15;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("---- Using Method 2 ----");
        System.out.println("a=" + a + " and b=" + b);

        //-----Method 3 Using Multiplication and division----

        a = 10;
        b = 15;

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("---- Using Method 3 ----");
        System.out.println("a=" + a + " and b=" + b);

        //-----Method 4 Using formula a=b-a+(b=a) -----

        /*
         Working of Formula :
         System first evaluates (b=a) expression based on BODMAS rule
         then b-a expression
         So a=15-10+(10)=15 and b=10
         */

        a = 10;
        b = 15;

        a = b - a + (b = a);

        System.out.println("---- Using Method 4 ----");
        System.out.println("a=" + a + " and b=" + b);
    }
}
Output
Values before swipe :

a=10 and b=15

---- Using Method 1 ----
a=15 and b=10

---- Using Method 2 ----
a=15 and b=10

---- Using Method 3 ----
a=15 and b=10

---- Using Method 4 ----
a=15 and b=10

Reverse a Number
import java.util.Scanner;

class ReverseNum
{
    public static void main(String[] args)
    {
        int reverse = 0, number = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to Reverse:");
        number = sc.nextInt();
        sc.close();
        while (number != 0)
        {
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }
        System.out.println("Result: " + reverse);
    }
}
Output
Enter number to Reverse:
456
Result: 654

Krishna Murthy Number
import java.io.*;

class KrishnaMurthyNumber
{
    int fact(int n)
    {
        int i, fact = 1;
        for (i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] arg) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number : ");
        int number = Integer.parseInt(br.readLine());

        KrishnaMurthyNumber kmn = new KrishnaMurthyNumber();

        if (kmn.isKrishnaMurthy(number))
        {
            System.out.println(number + " is a Krishna Murthy Number");
        }
        else
        {
            System.out.println(number + " is not a Krishna Murthy Number");
        }

    }

    boolean isKrishnaMurthy(int number)
    {
        int temp, k = 0;
        int n = number;
        while (number > 0)
        {
            temp = number % 10;
            k = k + fact(temp);
            number = number / 10;
        }

        if (k == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
Output
Enter the number : 145
145 is a Krishna Murthy Number

Automorphic Numbers
import java.util.Scanner;

class AutomorphicNumber
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        int square = input * input;

        String inputAsString = input + "";
        String squareAsString = square + "";

        if (squareAsString.endsWith(inputAsString))
        {
            System.out.println(input + " is Automorphic Number");
        }
        else
        {
            System.out.println(input + " is Not an Automorphic number");
        }
    }
}
Output
Enter a number: 76
76 is Automorphic Number

Keith Number
import java.io.*;

class KeithNumber
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number : ");

        int n = Integer.parseInt(br.readLine());

        int copy = n;
        String s = Integer.toString(n);

        //finding the number of digits (d) in the number
        int d = s.length();

        //array for storing the terms of the series
        int arr[] = new int[n];

        for (int i = d - 1; i >= 0; i--)
        {
            //storing the digits of the number in the array
            arr[i] = copy % 10;
            copy = copy / 10;
        }

        int i = d, sum = 0;
        //finding the sum till it is less than the number
        while (sum < n)
        {
            sum = 0;
            //loop for generating and adding the previous 'd' terms
            for (int j = 1; j <= d; j++)
            {
                sum = sum + arr[i - j];
            }
            //storing the sum in the array
            arr[i] = sum;
            i++;
        }

        //if sum is equal to the number, then it is a Keith number
        if (sum == n)
            System.out.println(n + " is a Keith Number");
        else
            System.out.println(n + " is a not a Keith Number");
    }
}
Output
Enter the number : 197
197 is a Keith Number

SquareRoot of a Number
import java.util.Scanner;

class SquareRoot
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        System.out.println(Math.sqrt(n));
    }
}
Output
Enter Number
49
7.0

Check whether Number is Prime
import java.util.*;

class Prime
{
    public static void main(String args[])
    {
        int n, i, res;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a No.");

        n = sc.nextInt();
        for (i = 2; i <= n / 2; i++)
        {
            res = n % i;
            if (res == 0)
            {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(n + " is Prime Number");
        else
            System.out.println(n + " is not Prime Number");
    }
}
Output
Please Enter a No.
5
5 is Prime Number

Largest Smallest
import java.io.*;

class LargestSmallest

{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter number of elements: ");
        int num = Integer.parseInt(br.readLine());

        int arr[] = new int[num];

        System.out.println("\nEnter " + num + " elements: ");
        for (int i = 0; i < num; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < (num - 1); i++)
        {
            for (int j = 0; j <= i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("\nHighest number: " + arr[num - 1]);
        System.out.print("\nSmallest number: " + arr[0]);
        System.out.println();
    }
}
Output
Enter number of elements: 10

Enter 10 elements:
6
2
4
1
3
9
8
6
7
2

Highest number: 9
Smallest number: 1

Adam Number
import java.io.*;

class AdamNumber
{
    int CountNumberOfDigits(int n)
    {
        int numdigits = 0;
        do
        {
            n = n / 10;
            numdigits++;
        }
        while (n > 0);
        return numdigits;
    }

    int ReverseNumber(int n)
    {
        int i = 0, result = 0;
        int numdigits = CountNumberOfDigits(n);
        for (i = 0; i < numdigits; i++)
        {
            result *= 10;
            result += n % 10;
            n = n / 10;
        }
        return result;
    }

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter the minimum number of range: ");
        int min = Integer.parseInt(br.readLine());

        System.out.print("\nEnter the maximum number of range: ");
        int max = Integer.parseInt(br.readLine());

        AdamNumber an = new AdamNumber();

        System.out.println("\nAdam Numbers: ");
        for (int i = min; i < max; i++)
        {
            int n = i;
            int rn = an.ReverseNumber(i);
            if (n == rn)
            {
                continue;
            }

            int sqrn = n * n;
            int sqrm = rn * rn;
            int revsqrm = an.ReverseNumber(sqrm);
            if (revsqrm == sqrn)
            {
                System.out.print(n + "\n");
            }
        }
        System.out.println();
    }
}
Output

Enter the minimum number of range: 1

Enter the maximum number of range: 100

Adam Numbers:
12
13
21
31

Tribonacci Series
import java.util.*;
import java.io.*;

class Tribonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till u want Tribonacci series: ");
        int n = sc.nextInt();

        int a = 0, b = 0, c = 1;
        int d = a + b + c;

        System.out.println("\nTribonacci Series: ");
        System.out.print(a + "\t" + b + "\t" + c);

        for (int i = 4; i <= n; i++)
        {
            System.out.print("\t" + d);
            a = b;
            b = c;
            c = d;
            d = a + b + c;
        }

        System.out.println();
    }
}
Output

Enter number till u want Tribonacci series: 10

Tribonacci Series:
0       0       1       1       2       4       7       13      24      44

Amicable Number
//Amicable Number

import java.util.Scanner;

class AmicableNumber
{

    public static void main(String[] args)
    {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        a = in.nextInt();
        b = in.nextInt();
        boolean flag = check(a, b);
        if (flag)
        {
            System.out.println("The numbers are amicable");
        }
        else
        {
            System.out.println("The numbers are not amicable");
        }
    }

    static boolean check(int a, int b)
    {
        int s = 0, i;
        for (i = 1; i < a; i++)
        {
            if (a % i == 0)
            {
                s = s + i;
            }
        }
        if (s == b)
        {
            s = 0;
            for (i = 1; i < b; i++)
            {
                if (b % i == 0)
                {
                    s = s + i;
                }
            }
            if (s == a)
                return true;
            else
                return false;
        }
        return false;
    }
}
Output
Enter two Numbers:
220
284
The numbers are amicable

Primorial Number
import java.util.Scanner;

class PrimorialNumber
{
    public static void main(String[] args)
    {
        int num;

        System.out.print("Enter a number : ");

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        int res = 2, flag = 0;
        String str = "2";
        for (int i = 3; i <= num; i++)
        {
            flag = 0;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    flag = 1;
                    break;
                }
            }

            if (flag != 1)
            {
                res *= i;
                str = str + "*" + i;
            }
        }
        System.out.println(num + "#= " + str + "=" + res);
    }
}
Output
Enter a number : 13
13#= 2*3*5*7*11*13=30030

Lucas Series
/*
In Lucas Series, each subsequent number is the sum of the previous two, 
and here the first two numbers are 2 and 1.
*/

import java.util.*;

class LucasSeries
{
    public static void main(String[] args)
    {
        int num1, num2, limit, add;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit of elements");
        limit = sc.nextInt();

        num1 = 2;
        num2 = 1;

        System.out.println("\nLucas Series:");
        while (limit >= num1)
        {
            System.out.print(num1 + " ");
            add = num1 + num2;
            num1 = num2;
            num2 = add;
        }
    }
}
Output

Enter the limit of elements
100

Lucas Series:
2 1 3 4 7 11 18 29 47 76

Sunny Number
//Sunny Number: when 1 is added to a number, then the square root of it will be a whole number.

import java.util.*;

class SunnyNumber
{
    public static void main(String[] args)
    {
        int n, n1;
        double x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        n = sc.nextInt();

        n1 = n + 1;
        x = Math.sqrt(n1);

        if ((int) x == x)
        {
            System.out.println("Number is a Sunny Number");
        }

        else
        {
            System.out.println("Number is not a Sunny Number");
        }
    }
}
Output

Enter number
66
Number is not a Sunny Number

Find perfect square number within a Range
import java.util.*;

class PerfectSquare
{
    public static void main(String[] args)
    {
        int start, end, n, sum = 0;
        float s;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting value of the range");
        start = sc.nextInt();

        System.out.println("Enter ending value of the range");
        end = sc.nextInt();

        System.out.println("The Perfect Square numbers present in the range " + start + " to " + end + " are : ");
        for (int i = start; i < end; i++)
        {
            s = (float) Math.sqrt(i);
            n = (int) Math.floor(s);

            if (s == n)
            {
                System.out.print(" " + i);
                sum += i;
            }
        }
        System.out.println(
                "\nSum of the perfect square numbers between the range " + start + " to " + end + " are : " + sum);
    }
}
Output

Enter starting value of the range
1 20
Enter ending value of the range
The Perfect Square numbers present in the range 1 to 20 are :
 1 4 9 16
Sum of the perfect square numbers between the range 1 to 20 are : 30

Factors of integer
import java.io.*;

class Factors
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a, i;

        System.out.print("Enter the number : ");
        a = Integer.parseInt(buf.readLine());
        System.out.print("\n");

        System.out.print("The factors are : ");
        for (i = 1; i <= a / 2; i++)
        {
            if (a % i == 0)
                System.out.print(i + ",");
        }

        System.out.print(a);
    }
}
Output
Enter the number : 15

The factors are : 1,3,5,15

Convert Number to Word
import java.io.*;
import java.util.*;

class NumberToWord
{
    private static final String[] specialNames = {
            "", " thousand", " million", " billion",
            " trillion", " quadrillion", " quintillion"};

    private static final String[] tensNames = {
            "",
            " ten", " twenty", " thirty", " forty", " fifty",
            " sixty", " seventy", " eighty", " ninety"};

    private static final String[] numNames = {
            "", " one", " two", " three", " four", " five", " six",
            " seven", " eight", " nine", " ten", " eleven", " twelve",
            " thirteen", " fourteen", " fifteen", " sixteen",
            " seventeen", " eighteen", " nineteen"};

    private String convertLessThanOneThousand(int number)
    {
        String current;

        if (number % 100 < 20)
        {
            current = numNames[number % 100];
            number /= 100;
        }
        else
        {
            current = numNames[number % 10];
            number /= 10;

            current = tensNames[number % 10] + current;
            number /= 10;
        }

        if (number == 0)
            return current;

        return numNames[number] + " hundred" + current;
    }

    public String convert(int number)
    {
        if (number == 0)
        {
            return "zero";
        }

        String prefix = "";

        if (number < 0)
        {
            number = -number;
            prefix = "negative";
        }

        String current = "";
        int place = 0;

        do
        {
            int n = number % 1000;
            if (n != 0)
            {
                String s = convertLessThanOneThousand(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        }
        while (number > 0);

        return (prefix + current).trim();
    }

    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println();
        NumberToWord obj = new NumberToWord();
        System.out.println(num + " = " + obj.convert(num));
    }
}
Output
Enter a number: 1222 
1222= one thousand two hundred twenty two

Niven Number
import java.util.*;

class Niven_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int c = n, d, sum = 0;

        //finding sum of digits
        while (c > 0)
        {
            d = c % 10;
            sum = sum + d;
            c = c / 10;
        }

        if (n % sum == 0)
            System.out.println("\n" + n + " is a Niven Number.");
        else
            System.out.println("\n" + n + " is not a Niven Number.");
    }
}
Output

Enter a number : 54

54 is a Niven Number.

Floor Value
class FloorValue
{
    public static void main(String a[])
    {
        System.out.println("Floor value of 50: " + Math.floor(50));
        System.out.println("Floor value of 23.8: " + Math.floor(23.8));
        System.out.println("Floor value of -46.5: " + Math.floor(-46.5));
    }
}
Output
Floor value of 50: 50.0                                                                                                                                                         
Floor value of 23.8: 23.0                                                                                                                                                       
Floor value of -46.5: -47.0

Top Two Maximum Number in Array
class TopTwoMaxNumber
{
    public void printTwoMaxNumbers(int[] nums)
    {
        int maxOne = 0;
        int maxTwo = 0;
        for (int n : nums)
        {
            if (maxOne < n)
            {
                maxTwo = maxOne;
                maxOne = n;
            }
            else if (maxTwo < n)
            {
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: " + maxOne);
        System.out.println("Second Max Number: " + maxTwo);
    }

    public static void main(String args[])
    {
        int num[] = {65, 34, 27, 8, 33, 10, 89, 45};
        TopTwoMaxNumber ttmn = new TopTwoMaxNumber();
        ttmn.printTwoMaxNumbers(num);
    }
}
Output
First Max Number: 89
Second Max Number: 65

Common Numbers Between Two Arrays
class CommnElements
{
    public static void main(String args[])
    {
        int[] arr1 = {1, 3, 7, 8};
        int[] arr2 = {9, 5, 7, 2, 1, 4, 8};

        System.out.println("Common Elements are:");

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
Output
Common Elements are:                                                                                                                                                            
1                                                                                                                                                                               
7                                                                                                                                                                               
8   
Search
Binary Search
import java.util.*;

class BinarySearch
{
    public static void main(String[] args)
    {
        int[] intArray = new int[10];
        int searchValue = 0, index;

        System.out.println("Enter 10 numbers");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < intArray.length; i++)
        {
            intArray[i] = input.nextInt();
        }

        System.out.print("Enter a number to search for: ");
        searchValue = input.nextInt();
        index = binarySearch(intArray, searchValue);

        if (index != -1)
        {
            System.out.println("Found at index: " + index);
        }
        else
        {
            System.out.println("Not Found");
        }

    }

    static int binarySearch(int[] search, int find)
    {
        int start, end, midPt;
        start = 0;
        end = search.length - 1;

        while (start <= end)
        {
            midPt = (start + end) / 2;

            if (search[midPt] == find)
            {
                return midPt;
            }
            else if (search[midPt] < find)
            {
                start = midPt + 1;
            }
            else
            {
                end = midPt - 1;
            }
        }

        return -1;
    }
}
Output
Enter 10 numbers:
1
2
3
4
5
6
7
8
9
10
Enter a number to search for:5
Found at index: 4

Linear / Sequential Search
import java.util.Scanner;

class LinearSearch
{
    public static void main(String args[])
    {
        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter " + n + " integers");

        for (c = 0; c < n; c++)
        {
            array[c] = in.nextInt();
        }

        System.out.println("Enter value to find");
        search = in.nextInt();

        for (c = 0; c < n; c++)
        {
            if (array[c] == search)     // Searching element is present 
            {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }
        }
        if (c == n)  // Searching element is absent 
            System.out.println(search + " is not present in array.");
    }
}
Output
Enter number of elements
6
Enter 6 integers
3
7
6
4
9
0
Enter value to find
9
9 is present at location 5.

Sort
Bubble Sort
import java.util.Scanner;

class BubbleSort
{

    public static void main(String[] args)
    {
        int n, c, d, swap;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of integers to sort");
        n = in.nextInt();

        int array[] = new int[n];

        System.out.println("Enter " + n + " integers");

        for (c = 0; c < n; c++)
        {
            array[c] = in.nextInt();
        }

        for (c = 0; c < (n - 1); c++)
        {
            for (d = 0; d < n - c - 1; d++)
            {
                if (array[d] > array[d + 1]) /* For descending order use < */
                {
                    swap = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers");

        for (c = 0; c < n; c++)
        {
            System.out.println(array[c]);
        }
    }
}
Output
Input number of integers to sort
7
Enter 7 integers
8
4
6
1
3
0
9
Sorted list of numbers
0
1
3
4
6
8
9

Heap Sort
class HeapSort
{
    public static void main(String a[])
    {
        int i;
        int arr[] = {1, 3, 4, 5, 2};

        System.out.println("\nHeap Sort\n---------------");
        System.out.println("\nUnsorted Array\n---------------");

        for (i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }

        for (i = arr.length; i > 1; i--)
        {
            fnSortHeap(arr, i - 1);
        }

        System.out.println("\n\nSorted array\n---------------");

        for (i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }
    }

    public static void fnSortHeap(int array[], int arr_ubound)
    {
        int i, o;
        int lChild, rChild, mChild, root, temp;

        root = (arr_ubound - 1) / 2;

        for (o = root; o >= 0; o--)
        {
            for (i = root; i >= 0; i--)
            {
                lChild = (2 * i) + 1;
                rChild = (2 * i) + 2;

                if ((lChild <= arr_ubound) && (rChild <= arr_ubound))
                {
                    if (array[rChild] >= array[lChild])
                        mChild = rChild;
                    else
                        mChild = lChild;
                }
                else
                {
                    if (rChild > arr_ubound)
                        mChild = lChild;
                    else
                        mChild = rChild;
                }

                if (array[i] < array[mChild])
                {
                    temp = array[i];
                    array[i] = array[mChild];
                    array[mChild] = temp;
                }
            }
        }

        temp = array[0];
        array[0] = array[arr_ubound];
        array[arr_ubound] = temp;
        return;
    }
}
Output
Heap Sort
---------------

Unsorted Array
---------------
 1 3 4 5 2

Sorted array
---------------
 1 2 3 4 5

Insertion Sort
class InsertionSortExample
{
    static int step = 1;

    public static void main(String[] args)
    {
        int[] input = {7, 21, 91, 43, 23, 17, 34, 9, 1};
        insertionSort(input);
    }

    private static void printNumbers(int[] input)
    {
        System.out.println("Step " + step);
        System.out.println("-----------------------------");
        step++;

        for (int i = 0; i < input.length; i++)
        {
            System.out.print(input[i] + ", ");
        }

        System.out.println("\n");
    }

    public static void insertionSort(int array[])
    {
        int n = array.length;

        for (int j = 1; j < n; j++)
        {
            int key = array[j];
            int i = j - 1;

            while ((i > -1) && (array[i] > key))
            {
                array[i + 1] = array[i];
                i--;
            }

            array[i + 1] = key;
            printNumbers(array);
        }
    }
}
Output
Step 1
-----------------------------
7, 21, 91, 43, 23, 17, 34, 9, 1, 

Step 2
-----------------------------
7, 21, 91, 43, 23, 17, 34, 9, 1, 

Step 3
-----------------------------
7, 21, 43, 91, 23, 17, 34, 9, 1, 

Step 4
-----------------------------
7, 21, 23, 43, 91, 17, 34, 9, 

Merge Sort
class MergeSort
{
    private int[] array;
    private int[] tempMergArr;
    private int length;

    public static void main(String a[])
    {
        int[] inputArr = {32, 27, 51, 89, 1, 98, 9, 28, 65, 0};
        MergeSort mms = new MergeSort();
        mms.sort(inputArr);

        for (int i : inputArr)
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public void sort(int inputArr[])
    {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex)
    {
        if (lowerIndex < higherIndex)
        {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex)
    {
        for (int i = lowerIndex; i <= higherIndex; i++)
        {
            tempMergArr[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex)
        {
            if (tempMergArr[i] <= tempMergArr[j])
            {
                array[k] = tempMergArr[i];
                i++;
            }
            else
            {
                array[k] = tempMergArr[j];
                j++;
            }

            k++;
        }

        while (i <= middle)
        {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
}
Output
0 1 9 27 28 32 51 65 89 98 

Quick Sort

{
    public static void main(String a[])
    {
        int i;
        int array[] = {12, 9, 4, 99, 120, 1, 3, 10, 13};

        System.out.println("Quick Sort\n\n");
        System.out.println("Values Before the sort:\n");

        for (i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "  ");
        }

        System.out.println();

        quick_srt(array, 0, array.length - 1);

        System.out.print("\nValues after the sort:\n\n");

        for (i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "  ");
        }

        System.out.println();
    }

    public static void quick_srt(int array[], int low, int n)
    {
        int lo = low;
        int hi = n;

        if (lo >= n)
        {
            return;
        }

        int mid = array[(lo + hi) / 2];

        while (lo < hi)
        {
            while (lo < hi && array[lo] < mid)
            {
                lo++;
            }

            while (lo < hi && array[hi] > mid)
            {
                hi--;
            }

            if (lo < hi)
            {
                int T = array[lo];
                array[lo] = array[hi];
                array[hi] = T;
            }
        }

        if (hi < lo)
        {
            int T = hi;
            hi = lo;
            lo = T;
        }

        quick_srt(array, low, lo);
        quick_srt(array, lo == low ? lo + 1 : lo, n);
    }
}
Output
Quick Sort


Values Before the sort:

12  9  4  99  120  1  3  10  13  

Values after the sort:

1  3  4  9  10  12  13  99  120

Selection Sort
class ShellSort
{
    private long[] data;
    private int len;

    public ShellSort(int max)
    {
        data = new long[max];
        len = 0;
    }

    public void insert(long value)
    {
        data[len] = value;
        len++;
    }

    public void display()
    {
        for (int j = 0; j < len; j++)
        {
            System.out.print(data[j] + " ");
        }

        System.out.println("");
    }

    public void shellSort()
    {
        int inner, outer;
        long temp;
        // find initial value of h

        int h = 1;

        while (h <= len / 3)
        {
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while (h > 0) // decreasing h, until h=1
        {
            // h-sort the file
            for (outer = h; outer < len; outer++)
            {
                temp = data[outer];
                inner = outer;

                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && data[inner - h] >= temp)
                {
                    data[inner] = data[inner - h];
                    inner -= h;
                }

                data[inner] = temp;
            }

            h = (h - 1) / 3; // decrease h
        }
    }

    public static void main(String[] args)
    {
        int maxSize = 10;
        ShellSort arr = new ShellSort(maxSize);

        for (int j = 0; j < maxSize; j++)
        {
            long n = (int) (java.lang.Math.random() * 99);
            arr.insert(n);
        }

        System.out.print("Unsorted List:\n");
        arr.display();

        arr.shellSort();

        System.out.print("-------------------------\n");
        System.out.print("Sorted List:\n");
        arr.display();
    }
}
Output
Unsorted List:
22 7 29 28 4 75 32 83 2 59 
-------------------------
Sorted List:
2 4 7 22 28 29 32 59 75 83

Shell Sort
class ShellSort
{
    private long[] data;
    private int len;

    public ShellSort(int max)
    {
        data = new long[max];
        len = 0;
    }

    public void insert(long value)
    {
        data[len] = value;
        len++;
    }

    public void display()
    {
        for (int j = 0; j < len; j++)
        {
            System.out.print(data[j] + " ");
        }

        System.out.println("");
    }

    public void shellSort()
    {
        int inner, outer;
        long temp;
        // find initial value of h

        int h = 1;

        while (h <= len / 3)
        {
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        }

        while (h > 0) // decreasing h, until h=1
        {
            // h-sort the file
            for (outer = h; outer < len; outer++)
            {
                temp = data[outer];
                inner = outer;

                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && data[inner - h] >= temp)
                {
                    data[inner] = data[inner - h];
                    inner -= h;
                }

                data[inner] = temp;
            }

            h = (h - 1) / 3; // decrease h
        }
    }

    public static void main(String[] args)
    {
        int maxSize = 10;
        ShellSort arr = new ShellSort(maxSize);

        for (int j = 0; j < maxSize; j++)
        {
            long n = (int) (java.lang.Math.random() * 99);
            arr.insert(n);
        }

        System.out.print("Unsorted List:\n");
        arr.display();

        arr.shellSort();

        System.out.print("-------------------------\n");
        System.out.print("Sorted List:\n");
        arr.display();
    }
}
Output
Unsorted List:
22 7 29 28 4 75 32 83 2 59 
-------------------------
Sorted List:
2 4 7 22 28 29 32 59 75 83

Object Sorting with Comparator
import java.util.Comparator;
import java.util.Arrays;

class SortFruitObject
{

    public static void main(String args[])
    {
        Fruit[] fruits = new Fruit[4];

        Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 70);
        Fruit apple = new Fruit("Apple", "Apple description", 100);
        Fruit orange = new Fruit("Orange", "Orange description", 80);
        Fruit banana = new Fruit("Banana", "Banana description", 90);

        fruits[0] = pineappale;
        fruits[1] = apple;
        fruits[2] = orange;
        fruits[3] = banana;

        Arrays.sort(fruits);

        int i = 0;
        for (Fruit temp : fruits)
        {
            System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity " + "\t: " + temp.getQuantity());
        }
    }
}

class Fruit implements Comparable<Fruit>
{

    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruit(String fruitName, String fruitDesc, int quantity)
    {
        super();
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }

    public String getFruitName()
    {
        return fruitName;
    }

    public void setFruitName(String fruitName)
    {
        this.fruitName = fruitName;
    }

    public String getFruitDesc()
    {
        return fruitDesc;
    }

    public void setFruitDesc(String fruitDesc)
    {
        this.fruitDesc = fruitDesc;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int compareTo(Fruit compareFruit)
    {
        int compareQuantity = ((Fruit) compareFruit).getQuantity();

        //ascending order
        return this.quantity - compareQuantity;

        //descending order
        //return compareQuantity - this.quantity;
    }

    public static Comparator<Fruit> FruitNameComparator
            = new Comparator<Fruit>()
    {
        public int compare(Fruit fruit1, Fruit fruit2)
        {

            String fruitName1 = fruit1.getFruitName().toUpperCase();
            String fruitName2 = fruit2.getFruitName().toUpperCase();

            //ascending order
            return fruitName1.compareTo(fruitName2);

            //descending order
            //return fruitName2.compareTo(fruitName1);
        }
    };
}
Output
fruits 1 : Pineapple, Quantity  : 70
fruits 2 : Orange, Quantity     : 80
fruits 3 : Banana, Quantity     : 90
fruits 4 : Apple, Quantity      : 100

Selection Sort in Descending Order
import java.util.*;

class SelectionSortDesc
{
    public static void main(String[] args)
    {
        int[] num;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("No. of elements to sort :");
        size = scanner.nextInt();
        num = new int[size];
        for (int i = 0; i < size; i++)
        {
            num[i] = scanner.nextInt();
        }
        int sorted_array[] = sort(num);
        System.out.println("Selection Sort in Descending order : ");
        for (int i = 0; i < sorted_array.length; i++)
        {
            System.out.print(sorted_array[i] + "\t");
        }
    }
    public static int[] sort(int[] num)
    {
        int i, j, first, temp;
        for (i = num.length - 1; i > 0; i--)
        {
            first = 0;  //initialize to subscript of first element
            for (j = 1; j <= i; j++)   //locate smallest element between positions 1 and i.
            {
                if (num[j] < num[first])
                    first = j;
            }
            temp = num[first];   //swap smallest found with element in position i.
            num[first] = num[i];
            num[i] = temp;
        }
        return num;
    }
}
Output
No. of elements to sort :7
6
9
1
8
3
7
5
Selection Sort in Descending order :
9       8       7       6       5       3       1

Enumeration Sort
 
class EnumerationSort {

    public static void main(String[] args) {

        /*
         Creates random data for sorting source. Will use java.util.Vector
         to store the random integer generated.
        */

        Random random = new Random();
        Vector<Integer> data = new Vector<Integer>();

        for (int i = 0; i < 10; i++) {

            data.add(Math.abs(random.nextInt()));

        }
 
        /*
         Get the enumeration from the vector object and convert it into
         a java.util.List. Finally we sort the list using
         Collections.sort() method.
        */

        Enumeration enumeration = data.elements();
        List<Integer> list = Collections.list(enumeration);
        Collections.sort(list);
 
        //
        // Prints out all generated number after sorted.
        //

        for (Integer number : list) {

            System.out.println("number = " + number);

        }
    }
}
Output
number = 64029842
number = 72921309
number = 230054456
number = 256151404
number = 345486128
number = 387933255
number = 398974777
number = 626349261
number = 654063730
number = 1319397578


Sorting Array in Ascending and Descending order
import java.util.*;

class Sorting
{
    public static void main(String[] args)
    {
        int num, i, j, temp;
        int[] asc;
        int[] des;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        num = sc.nextInt();

        asc = new int[num];
        des = new int[num];

        System.out.println("Enter " + num + " numbers: ");

        //Sorting numbers in ascending order	
        for (i = 0; i < num; i++)
        {
            asc[i] = sc.nextInt();
            des[i] = asc[i];
        }
        
        for (i = 0; i < (num - 1); i++)
        {
            for (j = 0; j < (num - i - 1); j++)
            {
                if (asc[j] > asc[j + 1])
                {
                    temp = asc[j];
                    asc[j] = asc[j + 1];
                    asc[j + 1] = temp;
                }
            }
        }

        //Sorting numbers in descending order
        for (i = 0; i < (num - 1); i++)
        {
            for (j = 0; j < (num - i - 1); j++)
            {
                if (des[j] < des[j + 1])
                {
                    temp = des[j];
                    des[j] = des[j + 1];
                    des[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted list of numbers in ascending order:");
        for (i = 0; i < num; i++)
        {
            System.out.print(" " + asc[i]);
        }

        System.out.println("\n \nSorted list of numbers in descending order:");
        for (i = 0; i < num; i++)
        {
            System.out.print(" " + des[i]);
        }
    }
}
Output

Enter the number of elements:
5
Enter 5 numbers:
2
4
2
4
5
Sorted list of numbers in ascending order:
 2 2 4 4 5

Sorted list of numbers in descending order:
 5 4 4 2 2


Skip List
import java.util.Scanner;

/* Class SkipListTest */
class SkipList
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        /* Creating object of SkipList */
        SkipList1 sl = new SkipList1(100000000);

        System.out.println("Enter no of elements to enter");
        n = scan.nextInt();

        /*  Perform list operations  */
        do
        {
            System.out.println("Enter integer element to insert");
            sl.insert(scan.nextInt());      
            /*  Display List  */
            sl.printList();
            n--;
        }
        while (n > 0);
    }
}

/* Class SkipNode */
class SkipNode
{
    int element;
    SkipNode right;
    SkipNode down;

    /* Constructor */
    public SkipNode(int x)
    {
        this(x, null, null);
    }
    /* Constructor */
    public SkipNode(int x, SkipNode rt, SkipNode dt)
    {
        element = x;
        right = rt;
        down = dt;
    }
}

/* Class SkipList */
class SkipList1
{
    private SkipNode header;
    private int infinity;
    private SkipNode bottom = null;
    private SkipNode tail = null;

    /* Constructor */
    public SkipList1(int inf)
    {
        infinity = inf;
        bottom = new SkipNode(0);
        bottom.right = bottom.down = bottom;
        tail = new SkipNode(infinity);
        tail.right = tail;
        header = new SkipNode(infinity, tail, bottom);
    }
    /* Function to insert element */
    public void insert(int x)
    {
        SkipNode current = header;
        bottom.element = x;
        while (current != bottom)
        {
            while (current.element < x)
            {
                current = current.right;
            }
            /*  If gap size is 3 or at bottom level and must insert, then promote middle element */
            if (current.down.right.right.element < current.element)
            {
                current.right = new SkipNode(current.element, current.right, current.down.right.right);
                current.element = current.down.right.element;
            }
            else
                current = current.down;
        }
        /* Raise height of skiplist if necessary */
        if (header.right != tail)
            header = new SkipNode(infinity, tail, header);
    }

    /* Function to get node at a position */
    private int elementAt(SkipNode t)
    {
        return t == bottom ? 0 : t.element;
    }
    /* Function to print list */
    public void printList()
    {
        System.out.print("\nSkiplist = ");
        SkipNode current = header;
        while (current.down != bottom)
        {
            current = current.down;
        }
        while (current.right != tail)
        {
            System.out.print(current.element + " ");
            current = current.right;
        }
        System.out.println();
    }
}
Output

Enter no of elements to enter
6
Enter integer element to insert
2 4 6 3 2 5

Skiplist = 2
Enter integer element to insert

Skiplist = 2 4
Enter integer element to insert

Skiplist = 2 4 6
Enter integer element to insert

Skiplist = 2 3 4 6
Enter integer element to insert

Skiplist = 2 3 4 6

Exchange Sort
//The exchange sort compares the first element with each element of the array, making a swap where is necessary.

import java.util.*;

class ExchangeSort
{
    public static void main(String[] args)
    {
        int[] array;
        int i, j, temp, size;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        size = sc.nextInt();
        array = new int[size];

        System.out.println("Enter the elements of array : ");
        for (i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }

        //Exchange sort
        for (i = 0; i < (size - 1); i++)
        {
            for (j = (i + 1); j < size; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array is : ");
        for (i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
Output

Enter the size of array
4
Enter the elements of array :
5
2
9
4
Sorted Array is :
2 4 5 9

Bubble Sort in Descending order

import java.util.*;

class BubbleSortInDescendingOrder
{
    public static void main(String args[])
    {
        int n, c, d, swap;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of integers to sort");
        n = in.nextInt();

        int array[] = new int[n];

        System.out.println("Enter " + n + " integers");

        for (c = 0; c < n; c++)
        {
            array[c] = in.nextInt();
        }

        for (c = 0; c < (n - 1); c++)
        {
            for (d = 0; d < n - c - 1; d++)
            {
                if (array[d] < array[d + 1])
                {
                    swap = array[d];
                    array[d] = array[d + 1];
                    array[d + 1] = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers");

        for (c = 0; c < n; c++)
        {
            System.out.println(array[c]);
        }
    }
}
Output

Input number of integers to sort
5
Enter 5 integers
96
52
88
69
25
Sorted list of numbers
96
88
69
52
25

String
Find All Substrings
import java.util.Scanner;

class SubstringsOfAString
{
    public static void main(String args[])
    {
        String string, sub;
        int i, c, length;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        string = in.nextLine();

        length = string.length();

        System.out.println("Substrings of \"" + string + "\" are :-");

        for (c = 0; c < length; c++)
        {
            for (i = 1; i <= length - c; i++)
            {
                sub = string.substring(c, c + i);
                System.out.println(sub);
            }
        }
    }
}
Output
Enter a string to print it's all substrings
java
Substrings of "java" are :-
j
ja
jav
java
a
av
ava
v
va
a

Reverse of a String
import java.util.*;

class ReverseString
{
    public static void main(String args[])
    {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
        {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Reverse of entered string is: " + reverse);
    }
}
Output
Enter a string to reverse
hello
Reverse of entered string is: olleh

String Equals Test
class StringEqualsTest {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = s1;
		String s5 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println("== comparison : " + (s1 == s5));
		System.out.println("== comparison : " + (s1 == s2));
		System.out.println("Using equals method : " + s1.equals(s2));
		System.out.println("== comparison : " + (s3 == s4));
		System.out.println("Using equals method : " + s3.equals(s4));
	}
}
Output
== comparison : true
== comparison : true
Using equals method : true
== comparison : false
Using equals method : true

String Concatenate
class StringConcat
{
    public static void main(String args[])
    {
        String s1 = "Hello";
        String s2 = "FreeIT";

        //Concatenation
        String s3 = s1.concat(s2);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        String s4 = "Hello";

        //checking equals
        if (s4.equals(s1))
        {
            System.out.println("s4 is equal to s1");
        }
        else
        {
            System.out.println("s4 is not equal to s1");
        }
    }
}  
Output
s1 = Hello
s2 = FreeIT
s3 = HelloFreeIT
s4 is equal to s1

String Length & Trim
class StringExampleTwo
{
    public static void main(String args[])
    {
        String s1 = " Universe ";
        System.out.println("s1 = " + s1);

        //Display String Length
        System.out.println("The length of s1 is: " + s1.length());

        //Removing extra spaces from s1
        String s2 = s1.trim();

        System.out.println("s2 = " + s2);
        System.out.println("The length of s2 is: " + s2.length());
    }
} 
Output
s1 =  Universe
The length of s1 is: 10
s2 = Universe
The length of s2 is: 8

Change case of a String
class StringCase
{
    public static void main(String args[])
    {
        String str = "Java Programs With Output";

        //toUpperCase() method converts the complete string in upper case
        String strUpper = str.toUpperCase();

        //toLowerCase() method converts the complete string in lower case
        String strLower = str.toLowerCase();

        //printing changed case string
        System.out.println("Upper Case: " + strUpper);
        System.out.println("Lower Case: " + strLower);
    }
}
Output
Upper Case: JAVA PROGRAMS WITH OUTPUT
Lower Case: java programs with output

Reverse a String Using Recursive
class StringRecursiveReversal
{
    String reverse = "";

    public String reverseString(String str)
    {
        if (str.length() == 1)
        {
            return str;
        }
        else
        {
            reverse += str.charAt(str.length() - 1)
                    + reverseString(str.substring(0, str.length() - 1));
            return reverse;
        }
    }

    public static void main(String a[])
    {
        StringRecursiveReversal srr = new StringRecursiveReversal();

        System.out.println("Result: " + srr.reverseString("Java Programs With Output"));
    }
}
Output
Result: tuptuO htiW smargorP avaJ

String Tokenizer
/*
  String Tokenizer example
  This example shows how a Java StringTokenizer can be used to break a string
  into tokens.
*/

import java.util.StringTokenizer;

class StringTokenizerExample
{
    public static void main(String[] args)
    {
        //create StringTokenizer object
        StringTokenizer st = new StringTokenizer("Java StringTokenizer Example");

        //iterate through tokens
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
Output
Java
StringTokenizer
Example

Check Palindrome
import java.util.*;

class Palindrome
{
    public static void main(String args[])
    {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string : ");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
        {
            reverse = reverse + original.charAt(i);
        }

        if (original.equals(reverse))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string is not a palindrome.");
    }
}	
Output
Enter a string : madam
Entered string is a palindrome.

Strings sorting in ascending order (Alphabetical order)
import java.util.Arrays;
import java.io.*;

class SortString
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // create a Java String array
        String[] names = null;
        System.out.print("How many names you want to sort : ");
        int size = Integer.parseInt(br.readLine());

        names = new String[size];

        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter " + (i + 1) + " name : ");
            names[i] = br.readLine();
        }
        // sort the array, using the sort method of the Arrays class
        Arrays.sort(names);

        System.out.println("Sorted names -> ");
        // print the sorted results
        for (String name : names)
        {
            System.out.println("\t" + name);
        }
    }
}
Output
How many names you want to sort : 5
Enter 1 name : Mark
Enter 2 name : Bill
Enter 3 name : Larry
Enter 4 name : John
Enter 5 name : Alexander
Sorted names ->
        Alexander
        Bill
        John
        Larry
        Mark

Longest word in a String
import java.util.Scanner;

class LongestWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        String maxword = null;
        str = str + ' ';
        int l = str.length();
        String word = "";
        int maxlength = 0;

        for (int i = 0; i < l; i++)
        {
            word = word + str.charAt(i);
            if (str.charAt(i + 1) == ' ')
            {
                if (word.length() > maxlength)
                {
                    maxword = new String(word);
                    maxlength = word.length();
                }
                word = "";
                i++;
            }
        }

        System.out.println("longest word is " + maxword);
    }
} 
Output
Enter the string : I love doing programming in java
longest word is programming


Convert a English word into Piglatin
Code
Run
import java.util.Scanner;

class PigLatin
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final String vowels = "aeiouAEIOU";
        System.out.println("Enter done to exit...");
        System.out.print("Enter your word : ");
        String word = sc.nextLine();
        while (!word.equalsIgnoreCase("done"))
        {
            String beforVowel = "";
            int cut = 0;
            while (cut < word.length() && !vowels.contains("" + word.charAt(cut)))
            {
                beforVowel += word.charAt(cut);
                cut++;
            }
            if (cut == 0)
            {
                cut = 1;
                word += word.charAt(0) + "w";
            }
            System.out.println("PigLatin : " + word.substring(cut) + beforVowel + "ay");
            System.out.print("Enter your word : ");
            word = sc.nextLine();
        }
    }
}
Output
Enter done to exit...
Enter your word : Java
PigLatin : avaJay
Enter your word : Python
PigLatin : onPythay
Enter your word : Android
PigLatin : ndroidAway
Enter your word : done

String length without using length()
class StringLength
{
    static int i, c, res;

    static int length(String s)
    {
        try
        {
            for (i = 0, c = 0; 0 <= i; i++, c++)
            {
                s.charAt(i);
            }
        }
        catch (Exception e)
        //Array index out of bounds and array index out of range are different exceptions
        {
            System.out.print("length is ");
            // we can not put return  statement in catch
        }
        return c;
    }

    public static void main(String args[])
    {
        System.out.println("Original String is : Programming Hub");
        res = StringLength.length("Programming Hub");
        System.out.println(res);
    }
}
Output
Original String is : Programming Hub
length is 15

String Reverse without using reverse()
class StringReverse
{
    public static void main(String args[])
    {
        String s = "abcdef";
        char c[] = s.toCharArray();

        System.out.print("Reverse String : ");


        for (int i = c.length - 1; i >= 0; i--)
        {
            System.out.print(c[i]);
        }
    }
}
Output
Reverse String : fedcba

Single String Sort
import java.util.Arrays;

class SingleStringSort
{
    public static void main(String[] args)
    {
        String original = "edcba";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println("Pre-sorting string : " + original);
        System.out.println("Sorted string : " + sorted);
    }
}
Output
Pre-sorting string : edcba
Sorted string : abcde

ASCII to char & char to ASCII
class CharToASCII
{
    public static int CharToASCII(final char character)
    {
        return (int) character;
    }

    public static char ASCIIToChar(final int ascii)
    {
        return (char) ascii;
    }

    public static void main(String args[])
    {
        char a = 'a';
        int i = 65;

        System.out.println("Char to ASCII : " + a + " ascii is " + CharToASCII(a));
        System.out.println("ASCII to char : " + i + " char is " + ASCIIToChar(i));
    }
}
Output
Char to ASCII : a ascii is 97
ASCII to char : 65 char is A

Count Number of Words in a Sentence
import java.util.Scanner;

class CountWords
{
    public static int countWords(String str)
    {
        String words[] = str.split(" ");
        int count = words.length;
        return count;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        String sentence = in.nextLine();
        System.out.print("Your sentence has " + countWords(sentence)
                                 + " words.");

        //Close Scanner to avoid memory leak
        in.close();
    }
}
Output
Enter a sentence: how are you doing?
Your sentence has 4 words.


Number of vowels in String
import java.io.*;

class VowelsInString
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter String : ");
        String str = br.readLine();

        int noofvowels = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if ((str.toLowerCase().charAt(i) == 'a') || (str.toLowerCase().charAt(i) == 'e') || (str.toLowerCase().charAt(i) == 'i') || (str.toLowerCase().charAt(i) == 'o') || (str.toLowerCase().charAt(i) == 'u'))
            {
                noofvowels++;
            }
        }
        System.out.print("Number of vowels in " + str + " : " + noofvowels);
    }
}
Output
Enter String : Learn to Program
Number of vowels in Learn to Program : 

Reverse Sentence
import java.io.*;

class ReverseSentence
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter sentence : ");
        String str = br.readLine();

        String words[] = str.split(" ");
        System.out.println("Reverse Sentence : ");
        for (int i = words.length - 1; i >= 0; i--)
        {
            System.out.print(words[i] + " ");
        }
    }
}
Output
Enter sentence : I Enjoy Coding
Reverse Sentence :
Coding Enjoy I

String Concatenation Using Plus Operator
class StringConcatWithPlus
{
    public static void main(String[] args)
    {
        String s1 = "Hi ";
        String s2 = "Programming Hub";
        String s3 = null;
        String s4 = null;

        //Concatenating two String Objects
        s3 = s1 + s2;

        //Concatenating Strings Dynamically
        s4 = "This is " + "New String";

        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
    }
}
Output
s3 = Hi Programming Hub
s4 = This is New String

Reverse Sentence without Using split()
import java.util.ArrayList;
import java.io.*;

class ReverseSentence
{
    public static void main(String args[]) throws Exception
    {
        System.out.print("Enter sentence : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        ArrayList al = new ArrayList();
        al = recursiveReverseMethod(sentence, al);
        al.trimToSize();
        StringBuilder sb = new StringBuilder();
        for (int i = al.size() - 1; i >= 0; i--)
        {
            sb.append(al.get(i) + " ");

        }
        System.out.println("Reverse of Sentence : " + sb);
    }
    public static ArrayList recursiveReverseMethod(String sentence, ArrayList al)
    {
        int index = sentence.indexOf(" ");
        al.add(sentence.substring(0, index));
        sentence = sentence.substring(index + 1);
        if (sentence.indexOf(" ") == -1)
        {
            al.add(sentence.substring(0));
            return al;
        }
        return recursiveReverseMethod(sentence, al);
    }
}
Output
Enter sentence : I love coding
Reverse of Sentence : coding love I

Permutations of the given string
import java.util.Scanner;

class Permutation
{
    public static void main(String args[])
    {
        System.out.print("Please enter the string for permutation : ");
        Scanner in = new Scanner(System.in);
        String original = in.nextLine();

        System.out.println("\nResults are :");

        permute(original);
    }

    public static void permute(String input)
    {
        int inputLength = input.length();
        boolean[] used = new boolean[inputLength];
        StringBuffer outputString = new StringBuffer();
        char[] in = input.toCharArray();
        doPermute(in, outputString, used, inputLength, 0);
    }

    public static void doPermute(char[] in, StringBuffer outputString,
                                 boolean[] used, int inputLength, int level)
    {
        if (level == inputLength)
        {
            System.out.println(outputString.toString());
            return;
        }

        for (int i = 0; i < inputLength; ++i)
        {
            if (used[i])
                continue;

            outputString.append(in[i]);
            used[i] = true;
            doPermute(in, outputString, used, inputLength, level + 1);
            used[i] = false;
            outputString.setLength(outputString.length() - 1);
        }
    }
}
Output
Please enter the string for permutation : abc

Results are :
abc
acb
bac
bca
cab
cba

StringBuilder Example
class StringBuilderDemo
{
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("java ");

        //now original string is changed
        sb.append("is best");
        System.out.println(sb);
        System.out.println(sb.length());

        //allocated capacity
        System.out.println(sb.capacity());

        StringBuilder sb1 = new StringBuilder("Android");
        sb1.insert(7, " is cool");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("He is Superstar");
        sb2.replace(3, 5, "was");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.delete(1, 3);
        //prints Hlo  
        System.out.println(sb3);
        sb3.deleteCharAt(0);
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("java");
        sb4.reverse();
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("java ");
        System.out.println(sb5.charAt(0));
        sb5.setCharAt(0, 'k');
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder("He is Superstar");
        String s = sb6.substring(6, 11);
        System.out.println(s);
        s = sb6.substring(6);
        System.out.println(s);
    }
}
Output
java is best
12
21
Android is cool
He was Superstar
Hlo
lo
avaj
j
kava 
Super
Superstar

Sum Of Numbers in String
class Test
{
    public static void main(String[] args)
    {
        int sum = 0;
        String str = "sha12bhu467";
        //replace all character to "" except decimals

        str = str.replaceAll("\\D+", "");

        System.out.println(str);

        char c[] = str.toCharArray();

        for (int i = 0; i < c.length; i++)
        {
            sum += Character.getNumericValue(c[i]);
        }
        System.out.println("Your sum :)" + " " + sum);
    }
}
Output
12467
Your sum :) 20

Anagram without Recursion
import java.io.*;

class Anagrams
{
    public static void main(String args[]) throws Exception
    {
        Anagrams a = new Anagrams();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first string: ");
        String str1 = br.readLine();

        System.out.print("Enter second string: ");
        String str2 = br.readLine();

        int flag = a.Anagram(str1, str2);

        if (flag == 0)
        {
            System.out.print("\nResult: " + str1 + " and " + str2 + " are anagrams.");
        }
        else
        {
            System.out.print("\nResult: " + str1 + " and " + str2 + " are not anagrams.");
        }

        System.out.println();
    }

    public int Anagram(String str1, String str2)
    {
        if (str1.equals(str2))
        {
            return 0;
        }

        return 1;
    }
}  
Output
Enter first string: ana
Enter second string: ana

Result: ana and ana are anagrams.

Output2:
Enter first string: aana
Enter second string: ana

Result: aana and ana are not anagrams.

Count No. of Times a Char Occurred in a Sentence

import java.util.*;

class Demo
{
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter string: ");
        String s1 = sc.nextLine();

        System.out.print("\nEnter char: ");
        char c = sc.next(".").charAt(0);

        int count = 0;

        char strarr[] = s1.toCharArray();

        for (int i = 0; i < strarr.length; i++)
        {
            if (strarr[i] == c)
            {
                count++;
            }
        }
        System.out.println("\nNo of Occurence found: " + count);
    }
}
Output
Enter string: i live in india

Enter char: i

No of Occurence found: 5

Sort Names in Alphabetical/Ascending Order
import java.util.*;

class AlphabeticalOrder
{
    public static void main (String[] args)
    {
        int n;
        String temp;

        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of names you want to enter : ");

        n = s.nextInt();

        String names[] = new String[n];

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter all the names:");
        for(int i = 0; i < n; i++)
        {
            names[i] = s1.nextLine();
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Names in Sorted Order : ");
        for (int i = 0; i < n; i++) 
        {
            System.out.println(names[i]);
        }
    }
}
Output
Enter number of names you want to enter : 6
Enter all the names:
Yogesh
Nigel
John
Larry
Mark
Tito
Names in Sorted Order : 
John
Larry
Mark
Nigel
Tito
Yogesh

Reverse Word in the Sentence
import java.io.*;

class ReverseWordIntheSentence
{
    public static void main(String[] args) throws Exception
    {
        int strLen, i, j;
        String str;
        String reverse = "", temp = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter string: ");
        str = br.readLine();

        strLen = str.length() - 1;

        for (i = 0; i <= strLen; i++)
        {
            temp += str.charAt(i);

            if ((str.charAt(i) == ' ') || (i == strLen))
            {
                for (j = temp.length() - 1; j >= 0; j--)
                {
                    reverse += temp.charAt(j);
                    if ((j == 0) && (i != strLen))
                        reverse += " ";
                }
                temp = "";
            }
        }
        System.out.println("\nReverse of " + str + " : " + reverse);
    }
}
Output

Enter string: Hi this is Programming Hub

Reverse of Hi this is Programming Hub :  iH  siht  si  gnimmargorP buH

Repeat the String
import java.io.*;

class RepeatStringName
{
    public static void main(String args[]) throws Exception
    {
        int i, n;
        String strName = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");
        strName = br.readLine();

        System.out.println("\nEnter the number of times you want to print your name: ");
        n = Integer.parseInt(br.readLine());

        System.out.println();
        for (i = 0; i < n; i++)
        {
            System.out.print(strName + " ");
        }
    }
}
Output

Enter your name:
John

Enter the number of times you want to print your name:
5

John John John John John

Count number of Punctuations in a sentence
import java.io.*;

class PunctuationMark
{
    public static void main(String[] args) throws Exception
    {
        String str;
        int i, punct = 0, letter = 0, spaces = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String : ");
        str = br.readLine();

        for (i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
            {
                letter++;
            }
            else if (ch == ' ' || ch == '\t')
            {
                spaces++;
            }
            else
            {
                punct++;
            }
        }

        System.out.println("Number of letter in the string is : " + letter);
        System.out.println("Number of spaces in the string is : " + spaces);
        System.out.println("Number of punctuation marks in the string is : " + punct);
    }
}
Output
Enter String :
Hello, This is ProgrammingHub. How are you doing?
Number of letter in the string is : 39
Number of spaces in the string is : 7
Number of punctuation marks in the string is : 3

Format a String
class FormatString
{
    public static void main(String a[])
    {
        String str = "This is formatted %s example.";
        System.out.println(String.format(str, "string"));

        String str1 = "We are adding number %d to string.";
        System.out.println(String.format(str1, 10));
    }
}
Output
This is formatted string example.
We are adding number 10 to strin

String Start With
class StringStartWith
{
    public static void main(String a[])
    {
        String str = "This is a Demo.";
        System.out.println("Is this string starts with \"This\"? " + str.startsWith("This"));

        System.out.println("Is this string starts with \"Demo\"? " + str.startsWith("Demo"));
    }
}
Output
Is this string starts with "This"? true
Is this string starts with "Demo"? false    

HTML Tag Remover
class HtmlTagRemover
{
    public static void main(String a[])
    {
        String text = "<p>This tags going to disappear.</p>";
        System.out.println(text);

        text = text.replaceAll("\\<.*?\\>", "");
        System.out.println(text);
    }
}	
Output
<p>This tags going to disappear.</p>
This tags going to disappear.

Thread
Get Current Thread

//Getting the current thread and displaying its info

class GetCurrentThread
{
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        t.setName("MainThread");
        System.out.println("Id of current thread is: " + t.getId());
        System.out.println("Name of current thread is: " + t.getName());
        System.out.println("Priority of current thread is: " + t.getPriority());
    }
} 
Output
Id of current thread is: 1
Name of current thread is: MainThread
Priority of current thread is: 5

Multi Thread Example
class MultiThreads
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++)
        {
            new Thread("" + i)
            {
                public void run()
                {
                    System.out.println("Thread: " + getName() + " running");
                }

            }.start();
        }
    }
}
Output
main
Thread: 1 running
Thread: 0 running
Thread: 2 running
Thread: 4 running
Thread: 3 running
Thread: 5 running
Thread: 6 running
Thread: 7 running
Thread: 8 running
Thread: 9 running

Simple Runnable Example
class SimpleRunnable implements Runnable
{
    public void run()
    {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[])
    {
        (new Thread(new SimpleRunnable())).start();
    }
}
Output
Hello from a thread!

Synchronized Threads Example
class CallThread
{
    void call(String msg)
    {
        System.out.print("[" + msg);

        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }

        System.out.println("]");
    }
}

// File Name : Caller.java
class Caller implements Runnable
{
    String msg;
    CallThread target;
    Thread t;

    public Caller(CallThread targ, String s)
    {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    // synchronize calls to call()
    public void run()
    {
        synchronized (target)
        {
            // synchronized block
            target.call(msg);
        }
    }
}

class SyncExample
{
    public static void main(String args[])
    {
        CallThread target = new CallThread();
        Caller ob1 = new Caller(target, "Thread A");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "Thread B");

        // wait for threads to end
        try
        {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Interrupted");
        }
    }
}
Output
[Thread A]
[Thread B]
[Synchronized]

Two Threads Example
class TwoThreadsExample
{
    public static void main(String[] args)
    {
        new SimpleThread("Thread A").start();
        new SimpleThread("Thread B").start();
    }
}

class SimpleThread extends Thread
{
    public SimpleThread(String str)
    {
        super(str);
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i + " " + getName());

            try
            {
                sleep((int) (Math.random() * 1000));
            }
            catch (InterruptedException e)
            {
            }
        }

        System.out.println("Exit! " + getName());
    }
}
Output
0 Thread A
0 Thread B
1 Thread A
1 Thread B
2 Thread B
3 Thread B
2 Thread A
4 Thread B
3 Thread A
4 Thread A
Exit! Thread B
Exit! Thread A

Set Thread Name Example
class SetThreadName
{
    public static void main(String[] args)
    {
        //get currently running thread object
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);

        //To set name of thread, use
        //void setName(String threadName) method of
        //Thread class.

        currentThread.setName("Set Thread Name Example");

        //To get the name of thread use,
        //String getName() method of Thread class.

        System.out.println("Thread Name : " + currentThread.getName());
    }
}
Output
Thread[main,5,main]
Thread Name : Set Thread Name Example

setPriority() and getPriority() Thread
import java.lang.*;

class ThreadDemo implements Runnable
{
    Thread t;
    ThreadDemo()
    {
        // thread created
        t = new Thread(this, "Admin Thread");
        // set thread priority
        t.setPriority(1);
        // print thread created
        System.out.println("thread  = " + t);
        // this will call run() function
        t.start();
    }

    public void run()
    {
        // returns this thread's priority.
        System.out.println("Thread priority = " + t.getPriority());
    }

    public static void main(String args[])
    {
        new ThreadDemo();
    }
}  
Output
thread  = Thread[Admin Thread,1,main]
Thread priority = 1

Thread Deadlock Example
class ThreadDeadLock
{
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String args[])
    {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        T1.start();
        T2.start();
    }

    private static class ThreadDemo1 extends Thread
    {
        public void run()
        {
            synchronized (Lock1)
            {
                System.out.println("Thread 1: Holding lock 1...");
                try
                {
                    Thread.sleep(10);
                }
                catch (InterruptedException e)
                {
                }

                System.out.println("Thread 1: Waiting for lock 2...");
                synchronized (Lock2)
                {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread
    {
        public void run()
        {
            synchronized (Lock2)
            {
                System.out.println("Thread 2: Holding lock 2...");
                try
                {
                    Thread.sleep(10);
                }
                catch (InterruptedException e)
                {
                }

                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (Lock1)
                {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }
}
Output
Thread 2: Holding lock 2...
Thread 1: Holding lock 1...
Thread 1: Waiting for lock 2...
Thread 2: Waiting for lock 1...

Multiplication Table Using Thread
public class Multiplicatin_Table implements Runnable{
	
	private int number;
	
	public Multiplicatin_Table(int number) {
		
		this.number=number;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		  for (int i = 1; i <= 10; i++) {
	            System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(),
	                                                                 number, i, i * number);
	        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("I will print table of 1 to 5 ");
		 for (int i = 1; i <= 5; i++) {
			    Multiplicatin_Table mul = new Multiplicatin_Table(i);
	            Thread thread = new Thread(mul);
	            thread.start();
	        }
	}

}
Output
I will print table of 1 to 5 
Thread-0: 1 * 1 = 1
Thread-4: 5 * 1 = 5
Thread-3: 4 * 1 = 4
Thread-2: 3 * 1 = 3
Thread-1: 2 * 1 = 2
Thread-2: 3 * 2 = 6
Thread-2: 3 * 3 = 9
Thread-2: 3 * 4 = 12
Thread-2: 3 * 5 = 15
Thread-2: 3 * 6 = 18
Thread-2: 3 * 7 = 21
Thread-2: 3 * 8 = 24
Thread-2: 3 * 9 = 27
Thread-2: 3 * 10 = 30
Thread-3: 4 * 2 = 8
Thread-3: 4 * 3 = 12
Thread-3: 4 * 4 = 16
Thread-3: 4 * 5 = 20

loop
For-each / Enhanced For Loop
class ForEachExample
{
    public static void main(String args[])
    {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6};

        for (int a : intArray)
        {
            System.out.print(a + " ");
        }
    }
} 
Output
1 2 3 4 5 6

Break Example
//The break keyword is used to stop the entire loop. 
//The break keyword must be used inside any loop or 
//a switch statement.

//The break keyword will stop the execution of the 
//innermost loop and start executing the next line of 
//code after the block.

class BreakExample
{
    public static void main(String args[])
    {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers)
        {
            if (x == 30)
            {
                break;//control comes out of loop
            }

            System.out.print(x);
            System.out.print("\n");
        }
    }
}
Output
10
20

Continue Example
//The continue keyword can be used in any of 
//the loop control structures. It causes the 
//loop to immediately jump to the next iteration 
//of the loop.

//In a for loop, the continue keyword causes 
//flow of control to immediately jump to the 
//update statement.

//In a while loop or do/while loop, flow of 
//control immediately jumps to the Boolean 
//expression.

class ContinueExample
{
    public static void main(String args[])
    {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers)
        {
            if (x == 30)
            {
                continue;
            }

            System.out.print(x);
            System.out.print("\n");
        }
    }
}
Output
10
20
40
50

Do-While Loop

class DoWhileLoop
{
    public static void main(String args[])
    {
        int x = 1;

        do
        {
            System.out.println("value of x : " + x);
            x++;
        }
        while (x < 10);
    }
}
Output
value of x : 1
value of x : 2
value of x : 3
value of x : 4
value of x : 5
value of x : 6
value of x : 7
value of x : 8
value of x : 9

For Loop
class ForLoop
{
    public static void main(String args[])
    {
        for (int i = 1; i < 10; i++)
        {
            System.out.println("value of i : " + i);
        }
    }
}
Output
value of i : 1
value of i : 2
value of i : 3
value of i : 4
value of i : 5
value of i : 6
value of i : 7
value of i : 8
value of i : 9

While Loop
class WhileLoop
{
    public static void main(String args[])
    {
        int x = 1;

        while (x < 10)
        {
            System.out.println("value of x : " + x);
            x++;
        }
    }
}
Output
value of x : 1
value of x : 2
value of x : 3
value of x : 4
value of x : 5
value of x : 6
value of x : 7
value of x : 8
value of x : 9

Basic
Hello World
class HelloWorld
{
    public static void main(String args[])
    {
        System.out.println("Hello World!!");
    }
} 
Output
Hello World!!

Switch Statement
class SwitchCaseDemo
{
    public static void main(String args[])
    {
        char grade = 'C';

        switch (grade)
        {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
Output
Well done
Your grade is C

If Else
class IfElseDemo
{
    public static void main(String args[])
    {
        int x = 30;

        if (x == 10)
        {
            System.out.print("Value of X is 10");
        }
        else if (x == 20)
        {
            System.out.print("Value of X is 20");
        }
        else if (x == 30)
        {
            System.out.print("Value of X is 30");
        }
        else
        {
            System.out.print("This is else statement");
        }
    }
}
Output
Value of X is 30

Add Two Numbers
import java.util.Scanner;

class AddNumbers
{
    public static void main(String args[])
    {
        int x, y, z;
        System.out.print("Enter two integers to calculate their sum : ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum of entered integers = " + z);
    }
}
Output
Enter two integers to calculate their sum : 5 6
Sum of entered integers = 11

Command Line Argument
class CommandLineArgs 

{
    public static void main(String args[]) 
    {
        int a, b, c;
        
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        if (a > b && a > c) {
            System.out.println("Largest Number is : " + a);
        } else if (b > c) {
            System.out.println("Largest Number is : " + b);
        } else {
            System.out.println("Largest Number is : " + c);
        }
    }
}
Output

java LargestNumber 2 5 7
Largest Number is : 7

BufferedReader Example
import java.io.*;

class BufferedReaderExample
{
    public static void main(String[] args) throws Exception
    {
        String str;
        int i;
        float f;
        double d;
        long l;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String");
        str = br.readLine();

        System.out.println("Enter Integer");
        i = Integer.parseInt(br.readLine());

        System.out.println("Enter float");
        f = Float.parseFloat(br.readLine());

        System.out.println("Enter double");
        d = Double.parseDouble(br.readLine());

        System.out.println("String : " + str);
        System.out.println("Integer : " + i);
        System.out.println("Float : " + f);
        System.out.println("Double : " + d);
    }
}
Output

Enter String
4
Enter Integer
4
Enter float
23.5
Enter double
22.4421312
String : 4
Integer : 4
Float : 23.5
Double : 22.4421312



File Handling
Read Binary File
import java.io.*;

class ReadBinaryFile
{
    public static void main(String[] args)
    {
        // The name of the file to open.
        String fileName = "file.txt";

        FileInputStream inputStream = null;

        try
        {
            // Use this for reading the data.
            byte[] buffer = new byte[1000];

            inputStream = new FileInputStream(fileName);

            // read fills buffer with data and returns
            // the number of bytes read (which of course
            // may be less than the buffer size, but
            // it will never be more).
            int total = 0;
            int nRead = 0;

            while ((nRead = inputStream.read(buffer)) != -1)
            {
                // Convert to String so we can display it.
                // Of course you wouldn't want to do this with
                // a 'real' binary file.
                System.out.println(new String(buffer));
                total += nRead;
            }

            System.out.println("Read " + total + " bytes");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch (IOException ex)
        {
            System.out.println("Error reading file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        finally
        {
            // Always close files.
            try
            {
                if (inputStream != null)
                {
                    inputStream.close();
                }
            }
            catch (IOException e)
            {
            }
        }
    }
}
Output
Hello there, here is some text.
We are writing the text to the file.
Read 69 bytes

Read File
import java.io.*;

class ReadFile
{
    public static void main(String[] args)
    {
        // The name of the file to open.
        String fileName = "file.txt";

        // This will reference one line at a time
        String line = null;

        BufferedReader bufferedReader = null;

        try
        {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch (IOException ex)
        {
            System.out.println("Error reading file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        finally
        {
            // Always close files.
            try
            {
                if (bufferedReader != null)
                {
                    bufferedReader.close();
                }
            }
            catch (IOException e)
            {
            }
        }
    }
}
Output
Hello there, here is some text.
We are writing the text to the file.

Write Binary File
import java.io.*;

class WriteBinaryFile
{
    public static void main(String[] args)
    {
        // The name of the file to open.
        String fileName = "file.txt";

        BufferedWriter bufferedWriter = null;

        try
        {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");

            // Always close files.
            bufferedWriter.close();
        }
        catch (IOException ex)
        {
            System.out.println("Error writing to file '" + fileName + "'");

            // Or we could just do this:
            // ex.printStackTrace();
        }
        finally
        {
            // Always close files.
            try
            {
                if (bufferedWriter != null)
                {
                    bufferedWriter.close();
                }
            }
            catch (IOException e)
            {
                
            }
        }
    }
}
Output
D:\FreeITProjects.org>java WriteFile
[The file named "file.txt" is created with the given text]

Write File
import java.io.*;

class WriteFile
{
    public static void main(String[] args)
    {
        // The name of the file to open.
        String fileName = "file.txt";

        BufferedWriter bufferedWriter = null;

        try
        {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");
        }
        catch (IOException ex)
        {
            System.out.println("Error writing to file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        finally
        {
            // Always close files.
            try
            {
                if (bufferedWriter != null)
                {
                    bufferedWriter.close();
                }
            }
            catch (IOException e)
            {
                
            }
        }
    }
}
Output
D:\FreeITProjects.org>java WriteFile
[The file named "file.txt" is created with the given text]

Serialization Example
import java.io.*;

class Employee implements java.io.Serializable
{
    public String name;
    public String address;
    // transient variable are not serialized
    public transient int id;
    public int number;
}

class SerializeDemo
{
    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.name = "Andy Rubin";
        e.address = "Chappaqua, New York, United States";
        e.id = 007;
        e.number = 5893254;
        try
        {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /employee.ser");
        }
        catch (IOException i)
        {
            i.printStackTrace();
        }
    }
}
Output
Serialized data is saved in /employee.ser

Copy File using Byte Stream
import java.io.*;

class CopyFile
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;

        try
        {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1)
            {
                out.write(c);
            }
        }
        finally
        {
            if (in != null)
            {
                in.close();
            }
            if (out != null)
            {
                out.close();
            }
        }
    }
}
Output
file : input.txt
Welcome to Programming Hub

file : output.txt
Welcome to Programming Hub

Copy File using Character Stream
import java.io.*;

class CopyFile
{
    public static void main(String args[]) throws IOException
    {
        FileReader in = null;
        FileWriter out = null;

        try
        {
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c;
            while ((c = in.read()) != -1)
            {
                out.write(c);
            }
        }
        finally
        {
            if (in != null)
            {
                in.close();
            }
            if (out != null)
            {
                out.close();
            }
        }
    }
}
Output
file : input.txt
Welcome to Programming Hub

file : output.txt
Welcome to Programming Hub

Create a file
Code
Run
import java.io.*;

class CreateFileTest
{
    public static void main(String args[])
    {
        try
        {
            if (new File("output.txt").createNewFile())
                System.out.println("Successfully created File.");

            else
                System.out.println("Failed to create file.");
        }
        catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
Output
Successfully created File.

Create a directory
import java.io.*;

class CreateDirectoryTest
{
    public static void main(String args[])
    {
        if (new File("docs").mkdir())
            System.out.println("Successfully created directory.");
        else
            System.out.println("Failed to create directory.");
    }
}
Output
Successfully created directory.

Delete a file
import java.io.File;

class FileDeleteTest
{
    public static boolean deleteFile(String filename)
    {
        boolean exists = new File(filename).delete();
        return exists;
    }

    public static void test(String type, String filename)
    {
        System.out.println("The following " + type + " called " + filename + (deleteFile(filename) ? " was deleted." : " does not exist."));
    }

    public static void main(String args[])
    {
        test("file", "Main.java");
    }
}
Output
The following file called output.txt was deleted

Delete a directory
import java.io.File;
public class DirectoryDeleteTest
{
	public static boolean deleteFile(String filename) 
	{
		boolean exists = new File(filename).delete();
		return exists;
	}
	
	public static void test(String type, String filename) 
	{
           System.out.println("The following "+type+
	   " called "+filename+(deleteFile(filename)?
	   " was deleted." : " does not exist."));
	}
	
	public static void main(String args[])
	{
		test("directory", File.seperator + "docs" + File.seperator); 
        }
}
Output
The following directory called docs was deleted.

Miscellaneous
Scanner Class Example(User Input)
//Scanner Class is used to get input from user

import java.util.Scanner;

class ScannerClassExample
{
    public static void main(String args[])
    {
        int intNum;
        long longNum;
        float floatNum;
        double doubleNum;
        String line;
        String str;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter line  ");
        line = in.nextLine();
        System.out.print("Enter string  ");
        str = in.next();
        System.out.print("Enter integer ");
        intNum = in.nextInt();
        System.out.print("Enter long ");
        longNum = in.nextLong();
        System.out.print("Enter float ");
        floatNum = in.nextFloat();
        System.out.print("Enter double ");
        doubleNum = in.nextDouble();

        System.out.println("\nEntered details are as follows: ");

        System.out.println("Line: " + line);
        System.out.println("String: " + str);
        System.out.println("Integer: " + intNum);
        System.out.println("Long: " + longNum);
        System.out.println("Float: " + floatNum);
        System.out.println("Double: " + doubleNum);
    }
} 
Output

Enter line  This is a line
Enter string  hello
Enter integer 23
Enter long 324234
Enter float 322.23
Enter double 42342.222

Entered details are as follows:
Line: This is a line
String: hello
Integer: 23
Long: 324234
Float: 322.23
Double: 42342.222

Test Static Keyword
class TestStatic
{
    static class InnerClass
    {
        public static void InnerMethod()
        {
            System.out.println("Static Inner Class!");
        }
    }

    public static void main(String args[])
    {
        TestStatic.InnerClass.InnerMethod();
    }
}
Output
Static Inner Class!

Print Alphabets
class Alphabets
{
    public static void main(String args[])
    {
        char c = 'A';

        do
        {
            System.out.println(c);
            c++;
        }
        while (c <= 'Z');
    }
}
Output
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S

Stack Operation using Stack Class
import java.util.*;

class StackDemo
{
    static void showpush(Stack st, int a)
    {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack st)
    {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String args[])
    {
        Stack st = new Stack();
        System.out.println("stack: " + st);

        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);

        try
        {
            showpop(st);
        }
        catch (EmptyStackException e)
        {
            System.out.println("empty stack");
        }
    }
}
Output
stack: []
push(42)
stack: [42]
push(66)
stack: [42, 66]
push(99)
stack: [42, 66, 99]
pop -> 99
stack: [42, 66]
pop -> 66
stack: [42]
pop -> 42
stack: []
pop -> empty stack

Zodiac Signs
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.text.DateFormat;

class ZodiacSigns
{
    public static void main(String[] args)
    {
        System.out.println(df.format(calendar.getTime()));
        int day = 0;
        int month = 0;
        int year = 0;
        while (true)
        {
            // Read in a date
            System.out.print("Enter the year: ");
            year = readInt();
            while (true)
            {
                System.out.print("Enter the month number January is 1, December is 12: ");
                month = readInt();
                // Change month to zero-based and validate
                if (validMonth(--month))                                        
                    break;
            }

            while (true)
            {
                System.out.print("Enter the day in the month: ");
                day = readInt();
                if (validDay(day, month, year))
                    break;
            }

            // determine the sign
            calendar.set(year, month, day);
            // Match the year for the sign start dates
            for (int i = 0; i < signStartDates.length; ++i)
            {
                signStartDates[i].set(GregorianCalendar.YEAR, year);
            }

            for (int i = 0; i < signStartDates.length; ++i)
            {
                if (calendar.after(signStartDates[i]) && calendar.before(
                        signStartDates[(i + 1) % signStartDates.length]))
                {
                    System.out.println(df.format(calendar.getTime()) + " is in the sign of " + signs[i]);
                    break;
                }
            }

            // Try another date?
            System.out.println("Do you want to try another date(Enter Y or N)?");
            if (!yes())
            {
                break;
            }
        }
    }

    // Validate the month value
    private static boolean validMonth(int month)
    {
        if (month >= 0 && month <= 11)
            return true;
        else
            System.out.println("The month value must be from 1 to 12. Try again.");
        return false;
    }

    // Validate the day value for the month and year
    private static boolean validDay(int day, int month, int year)
    {
    /* A valid day must be:
                 - between 1 and 31
                 - less than 31 when the month is April, June, September, or November
                 - less than 29 when the month is February and it is not a leap year
                 - less than 30 when the month is February and it is a leap year
    */
        if (day < 0 || day > 31)
        {
            System.out.println("Day values must be between 1 and 31. Try again.");
            return false;
        }

        if (day > 30 && (month == 3 || month == 5 || month == 8 || month == 10))
        {
            System.out.println(
                    "Day values must be less than 31 when the month" + " is " + MONTH_NAMES[month] + ". Try again.");
            return false;
        }

        if (day > 28 && month == 1 && !calendar.isLeapYear(year))
        {
            System.out.println(year + " is not a leap year so day values must be less than 29. Try again.");
            return false;
        }

        if (day > 29 && month == 1 && calendar.isLeapYear(year))
        {
            return false;
        }

        return true;

    }

    // Reads an integer from the keyboard
    private static int readInt()
    {
        int value = 0;
        while (true)
        {
            try
            {
                value = Integer.parseInt(in.readLine().trim());
                return value;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input. Try again.");
            }
            catch (IOException e)
            {
                System.out.println("Error reading for the keyboard." + e.getMessage());
            }
        }
    }

    private static boolean yes()
    {
        String str = null;
        while (true)
        {
            try
            {
                str = in.readLine().trim();
            }
            catch (IOException e)
            {
                System.out.println("Error reading for the keyboard." + e.getMessage());
            }

            if (str.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else if (str.equalsIgnoreCase("N"))
            {
                break;
            }
            else
            {
                System.out.print("Invalid input. Try again. Enter Y or N: ");
            }
        }
        return false;
    }
    
    // Keyboard input
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // Names for Zodiac signs and start dates. Remember - months start at zero.
    private static String[] signs = {"Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn"};
    private static GregorianCalendar[] signStartDates = {
            new GregorianCalendar(2002, 0, 20),    // Aquarius start date
            new GregorianCalendar(2002, 1, 19),    // Pisces start date
            new GregorianCalendar(2002, 2, 21),    // Aries start date
            new GregorianCalendar(2002, 3, 20),    // Taurus start date
            new GregorianCalendar(2002, 4, 21),    // Gemini start date
            new GregorianCalendar(2002, 5, 21),    // Cancer start date
            new GregorianCalendar(2002, 6, 23),    // Leo start date
            new GregorianCalendar(2002, 7, 23),    // Virgo start date
            new GregorianCalendar(2002, 8, 23),    // Libra start date
            new GregorianCalendar(2002, 9, 23),    // Scorpio start date
            new GregorianCalendar(2002, 10, 22),   // Sagittarius start date
            new GregorianCalendar(2002, 11, 22),   // Capricorn start date
    };
    private static GregorianCalendar calendar = new GregorianCalendar();

    private static final String[] MONTH_NAMES = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    // Date formatter for displaying dates
    private static DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

}
Output
8 September, 2014
Enter the year: 1993
Enter the month number January is 1, December is 12: 10
Enter the day in the month: 21
21 October, 1993 is in the sign of Libra
Do you want to try another date(Enter Y or N)?
n

BigInteger Example
import java.math.*;
import java.io.*;

class BigIntegerDemo
{
    public static int f = 0;
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number to find its factorial : ");
        f = Integer.parseInt(br.readLine());
        BigInteger fact = fact(f);

        System.out.println("fact("+f+") = " + fact);
        System.out.println("fact("+f+").longValue() = " + fact.longValue());
        System.out.println("fact("+f+").intValue() = " + fact.intValue());

        int powerOfTwoCount = 0;

        BigInteger two = BigInteger.valueOf(2);

        while (fact.compareTo(BigInteger.ZERO) > 0 && fact.mod(two).equals(BigInteger.ZERO))
        {
            powerOfTwoCount++;
            fact = fact.divide(two);
        }
        
        System.out.println("fact("+f+") powers of two = " + powerOfTwoCount);
    }

    private static BigInteger fact(long n)
    {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
Output
Enter any number to find its factorial : 100
fact(100) = 93326215443944152681699238856266700490715968264381621468592963895217
59999322991560894146397615651828625369792082722375825118521091686400000000000000
0000000000
fact(100).longValue() = 0
fact(100).intValue() = 0
fact(100) powers of two = 97

Command Line Example
class CommandLineExample
{
    // arugments entered in command line are 
    // passed in main(String args[]) method
    public static final void main(String args[])
    {
        for (int i = 0; i < args.length; i++)
        {
            System.out.println("args[" + i + "] -> " + args[i]);
        }
    }
}
Output
E:freeitjava>java CommandLineExample Java Programming Hub Tutorial
args[0] -> Java
args[1] -> Programming
args[2] -> Hub
args[3] -> Tutorial

Binary Addition
import java.io.*;

class BinaryAddition
{
    public static void main(String s[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter number1: ");
        int num1 = Integer.parseInt(br.readLine());
        int num4 = num1;

        System.out.print("\nEnter number2: ");
        int num2 = Integer.parseInt(br.readLine());
        int num5 = num2;

        int k = 1;
        int dec1 = 0, dec2 = 0;

        while (num1 != 0)
        {
            dec1 = dec1 + (num1 % 10) * k;
            k = k * 2;
            num1 = num1 / 10;
        }

        k = 1;
        while (num2 != 0)
        {
            dec2 = dec2 + (num2 % 10) * k;
            k = k * 2;
            num2 = num2 / 10;
        }

        int num3 = dec1 + dec2;
        String str1 = Integer.toBinaryString(num3);

        System.out.print("\nAddition of " + num4 + " + " + num5 + " = " + str1);

        System.out.println();
    }
}
Output

Enter number1: 101

Enter number2: 110

Addition of 101 + 110 = 1011

Email Validation
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

class EmailValidation
{

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter email id : ");
        String email = br.readLine();
        boolean result = isValidEmail(email);
        if (result)
        {
            System.out.print(email + " is valid email address.");
        }
        else
        {
            System.out.print(email + " is not a valid email address.");
        }


    }
    public static boolean isValidEmail(String email)
    {
        String s = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern emailPattern = Pattern.compile(s);
        Matcher m = emailPattern.matcher(email);
        return m.matches();
    }
}
Output
Enter email id : request@creativecub.com
request@creativecub.com is valid email

Format time in 24 hour Format
import java.text.SimpleDateFormat;
import java.util.Date;

class Main
{
    public static void main(String[] args)
    {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("h");
        System.out.println("hour in h format : " + sdf.format(date));

    }
}
Output
hour in h format : 8


Leap Year
import java.io.*;

class LeapYear
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter year : ");
        //year we want to check
        int year = Integer.parseInt(br.readLine());

        //if year is divisible by 4, it is a leap year

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Year " + year + " is a leap year");
        else
            System.out.println("Year " + year + " is not a leap year");
    }
}
Output
Enter year : 2016
Year 2016 is a leap year

Call by Value Call by Reference
class Number
{
    int x;
}

class CallByValue
{
    public static void main(String[] args)
    {
        int y = 4;
        //call by value
        increase(y);
        //call by reference	
        Number n = new Number();
        n.x = 3;
        System.out.println("Value of x before  increment  " + n.x);
        increment(n);
        System.out.println("Value of x after  increment " + n.x);
    }

    private static void increase(int y)
    {
        System.out.println("pass by value and increment result : " + y++);
    }

    public static void increment(Number n)
    {
        n.x = n.x + 1;
    }
} 
Output
pass by value and increment result : 4
Value of x before  increment  3
Value of x after  increment 4

Instance Of
class Animal
{
}

//Dog inherits Animal  
class Dog1 extends Animal
{
    public static void main(String args[])
    {
        Dog1 d = new Dog1();

        System.out.println("d is instanceof Animal: ");

        System.out.println(d instanceof Animal);//true  
    }
}
Output
d is instanceof Animal: 
true

FizzBuzz Program
class FizzBuzz
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 15 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(String.valueOf(i));
            }
        }
    }
}
Output
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17

Print Date and Time
import java.util.*;

class PrintCurrentDateandTime
{
    public static void main(String args[])
    {
        int day, month, year;
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println("Current date is  " + day + "/" + (month + 1) + "/" + year);
        System.out.println("Current time is  " + hour + " : " + minute + " : " + second);
    }
}
Output

Current date is  18/11/2015
Current time is  10 : 54 : 9

User Validation
import java.io.*;

class Validation
{
    public static void main(String args[]) throws Exception
    {
        String username, password;
        String user1, pass1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Login Details");

        System.out.println("Enter username");
        username = br.readLine();

        System.out.println("Enter password");
        password = br.readLine();

        System.out.println("Enter details for validation");
        System.out.println();

        System.out.println("Enter username");
        user1 = br.readLine();

        System.out.println("Enter password");
        pass1 = br.readLine();

        if (user1.equals(username) && pass1.equals(password))
        {
            System.out.println("You are a valid user");
        }
        else
        {
            System.out.println("You are not a valid user");
        }
    }
}
Output

Enter Login Details
Enter username
SuperSaiyan 
Enter password
DragonBall
Enter details for validation

Enter username
Supersaiyan 
Enter password
DragonBall
You are not a valid user

Counter using Static Variable
class StaticExample
{
    static int st = 0;
    int ns = 0;

    StaticExample()
    {
        ns++;
        System.out.println(ns);
    }

    public static void main(String args[])
    {
        //Non-Static variables requires object to get accessed in Static method
        System.out.println("Counter with non-static variable:");

        StaticExample s = new StaticExample();
        StaticExample s1 = new StaticExample();
        StaticExample s2 = new StaticExample();

        //Static variables can be accessed without reference(object) in Static method
        System.out.println("\nCounter with static variable:");

        for (int i = 0; i < 3; i++)
        {
            st++;
            System.out.println(st);

        }
    }
}
Output

Counter with non-static variable:
1
1
1

Counter with static variable:
1
2
3

Count Vowels Consonents Blanks and numbers
import java.io.*;

class VowelsConsonants
{
    public static void main(String[] args) throws Exception
    {
        String str;
        int vowels = 0, num = 0, blanks = 0, cons = 0;
        char ch;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a String : ");
        str = br.readLine();

        for (int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);

            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                vowels++;
            else if (Character.isDigit(ch))
                num++;
            else if (Character.isWhitespace(ch))
                blanks++;
            else
            {
                cons++;
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Numbers : " + num);
        System.out.println("Blanks : " + blanks);
        System.out.println("Consonants : " + cons);
    }
}
 
Output

Enter a String : 2 quick brown foxes jumped upon 4 lazy dogs
Vowels : 11
num : 2
Blanks : 8
Consonants : 22

Currency Converter
import java.util.*;
import java.text.DecimalFormat;

class CurrencyConverter
{
    public static void main(String[] args)
    {
        double rupee, dollar, pound, code, euro, yen;
        DecimalFormat f = new DecimalFormat("##.###");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the currency code 1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Yen");
        code = sc.nextInt();

        //For Rupees Conversion
        if (code == 1)
        {
            System.out.println("Enter amount in rupees");
            rupee = sc.nextFloat();

            dollar = rupee / 66;
            System.out.println("Dollar : " + f.format(dollar));

            pound = rupee / 98;
            System.out.println("Pound : " + f.format(pound));

            euro = rupee / 72;
            System.out.println("Euro : " + f.format(euro));

            yen = rupee / 0.55;
            System.out.println("Yen : " + f.format(yen));
        }

        //For Dollar Conversion
        else if (code == 2)
        {
            System.out.println("Enter amount in dollar");
            dollar = sc.nextFloat();

            rupee = dollar * 66;
            System.out.println("Rupees : " + f.format(rupee));

            pound = dollar * 0.67;
            System.out.println("Pound : " + f.format(pound));

            euro = dollar * 0.92;
            System.out.println("Euro : " + f.format(euro));

            yen = dollar * 120.90;
            System.out.println("Yen : " + f.format(yen));
        }

        //For Pound Conversion
        else if (code == 3)
        {
            System.out.println("Enter amount in Pound");
            pound = sc.nextFloat();

            rupee = pound * 98;
            System.out.println("Rupees : " + f.format(rupee));

            dollar = pound * 1.49;
            System.out.println("Dollar : " + f.format(dollar));

            euro = pound * 1.36;
            System.out.println("Euro : " + f.format(euro));

            yen = pound * 179.89;
            System.out.println("Yen : " + f.format(yen));
        }

        //For Euro Conversion
        else if (code == 4)
        {
            System.out.println("Enter amount in Euro");
            euro = sc.nextFloat();

            rupee = euro * 72;
            System.out.println("Rupees : " + f.format(rupee));

            dollar = euro * 1.09;
            System.out.println("Dollar : " + f.format(dollar));

            pound = euro * 0.73;
            System.out.println("Pound : " + f.format(pound));

            yen = euro * 131.84;
            System.out.println("Yen : " + f.format(yen));
        }

        //For Yen Conversion
        else if (code == 5)
        {
            System.out.println("Enter amount in Yen");
            yen = sc.nextFloat();

            rupee = yen * 0.55;
            System.out.println("Rupees : " + f.format(rupee));

            dollar = yen * 0.01;
            System.out.println("Dollar : " + f.format(dollar));

            pound = yen * 0.01;
            System.out.println("Pound : " + f.format(pound));

            euro = yen * 0.01;
            System.out.println("Euro : " + f.format(euro));
        }

        else
            System.out.println("Invalid Code");
    }

}
Output

Enter the currency code 1:Rupees
2:Dollar
3:Pound
4:Euro
5:Yen
1
Enter amount in rupees
100
Dollar : 1.515
Pound : 1.02
Euro : 1.389
Yen : 181.818

Largest among two numbers
import java.util.*;

class LargestNumber
{
    public static void main(String args[])
    {
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 >= num2)
        {
            System.out.println("\nLargest Number is : " + num1);
        }

        else
        {
            System.out.println("\nLargest Number is : " + num2);
        }
    }
}
Output

Enter two numbers : 3
5

Largest Number is : 5

Bike Rent system example
class Bike
{
    String name;
    int cc, model, days, r;

    Bike(String name, int cc, int model, int days)
    {
        this.name = name;
        this.cc = cc;
        this.model = model;
        this.days = days;
    }

    public void rent()
    {
        if (name == "abc" && cc == 100 && model == 1)
        {
            if (days == 1)
            {
                r = 500;
                System.out.println(r);
            }
            else if (days == 2)
            {
                r = 400;
                System.out.println(r);
            }
            else if (days >= 3)
            {
                r = 350;
                System.out.println(r);
            }
        }

        else if (name == "xyz" && cc == 125 && model == 2)
        {
            if (days == 1)
            {
                r = 600;
                System.out.println(r);
            }
            else if (days == 2)
            {
                r = 500;
                System.out.println(r);
            }
            else if (days >= 3)
            {
                r = 500;
                System.out.println(r);
            }
        }

        else if (name == "pqr" && cc == 150 && model == 3)
        {
            if (days == 1)
            {
                r = 800;
                System.out.println(r);
            }
            else if (days == 2)
            {
                r = 700;
                System.out.println(r);
            }
            else if (days >= 3)
            {
                r = 850;
                System.out.println(r);
            }
        }
    }

    public static void main(String[] args)
    {
        Bike b = new Bike("pqr", 150, 3, 4);
        System.out.print("Rent is : ");
        b.rent();
    }
}
Output

Rent is : 850

Number Guessing Game
import java.util.*;
class GuessGame 
{
    public static void main(String[] args) 
    {
        Random r = new Random();
        int numberoftries = 0;
        int numbertoguess = r.nextInt(50);
        boolean f = false;
        int guess;
        
        Scanner sc = new Scanner(System.in);
        
        try
        {
            while(f == false)
            {
                System.out.println("Guess number between 1-50");
                guess = sc.nextInt();
                numberoftries++;
                if(guess > 1 && guess < 50)
                {
                    if(guess == numbertoguess)
                    {
                        f = true;
                    }
                    else if(guess > numbertoguess)
                    {
                        System.out.println("Guess is too high");
                    }
                    else if(guess < numbertoguess)
                    {
                        System.out.println("Guess is too low");
                    }
                }
                else
                {
                    throw new Exception();
                }
            }
        
            System.out.println("\nYou win");
            System.out.println("Number was : "+numbertoguess);
            System.out.println("Number of tries : "+numberoftries);
        }
         catch(Exception e)
        {
            System.out.println("Number is either numeric or out of range(1-50)");
        }
    } 
}
Output

Guess number between 1-50
10
Guess is too low
Guess number between 1-50
20
Guess is too high
Guess number between 1-50
18
Guess is too high
Guess number between 1-50
15

You win
Number was : 15
Number of tries : 4

MarkSheet
import java.util.*;

class Marksheet
{
    public static void main(String[] args)
    {
        int marks;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks");
        marks = sc.nextInt();

        if (marks >= 75 && marks <= 100)
        {
            System.out.println("Your grade is A");
        }

        else if (marks >= 60 && marks < 75)
        {
            System.out.println("Your grade is B");
        }

        else if (marks >= 50 && marks < 60)
        {
            System.out.println("Your grade is C");
        }

        else if (marks >= 40 && marks < 50)
        {
            System.out.println("Your grade is D");
        }

        else if (marks < 40)
        {
            System.out.println("Your grade is Fail");
        }
    }
}
Output

Enter your marks
67
Your grade is B

Square Root without Inbuilt Function
import java.util.*;

class SquareRootWithoutInbuiltFunction
{
    public static void main(String args[])
    {
        int number;
        double t, squareroot;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        number = sc.nextInt();

        //Logic to find square root of a number without sqrt function
        squareroot = number / 2;

        do
        {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        }
        while ((t - squareroot) != 0);

        System.out.println("Square Root of a Number is : " + squareroot);
    }
}
Output

Enter a Number
9
Square Root of a Number is

Remove Zero from given number
import java.util.*;

class RemoveZero
{
    public static void main(String args[])
    {
        int a, x, b;
        char z;
        String n, k = "", str;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        str = sc.next();

        x = str.length();

        for (int i = 0; i < x; i++)
        {
            z = str.charAt(i);

            if (z == '0')
            {
            }
            else
                k += z;
        }

        System.out.println("Numbers without zero : " + k);
    }
}
Output

Enter a number
32010203012202020022022222321222112
Numbers without zero : 32123122222222222321222112

Date format
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Dates
{
    public static void main(final String[] args)
    {
        Calendar now = new GregorianCalendar(); //months are 0 indexed, dates are 1 indexed
        DateFormatSymbols symbols = new DateFormatSymbols(); //names for our months and weekdays

        //plain numbers way
        System.out.println(now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE));

        //words way
        System.out.print(symbols.getWeekdays()[now.get(Calendar.DAY_OF_WEEK)] + ", ");
        System.out.print(symbols.getMonths()[now.get(Calendar.MONTH)] + " ");
        System.out.println(now.get(Calendar.DATE) + ", " + now.get(Calendar.YEAR));

        //using DateFormat
        Date date = new Date();
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format1.format(date));
        DateFormat format2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(format2.format(date));
    }
}
Output
2016-3-15
Tuesday, March 15, 2016
2016-03-15
Tuesday, March 15, 2016

Keyboard macros
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormatSymbols;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Dates
{
    public static void main(final String[] args)
    {
        Calendar now = new GregorianCalendar(); //months are 0 indexed, dates are 1 indexed
        DateFormatSymbols symbols = new DateFormatSymbols(); //names for our months and weekdays

        //plain numbers way
        System.out.println(now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE));

        //words way
        System.out.print(symbols.getWeekdays()[now.get(Calendar.DAY_OF_WEEK)] + ", ");
        System.out.print(symbols.getMonths()[now.get(Calendar.MONTH)] + " ");
        System.out.println(now.get(Calendar.DATE) + ", " + now.get(Calendar.YEAR));

        //using DateFormat
        Date date = new Date();
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format1.format(date));
        DateFormat format2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(format2.format(date));
    }
}
Output
2016-3-15
Tuesday, March 15, 2016
2016-03-15
Tuesday, March 15, 2016

Calendar
import java.util.*;
import java.text.*;
class CalendarTask
{
    public static void main(String args[]) throws Exception
    {
        printCalendar(2016, 2);
    }

    static void printCalendar(int year, int nCols)
    {
        if (nCols < 1 || nCols > 12)
            throw new IllegalArgumentException("Illegal column width.");

        Calendar date = new GregorianCalendar(year, 0, 1);

        int nRows = (int) Math.ceil(12.0 / nCols);
        int offs = date.get(Calendar.DAY_OF_WEEK) - 1;
        int w = nCols * 24;

        String[] monthNames = new DateFormatSymbols(Locale.US).getMonths();

        String[][] mons = new String[12][8];
        for (int m = 0; m < 12; m++)
        {
            String name = monthNames[m];
            int len = 11 + name.length() / 2;
            String format = MessageFormat.format("%{0}s%{1}s", len, 21 - len);

            mons[m][0] = String.format(format, name, "");
            mons[m][1] = " Su Mo Tu We Th Fr Sa";
            int dim = date.getActualMaximum(Calendar.DAY_OF_MONTH);

            for (int d = 1; d < 43; d++)
            {
                boolean isDay = d > offs && d <= offs + dim;
                String entry = isDay ? String.format(" %2s", d - offs) : "   ";
                if (d % 7 == 1)
                    mons[m][2 + (d - 1) / 7] = entry;

                else
                    mons[m][2 + (d - 1) / 7] += entry;
            }

            offs = (offs + dim) % 7;
            date.add(Calendar.MONTH, 1);
        }

        System.out.printf("%" + (w / 2 + 10) + "s%n", "[Snoopy Picture]");
        System.out.printf("%" + (w / 2 + 4) + "s%n%n", year);

        for (int r = 0; r < nRows; r++)
        {
            for (int i = 0; i < 8; i++)
            {
                for (int c = r * nCols; c < (r + 1) * nCols && c < 12; c++)
                {
                    System.out.printf("   %s", mons[c][i]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

Pendulum
import java.awt.*;

import javax.swing.*;

class Pendulum extends JPanel implements Runnable
{
    private double angle = Math.PI / 2;
    private int length;

    public Pendulum(int length)
    {
        this.length = length;

        setDoubleBuffered(true);
    }

    @Override

    public void paint(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);

        int anchorX = getWidth() / 2, anchorY = getHeight() / 4;

        int ballX = anchorX + (int) (Math.sin(angle) * length);
        int ballY = anchorY + (int) (Math.cos(angle) * length);

        g.drawLine(anchorX, anchorY, ballX, ballY);

        g.fillOval(anchorX - 3, anchorY - 4, 7, 7);

        g.fillOval(ballX - 7, ballY - 7, 14, 14);
    }


    public void run()
    {
        double angleAccel, angleVelocity = 0, dt = 0.1;

        while (true)
        {
            angleAccel = -9.81 / length * Math.sin(angle);

            angleVelocity += angleAccel * dt;

            angle += angleVelocity * dt;

            repaint();

            try
            {
                Thread.sleep(15);
            }
            catch (InterruptedException ex)
            {
            }
        }
    }

    @Override

    public Dimension getPreferredSize()
    {
        return new Dimension(2 * length + 50, length / 2 * 3);
    }

    public static void main(String[] args)
    {
        JFrame f = new JFrame("Pendulum");

        Pendulum p = new Pendulum(200);

        f.add(p);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.pack();

        f.setVisible(true);

        new Thread(p).start();
    }
}

Balanced brackets
class Brackets
{
    public static boolean checkBrackets(String str)
    {
        int mismatchedBrackets = 0;

        for (char ch : str.toCharArray())
        {
            if (ch == '[')
            {
                mismatchedBrackets++;
            }
            else if (ch == ']')
            {
                mismatchedBrackets--;
            }
            else
            {
                return false; //non-bracket chars
            }

            if (mismatchedBrackets < 0)
            {
                //close bracket before open bracket

                return false;
            }
        }

        return mismatchedBrackets == 0;
    }

    public static String generate(int n)
    {
        if (n % 2 == 1)
        {
            //if n is odd we can't match brackets

            return null;
        }

        String ans = "";

        int openBracketsLeft = n / 2;
        int unclosed = 0;

        while (ans.length() < n)
        {
            if (Math.random() >= .5 && openBracketsLeft > 0 || unclosed == 0)
            {
                ans += '[';

                openBracketsLeft--;

                unclosed++;
            }
            else
            {
                ans += ']';

                unclosed--;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        String[] tests = {"", "[]", "][", "[][]", "][][", "[[][]]", "[]][[]"};

        for (int i = 0; i <= 16; i += 2)
        {
            String bracks = generate(i);

            System.out.println(bracks + ": " + checkBrackets(bracks));
        }

        for (String test : tests)
        {
            System.out.println(test + ": " + checkBrackets(test));
        }
    }
}
Output
: true
[]: true
[[]]: true
[][[]]: true
[][[[]]]: true
[][[[][]]]: true
[[]][][][[]]: true
[[]][][[[][]]]: true
[[][]][[]][[[]]]: true
: true
[]: true
][: false
[][]: true
][][: false
[[][]]: true
[]][[]: false

Boolean Wrapper Object
class MyBasicBoolean
{ 
    public static void main(String a[])
	{
        //create Boolean using boolean primitive type
        boolean b1 = true;

        Boolean bObj1 = new Boolean(b1);
        System.out.println("Wrapper class Boolean output: "+bObj1);

        //create Boolean using string value
        Boolean bObj2 = new Boolean("false");
        System.out.println("Wrapper class Boolean output: "+bObj2);

        //how to get primitive boolean value from wrapper class
        System.out.println(bObj1.booleanValue());
    }
}

String to Boolean Value
class MyStringToBoolean
{
    public static void main(String a[])
    {
        String strBool = "true";
        Boolean bool = Boolean.parseBoolean(strBool);
        System.out.println(bool);
    }
}

Primitive Boolean Constants
class MyBooleanConstants
{
    public static void main(String a[])
    {
        System.out.println("Boolean object corresponding to the primitive value :"
                                   + Boolean.FALSE);
        System.out.println("Boolean object corresponding to the primitive value :"
                                   + Boolean.TRUE);
    }
}

Math rint Method
class MyRintEx
{
    public static void main(String args[])
    {
        System.out.println("rint value of 13.345 is: " + Math.rint(13.345));
        System.out.println("rint value of 38.482 is: " + Math.rint(38.482));
        System.out.println("rint value of 46.65 is: " + Math.rint(46.65));
    }
}
Output
rint value of 13.345 is: 13.0
rint value of 38.482 is: 38.0
rint value of 46.65 is: 47.0

Display list of TimeZone with GMT
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

class TimeZoneExample
{
    public static void main(String[] args)
    {
        String[] ids = TimeZone.getAvailableIDs();
        for (String id : ids)
        {
            System.out.println(displayTimeZone(TimeZone.getTimeZone(id)));
        }

        System.out.println("\nTotal TimeZone ID " + ids.length);
    }

    private static String displayTimeZone(TimeZone tz)
    {
        long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
        long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset())
                - TimeUnit.HOURS.toMinutes(hours);
        // avoid -4:-30 issue
        minutes = Math.abs(minutes);

        String result = "";
        if (hours > 0)
        {
            result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());
        }
        else
        {
            result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());
        }

        return result;
    }
}



OOP
Abstract Example - Shape
abstract class Shape
{
    abstract void draw();
}

class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("Draw Rectangle");
    }
}

class Traingle extends Shape
{
    void draw()
    {
        System.out.println("Draw Traingle");
    }
}

class AbstractTest
{
    public static void main(String args[])
    {
        Shape s1 = new Rectangle();
        
        s1.draw();
        
        s1 = new Traingle();

        s1.draw();
    }
}
Output
Draw Rectangle
Draw Traingle

Constructor
class Student
{
    String student_name;

    public Student(String student_name)
    {
        this.student_name = student_name;
    }

    public String getName()
    {
        return student_name;
    }
}

class ConstructorTest
{
    public static void main(String args[])
    {
        Student t = new Student("John Doe");

        System.out.println(t.student_name);

        System.out.println(t.getName());
    }
}
Output
John Doe
John Doe

Inheritance Example
class Box
{
    double width;
    double height;
    double depth;

    Box()
    {
    }

    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    void getVolume()
    {

        System.out.println("Volume is : " + width * height * depth);
    }
}

class MatchBox extends Box
{
    double weight;

    MatchBox()
    {
    }

    MatchBox(double w, double h, double d, double m)
    {
        super(w, h, d);

        weight = m;
    }

    public static void main(String args[])
    {
        MatchBox mb1 = new MatchBox(10, 20, 30, 40);

        mb1.getVolume();

        System.out.println("width of MatchBox is " + mb1.width);
        System.out.println("height of MatchBox is " + mb1.height);
        System.out.println("depth of MatchBox is " + mb1.depth);
        System.out.println("weight of MatchBox is " + mb1.weight);
    }
}
Output
Volume is : 6000.0
width of MatchBox is 10.0
height of MatchBox is 20.0
depth of MatchBox is 30.0
weight of MatchBox is 40.0

Method Overloading
class MethodOverloading
{
    public void display(int number)
    {
        System.out.println("Integer value: " + number);
    }

    public void display(float number)
    {
        System.out.println("Float value: " + number);
    }

    public void display(char character)
    {
        System.out.println("Character value: " + character);
    }
}

class MethodOverloadingTest
{
    public static void main(String args[])
    {
        MethodOverloading ob = new MethodOverloading();

        ob.display(20);

        ob.display(0.33f);

        ob.display('z');
    }
}
Output
Integer value: 20
Float value: 0.33
Character value: z

Method Overriding
class A
{
    void display()
    {
        System.out.println("A");
    }
}

class B extends A
{
    void display()
    {
        System.out.println("B");
    }
}

class C extends A
{
    void display()
    {
        System.out.println("C");
    }
}

class MethodOverridingTest
{
    public static void main(String[] args)
    {
        A a = new A();
        B b = new B();
        C c = new C();

        a.display();
        b.display();
        c.display();
    }
}
Output
A
B
C

Class Example - Circle
//This is a simple example of a Class. 
//This program shows the structure of a class.

// class name
class Circle
{ 

    double radius = 2.3; // variables
    String color = "white";

    // methods
    double getRadius()
    {
        // method body

        return radius; //return statement
    }

    String getColor()
    {
        // method body

        return color; //return statement
    }
}
Output
[This program has no output]

Class Usage - CircleDemo
//This example shows how to create an object
//of a class and call its methods

class CircleDemo
{
    public static void main(String[] args)
    {
        //Creating an object 
        CircleTest c = new CircleTest();
        //accessing object method with dot(.) operator
        String color = c.getColor();
        //print color
        System.out.println(color);
    }
}

// class name
class CircleTest
{ 
    double radius = 2.3; // variables
    String color = "white color";

    // methods
    double getRadius()
    {
        // method body

        return radius; //return statement
    }

    String getColor()
    {
        // method body

        return color; //return statement
    }


}
Output
white color

Methods Example - BicycleDemo
//The following Bicycle class is one possible 
//implementation of a bicycle

//This class shows how to use methods in a class

class BicycleDemo
{
    public static void main(String[] args)
    {
        // Create two different
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}

class Bicycle
{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue)
    {
        cadence = newValue;
    }

    void changeGear(int newValue)
    {
        gear = newValue;
    }

    void speedUp(int increment)
    {
        speed = speed + increment;
    }

    void applyBrakes(int decrement)
    {
        speed = speed - decrement;
    }

    void printStates()
    {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}
Output
cadence:50 speed:10 gear:2
cadence:40 speed:20 gear:3

Abstract Example - Game
abstract class Games
{
    public abstract void start();

    public void stop()
    {
        System.out.println("Stopping game in abstract class");
    }
}

class GameA extends Games
{
    @Override
    public void start()
    {
        System.out.println("Starting Game A");
    }
}

class GameB extends Games
{
    @Override
    public void start()
    {
        System.out.println("Starting Game B");
    }
}

class AbstractExample
{
    public static void main(String[] args)
    {
        Games A = new GameA();
        Games B = new GameB();

        A.start();
        A.stop();

        B.start();
        B.stop();
    }
}
Output
Starting Game A
Stopping game in abstract class
Starting Game B
Stopping game in abstract class

Inheritance Example - Child
class Parent
{
    String name = "Class A";

    public String getName()
    {
        return name;
    }
}

class Child extends Parent
{
    String address = "Thane, Mumbai";

    public String getAddress()
    {
        return address;
    }

    public static void main(String[] args)
    {
        Child obj = new Child();
        System.out.println(obj.getName());
        System.out.println(obj.getAddress());
    }
}
Output
Class A
Thane, Mumbai

Encapsulation
class EncapsulationExample
{
    private String manufacturer;
    private String operating_system;
    public String model;
    private int cost;

    // Constructor to set properties/characteristics of object
    EncapsulationExample(String manufac, String operatSys, String mod, int cst)
    {
        this.manufacturer = manufac;
        this.operating_system = operatSys;
        this.model = mod;
        this.cost = cst;
    }

    // Method to get access Model property of Object
    public String getModel()
    {
        return this.model;
    }

    public String getManufacturer()
    {
        return this.manufacturer;
    }

    public int getcost()
    {
        return this.cost;
    }

    public String getOperatingSystem()
    {
        return this.operating_system;
    }

    public static void main(String[] args)
    {
        EncapsulationExample en = new EncapsulationExample("Microsoft",
                                                           "Windows", "2007", 500);
        System.out.println("Manufacturer: " + en.getManufacturer());
        System.out.println("OS: " + en.getOperatingSystem());
        System.out.println("Model: " + en.getModel());
        System.out.println("Cost: " + en.getcost());
    }
}
Output
Manufacturer: Microsoft
OS: Windows
Model: 2007
Cost: 500

Interface example - Multiple inheritance
//Java doesn't support Multiple Inheritance
//To achieve multiple inheritance Java has Interface

interface MyInterface
{
    public String hello = "Hello";

    public void sayHello();
}

interface MyOtherInterface
{
    public void sayGoodbye();
}

class MyInterfaceImpl implements MyInterface, MyOtherInterface
{

    public void sayHello()
    {
        System.out.println("Hello");
    }

    public void sayGoodbye()
    {
        System.out.println("Goodbye");
    }

    public static void main(String args[])
    {
        MyInterfaceImpl obj = new MyInterfaceImpl();
        obj.sayHello();
        obj.sayGoodbye();
    }
}
Output
Hello
Goodbye

Multilevel Inheritance Example
class Car
{
    public Car()
    {
        System.out.println("Class Car");
    }
    public void vehicleType()
    {
        System.out.println("Vehicle Type: Car");
    }
}

class Maruti extends Car
{
    public Maruti()
    {
        System.out.println("Class Maruti");
    }
    public void brand()
    {
        System.out.println("Brand: Maruti");
    }
    public void speed()
    {
        System.out.println("Max: 90Kmph");
    }
}

class Maruti800 extends Maruti
{
    public Maruti800()
    {
        System.out.println("Maruti Model: 800");
    }
    public void speed()
    {
        System.out.println("Max: 80Kmph");
    }
    public static void main(String args[])
    {
        Maruti800 obj = new Maruti800();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}
Output
Class Car
Class Maruti
Maruti Model: 800
Vehicle Type: Car
Brand: Maruti
Max: 80Kmph

Constructor Overloading
class Constructor1
{
    int id;
    String name;
    int age;
    Constructor1(int i, String n)
    {
        id = i;
        name = n;
    }
    Constructor1(int i, String n, int a)
    {
        id = i;
        name = n;
        age = a;
    }
    void display()
    {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args)
    {
        Constructor1 co = new Constructor1(1, "Sam");
        Constructor1 co1 = new Constructor1(2, "Roy", 25);
        co.display();
        co1.display();
    }
}
Output
1 Sam 0
2 Roy 25

Single Inheritance
import java.io.*;

class Student
{
    private int roll_no;
    private String name;

    void get_data(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }

    void display()
    {
        System.out.print("\nThe Student Details are:");
        System.out.print("\nRoll no: " + roll_no);
        System.out.print("\nName: " + name);
    }
}


class Marks extends Student
{
    private int mark1, mark2;

    Marks(int mark1, int mark2)
    {
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    void display_marks()
    {
        System.out.print("\nMarks1: " + mark1);
        System.out.print("\nMarks2: " + mark2);

        float avg;
        avg = (mark1 + mark2) / 2;
        System.out.println("\nAverage: " + avg);
    }
}

class SingleInheritance
{
    public static void main(String s[]) throws Exception
    {
        int roll_no, mark1, mark2;
        String name;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter Roll_no: ");
        roll_no = Integer.parseInt(br.readLine());

        System.out.print("\nEnter Name: ");
        name = br.readLine();

        System.out.print("\nEnter Marks1: ");
        mark1 = Integer.parseInt(br.readLine());

        System.out.print("\nEnter Marks2: ");
        mark2 = Integer.parseInt(br.readLine());

        Marks m = new Marks(mark1, mark2);
        m.get_data(roll_no, name);

        m.display();
        m.display_marks();
    }
} 
Output

Enter Roll_no: 2

Enter Name: John

Enter Marks1: 45

Enter Marks2: 65

The Student Details are:
Roll no: 2
Name: John
Marks1: 45
Marks2: 65
Average: 55.0

Hybrid Inheritance
interface A
{
    public void methodA();
}

interface B extends A
{
    public void methodB();
}

interface C extends A
{
    public void methodC();
}

class D implements B, C
{
    public void methodA()
    {
        System.out.println("MethodA");
    }

    public void methodB()
    {
        System.out.println("MethodB");
    }

    public void methodC()
    {
        System.out.println("MethodC");
    }

    public static void main(String args[])
    {
        D obj1 = new D();
        obj1.methodA();
        obj1.methodB();
        obj1.methodC();
    }
}
Output

MethodA
MethodB
MethodC

Address Details using 'this' keyword
class AddressDetails
{
    int flatno;
    String blgd;
    String city;

    AddressDetails(int flatno, String blgd)
    {
        this.flatno = flatno;
        this.blgd = blgd;
    }

    AddressDetails(int flatno, String blgd, String city)
    {
        //now no need to initialize id and name 
        this(flatno, blgd);
        this.city = city;
    }

    void display()
    {
        System.out.println(flatno + " " + blgd + " " + city);
    }

    public static void main(String args[])
    {
        AddressDetails e1 = new AddressDetails(01, "abc");
        AddressDetails e2 = new AddressDetails(02, "def", "mumbai");
        e1.display();
        e2.display();
    }
}  
Output

1 WTC null
2 Twin Tower mumbai

Polymorphism Method Overriding
class SuperClass
{  
	void display()
	{
		System.out.println("Hello Superclass ");
	}  
} 
 
class Polymorphism extends SuperClass
{  
	void display()
	{
		System.out.println("Hello Subclass ");
	}  
 
	public static void main(String args[])
	{  
		//This is called upcasting 
		SuperClass s = new Polymorphism(); 
		s.display();  
  	}  
}  
Output
Hello Subclass 

Inheritance - Accessing parent class property with super keyword
{
    String name;
}

class Inheritance extends Parent
{
    String name;

    public void displaydetails()
    {
        //refers to parent class member
        super.name = "Parent";
        name = "Child";

        System.out.println(super.name + " and " + name);
    }

    public static void main(String[] args)
    {
        Inheritance obj = new Inheritance();
        obj.displaydetails();
    }
}
Output
Parent and Child

Parameterized Constructor
class ParameterizedConstructor
{
    ParameterizedConstructor(int num1, int num2)
    {
        int addition;
        addition = num1 + num2;
        System.out.println("Addition of Numbers: " + addition);
    }

    public static void main(String args[])
    {
        ParameterizedConstructor p = new ParameterizedConstructor(30, 40);
    }
}
Output
Addition of Numbers: 70

Passing argument/parameter in constructor
class Demo
{
    // constructor with parameters
    Demo(int num1, int num2)
    {
        int addition;
        addition = num1 + num2;
        System.out.println("Addition of Numbers : " + addition);
    }

    public static void main(String args[])
    {
        Demo p = new Demo(30, 40);
    }
}
Output
Addition of Numbers : 70

Using Final Keyword
class Superclass
{
    //Final variable
    final int i = 10;

    //final method
    final void display()
    {
        System.out.println("Super Class Method");
        System.out.println("\nValue of final variable : " + i);
    }
}

class FinalKeyword extends Superclass
{
    public static void main(String args[])
    {
        FinalKeyword obj = new FinalKeyword();
        obj.display();
    }
}
Output

Super Class Method

Value of final variable : 10

Wrapper Example
class Wrapper
{
    public static void main(String args[])
    {
        byte b = 3;
        int i = 10;
        float f = 4.5f;
        double d = 90.7;

        //data types to objects - wrapping		
        Byte b_obj = new Byte(b);
        Integer i_obj = new Integer(i);
        Float f_obj = new Float(f);
        Double d_obj = new Double(d);

        // printing the values from objects	
        System.out.println("Values of Wrapper objects ");
        System.out.println("Byte object :  " + b_obj);
        System.out.println("Integer object :  " + i_obj);
        System.out.println("Float object :  " + f_obj);
        System.out.println("Double object :  " + d_obj);

        // objects to data types (retrieving data types from objects) - unwrapping 
        byte bv = b_obj.byteValue();
        int iv = i_obj.intValue();
        float fv = f_obj.floatValue();
        double dv = d_obj.doubleValue();

        //printing the values from data types	
        System.out.println("\nUnwrapped values ");
        System.out.println("byte value : " + bv);
        System.out.println("int value : " + iv);
        System.out.println("float value : " + fv);
        System.out.println("double value : " + dv);
    }
}
Output

Values of Wrapper objects
Byte object :  3
Integer object :  10
Float object :  4.5
Double object :  90.7

Unwrapped values
byte value : 3
int value : 10
float value : 4.5
double value : 90.7


Applet
Simple Applet
import java.applet.*;
import java.awt.*;


//Following example demonstrates how to create a 
//basic Applet by extrnding Applet Class.You will
//need to embed another HTML code to run this program.

class SimpleApplet extends Applet
{

    public void paint(Graphics g)
    {
        g.drawString("Hello Applet", 50, 30);
    }
}

//Now compile the above code and call the generated 
//class in your HTML code as follows:
<!--/*--------------------------
<HTML>
<HEAD>
</HEAD>
<BODY>
<div >
<APPLET CODE="SimpleApplet.class" WIDTH="600" HEIGHT="400">
</APPLET>
</div>
</BODY>
</HTML>
---------------------------*/-->
Output
Hello Applet

GUI
Login Form Example
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LoginView
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Demo application");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel)
    {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JButton registerButton = new JButton("register");
        registerButton.setBounds(180, 80, 80, 25);
        panel.add(registerButton);
    }
}

Array

Array Copy Example
class ArrayCopyExample
{
    public static void main(String[] args)
    {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a',
                           't', 'e', 'd'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
Output
caffein

Array Copy Of Range
class ArrayCopyOfRangeExample {
	
	public static void main(String[] args) {

		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a',
				't', 'e', 'd' };

		char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

		System.out.println(new String(copyTo));
	}
}
Output
caffein

Array Example
class ArrayExample
{
    public static void main(String[] args)
    {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);
    }
} 
Output
Element at index 0: 100
Element at index 1: 200
Element at index 2: 300
Element at index 3: 400
Element at index 4: 500
Element at index 5: 600
Element at index 6: 700
Element at index 7: 800
Element at index 8: 900
Element at index 9: 1000

Array of Arrays
class ArrayOfArraysAnimalDemo
{
    public static void main(String[] args)
    {
        String[][] animals = {{"DanaDog", "WallyDog", "JessieDog", "AlexisDog", "LuckyDog"}, {"BibsCat", "DoodleCat", "MillieCat", "SimonCat"}, {"ElyFish", "CloieFish", "GoldieFish", "OscarFish", "ZippyFish", "TedFish"}, {"RascalMule", "GeorgeMule", "GracieMule", "MontyMule", "BuckMule", "RosieMule"}};

        for (int i = 0; i < animals.length; i++)
        {
            System.out.print(animals[i][0] + ": ");

            for (int j = 1; j < animals[i].length; j++)
            {
                System.out.print(animals[i][j] + " ");
            }

            System.out.println();
        }
    }
}
Output
DanaDog: WallyDog JessieDog AlexisDog LuckyDog 
BibsCat: DoodleCat MillieCat SimonCat 
ElyFish: CloieFish GoldieFish OscarFish ZippyFish TedFish 
RascalMule: GeorgeMule GracieMule MontyMule BuckMule Rosie

Array Operations
class ArrayOperations
{
    public static void main(String[] args)
    {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++)
        {
            System.out.println(myList[i] + " ");
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++)
        {
            total += myList[i];
        }

        System.out.println("Total is " + total);

        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++)
        {
            if (myList[i] > max)
                max = myList[i];
        }

        System.out.println("Max is " + max);
    }
}
Output
1.9 
2.9 
3.4 
3.5 
Total is 11.7
Max is 3.5

Create & Display Matrix
import java.util.Scanner;
 
 class Matrix_Create {
	
	Scanner scan;
	int matrix[][];
	int row, column;
 
	void create() {
		
		scan = new Scanner(System.in);
		
		System.out.println("Matrix Creation");
		
		System.out.println("\nEnter number of rows :");
		row = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter number of columns :");
		column = Integer.parseInt(scan.nextLine());
		
		matrix = new int[row][column];
		System.out.println("Enter the data :");
 
		for(int i=0; i<row ; i++) {
			
			for(int j=0; j
				<column ; j++) {
				
				matrix[i][j] =scan.nextInt();
					}
		}
	}
	
	void display() {
		
		System.out.println("\nThe Matrix is :");
		
		for(int i=0; i <row ; i++) {
			
			for(int j=0; j <column ; j++) {
				
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
 
  class CreateAndDisplayMatrix {
	
	public static void main(String
					args[]) {
		
		Matrix_Create obj=new Matrix_Create();
		
		obj.create();
		obj.display();
	}
}
Output
Matrix Creation

Enter number of rows :
3
Enter number of columns :
2
Enter the data :
2 4 5 6 2 3

The Matrix is :
	2	4
	5	6
	2	3

Display Array using For-Each Loop
class DisplayArrayForEach
{
    public static void main(String[] args)
    {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (double element : myList)
        {
            System.out.println(element);
        }
    }
}
Output
1.9
2.9
3.4
3.5

Matrix Operations
import java.util.Scanner;

public class Matrices {

   public static void main(String[] args) {
	   
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter number of rows: ");
       int rows = scanner.nextInt();
       
       System.out.print("Enter number of columns: ");
       int columns = scanner.nextInt();
       
       System.out.println();
       System.out.println("Enter first matrix");
       int[][] a = readMatrix(rows, columns);
       
       System.out.println();
       System.out.println("Enter second matrix");
       int[][] b = readMatrix(rows, columns);
       
       int[][] sum = add(a, b);
       int[][] difference1 = subtract(a, b);
       int[][] difference2 = subtract(b, a);
       
       System.out.println();
       System.out.println("A + B =");
       printMatrix(sum);
       
       System.out.println();
       System.out.println("A - B =");
       printMatrix(difference1);
       
       System.out.println();
       System.out.println("B - A =");
       printMatrix(difference2);
   }

   public static int[][] readMatrix(int rows, int columns) {
	   
       int[][] result = new int[rows][columns];
       Scanner s = new Scanner(System.in);
       
       for (int i = 0; i < rows; i++) {
    	   
           for (int j = 0; j < columns; j++) {
        	   
               result[i][j] = s.nextInt();
               
           }
       }
       return result;
   }

   public static int[][] add(int[][] a, int[][] b) {
	   
       int rows = a.length;
       int columns = a[0].length;
       int[][] result = new int[rows][columns];
       
       for (int i = 0; i < rows; i++) {
    	   
           for (int j = 0; j < columns; j++) {
        	   
               result[i][j] = a[i][j] + b[i][j];
               
           }
       }
       return result;
   }

   public static int[][] subtract(int[][] a, int[][] b) {
	   
       int rows = a.length;
       int columns = a[0].length;
       int[][] result = new int[rows][columns];
       
       for (int i = 0; i < rows; i++) {
    	   
           for (int j = 0; j < columns; j++) {
        	   
               result[i][j] = a[i][j] - b[i][j];
               
           }
       }
       return result;
   }

   public static void printMatrix(int[][] matrix) {
	   
       int rows = matrix.length;
       int columns = matrix[0].length;
       
       for (int i = 0; i < rows; i++) {
    	   
           for (int j = 0; j < columns; j++) {
        	   
               System.out.print(matrix[i][j] + "  ");
               
           }
           System.out.println();
       }
   }
}
Output
Enter number of rows: 3
Enter number of columns: 2

Enter first matrix
23
11
33
4
55
6

Enter second matrix
11
2
3
45
6
54


Matrix Multiplication
import java.util.Scanner;

class MatrixMultiplication
{
    public static void main(String args[])
    {
        int m, n, p, q, sum = 0, c, d, k;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        m = in.nextInt();
        n = in.nextInt();

        int first[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");

        for (c = 0; c < m; c++)
        {
            for (d = 0; d < n; d++)
            {
                first[c][d] = in.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns of second matrix");
        p = in.nextInt();
        q = in.nextInt();

        if (n != p)
            System.out.println("Matrices with entered orders can't be multiplied with each other.");
        else
        {
            int second[][] = new int[p][q];
            int multiply[][] = new int[m][q];

            System.out.println("Enter the elements of second matrix");

            for (c = 0; c < p; c++)
            {
                for (d = 0; d < q; d++)
                {
                    second[c][d] = in.nextInt();
                }
            }

            for (c = 0; c < m; c++)
            {
                for (d = 0; d < q; d++)
                {
                    for (k = 0; k < p; k++)
                    {
                        sum = sum + first[c][k] * second[k][d];
                    }

                    multiply[c][d] = sum;
                    sum = 0;
                }
            }

            System.out.println("Product of entered matrices:-");

            for (c = 0; c < m; c++)
            {
                for (d = 0; d < q; d++)
                {
                    System.out.print(multiply[c][d] + "\t");
                }

                System.out.print("\n");
            }
        }
    }
}
Output
Enter the number of rows and columns of first matrix
3 3
Enter the elements of first matrix
1 2 3
4 5 6
7 8 9
Enter the number of rows and columns of second matrix
3 3
Enter the elements of second matrix
9 8 7
6 5 4
3 2 1
Product of entered matrices:-
30      24      18
84      69      54
138     114     90

Matrix Subtraction
import java.util.Scanner;
 
 class Matrix_Subtraction {
	
	Scanner scan;
	int matrix1[][], matrix2[][], sub[][];
	int row, column;
 
	void create() {
		
		scan = new Scanner(System.in);
		
		System.out.println("Matrix Subtraction");
		
		// First Matrix Creation..
		System.out.println("\nEnter number of rows & columns");
		row = Integer.parseInt(scan.nextLine());
		column = Integer.parseInt(scan.nextLine());
		
		matrix1 = new int[row][column];
		matrix2 = new int[row][column];
		sub = new int[row][column];
 
		System.out.println("Enter the data for first matrix :");
 
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				matrix1[i][j] = scan.nextInt();
			}
		}
		
		// Second Matrix Creation..
		System.out.println("Enter the data for second matrix :");
 
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				matrix2[i][j] = scan.nextInt();
			}
		}
	}
	
	void display() {
		
		System.out.println("\nThe First Matrix is :");
		
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				System.out.print("\t" + matrix1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n\nThe Second Matrix is :");
		
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				System.out.print("\t" + matrix2[i][j]);
			}
			System.out.println();
		}
	}
	
	void sub() {
		
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				sub[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		
		System.out.println("\n\nThe Subtraction is :");
		
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				System.out.print("\t" + sub[i][j]);
			}
			System.out.println();
		}
	}
}
 
class MatrixSubtractionExample {
	
	public static void main(String args[]) {
		
		Matrix_Subtraction obj = new Matrix_Subtraction();
		
		obj.create();
		obj.display();
		obj.sub();
	}
}
Output
Matrix Subtraction

Enter number of rows & columns
2
3
Enter the data for first matrix :
1
2
3
3
4
5
Enter the data for second matrix :
11
2
3
45
6
3

The First Matrix is :
	1	2	3
	3	4	5


Multidimensional Array
class MultiDimArrayExample
{
    public static void main(String[] args)
    {
        String[][] names = {{"Mr. ", "Mrs. ", "Ms. "}, {"Smith", "Jones"}};
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}
Output
Mr. Smith
Ms. Jones

Matrix Addition
import java.util.Scanner;
 
 class MatrixAddition {
	
	Scanner scan;
	int matrix1[][], matrix2[][], sum[][];
	int row, column;
 
	void create() {
		
		scan = new Scanner(System.in);
		
		System.out.println("Matrix Addition");
		
		// First Matrix Creation..
		System.out.println("\nEnter number of rows & columns");
		row = Integer.parseInt(scan.nextLine());
		column = Integer.parseInt(scan.nextLine());
		
		matrix1 = new int[row][column];
		matrix2 = new int[row][column];
		sum = new int[row][column];
 
		System.out.println("Enter the data for first matrix :");
 
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				matrix1[i][j] = scan.nextInt();
			}
		}
		
		// Second Matrix Creation..
		System.out.println("Enter the data for second matrix :");
 
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				matrix2[i][j] = scan.nextInt();
			}
		}
	}
	
	void display() {
		
		System.out.println("\nThe First Matrix is :");
		
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				System.out.print("\t" + matrix1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n\nThe Second Matrix is :");
		
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				System.out.print("\t" + matrix2[i][j]);
			}
			System.out.println();
		}
	}
	
	void add() {
		
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("\n\nThe Sum is :");
		
		for(int i=0; i &lt row; i++) {
			
			for(int j=0; j &lt column; j++) {
				
				System.out.print("\t" + sum[i][j]);
			}
			System.out.println();
		}
	}
}
 
class MatrixAdditionExample {
	
	public static void main(String args[]) {
		
		MatrixAddition obj = new MatrixAddition();
		
		obj.create();
		obj.display();
		obj.add();
	}
}
Output
Matrix Addition

Enter number of rows & columns
2
3
Enter the data for first matrix :
22
12
3
4
55
6
Enter the data for second matrix :
23
4
57
78
9
6

The First Matrix is :
	22	12	3

2 Dimensional Array
import java.util.*;

class TwoDArray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter # of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter # of cols: ");
        int cols = scanner.nextInt();

        int[][] a = new int[rows][cols];

        System.out.print("Enter " + rows + "x" + cols + "=" + (rows * cols) + " integers: ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Here are those " + (rows * cols) + " integers in a " + rows + "x" + cols + " 2d-array:");
        System.out.println(Arrays.deepToString(a));
    }
}
Output
Enter # of rows: 2
Enter # of cols: 3
Enter 2x3=6 integers: 4
5
6
1
2
3
Here are those 6 integers in a 2x3 2d-array:
[[4, 5, 6], [1, 2, 3]]

Magic Matrix
import java.io.*;

class MagicMatrix
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the matrix : ");
        int n = Integer.parseInt(br.readLine());

        if (n > 5)
            System.out.println("Enter a number between 1 to 5 ");
        else
        {
            int A[][] = new int[n][n]; // Creating the Magic Matrix
            int i, j, k, t;
         
            /*Initializing every cell of the matrix with 0 */
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++)
                {
                    A[i][j] = 0;
                }
            }

            /* When the size of the matrix is Odd */
            if (n % 2 != 0)
            {
                i = 0;
                j = n / 2;
                k = 1;
                while (k <= n * n)
                {
                    A[i][j] = k++;
                    i--; // Making one step upward
                    j++; // Moving one step to the right

                    if (i < 0 && j > n - 1) // Condition for the top-right corner element
                    {
                        i = i + 2;
                        j--;
                    }

                    if (i < 0) // Wrapping around the row if it goes out of boundary
                        i = n - 1;

                    if (j > n - 1) // Wrapping around the column if it goes out of boundary
                        j = 0;

                    if (A[i][j] > 0) // Condition when the cell is already filled
                    {
                        i = i + 2;
                        j--;
                    }
                }
            }
            /* When the size of the matrix is even */
            else
            {
                k = 1;
             
                /* Filling the matrix with natural numbers from 1 till n*n */
                for (i = 0; i < n; i++)
                {
                    for (j = 0; j < n; j++)
                    {
                        A[i][j] = k++;
                    }
                }

                j = n - 1;

                for (i = 0; i < n / 2; i++)
                {
                    /* swapping corner elements of primary diagonal */
                    t = A[i][i];
                    A[i][i] = A[j][j];
                    A[j][j] = t;
                 
                    /* swapping corner elements of secondary diagonal */
                    t = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = t;

                    j--;
                }
            }

            /* Printing the Magic matrix */
            System.out.println("The Magic Matrix of size " + n + "x" + n + " is:");
            for (i = 0; i < n; i++)
            {
                for (j = 0; j < n; j++)
                {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
Output
Enter the size of the matrix : 3
The Magic Matrix of size 3x3 is:
8       1       6
3       5       7
4       9       2

Missing number in an Array
class MissingNumberArray
{
    public static int count = 0;
    public static int position = 0;
    public static boolean flag = false;

    public static void main(String[] args)
    {
        int a[] = {0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23};

        findMissingNumbers(a, position);
    }

    private static void findMissingNumbers(int a[], int position)
    {
        if (position == a.length - 1)
            return;

        for (; position < a[a.length - 1]; position++)
        {
            if ((a[position] - count) != position)
            {
                System.out.println("Missing Number: " + (position + count));
                flag = true;
                count++;
                break;
            }
        }

        if (flag)
        {
            flag = false;
            findMissingNumbers(a, position);
        }
    }
}
Output
Missing Number: 5
Missing Number: 16
Missing Number: 17
Missing Number: 19
Missing Number: 22

Mirror Matrix
import java.util.*;

class MirrorMatrix
{
    public static void main(String[] args)
    {
        int row, column;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows for matrix :");
        row = in.nextInt();
        System.out.print("Enter number of rows for matrix :");
        column = in.nextInt();

        int matrix[][] = new int[row][column];

        System.out.println("Enter matrix : ");

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Mirror matrix : ");

        for (int i = 0; i < row; i++)
        {
            for (int j = column - 1; j >= 0; j--)
            {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println("");
        }
    }
}
Output
Enter number of rows for matrix :3
Enter number of rows for matrix :3
Enter matrix :
1 2 3
4 5 6
7 8 9
Mirror matrix :
3       2       1
6       5       4
9       8       7

Sort an Array
import java.util.*;

class ArraySortingDemo
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements to sort : ");

        int size = in.nextInt();
        // initializing unsorted int array
        int iArr[] = new int[size];
        System.out.println("Enter " + size + " integer(s) :");
        for (int i = 0; i < size; i++)
        {
            iArr[i] = in.nextInt();
        }

        // let us print all the elements available in list
        for (int number : iArr)
        {
            System.out.println("Number = " + number);
        }

        // sorting array
        Arrays.sort(iArr);

        // let us print all the elements available in list
        System.out.println("The sorted int array is:");
        for (int number : iArr)
        {
            System.out.println("Number = " + number);
        }
    }
}
Output
Enter no. of elements to sort : 10
Enter 10 integer(s) :
5 6 4 3 8 9 2 1 7 10
Number = 5
Number = 6
Number = 4
Number = 3
Number = 8
Number = 9
Number = 2
Number = 1
Number = 7
Number = 10
The sorted int array is:
Number = 1
Number = 2
Number = 3
Number = 4
Number = 5
Number = 6

Merge Two Array
class MergeArrayDemo
{
	public static void main(String args[])
	{
		Integer a[]={1,2,3,4};
		Integer b[]={5,6,7,0};
		Integer[] both = concat(a, b);
		
		System.out.print("\nFirst  Array : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}

		System.out.print("\nSecond Array : ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"\t");
		}

		System.out.print("\nMerged Array : ");
		for(int i=0;i<both.length;i++)
		{
			System.out.print(both[i]+"\t");
		}
	}

	public static Integer[] concat(Integer[] a, Integer[] b)
	{
		int aLen = a.length;
		int bLen = b.length;
		Integer[] c= new Integer[aLen+bLen];
		System.arraycopy(a, 0, c, 0, aLen);
		System.arraycopy(b, 0, c, aLen, bLen);
		return c;
	}
}
Output
First  Array : 1        2       3       4
Second Array : 5        6       7       0
Merged Array : 1        2       3

Symmetric matrix
import java.io.*;
import java.util.*;

class SymmetricMatrix
{
    public static void main(String args[]) throws IOException
    {
        int m, n, c, d;
        int matrix[][], transpose[][];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n = in.nextInt();
        if (m == n)
        {
            matrix = new int[m][n];

            System.out.println("Enter the elements of matrix");

            for (c = 0; c < m; c++)
            {
                for (d = 0; d < n; d++)
                {
                    matrix[c][d] = in.nextInt();
                }
            }

            transpose = new int[n][m];

            for (c = 0; c < m; c++)
            {
                for (d = 0; d < n; d++)
                {
                    transpose[d][c] = matrix[c][d];
                }
            }

            System.out.println("Transpose of entered matrix:-");

            for (c = 0; c < n; c++)
            {
                for (d = 0; d < m; d++)
                {
                    System.out.print(transpose[c][d] + "\t");
                }

                System.out.print("\n");
            }

            for (c = 0; c < n; c++)
            {
                for (d = 0; d < m; d++)
                {
                    if (matrix[c][d] != transpose[c][d])
                        break;
                }
                if (d != m)
                    break;

            }
            if (c == n)
                System.out.println("Symmetric matrix.");
        }
        else
            System.out.println("Please enter Sqare matrix");
    }
}
Output
Enter the number of rows and columns of matrix
3 3
Enter the elements of matrix
1 7 3 
7 4 5
3 5 6
Transpose of entered matrix:-
1	7	3	
7	4	5	
3	5	6	
Symmetric matrix.


Object Array
import java.io.*;

class Employee
{
    String name;
    int emp_id;
    int salary;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void get_data()
    {
        try
        {
            System.out.print("\nEnter name: ");
            name = br.readLine();
            System.out.print("\nEnter emp id: ");
            emp_id = Integer.parseInt(br.readLine());
            System.out.print("\nEnter salary: ");
            salary = Integer.parseInt(br.readLine());
        }
        catch (Exception e)
        {
            System.out.print("\n" + e);
        }
    }

    public void display()
    {
        System.out.print("\nName: " + name);
        System.out.print("\nEmp id: " + emp_id);
        System.out.print("\nSalary: " + salary);
    }
}

class ObjectArray
{
    public static void main(String args[]) throws Exception
    {
        int i;
        Employee emp[] = new Employee[5];
        for (i = 0; i < 5; i++)
        {
            emp[i] = new Employee();
        }

        for (i = 0; i < 5; i++)
        {
            System.out.print("\nEnter Employee Detail for employee " + (i + 1));
            emp[i].get_data();
        }

        for (i = 0; i < 5; i++)
        {
            System.out.print("\nEmployee Details for employee " + (i + 1));
            emp[i].display();
        }
    }
}
Output

Enter Employee Detail for employee 1
Enter name: ABC

Enter emp id: 101

Enter salary: 10000

Enter Employee Detail for employee 2
Enter name: DEF

Enter emp id: 102

Enter salary: 20000

Enter Employee Detail for employee 3
Enter name: LMN

Enter emp id: 103

Sort 2D Array
import java.io.*;

class SortArray
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter the no. of  rows: ");    //enter number of rows
        int m = Integer.parseInt(br.readLine());
        System.out.print("\nEnter the no. of columns: "); //enter number of columns
        int n = Integer.parseInt(br.readLine());

        int A[][] = new int[m][n]; //creating a 2D array

        //enter elements in 2D Array
        System.out.println();
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print("Enter the elements: ");
                A[i][j] = Integer.parseInt(br.readLine());
            }
        }

        //Printing the original 2D Array
        System.out.println("\nThe original array: ");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        //Sorting the 2D Array
        int t = 0;
        for (int x = 0; x < m; x++)
        {
            for (int y = 0; y < n; y++)
            {
                for (int i = 0; i < m; i++)
                {
                    for (int j = 0; j < n; j++)
                    {
                        if (A[i][j] > A[x][y])
                        {
                            t = A[x][y];
                            A[x][y] = A[i][j];
                            A[i][j] = t;
                        }
                    }
                }
            }
        }

        //Printing the sorted 2D Array
        System.out.println("\nThe Sorted Array:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
Output
Enter the no. of  rows: 3

Enter the no. of columns: 3

Enter the elements: 9
Enter the elements: 5
Enter the elements: 1
Enter the elements: 2
Enter the elements: 3
Enter the elements: 4
Enter the elements: 6
Enter the elements: 7
Enter the elements: 2

The original array:
9       5       1
2       3       4
6       7       2


Array Sort
import java.util.Arrays;

class ArraySort
{
    // This program is the example of  array sorting
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // initializing unsorted  array
        String iArr[] = {"Programming", "Hub", "Alice", "Wonder", "Land"};

        // sorting array
        Arrays.sort(iArr);

        // let us print all the elements available in list
        System.out.println("The sorted array is:");
        for (int i = 0; i < iArr.length; i++)
        {
            System.out.println(iArr[i]);
        }
    }
}
Output

The sorted array is:
Alice
Hub
Land
Programming
Wonder

Transpose Matrix using one Array
import java.util.*;
class TransposeMatrix
{
    public static void main(String s[])
    {
        int i,j;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of rows : ");
        int r = sc.nextInt();

        System.out.print("\nEnter number of columns : ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        // take input from user
        System.out.println("\nEnter matrix elements : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        // Logic for Transpose
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(i<j)
                {
                    int temp = a[j][i];
                    a[j][i] = a[i][j];
                    a[i][j] = temp;
                }
            }
        }

        // print Transpose matrix 
        System.out.println("\nTranspose Matrix :");
        for(i=0;i<r;i++)
        {
            System.out.print("\n");
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
        }

    }
}
Output
Enter number of rows : 3
Enter number of columns : 3
Enter matrix elements : 
1 2 3
4 5 6
7 8 9
Transpose Matrix :

1	4	7	
2	5	8	
3	6	9

Middle value of an array
import java.util.*;

class MiddleValue
{
    public static void main(String args[])
    {
        int[] a;
        int i, j, n, sum = 0, swap, size;

        double t;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        size = sc.nextInt();

        a = new int[size];

        System.out.println("Enter numbers ");
        for (i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Numbers are : ");
        for (i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }

        //Sorting
        for (i = 0; i < (size - 1); i++)
        {
            for (j = 0; j < (size - i - 1); j++)
            {
                if (a[j] > a[j + 1])
                {
                    swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }

        System.out.println("\nNumbers in sorted order : ");
        for (i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }

        //Finding the Middle Value
        if (size % 2 == 0)
        {
            n = (size + 1) / 2;
            t = (a[n] + a[n - 1]) / 2.0;
            System.out.println("\nMiddle Value is : " + t);
        }

        else
        {
            System.out.println("\nMiddle Value is : " + a[size / 2]);
        }

    }
}
Output

Enter size of array
4
Enter numbers
2
4
5
2
Numbers are :
2 4 5 2
Numbers in sorted order :
2 2 4 5
Middle Value is : 3.0


Find Closest value of a number in an Array
import java.util.*;

class ClosestValue
{
    public static void main(String[] args)
    {
        int a[];
        int find;
        int closest = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = sc.nextInt();

        a = new int[size];

        System.out.println("Enter numbers in array");
        for (int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Numbers are : ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Enter Number to find closest value");
        find = sc.nextInt();

        int distance = Math.abs(closest - find);

        for (int i : a)
        {
            int distanceI = Math.abs(i - find);
            if (distance > distanceI)
            {
                closest = i;
                distance = distanceI;
            }
        }

        System.out.println("Closest Value is : " + closest);
    }

}
Output

Enter size of array
8
Enter numbers in array
32 74 98 14 65 28 92 64
Numbers are :
32 74 98 14 65 28 92 64
Enter Number to find closest value
49
Closest Value is : 64

Double Matrix
import java.util.*;
import java.text.DecimalFormat;

class DoubleMatrix
{
    public static void main(String[] args)
    {
        double[][] a;
        double[] s;
        int row, col, k = 0, i, j;
        double sum = 0.0;

        DecimalFormat f = new DecimalFormat("##.####");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of row and column");
        row = sc.nextInt();
        col = sc.nextInt();

        a = new double[row][col];
        s = new double[col];

        System.out.println("Enter elements of matrix");
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                a[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Double Matrix is : ");
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

        //sum of the elements of double matrix

        for (i = 0; i < col; i++)
        {
            for (j = 0; j < row; j++)
            {
                sum = sum + a[j][i];
            }
            s[k] = sum;
            k++;
            sum = 0;
        }

        for (i = 0; i < col; i++)
        {
            System.out.println("Sum of Column " + (i + 1) + " is : " + f.format(s[i]));
        }
    }
}
Output

Enter size of row and column
3
3
Enter elements of matrix
1 6 8
2 7 9
3 8 0
Double Matrix is :
 1.0 6.0 8.0
 2.0 7.0 9.0
 3.0 8.0 0.0
Sum of Column 1 is : 6
Sum of Column 2 is : 21
Sum of Column 3 is : 17

Basic Array
import java.util.*;

class ArrayBasic
{
    public static void main(String[] args)
    {
        int[] arr;
        int size, i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        size = sc.nextInt();

        arr = new int[size];

        System.out.println("\nEnter array elements");
        for (i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nElements in the Array are : ");
        for (i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
Output

Enter size of array
3

Enter array elements
1 2 3

Elements in the Array are :
1 2 3

Add Two Matrix
//In call by reference, the original value is changed if we made changes in the called method.

import java.util.*;

class AddTwoMatrix
{
    int m, n;
    int first[][] = new int[m][n];
    int second[][] = new int[m][n];

    AddTwoMatrix(int[][] first, int[][] second, int m, int n)
    {
        this.first = first;
        this.second = second;
        this.m = m;
        this.n = n;
    }

    public static void main(String[] args)
    {
        int m, n, c, d;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n = in.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int[m][n];

        System.out.println("Enter the elements of first matrix");

        for (c = 0; c < m; c++)
        {
            for (d = 0; d < n; d++)
            {
                first[c][d] = in.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix");

        for (c = 0; c < m; c++)
        {
            for (d = 0; d < n; d++)
            {
                second[c][d] = in.nextInt();
            }
        }

        System.out.println("\nElements of First matrix is : ");

        for (c = 0; c < m; c++)
        {
            for (d = 0; d < n; d++)
            {
                System.out.print(first[c][d] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nElements of Second matrix is : ");

        for (c = 0; c < m; c++)
        {
            for (d = 0; d < n; d++)
            {
                System.out.print(second[c][d] + "\t");
            }
            System.out.println();
        }

        AddTwoMatrix a = new AddTwoMatrix(first, second, m, n);
        //call by reference
        a.addmatrix(a); //Passing Object
    }

    //Function for Adding two matrix and storing in third matrix 
    public void addmatrix(AddTwoMatrix a)
    {
        int c, d;
        int sum[][] = new int[a.m][a.n];

        for (c = 0; c < a.m; c++)
        {
            for (d = 0; d < a.n; d++)
            {
                sum[c][d] = a.first[c][d] + a.second[c][d];
            }
        }

        System.out.println("\nSum of the two matrices is : ");

        for (c = 0; c < a.m; c++)
        {
            for (d = 0; d < a.n; d++)
            {
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println();
        }
    }
}
Output

Enter the number of rows and columns of matrix
3 2
Enter the elements of first matrix
1 2 3
1 2 4
Enter the elements of second matrix
4 5 6
6 5 4

Elements of First matrix is :
1       2
3       1
2       4

Elements of Second matrix is :
4       5
6       6
5       4


Example to Pass Arrays to Function
//Sum of Numbers in an Array

import java.util.*;
class PassingArraystoFunction 
{
    public static void main(String[] args) 
    {
        int[] a;
        int size;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        size = sc.nextInt();
        
        a = new int[size];
        
        System.out.println("Enter elements in the array");
        for(int i = 0 ;i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("The Elements of the array are : ");
        for(int i = 0 ;i < size; i++)
        {
            System.out.print(a[i] + " ");
        }

        //Passing array to the function
        addElements(a, size);
    }
    
    public static void addElements(int[] a , int size)
    {
        int sum = 0;
        
        for(int i = 0; i < size; i++)
        {
            sum += a[i];
        }

        System.out.println("\nSum of the elements of arrays is : "+sum);
    }
}
Output

Enter size of array
3
Enter elements in the array
3
4
5
The Elements of the array are :
3 4 5
Sum of the elements of arrays is : 1

Array Sum and Average
import java.io.*;

class ArrayAverage
{
    public static void main(String[] args)
    {
        //define an array
        int[] numbers = new int[]{10, 20, 15, 25, 16, 60, 100};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println("Sum of array elements is : " + sum);
        System.out.println("Average value of array elements is : " + average);
    }
}
 
Output
Sum of array elements is : 246
Average value of array elements is : 35.0



System
Find IP Address of Machine
import java.net.*;
 class IPAddress 
{ 
    public static void main(String args[])
	{ 
        try 
		{
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println("\nIP address of the machine: " +ipAddr.getHostAddress());
        } 
		catch (UnknownHostException ex) 
		{
            ex.printStackTrace();
        }
    }
}
Output

IP address of the machine: 192.16
Recursion
Tower

class TowerHonoi
{

    public static void main(String[] args)
    {

        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }

    public static void doTowers(int topN, char from,
                                char inter, char to)
    {
        if (topN == 1)
        {
            System.out.println("Disk 1 from "
                                       + from + " to " + to);
        }
        else
        {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disk "
                                       + topN + " from " + from + " to " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}
Output
Disk 1 from A to C
Disk 2 from A to B
Disk 1 from C to B
Disk 3 from A to C
Disk 1 from B to A
Disk 2 from B to C
Disk 1 from A to C

Mathematics and Science
Radian to Degree
class RadTodeg
{
    public static void main(String a[])
    {
        System.out.println("Radiance 4.0 in degrees: " + Math.toDegrees(4.0));
        System.out.println("Radiance 6.0 in degrees: " + Math.toDegrees(6.0));
    }
}
Output
Radiance 4.0 in degrees: 229.1831180523293
Radiance 6.0 in degrees: 343.77467707849394


Data Structures
Binary Search Tree
import java.util.Scanner;

// Class BSTNode 
class BSTNode
{
    BSTNode left, right;
    int data;

    // Constructor 
    public BSTNode()
    {
        left = null;
        right = null;
        data = 0;
    }

    // Constructor 
    public BSTNode(int n)
    {
        left = null;
        right = null;
        data = n;
    }

    // Function to set left node 
    public void setLeft(BSTNode n)
    {
        left = n;
    }

    // Function to set right node  
    public void setRight(BSTNode n)
    {
        right = n;
    }

    // Function to get left node 
    public BSTNode getLeft()
    {
        return left;
    }

    // Function to get right node 
    public BSTNode getRight()
    {
        return right;
    }

    // Function to set data to node 
    public void setData(int d)
    {
        data = d;
    }

    // Function to get data from node 
    public int getData()
    {
        return data;
    }
}

// Class BST 
class BST
{
    private BSTNode root;

    // Constructor 
    public BST()
    {
        root = null;
    }

    // Function to check if tree is empty 
    public boolean isEmpty()
    {
        return root == null;
    }

    // Functions to insert data 
    public void insert(int data)
    {
        root = insert(root, data);
    }

    // Function to insert data recursively 
    private BSTNode insert(BSTNode node, int data)
    {
        if (node == null)
            node = new BSTNode(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    // Functions to delete data 
    public void delete(int k)
    {
        if (isEmpty())
            System.out.println("Tree Empty");
        else if (search(k) == false)
            System.out.println("Sorry " + k + " is not present");
        else
        {
            root = delete(root, k);
            System.out.println(k + " deleted from the tree");
        }
    }

    private BSTNode delete(BSTNode root, int k)
    {
        BSTNode p, p2, n;
        if (root.getData() == k)
        {
            BSTNode lt, rt;
            lt = root.getLeft();
            rt = root.getRight();
            if (lt == null && rt == null)
                return null;
            else if (lt == null)
            {
                p = rt;
                return p;
            }
            else if (rt == null)
            {
                p = lt;
                return p;
            }
            else
            {
                p2 = rt;
                p = rt;
                while (p.getLeft() != null)
                {
                    p = p.getLeft();
                }
                p.setLeft(lt);
                return p2;
            }
        }
        if (k < root.getData())
        {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        }
        else
        {
            n = delete(root.getRight(), k);
            root.setRight(n);
        }
        return root;
    }

    // Functions to count number of nodes 
    public int countNodes()
    {
        return countNodes(root);
    }

    // Function to count number of nodes recursively 
    private int countNodes(BSTNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    // Functions to search for an element 
    public boolean search(int val)
    {
        return search(root, val);
    }

    // Function to search for an element recursively 
    private boolean search(BSTNode r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }

    // Function for inorder traversal 
    public void inorder()
    {
        inorder(root);
    }

    private void inorder(BSTNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    // Function for preorder traversal 
    public void preorder()
    {
        preorder(root);
    }

    private void preorder(BSTNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    // Function for postorder traversal 
    public void postorder()
    {
        postorder(root);
    }

    private void postorder(BSTNode r)
    {
        if (r != null)
        {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}

//Class BinarySearchTree
class BinarySearchTree
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Creating object of BST 
        BST bst = new BST();

        System.out.println("Binary Search Tree Test\n");

        char ch;
        //  Perform tree operations  
        do
        {
            System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter integer element to insert");
                    bst.insert(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to delete");
                    bst.delete(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : " + bst.search(scan.nextInt()));
                    break;
                case 4:
                    System.out.println("Nodes = " + bst.countNodes());
                    break;
                case 5:
                    System.out.println("Empty status = " + bst.isEmpty());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            //  Display tree   
            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : ");
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y');
    }
}
Output
Binary Search Tree Test
 
 
Binary Search Tree Operations
 
1. insert
2. delete
3. search
4. count nodes
5. check empty
5
Empty status = true
 

Stack using Array
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack
{

    private int top;
    private int item[];

    Stack(int size)
    {
        top = -1;
        item = new int[size];
    }

    void pushItem(int data)
    {
        if (top == item.length - 1)
        {
            System.out.println("Stack is Full");
        }
        else
        {
            item[++top] = data;
            System.out.println("Pushed Item :" + item[top]);
        }
    }

    int popItem()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            System.out.println("Pop Item : " + item[top]);
            return item[top--];
        }
    }
    void displayAll()
    {
        for (int i = 0; item[i] != 0; i++)
        {
            System.out.print(item[i] + "\t");
        }

        System.out.println("");
    }
}

class StackDemo
{

    public static void main(String[] args) throws IOException
    {
        Stack stk = new Stack(5);
        boolean yes = true;
        int choice;
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("1).Push\n2).Pop\n3).Display\n4).Exit\n");
        do
        {
            System.out.print("\nEnter Choice : ");

            choice = Integer.parseInt(is.readLine());

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Push Item :");
                    stk.pushItem(Integer.parseInt(is.readLine()));
                    break;
                case 2:
                    stk.popItem();
                    break;
                case 3:
                    stk.displayAll();
                    break;
                case 4:
                    yes = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        while (yes == true);

    }
}
Output
1).Push
2).Pop
3).Display
4).Exit

Enter Choice : 1
Enter Push Item :6
Pushed Item :6

Enter Choice : 1
Enter Push Item :9
Pushed Item :9

Enter Choice : 3
6       9

Enter Choice : 1
Enter Push Item :10

Doubly Linked List
import java.util.Scanner;
 
class Node
{
    protected int data;
    protected Node next, prev;
 
    public Node()
    {
        next = null;
        prev = null;
        data = 0;
    }

    public Node(int d, Node n, Node p)
    {
        data = d;
        next = n;
        prev = p;
    }

    // Function to set link to next node
    public void setLinkNext(Node n)
    {
        next = n;
    }

    // Function to set link to previous node
    public void setLinkPrev(Node p)
    {
        prev = p;
    }    

    // Funtion to get link to next node
    public Node getLinkNext()
    {
        return next;
    }

    // Function to get link to previous node
    public Node getLinkPrev()
    {
        return prev;
    }

    // Function to set data to node
    public void setData(int d)
    {
        data = d;
    }

    // Function to get data from node
    public int getData()
    {
        return data;
    }
}

class linkedList
{
    protected Node start;
    protected Node end ;
    public int size;
 
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }

    // Function to check if list is empty
    public boolean isEmpty()
    {
        return start == null;
    }

    // Function to get size of list
    public int getSize()
    {
        return size;
    }

    // Function to insert element at begining
    public void insertAtStart(int val)
    {
        Node nptr = new Node(val, null, null);        
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            start = nptr;
        }
        size++;
    }

    // Function to insert element at end
    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val, null, null);        
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            end = nptr;
        }
        size++;
    }

    // Function to insert element at position
    public void insertAtPos(int val , int pos)
    {
        Node nptr = new Node(val, null, null);    
        if (pos == 1)
        {
            insertAtStart(val);
            return;
        }            
        Node ptr = start;
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                Node tmp = ptr.getLinkNext();
                ptr.setLinkNext(nptr);
                nptr.setLinkPrev(ptr);
                nptr.setLinkNext(tmp);
                tmp.setLinkPrev(nptr);
            }
            ptr = ptr.getLinkNext();            
        }
        size++ ;
    }

    // Function to delete node at position
    public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            if (size == 1)
            {
                start = null;
                end = null;
                size = 0;
                return; 
            }
            start = start.getLinkNext();
            start.setLinkPrev(null);
            size--; 
            return ;
        }
        if (pos == size)
        {
            end = end.getLinkPrev();
            end.setLinkNext(null);
            size-- ;
        }
        Node ptr = start.getLinkNext();
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                Node p = ptr.getLinkPrev();
                Node n = ptr.getLinkNext();
 
                p.setLinkNext(n);
                n.setLinkPrev(p);
                size-- ;
                return;
            }
            ptr = ptr.getLinkNext();
        }        
    }    

    // Function to display status of list
    public void display()
    {
        System.out.print("\nDoubly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLinkNext() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ " <-> ");
        ptr = start.getLinkNext();
        while (ptr.getLinkNext() != null)
        {
            System.out.print(ptr.getData()+ " <-> ");
            ptr = ptr.getLinkNext();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}

public class DoublyLinkedList
{    
    public static void main(String[] args)
    {            
        Scanner scan = new Scanner(System.in);
        
        // Creating object of linkedList
        linkedList list = new linkedList();
        System.out.println("Doubly Linked List Test\n");
        char ch;

        // Perform list operations
        System.out.println("\nDoubly Linked List Operations\n");
        System.out.println("1. Insert at begining");
        System.out.println("2. Insert at end");
        System.out.println("3. Insert at position");
        System.out.println("4. Delete at position");
        System.out.println("5. Check empty");
        System.out.println("6. Get size");
        do
        {
            System.out.print("Enter choice : ");
 
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.print("Enter integer element to insert : ");
                    list.insertAtStart( scan.nextInt() );
                    break;
                case 2 :
                    System.out.print("Enter integer element to insert : ");
                    list.insertAtEnd( scan.nextInt() );
                    break;
                case 3 :
                    System.out.print("Enter integer element to insert : ");
                    int num = scan.nextInt() ;
                    System.out.print("Enter position : ");
                    int pos = scan.nextInt() ;
                    if (pos < 1 || pos > list.getSize() )
                        System.out.println("Invalid position\n");
                    else
                        list.insertAtPos(num, pos);
                    break;
                case 4 :
                    System.out.print("Enter position : ");
                    int p = scan.nextInt() ;
                    if (p < 1 || p > list.getSize() )
                        System.out.print("Invalid position\n");
                    else
                        list.deleteAtPos(p);
                    break; 
                case 5 :
                    System.out.print("Empty status = "+ list.isEmpty());
                    break;
                case 6 :
                    System.out.print("Size = "+ list.getSize() +" \n");
                    break;
                default :
                    System.out.print("Wrong Entry \n ");
                    break;
            }

            // Display List
            list.display();
            System.out.print("\nDo you want to continue (Type y or n) : ");
            ch = scan.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y');
    }
}
Output
Doubly Linked List Test


Doubly Linked List Operations

1. Insert at begining
2. Insert at end
3. Insert at position
4. Delete at position
5. Check empty
6. Get size
Enter choice : 5
Empty status = true
Doubly Linked List = empty

Do you want to continue (Type y or

Queue Using Linked List

import java.util.*;

class Node
{
    protected int data;
    protected Node link;


    public Node()
    {
        link = null;
        data = 0;
    }

    public Node(int d, Node n)
    {
        data = d;
        link = n;
    }

    public void setLink(Node n)
    {
        link = n;
    }

    //  Function to set data to current Node
    public void setData(int d)
    {
        data = d;
    }

    //  Function to get link to next node
    public Node getLink()
    {
        return link;
    }

    //  Function to get data from current Node
    public int getData()
    {
        return data;
    }
}

class linkedQueue
{
    protected Node front, rear;
    public int size;


    public linkedQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }

    //  Function to check if queue is empty
    public boolean isEmpty()
    {
        return front == null;
    }

    //  Function to get the size of the queue
    public int getSize()
    {
        return size;
    }

    //  Function to insert an element to the queue
    public void insert(int data)
    {
        Node nptr = new Node(data, null);
        if (rear == null)
        {
            front = nptr;
            rear = nptr;
        }
        else
        {
            rear.setLink(nptr);
            rear = rear.getLink();
        }
        size++;
    }

    //  Function to remove front element from the queue
    public int remove()
    {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        front = ptr.getLink();
        if (front == null)
            rear = null;
        size--;
        return ptr.getData();
    }

    //  Function to check the front element of the queue
    public int peek()
    {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }

    //  Function to display the status of the queue
    public void display()
    {
        System.out.print("\nQueue = ");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return;
        }
        Node ptr = front;
        while (ptr != rear.getLink())
        {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }
}

class LinkedQueueImplement
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        linkedQueue lq = new linkedQueue();

        System.out.println("Linked Queue Test\n");
        char ch;
        System.out.println("\nQueue Operations");
        System.out.println("1. Insert");
        System.out.println("2. Remove");
        System.out.println("3. Peek");
        System.out.println("4. Check empty");
        System.out.println("5. Size");
        do
        {
            System.out.print("Enter choice  : ");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter integer element to insert : ");
                    lq.insert(scan.nextInt());
                    break;
                case 2:
                    try
                    {
                        System.out.println("Removed Element = " + lq.remove());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3:
                    try
                    {
                        System.out.println("Peek Element = " + lq.peek());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Empty status = " + lq.isEmpty());
                    break;

                case 5:
                    System.out.println("Size = " + lq.getSize());
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            // display queue       
            lq.display();

            System.out.print("\nDo you want to continue (Type y or n) : ");
            ch = scan.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y');
    }
}
Output
Linked Queue Test


Queue Operations
1. Insert
2. Remove
3. Peek
4. Check empty
5. Size
Enter choice  : 1
Enter integer element to insert : 25

Queue = 25

Do you want to continue (Type y or n) : y
Enter choice  : 1
Enter integer element to insert : 36


Singly Linked List
import java.util.Scanner;

class Node
{
    protected int data;
    protected Node link;

    public Node()
    {
        link = null;
        data = 0;
    }

    public Node(int d, Node n)
    {
        data = d;
        link = n;
    }
    //  Function to set link to next Node 
    public void setLink(Node n)
    {
        link = n;
    }
    //  Function to set data to current Node  
    public void setData(int d)
    {
        data = d;
    }
    //  Function to get link to next node  
    public Node getLink()
    {
        return link;
    }
    //  Function to get data from current Node  
    public int getData()
    {
        return data;
    }
}

// Class linkedList 
class linkedList
{
    protected Node start;
    protected Node end;
    public int size;

    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    //  Function to check if list is empty  
    public boolean isEmpty()
    {
        return start == null;
    }
    //  Function to get size of list  
    public int getSize()
    {
        return size;
    }
    //  Function to insert an element at begining  
    public void insertAtStart(int val)
    {
        Node nptr = new Node(val, null);
        size++;
        if (start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setLink(start);
            start = nptr;
        }
    }
    // Function to insert an element at end  
    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val, null);
        size++;
        if (start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            end.setLink(nptr);
            end = nptr;
        }
    }
    // Function to insert an element at position  
    public void insertAtPos(int val, int pos)
    {
        Node nptr = new Node(val, null);
        Node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size; i++)
        {
            if (i == pos)
            {
                Node tmp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }
    //  Function to delete an element at position  
    public void deleteAtPos(int pos)
    {
        if (pos == 1)
        {
            start = start.getLink();
            size--;
            return;
        }
        if (pos == size)
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size--;
            return;
        }
        Node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size - 1; i++)
        {
            if (i == pos)
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }
    //  Function to display elements  
    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getLink() == null)
        {
            System.out.println(start.getData());
            return;
        }
        Node ptr = start;
        System.out.print(start.getData() + "->");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData() + "\n");
    }
}

 class SinglyLinkedList
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        linkedList list = new linkedList();
        char ch;
        //  Perform list operations  
        do
        {
            System.out.println("Singly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter integer element to insert");
                    list.insertAtStart(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to insert");
                    list.insertAtEnd(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Enter integer element to insert");
                    int num = scan.nextInt();
                    System.out.println("Enter position");
                    int pos = scan.nextInt();
                    if (pos <= 1 || pos > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.insertAtPos(num, pos);
                    break;
                case 4:
                    System.out.println("Enter position");
                    int p = scan.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.deleteAtPos(p);
                    break;
                case 5:
                    System.out.println("Empty status = " + list.isEmpty());
                    break;
                case 6:
                    System.out.println("Size = " + list.getSize() + " \n");
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display List  */
            list.display();
            System.out.println("Do you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y');
    }
}
Output
Singly Linked List Operations

1. insert at begining
2. insert at end
3. insert at position
4. delete at position
5. check empty
6. get size
1
Enter integer element to insert
10

Singly Linked List = 10
Do you want to continue (Type y or n) 

y

Infix Postfix and Prefix
import java.io.*;

class Stack
{
    private char[] a;
    private int top, m;
    public Stack(int max)
    {
        m = max;
        a = new char[m];
        top = -1;
    }

    public void push(char key)
    {
        a[++top] = key;
    }

    public char pop()
    {
        return (a[top--]);
    }

    public char peek()
    {
        return (a[top]);
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }
}

class Evaluation
{
    private Stack s;
    private String input;
    private String output = "";

    public Evaluation(String str)
    {
        input = str;
        s = new Stack(str.length());
    }

    public String inToPre()
    {
        int i;

        for (i = (input.length() - 1); i >= 0; i--)
        {
            char ch = input.charAt(i);
            switch (ch)
            {
                case '+':
                case '-':
                    gotOperator(ch, 1, ')');
                    break;
                case '*':
                case '/':
                    gotOperator(ch, 2, ')');
                    break;
                case ')':
                    s.push(ch);
                    break;
                case '(':
                    gotParenthesis(')');
                    break;
                default:
                    output = ch + output;
            }
        }

        while (!s.isEmpty())
        {
            output = s.pop() + output;
        }
        return output;
    }

    public String inToPost()
    {
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            switch (ch)
            {
                case '+':
                case '-':
                    gotOperator(ch, 1, '(');
                    break;
                case '*':
                case '/':
                    gotOperator(ch, 2, '(');
                    break;
                case '(':
                    s.push(ch);
                    break;
                case ')':
                    gotParenthesis('(');
                    break;
                default:
                    output = output + ch;
            }
        }

        while (!s.isEmpty())
        {
            output = output + s.pop();
        }
        return output;
    }

    public String preToPost()
    {
        Stack f = new Stack(input.length());
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                s.push(ch);
                f.push('0');
            }
            else
            {
                output = output + ch;
                while (f.peek() == '1')
                {
                    output = output + s.pop();
                    f.pop();
                    if (f.isEmpty())
                        break;
                }
                if (!f.isEmpty())
                    f.pop();
                f.push('1');
            }
        }
        return output;
    }

    private void gotOperator(char opThis, int prec1, char x)
    {
        while (!s.isEmpty())
        {
            char opTop = s.pop();
            if (opTop == x)
            {
                s.push(opTop);
                break;
            }
            else
            {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1 && x == '(')
                {
                    s.push(opTop);
                    break;
                }
                else if (prec2 <= prec1 && x == ')')
                {
                    s.push(opTop);
                    break;
                }
                else
                {
                    if (x == ')')
                        output = opTop + output;
                    else
                        output = output + opTop;
                }
            }
        }
        s.push(opThis);
    }

    private void gotParenthesis(char x)
    {
        while (!s.isEmpty())
        {
            char ch = s.pop();
            if (ch == x)
                break;
            else
            {
                if (x == ')')
                    output = ch + output;
                else
                    output = output + ch;
            }
        }
    }
}

class BinaryTreeTraversal
{
    public static void main(String args[]) throws IOException
    {
        String s, check = "y";
        int n;
        Evaluation ev;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (check.equals("y"))
        {
            System.out.println("MENU");
            System.out.println("1. Infix to Prefix");
            System.out.println("2. Infix to Postfix");
            System.out.println("3. Prefix to Postfix");
            System.out.println("Enter your choice");

            n = Integer.parseInt(br.readLine());
            switch (n)
            {
                case 1:
                    System.out.println("Enter the infix expression ");
                    s = br.readLine();
                    ev = new Evaluation(s);
                    System.out.println("Prefix expression : " + ev.inToPre());
                    break;

                case 2:
                    System.out.println("Enter the infix expression ");
                    s = br.readLine();
                    ev = new Evaluation(s);
                    System.out.println("Postfix expression : " + ev.inToPost());
                    break;

                case 3:
                    System.out.println("Enter the Prefix expression ");
                    s = br.readLine();
                    ev = new Evaluation(s);
                    System.out.println("Postfix expression : " + ev.preToPost());
                    break;

                default:
                    System.out.println("Invalid input");
            }
            System.out.println("Press y to continue");
            check = br.readLine();
        }
    }
}
Output

MENU
1. Infix to Prefix
2. Infix to Postfix
3. Prefix to Postfix
Enter your choice
1
Enter the infix expression
this
Prefix expression : this
Press y to continue
y
MENU
1. Infix to Prefix
2. Infix to Postfix
3. Prefix to Postfix
Enter your choice

Exception Handling
Array Index Out Of Bounds
class ArrayIndexOutOfBounds
{

    public static void main(String[] args)
    {

        String languages[] = {"C", "C++", "Java", "Perl", "Python"};

        try
        {

            for (int c = 1; c <= 5; c++)
            {

                System.out.println(languages[c]);

            }

        }
        catch (Exception e)
        {

            System.out.println(e);

        }
    }
}
Output
C++
Java
Perl
Python
java.lang.ArrayIndexOutOfBoundsException: 5

Divide By Zero
Array Index Out Of Bounds
class ArrayIndexOutOfBounds
{

    public static void main(String[] args)
    {

        String languages[] = {"C", "C++", "Java", "Perl", "Python"};

        try
        {

            for (int c = 1; c <= 5; c++)
            {

                System.out.println(languages[c]);

            }

        }
        catch (Exception e)
        {

            System.out.println(e);

        }
    }
}
Output
C++
Java
Perl
Python
java.lang.ArrayIndexOutOfBoundsException: 5

Divide By Zero

Throw an Exception
Multiple Catch Blocks
Create Your Own Exception
Using Only Try Block
Using Finally
Using Throws Keyword




Abstrak	1
What Will I Learn?	1
Who is the target audience?	1
Benefits	1
Requirements	1
Introduction	2
computer program	2
What is Java ?	2
History of Java	3
Features of java	3
Java Setup	5
Installing Java	5
Setting Path Variable	6
Compiling and Execution	8
Java Basics	9
Step in Java	9
Syntax	9
Hello World	10
Comment in java	11
Jaya Keywords	11
Naming Conventions	13
Data types & variable	14
Data Types	14
Reference Data Types	16
Variables	16
Decision making	18
If Statement	18
If Else Statement	19
If Else If Ladder	20
Nested If.. Else Statement	22
Switch Statement	23
Loops	25
While Loop	25
doo. While loop	26
For Loop	27
Enhanced For Loop	28
Arrays	29
What is an Array	29
Creating an Array	30
Initializing an Array	30
Array Length	31
Accessing an Array	31
Iterating Array	32
Array Example	32
Multi-Dimensional Arrays	33
Classes	34
What is Class in Java	34
Defining a Class in Java	35
Classes with Methods	35
Classes and Objects	36
Constructors	36
What are Constructors	36
Parameterized Constructor in Java	37
Difference between Constructor and Method	38
Methods	39
What are Methods in Java	39
Method Access Modifiers	39
Method Return Types	40
Multiple Return statements	40
Exception Declarations	41
Methods Calling	42
Method Overloading in Java	43
Method Overriding	45
Using Super keyword	48
Inheritance	49
What is Inheritance	49
Extends keyword	49
Types of inheritance	51
Single Inheritance	51
Multilevel Inheritance	52
Hierarchical Inheritance	53
Hybrid Inheritance	54
Why Multiple Inheritance is not Supported in Java	55
The Instance of operator	56
Super keyword	57
Aggregation	59
Code	61
Programs inFormula	61
Area of a Circle	61
Calculate Mean	61
Calculator	62
Harmonic Series	67
Quadratic Equation	68
Fahrenheit to Celsius	69
Multiplication Table	69
Multiplication Tables	70
Binary To Octal	71
Fraction Addition	71
Fraction Subtraction	72
Hexadecimal To Decimal	73
Octal To Decimal	73
Binary To Decimal	74
GCD of two number using Euclid's method	75
SquareRoot	75
Calculate the simple and compound interest	76
Decimal To Binary	77
Volume and Area of Cylinder	78
Pythagorean Triplet	79
Area of Rectangle	80
Area Calculator	81
Celsius to Fahreneit	83
Area of Square	84
GCDLCM	85
Binary number calculation	86
Number	87
Armstrong Number	87
Prime Number	88
Compare Two Strings	89
Factorial of a number	90
Fibonacci Series	90
Find Even or Odd	91
Largest of Three Numbers	92
Palindrome	92
Random Number	93
Swapping Two Numbers	94
HCF and LCM	95
Palindrome Primes / PalPrimes	95
Twin Primes	97
Buzz Number	98
Special Number	99
Happy Number	100
Greatest of 'n' numbers	101
Unique Number	102
Neon Number	103
Magic Number	104
Fibonacci using Recursion	106
Find Resultant Palindrome of Number	106
Roman Number to Decimal	108
Duck Number	110
HailStone Sequence	111
Perfect Number	111
Prime Factors of a Number	112
Convert Number to Words	113
Disarium Number	116
Factorial using Recursion	117
Check whether two numbers are Amicable Numbers	118
Kaprekar Number or Not	119
Swap numbers with two variables only	120
Reverse a Number	122
Krishna Murthy Number	123
Automorphic Numbers	124
Keith Number	125
SquareRoot of a Number	126
Check whether Number is Prime	126
Largest Smallest	127
Adam Number	128
Tribonacci Series	130
Amicable Number	131
Primorial Number	132
Lucas Series	133
Sunny Number	134
Find perfect square number within a Range	134
Factors of integer	135
Convert Number to Word	136
Niven Number	138
Floor Value	139
Top Two Maximum Number in Array	139
Common Numbers Between Two Arrays	140
Search	141
Binary Search	141
Linear / Sequential Search	142
inSort	143
Bubble Sort	143
Heap Sort	145
Insertion Sort	147
Merge Sort	148
Quick Sort	150
Selection Sort	151
Shell Sort	153
Object Sorting with Comparator	155
Selection Sort in Descending Order	158
Enumeration Sort	159
Sorting Array in Ascending and Descending order	160
Skip List	162
Exchange Sort	165
Bubble Sort in Descending order	166
inString	167
Find All Substrings	167
Reverse of a String	168
String Equals Test	169
String Concatenate	169
String Length & Trim	170
Change case of a String	171
Reverse a String Using Recursive	171
String Tokenizer	172
Check Palindrome	172
Strings sorting in ascending order (Alphabetical order)	173
Longest word in a String	174
Convert a English word into Piglatin	175
String length without using length()	176
String Reverse without using reverse()	177
Single String Sort	177
ASCII to char & char to ASCII	178
Count Number of Words in a Sentence	178
Number of vowels in String	179
Reverse Sentence	180
String Concatenation Using Plus Operator	180
Reverse Sentence without Using split()	181
Permutations of the given string	182
StringBuilder Example	183
Sum Of Numbers in String	184
Anagram without Recursion	185
Count No. of Times a Char Occurred in a Sentence	186
Sort Names in Alphabetical/Ascending Order	187
Reverse Word in the Sentence	188
Repeat the String	189
Count number of Punctuations in a sentence	190
Format a String	191
String Start With	191
HTML Tag Remover	191
inThread	192
Get Current Thread	192
Multi Thread Example	192
Simple Runnable Example	193
Synchronized Threads Example	193
Two Threads Example	195
Set Thread Name Example	196
setPriority() and getPriority() Thread	197
Thread Deadlock Example	197
Multiplication Table Using Thread	199
loop	200
For-each / Enhanced For Loop	200
Break Example	200
Continue Example	201
Do-While Loop	202
For Loop	202
While Loop	203
Basic	204
Hello World	204
Switch Statement	204
If Else	205
Add Two Numbers	205
Command Line Argument	206
BufferedReader Example	206
File Handling	207
Read Binary File	207
Read File	209
Write Binary File	210
Write File	211
Serialization Example	213
Copy File using Byte Stream	213
Copy File using Character Stream	214
Create a file	215
Create a directory	216
Delete a file	216
Delete a directory	217
Miscellaneous	217
Scanner Class Example(User Input)	217
Test Static Keyword	219
Print Alphabets	219
Stack Operation using Stack Class	220
Zodiac Signs	221
BigInteger Example	225
Command Line Example	226
Binary Addition	227
Email Validation	228
Format time in 24 hour Format	229
Leap Year	229
Call by Value Call by Reference	230
Instance Of	231
FizzBuzz Program	231
Print Date and Time	232
User Validation	233
Counter using Static Variable	234
Count Vowels Consonents Blanks and numbers	235
Currency Converter	236
Largest among two numbers	239
Bike Rent system example	239
Number Guessing Game	241
MarkSheet	243
Square Root without Inbuilt Function	244
Remove Zero from given number	244
Date format	245
Keyboard macros	246
Calendar	247
Pendulum	248
Balanced brackets	250
Boolean Wrapper Object	252
String to Boolean Value	253
Primitive Boolean Constants	253
Math rint Method	253
Display list of TimeZone with GMT	254
OOP	255
Abstract Example - Shape	255
Constructor	256
Inheritance Example	256
Method Overloading	258
Method Overriding	258
Class Example - Circle	259
Class Usage - CircleDemo	260
Methods Example - BicycleDemo	261
Abstract Example - Game	262
Inheritance Example - Child	263
Encapsulation	264
Interface example - Multiple inheritance	265
Multilevel Inheritance Example	266
Constructor Overloading	267
Single Inheritance	268
Hybrid Inheritance	270
Address Details using 'this' keyword	271
Polymorphism Method Overriding	272
Inheritance - Accessing parent class property with super keyword	272
Parameterized Constructor	273
Passing argument/parameter in constructor	273
Using Final Keyword	274
Wrapper Example	275
Applet	276
Simple Applet	276
GUI	277
Login Form Example	277
Array	278
Array Copy Example	278
Array Copy Of Range	278
Array Example	279
Array of Arrays	280
Array Operations	280
Create & Display Matrix	281
Display Array using For-Each Loop	283
Matrix Operations	283
Matrix Multiplication	286
Matrix Subtraction	288
Multidimensional Array	291
Matrix Addition	291
2 Dimensional Array	294
Magic Matrix	295
Missing number in an Array	297
Mirror Matrix	298
Sort an Array	299
Merge Two Array	300
Symmetric matrix	301
Object Array	303
Sort 2D Array	305
Array Sort	307
Transpose Matrix using one Array	308
Middle value of an array	309
Find Closest value of a number in an Array	311
Double Matrix	312
Basic Array	314
Add Two Matrix	315
Example to Pass Arrays to Function	317
Array Sum and Average	319
System	319
Find IP Address of Machine	319
Recursion	320
Tower	320
Mathematics and Science	321
Radian to Degree	321

Throw an Exception
class MyExplicitThrow
{

    public static void main(String a[])
    {

        try
        {

            MyExplicitThrow met = new MyExplicitThrow();
            System.out
                    .println("length of JUNK is " + met.getStringSize("JUNK"));

            System.out.println("length of WRONG is "
                                       + met.getStringSize("WRONG"));

            System.out.println("length of null string is "
                                       + met.getStringSize(null));

        }
        catch (Exception ex)
        {

            System.out.println("Exception message: " + ex.getMessage());

        }
    }

    public int getStringSize(String str) throws Exception
    {

        if (str == null)
        {

            throw new Exception("String input is null");

        }

        return str.length();
    }
}
Output
length of JUNK is 4
length of WRONG is 5
Exception message: String input is null

Multiple Catch Blocks
import java.net.MalformedURLException;
import java.net.URL;

class MyMultipleCatchBlocks
{

    public static void main(String a[])
    {

        MyMultipleCatchBlocks mmcb = new MyMultipleCatchBlocks();
        mmcb.execute(1);
        mmcb.execute(2);

    }

    public void execute(int i)
    {

        try
        {

            if (i == 1)
            {

                getIntValue("7u");

            }
            else
            {

                getUrlObj("www.junksite.com");

            }

        }
        catch (NumberFormatException nfe)
        {

            System.out.println("Inside NumberFormatException... "
                                       + nfe.getMessage());

        }
        catch (MalformedURLException mue)
        {

            System.out.println("Inside MalformedURLException... "
                                       + mue.getMessage());

        }
        catch (Exception ex)
        {

            System.out.println("Inside Exception... " + ex.getMessage());

        }
    }

    public int getIntValue(String num)
    {

        return Integer.parseInt(num);

    }

    public URL getUrlObj(String urlStr) throws MalformedURLException
    {

        return new URL(urlStr);

    }
}
Output
Inside NumberFormatException... For input string: "7u"
Inside MalformedURLException... no protocol: www.junksite.com

Create Your Own Exception
class MyOwnException
{

    public static void main(String[] a)
    {

        try
        {

            MyOwnException.myTest(null);

        }
        catch (MyAppException mae)
        {

            System.out.println("Inside catch block: " + mae.getMessage());

        }
    }

    static void myTest(String str) throws MyAppException
    {

        if (str == null)
        {

            throw new MyAppException("String val is null");

        }
    }
}

class MyAppException extends Exception
{

    private String message = null;

    public MyAppException()
    {
        super();
    }

    public MyAppException(String message)
    {

        super(message);
        this.message = message;

    }

    public MyAppException(Throwable cause)
    {

        super(cause);

    }

    @Override
    public String toString()
    {

        return message;

    }

    @Override
    public String getMessage()
    {

        return message;

    }
}
Output
Inside catch block: String val is null

Using Only Try Block
import java.net.MalformedURLException;
import java.net.URL;

class MyTryBlockOnly
{

    public static void main(String a[]) throws MalformedURLException
    {

        try
        {

            URL url = new URL("http://www.google.com");

        }
        finally
        {

            System.out.println("In finally block");

        }
    }
}
Output
In finally block

Using Finally
class UsingFinally
{

    public static void main(String[] args)
    {

        try
        {

            int a = 3 / 0;
            System.out.println(a);

        }
        catch (Exception e)
        {

            System.out.println(e);

        }
        finally
        {

            System.out.println("finally block will execute always.");

        }
    }
}
Output
java.lang.ArithmeticException: / by zero
finally block will execute always.

Using Throws Keyword
import java.io.IOException;

class UsingThrows
{

    void m() throws IOException
    {

        throw new IOException("device error");// checked exception

    }

    void n() throws IOException
    {

        m();

    }

    void p()
    {

        try
        {

            n();

        }
        catch (Exception e)
        {

            System.out.println("exception handled");

        }
    }

    public static void main(String args[])
    {

        UsingThrows obj = new UsingThrows();
        obj.p();
        System.out.println("normal flow...");

    }
}
Output
exception handled
normal flow...
