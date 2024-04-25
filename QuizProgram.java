import java.util.*;

public class QuizProgram {
    private static Map<String, List<String>> questions = new HashMap<>();
    private static Map<String, String> correctAnswers = new HashMap<>();
    private static int score = 0;

    public static void main(String[] args) {
        initializeQuestions();
        displayMenu();
    }

    private static void initializeQuestions() {
               questions.put("What is the capital of France?", Arrays.asList("A. Paris", "B. London", "C. Rome", "D. Berlin"));
        correctAnswers.put("What is the capital of France?", "A");

        questions.put("Which planet is known as the Red Planet?", Arrays.asList("A. Jupiter", "B. Mars", "C. Saturn", "D. Venus"));
        correctAnswers.put("Which planet is known as the Red Planet?", "B");

            }

    private static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        for (String question : questions.keySet()) {
            List<String> options = questions.get(question);
            System.out.println(question);
            for (String option : options) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().toUpperCase();
            checkAnswer(question, answer);
        }
        System.out.println("Quiz completed! Your score is: " + score + "/" + questions.size());
        scanner.close();
    }

    private static void checkAnswer(String question, String answer) {
        String correctAnswer = correctAnswers.get(question);
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is: " + correctAnswer);
        }
    }
}
