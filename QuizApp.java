package com.quizgame;
import java.util.Scanner;
public class QuizApp {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] questions = {
        		
            {"1. What is the capital of India?",
                    "a. Mumbai", "b. New Delhi", "c. Chennai", "d. Kolkata", "b"},

            {"2. Which planet is known as the Red Planet?",
                    "a. Earth", "b. Venus", "c. Mars", "d. Jupiter", "c"},

            {"3. Who wrote 'Romeo and Juliet'?",
                    "a. Shakespeare", "b. Dickens", "c. Rowling", "d. Tolkien", "a"},

            {"4. What is 5 + 7?",
                    "a. 10", "b. 12", "c. 14", "d. 11", "b"},

            {"5. Which is the largest ocean on Earth?",
                    "a. Atlantic Ocean", "b. Indian Ocean", "c. Pacific Ocean", "d. Arctic Ocean", "c"},

            {"6. Who is known as the Father of Computers?",
                    "a. Newton", "b. Charles Babbage", "c. Einstein", "d. James Watt", "b"},

            {"7. Which country invented paper?",
                    "a. India", "b. China", "c. Egypt", "d. Japan", "b"},

            {"8. What is the smallest continent?",
                    "a. Europe", "b. Australia", "c. Africa", "d. Antarctica", "b"},

            {"9. Which gas do plants absorb?",
                    "a. Oxygen", "b. Nitrogen", "c. Carbon Dioxide", "d. Hydrogen", "c"},

            {"10. Water boils at what temperature?",
                    "a. 50°C", "b. 100°C", "c. 90°C", "d. 200°C", "b"},

            {"11. What is the chemical symbol for Gold?",
                    "a. G", "b. Au", "c. Ag", "d. Go", "b"},

            {"12. How many bones are in the human body?",
                    "a. 206", "b. 180", "c. 201", "d. 250", "a"},

            {"13. Which organ pumps blood?",
                    "a. Brain", "b. Heart", "c. Liver", "d. Kidney", "b"},
            
            {"14. What does CPU stand for?",
                    "a. Central Processing Unit", "b. Control Process Utility", "c. Computer Power Unit", "d. Central Power Utility", "a"},

            {"15. What does RAM stand for?",
                    "a. Random Access Memory", "b. Read And Modify", "c. Run Access Mode", "d. Remote Access Module", "a"},

            {"16. Which language is used to create Android Apps?",
                    "a. C", "b. Java", "c. PHP", "d. SQL", "b"},

            {"17. What is the value of Pi?",
                    "a. 2.14", "b. 3.14", "c. 4.13", "d. 3.41", "b"},

            {"18. Solve: 15 × 3",
                    "a. 35", "b. 45", "c. 50", "d. 25", "b"},

            {"19. What is 100 divided by 4?",
                    "a. 10", "b. 20", "c. 25", "d. 30", "c"},

            {"20. Which device is used to input data?",
                    "a. Monitor", "b. Keyboard", "c. Speaker", "d. Projector", "b"}
        };
        int score = 0;
        System.out.println("\n==============================");
        System.out.println("        QUIZ APP (JAVA)       ");
        System.out.println("==============================");
        System.out.println("Answer using options: a / b / c / d\n");

        for (String[] q : questions) {
            System.out.println(q[0]);
            System.out.println(q[1]);
            System.out.println(q[2]);
            System.out.println(q[3]);
            System.out.println(q[4]);
            System.out.print("\nYour answer: ");

            String userAns = scanner.nextLine().trim();
            if (userAns.equalsIgnoreCase(q[5])) {
                System.out.println("✔ Correct!\n");
                score++;
            } else {
                System.out.println("✘ Wrong! Correct answer: " + q[5] + "\n");
            }
        }
        System.out.println("==============================");
        System.out.println("          QUIZ RESULT         ");
        System.out.println("==============================");
        System.out.println("Your Score: " + score + " / " + questions.length);
        System.out.println("==============================");

        scanner.close();
    }
}
