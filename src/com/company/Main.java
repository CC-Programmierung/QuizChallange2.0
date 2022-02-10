package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Integer> numberDrawn = new ArrayList<>();
   static ArrayList<Integer> randomNumbers = new ArrayList<>();
    static Random rand = new Random();
    private static int randNum;

    //Starts the Programm through Main
    public static void main(String[] args) throws IOException {
        int round = 0;
        do {
            System.out.println("Press Enter....");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String user = br.readLine();
            createQuestions();

        }while (round != 10);
    }

    //Checks if Number are rolled twice in a row ---> next ONLY one Number per Round
    public static int randomNumber(){
        boolean isRepeated;
        randNum = rand.nextInt(10) + 1;
        int nRandNum = 0;
        randomNumbers.add(randNum);
        int secondLastIndex = 0;
        try {
            secondLastIndex = randomNumbers.get(randomNumbers.size() - 2);
        }catch (IndexOutOfBoundsException ex){}

        do{
            if(randNum == secondLastIndex){
                isRepeated = true;
                nRandNum = rand.nextInt(10) + 1;
                randNum = nRandNum;
            }else{
                break;
            }
        }while (isRepeated);
        return  randNum;
    }

    //Gets the Question from Questions Class with randomNumber Method
    public static void createQuestions(){
        Questions q = new Questions();
        int randNum = randomNumber();
        if(randNum == 1){
            System.out.println(q.question1);
        }else if( randNum == 2){
            System.out.println(q.question2);
        }else if(randNum == 3){
            System.out.println(q.question3);
        }else if(randNum == 4){
            System.out.println(q.question4);
        }else if(randNum == 5){
            System.out.println(q.question5);
        }else if(randNum == 6){
            System.out.println(q.question6);
        }else if(randNum == 7){
            System.out.println(q.question7);
        }else if(randNum == 8){
            System.out.println(q.question8);
        }else if(randNum == 9){
            System.out.println(q.question9);
        }else if(randNum == 10){
            System.out.println(q.question10);
        }else{
            System.out.println("Keine Fragen");
        }
    }
}
