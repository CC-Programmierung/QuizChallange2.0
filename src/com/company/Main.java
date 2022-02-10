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



    public static void main(String[] args) throws IOException {
        int round = 0;
        do {
            System.out.println("Press Enter....");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String user = br.readLine();

            //randomNumber();
            createQuestions();
        }while (round != 10);
    }


    public static int randomNumber(){
        boolean isRepeated;
        randNum = rand.nextInt(10) + 1;
        int nRandNum = 0;
        randomNumbers.add(randNum);
        int secondLastIndex = 0;
        try {
            secondLastIndex = randomNumbers.get(randomNumbers.size() - 2);
        }catch (IndexOutOfBoundsException ex){}

        //System.out.println("Vorletzte gewürfelte Zahl: " + secondLastIndex);
        //System.out.println("Die gezogene Zahl ist: " + randNum);

        do{
            if(randNum == secondLastIndex){
                isRepeated = true;
                nRandNum = rand.nextInt(10) + 1;
                randNum = nRandNum;
                //System.out.println("Zahl ist Doppelt");
                //(System.out.println("Die neu gewürfelte Zahl ist: " + randNum);
            }else{
                //System.out.println("Zahl ist NICHT Doppelt");
                break;
            }
        }while (isRepeated);
        return  randNum;
    }

    public static void createQuestions(){
        Questions q = new Questions();
        randNum = randomNumber();
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
