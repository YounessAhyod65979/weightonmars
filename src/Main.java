public class Main {

    public static void main(String[] args) {

        float earthWeightAhyod;

        float marsWeightAhyod;

        double marsWeightInDouble;

        int marsWeightInInt;

        earthWeightAhyod = 80;

        marsWeightAhyod= (earthWeightAhyod * 0.38F);

        System.out.println(earthWeightAhyod + " kg on Earth is " +  marsWeightAhyod + " kg on Mars");


        marsWeightInDouble =  marsWeightAhyod;

        System.out.println("Kilograms on Mars after converting to double "+marsWeightInDouble);


        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n", marsWeightInDouble);


        marsWeightInInt = (int)marsWeightInDouble;

        System.out.println("Kilograms on Mars when casted to integer " + marsWeightInInt);

        char c = (char)marsWeightInInt;

        System.out.println("The ASCII table equivalent of masrWeigtInInt is: " + c);


        int exampleOfMathOnChar = c * c;

        System.out.println("An example of a mathematical operation on the char type: "+ exampleOfMathOnChar);

    }
}