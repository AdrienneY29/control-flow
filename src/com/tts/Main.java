package com.tts;
import java.util.Scanner;

public class Main {

//   int jerseyNum;
//   int randomNum;
//   int modelYr;
//   int luckyNum;
//    String actor;

    public static void main(String[] args) {
        // write your code here
        //this is for converting letters and numbers into ascii values; casting is used here to convert letter into integer.
        ////AsciiChars.printNumbers();
        for (int i = '0'; i <= '9'; i++)
        System.out.println(i);
        ////AsciiChars.printUpperCaseLetters();
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }
      ////AsciiChars.printLowerCaseLetters();
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
//
//

        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your name? ");     // type a word and hit enter
        String yourName = userInput.nextLine();
        System.out.printf("Hello, %s \n", yourName);
        System.out.println("Do you want to continue? yes or no?");
        String answer = userInput.nextLine();

      if  (answer.equals("yes")) {
          System.out.println("Glad you want to continue");
          System.out.println("What is the name of your favorite pet?");
          String petName = userInput.nextLine();
          System.out.println("how old is your pet?");
          int petAge = userInput.nextInt();
          System.out.println("What is your lucky number?");
          int luckyNum = userInput.nextInt();
          userInput.nextLine();
          System.out.println("Do you have a red car? yes or no");
          String redCar = userInput.nextLine();
          System.out.println("Do you have a favorite quarterback?");
          String yesOrNo = userInput.nextLine();
          if (yesOrNo.equals("no")) {
              System.out.println("I don't have a favorite quarterback either.");
              System.exit(0);
          }
          if (yesOrNo.equals("yes")){
              System.out.println("What is the quarterback's jersey number?");
              int jerseyNum = userInput.nextInt();
              System.out.println("What is two-digit model year of your car?");
              int modelYr = userInput.nextInt();
              userInput.nextLine();
              System.out.println("What is the first name of your favorite actor or actress?");
              String actor = userInput.nextLine();
              System.out.println("Enter a random number between 1 and 50.");
              int randomNum = userInput.nextInt();

////

////            // Generating Lottery Numbers
////
////            //to generate magic ball number
              int magicNum = jerseyNum * randomNum;
              if (magicNum > 75) {
                  magicNum -= 75;
              }
              System.out.println("your magic ball number is " + magicNum);
//
////            //non magic numbers
////
////            //random no. 1 fav. quarterback number + age of pet + lucky number
////
////            //1.convert first letter of fav actress's name to an integer and use that value
              char letter = actor.charAt(0);
              int num = letter;
              System.out.println(num);
              if (num > 65) {
                  num -= 65;
              }
              System.out.println("your random number 1 is " + num);
//////            // another way to generate ascii number from a character
//            for (int i='a';  i <= 'z'; i++)
////             'letter' = actor.charAt(0);
////             }
//                System.out.print(letter);
//
//
////
////            //2. Use the two digit model year of their car and add their lucky number to it.
              int num2 = modelYr + luckyNum;
              System.out.println("Random number 2 is " + num2);

////            //3. Use the random number between 1 and 50, subtracting one of the generated random numbers.
              double num3 = Math.random() * 50;
              num3 = Math.round(num3);
              int num4 = (int) num3;
              System.out.println("Your random number 3 is " + num4);

////            //Use the value 42.
////            // 4. Use the age of their favorite pet + their car model year.
              int num5 = petAge + modelYr;
              System.out.println("Your random number 4 is " + num5);

//            //5. Favorite quarterback number + age of pet + lucky number.
              int num6 = jerseyNum + petAge + luckyNum;
              if (num6 > 65) {
                  num6 -= 65;
              }
              System.out.println("Your random number 5 is " +num6);

              int[] lottery = {num, num2, num4, num5, num6};
              System.out.println("Your lottery numbers are " + lottery[0] + "," + lottery[1] + "," + lottery[2] + "," + lottery[3]
                      + "," + lottery[4]);

              System.out.println("Your Magic Ball number is " + magicNum);
          } else {
              System.out.println("Please return at a later time to complete the survey");
              System.exit(0);
          }
      }

//
        }
    }

