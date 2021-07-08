package Module1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Main {
    public static void main(String[] args){
        System.out.println("\n---------------------------------------------------------------------------");
        System.out.println("These are the exercises of basic programming in Java for Globant Univeristy");

        String opt = IntroductionMessage();

        while(!opt.equals("EXIT") && !opt.equals("exit")) {            
            HandlerMenu(opt);
            SaveLastFiveOptions(opt);
            opt = IntroductionMessage();
        }

    }

    public static boolean res;
    public static int[] arrNumbers;
    public static String receiveKeys = "";
    public static Scanner write = new Scanner(System.in);
    public static Random myRandom = new Random();
    public static int[] lastFiveOptions = new int[5];

    public static String IntroductionMessage(){
        System.out.println("\n---------------------------------------------------------------------------");
        System.out.println("MENU");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Write the number for the option which you want to run \n");
        System.out.println("1. Value boolean for gender");
        System.out.println("2. Generate an array with at least 5 numbers randomly and check if the sum between the number in position 2, 3 and 4 is a pair number");
        System.out.println("3. Generate an array with many numbers randomly and check if at least of these is pair");
        System.out.println("4. Write two words and check if are equals");
        System.out.println("5. Write a number and check if is a Capicua number");
        System.out.println("6. Check if the first number is higher than number B");
        System.out.println("7. Check if the result of numberA X number B is the same result of numberA / number B");
        System.out.println("8. Check if two arrays have at least two equals numbers");
        System.out.println("9. Write a word and the system shall show this in backwards");
        System.out.println("10. Write a word to replace their vowels by X");
        System.out.println("11. Print the last five options chosen ");
        receiveKeys = write.nextLine();
        System.out.println("If you want to finish the program write 'EXIT'\n");

        return receiveKeys;
    }

    public static void HandlerMenu(String opt){
        
        System.out.println("your opt is: " + opt +"\n");

        switch(opt){
            case "1":
                System.out.println("Write 'F' if your gender is female or 'M' if is male or another");
                receiveKeys = write.nextLine();
                boolean myGender = ReturnGender(receiveKeys.charAt(0));
                System.out.println("you wrote ["+receiveKeys+"] so the result is ["+myGender+"]");
                break;
            case "2":
                arrNumbers = GenerateNumbers(2);
                int sum = arrNumbers[2]+arrNumbers[3]+arrNumbers[4];
                boolean isPair = CheckPairAndOdd(sum);
                System.out.println("\nThe sum between "+arrNumbers[2]+" + "+arrNumbers[3]+" + "+arrNumbers[4]+" = "+sum+" then pair is ["+isPair+"]");
                break;
            case "3":
                arrNumbers = GenerateNumbers(2);
                boolean hasAPair = HasAtLeastPairNumber(arrNumbers);
                System.out.println("\nThe array has at least a pair number? ["+hasAPair+"]");
                break;
            case "4":
                boolean equalWords = EqualWords();
                System.out.println("the words are equals? = ["+equalWords+"]");
                break; 
            case "5":
                System.out.println("write your number: ");
                receiveKeys = write.nextLine();
                boolean isCapicua = CapicuaNumber(receiveKeys);
                System.out.println("\nThis number "+receiveKeys+" is capicua? ["+isCapicua+"]");
                break;
            case "6":
                boolean aHigherB = NumberAHigherThanB();
                System.out.println("\nThe number A is higher than B ? ["+aHigherB+"]");
                break;
            case "7":
                boolean multiplyEqualDivision = MultiplyDivideIsTheSame();
                System.out.println("\nThe resuslt of multiply is equal to the result of division? ["+multiplyEqualDivision+"]");
                break;
            case "8":
                boolean hasAtleastTwoEqualsNumbers = HasAtleastTwoEqualsNumbers();
                System.out.println("\nThe Arrays has at least two equals number? ["+hasAtleastTwoEqualsNumbers+"]");
                break;
            case "9":
                System.out.println("Write a word");
                receiveKeys = write.nextLine();
                String reverseWord = ReversString(receiveKeys);
                System.out.println("\nThe reverse of word "+receiveKeys+" is "+reverseWord);
                break;
            case "10":
                System.out.println("Write a word");
                receiveKeys = write.nextLine();
                String newWord = ReplaceVowelsByX(receiveKeys);
                System.out.println("\nThe word ["+receiveKeys+"] with vowels replaced is "+newWord);
                break;
            case "11":
                PrintLastFiveOptions();
                break;
            default:
                System.out.println("\nThe option ["+opt+"] does not exist");
                break;
        }
    }

    public static int[] GenerateNumbers(int sizeArray){
        int arrayLength = 0;
        /* 
        if sizeArray = 1 then arrayLength = 1000
        if sizeArray = 2 then arrayLength = 5
        default value shall allow to User assign the size
        */
        switch(sizeArray){
            case 1:
                arrayLength = 100;
                break;
            case 2:
                arrayLength = 5;
                break;
            default:
                System.out.println("Write the number to assign the quantity of numbers to generate randomly");
                break;
        }

        int[] arrNumbers = new int[arrayLength];

        for(int count = 0; count < arrayLength ;count++){
            arrNumbers[count] = myRandom.nextInt(1000);
            System.out.println("The number for pos ["+count+"] = " + arrNumbers[count]);
        }
        System.out.println("\n");

        return arrNumbers;
    }
    
    public static boolean ReturnGender(char gender){
        gender = Character.toUpperCase(gender);
        boolean res;

        res = gender == 'F' ? true : false;

        return res;
    }
    
    public static boolean CheckPairAndOdd(int resSum){
        res = resSum % 2 == 0 ? true : false;

        return res;
    }

    public static boolean HasAtLeastPairNumber(int[] arrNumbers){
        int hasAPair = 0;

        for(int count = 0; count < arrNumbers.length; count++ ){
            if(arrNumbers[count] % 2 == 0){
                hasAPair++;
            }
        }

        res = hasAPair >= 1 ? true : false;

        return res;
    }

    public static boolean EqualWords(){
        String firstWord = "";
        String secondWord = "";
        
        System.out.println("Write the first word");
        firstWord = write.nextLine();
        firstWord = firstWord.toLowerCase();
        
        System.out.println("Write the second word");
        secondWord = write.nextLine();
        secondWord = secondWord.toLowerCase();

        res = firstWord.equals(secondWord) ? true : false;

        return res;
    }

    public static String ReversString(String myString){
        int lengthString = myString.length();
        char[] reverseCharArr = new char[lengthString];
        String reverseString = "";
        
        for(int count = 0; count < receiveKeys.length(); count++){
            reverseCharArr[count] = receiveKeys.charAt(lengthString-1);
            reverseString = reverseString+reverseCharArr[count];
            lengthString--;
        }

        return reverseString;
    }

    public static boolean CapicuaNumber(String number){
        String reverseNumber = ReversString(number);
        res = number.equals(reverseNumber) ? true : false;

        return res;
    }

    public static boolean NumberAHigherThanB(){
        System.out.println("write your first number: ");
        int numA = Integer.parseInt(write.nextLine());
        System.out.println("write your second number: ");
        int numB = Integer.parseInt(write.nextLine());
        System.out.println("\nThe number "+numA+" > "+numB+"?");

        res = numA > numB ? true : false;

        return res;
    }

    public static boolean MultiplyDivideIsTheSame(){
        System.out.println("write your first number: ");
        double numA = Double.parseDouble(write.nextLine());
        System.out.println("write your second number: ");
        double numB = Double.parseDouble(write.nextLine());
        double multiply = numA * numB ;
        double division = numA / numB ;

        System.out.println("\nThe resuslt of multiply = "+multiply+" the result of division =   "+division);

        res = multiply == division ? true : false;

        return res;
    }

    public static boolean MyIncludeInt(int[] arrA, int numB){
        for(int countA = 0; countA < arrA.length;countA++){
            res = false;
            if(arrA[countA] == numB){
                res = true;
                System.out.println("The number ["+numB+"] is in the listA");
                break;
            }
        }
        return res;
    }

    public static boolean HasAtleastTwoEqualsNumbers(){
        int[] arrayNumbersA = GenerateNumbers(1);
        int[] arrayNumbersB = GenerateNumbers(1);
        ArrayList<Integer> listNumbersA = new ArrayList<Integer>();
        boolean includes = false;
        int isInto = 0;
        
        //FORM 1
        for(int countA = 0; countA < arrayNumbersA.length; countA++ ){
            includes = MyIncludeInt(arrayNumbersA, arrayNumbersB[countA]);
            if(includes){
                isInto++;
            }
        }

        //FORM 2
        /* for(int countA = 0; countA < arrayNumbersA.length; countA++ ){
            listNumbersA.add(arrayNumbersA[countA]);
            System.out.println("List["+listNumbersA.get(countA)+"]");
        }

        for(int countB = 0; countB < arrayNumbersB.length; countB++ ){
            if(listNumbersA.contains(arrayNumbersB[countB])){
                System.out.println("The number ["+arrayNumbersB[countB]+"] is in the listA");
                isInto++;
            }
        } */
        
        System.out.println("isInto = "+isInto);
        res =  isInto >= 2 ? true : false;

        return res;
    }

    public static String ReplaceVowelsByX(String word){
        String regexVowels = "[aeiouAEIOU]";
        String newString = "";

        newString = word.replaceAll(regexVowels, "X");

        return newString;
    }
    
    public static int count = 0;
    public static void SaveLastFiveOptions(String opt){
        lastFiveOptions[count] = Integer.parseInt(opt);
        System.out.println("Save in pos "+count);
        count+=1;
        if(count == 5){
            count = 0;
        }
    }
    
    public static void PrintLastFiveOptions(){
        System.out.println("Your Last Five Options ");
        for(int count = 4; count >= 0; count--){
            System.out.println("Opt ["+count+"] = "+ lastFiveOptions[count]);
        }
    }
}
