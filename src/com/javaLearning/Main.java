package com.javaLearning;

public class Main {

    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 4;
        int bonus = 500;


        int totalScore=  calculateScore(true , score , levelCompleted , bonus);
        System.out.println("your total score by call method is = " + totalScore );

        /*if (gameOver){
            int finalScore = score + (levelCompleted* bonus);
            System.out.println("your final score is " + finalScore);
        }else {
            System.out.println("you are out from the game");
        }*/

        //  upper code can be also  execute by below method

        totalScore = calculateScore(true,2000 ,4,500);
        System.out.println("your total score by call method is = " + totalScore );


       /* boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if (newGameOver){
            int newFinalScore = newScore + (newLevelCompleted* newBonus);
            System.out.println("your final score is " + newFinalScore);
        }else {
            System.out.println("you are out from the game");
        }
*/

        totalScore = calculateScore(false, 10000 , 8 , 200);
        System.out.println("your total score by call method is = " + totalScore );


        // Chellenge

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message "on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //


        int calculatedScore = calculateHighScorePosition(1500);
        displayHIghScorePossition("Lovekesh" ,calculatedScore);


        calculatedScore = calculateHighScorePosition(900);
        displayHIghScorePossition("Ankit" ,calculatedScore);


        calculatedScore = calculateHighScorePosition(400);
        displayHIghScorePossition("Parul" ,calculatedScore);


        calculatedScore = calculateHighScorePosition(50);
        displayHIghScorePossition("Gaurav" ,calculatedScore);



    }

    //chellenge method
    public static void displayHIghScorePossition(String name , int possition) {

        System.out.println("Mr. " + name + " managed to get into position " + possition + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore){
       /* if (playerScore >= 1000){
            return 1;

        }else if (playerScore >= 500 ) {
            return 2;
        }else if (playerScore >= 100){
            return 3;
        }
            return 4;
*/
        int possition = 4;
        if (playerScore >= 1000){
            possition =1;

        }else if (playerScore >= 500 ) {
            possition = 2;
        }else if (playerScore >= 100){
            possition = 3;
        }
        return possition;

    }
    public static int calculateScore( boolean gameOver ,  int score , int levelCompleted ,int bonus){
        if (gameOver == true){
            int totalScore = score + (levelCompleted * bonus);
//            System.out.println("your total score by call method is = " + totalScore );
//            totalScore += 5000;
            return totalScore;
        }else {
            return -1;
        }


    }

}
