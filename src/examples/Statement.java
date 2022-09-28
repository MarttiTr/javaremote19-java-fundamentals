package examples;

public class Statement {
    public static void main(String[] args) {
        int i = 8;                                          //Combining statement makes them nested statements.
        int y = 10;
        String name = "Martti";

        if (i > y) {
            System.out.println("i is greater than y");
        }

        System.out.println("This is a simple program");

        if (name == "Martti"){
            System.out.println("Õige");
        }

        if(i > y) {
            System.out.println("i is greater than y");
        } else {
            System.out.println("y is greater than i");
        }

        if(i > y) {
            System.out.println("i is greater than y");
        } else if (i < y){
            System.out.println("i is lesser than y");
        } else {                    // Siin on else optional, ilma selleta on ka ok
            System.out.println("i is invalid");
        }

        /* SWITCH
            If we want one condition for multiple values.
         */
        int x = 5;
        int j = 6;
        int z = x + j;


        switch (z){                 // Break ja default on mõlemad optional.
            case 10:
                System.out.println("The value of z is 10");
            case 11:
                System.out.println("The value of z is 11");
               break;               // Break block is optional
            case 12:
                System.out.println("The value of z is 12");
            default:                // Default block is optional
                System.out.println("Default block executed!");
        }

        String color = "Red";

        switch(color) {
            case "Red":
                System.out.println("I am red");
                break;
            case "White":
                System.out.println("I am white");
                break;
        }


        // WHILE (entry-check loop)

        int money = 0;

        while(money <= 5) {
            System.out.println("Doing job. Money = " + money);
            money++;
        }


        // DO WHILE (exit-check loop)

        do {
            System.out.println("money =" + money);
            money += 10; // money = money + 10
        } while(money < 100);



        //FOR
        //int g = 0; // Võib ka ilma selleta kasutada
        for (int g = 0; g <= 6; g++) {      //ükskõik kui palju conditioneid on võimalik siin kasutada
            System.out.println("g value is: " + g);
        }


        //EXERCISES

        //1) if
        // Write a Java program to find if the person is adult. (Minimum adult age is 18)

        int myAge = 18;
                if (myAge >= 18)  {
                    System.out.println("The person is an adult!");
                }


        //2) if-else
        // Write a Java program to print if the given number is odd or even.

        int randomNr = 2021;
                if(randomNr % 2 == 0) {
                    System.out.println("This number is even");
                }
                else {
                    System.out.println("This number is odd");
                }


        //3) if, else-if, else
        // Write a Java program to print if the string is empty, if the length is greater then 20 and if the string is null

        String test = "";

                if (test == "")  {
                    System.out.println("The given string is empty");
                }else if (test.length() > 20)   {
                        System.out.println("The given string is so long");
                }else if(test.length() < 20)    {
                    System.out.println("The given string is too short");
                }else if (test == null)   {
                    System.out.println("The string cannot be null");
                }


        //SWITCH
        // Write a Java program to match the given alphabet
        char test2 = 'H';

        switch(test2)   {
            case 'A':
                System.out.println("The given alphabet is A");
                break;
            case 'B':
                System.out.println("The given alphabet is B");
                break;
            case 'K':
                System.out.println("The given alphabet is K");
                break;
            default:
                System.out.println("The given alphabet is not found");
        }


        // Write a Java program to print all the odd numbers from 1 to 50.

        for(int p=1; p < 51;  p++)
            if(p % 2 != 0) {
                System.out.println(p + " This is odd number");
            }

        }
    }

