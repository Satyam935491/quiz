import java.util.Scanner;

public class QuizApplication {
    static final int NUM_QUESTIONS = 5;
    static final int TIME_LIMIT_PER_QUESTION = 20; // seconds

    static String[] questions = {
        "1. What is the capital of France?",
        "2. What is the largest planet in our solar system?",
        "3. Who wrote 'Romeo and Juliet'?",
        "4. What is the chemical symbol for water?",
        "5. Who painted the Mona Lisa?"
    };

    static String[][] options = {
        {"A. London", "B. Paris", "C. Rome", "D. Madrid"},
        {"A. Venus", "B. Jupiter", "C. Earth", "D. Mars"},
        {"A. William Shakespeare", "B. Jane Austen", "C. Charles Dickens", "D. Mark Twain"},
        {"A. H2O", "B. NaCl", "C. CO2", "D. H2SO4"},
        {"A. Leonardo da Vinci", "B. Michelangelo", "C. Vincent van Gogh", "D. Pablo Picasso"}
    };

    static char[] answers = {'B', 'B', 'A', 'A', 'A'};

    static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Application!");

        for (int i = 0; i < NUM_QUESTIONS; i++) {
            System.out.println("\n" + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            String userAnswer = scanner.next().toUpperCase();

            if (userAnswer.charAt(0) == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }

            try {
                Thread.sleep(TIME_LIMIT_PER_QUESTION * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nQuiz complete!");
        System.out.println("Your final score: " + score + " out of " + NUM_QUESTIONS);

        scanner.close();
    }
}
