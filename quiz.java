import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    // Constructor to initialize the quiz with questions
    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    // Method to start the quiz
    public void start() {
        Scanner scanner = new Scanner(System.in);

        // Iterate through each question in the quiz
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ": " + options.get(i));
            }

            int userAnswerIndex;
            while (true) {
                System.out.print("Enter your answer (1-" + options.size() + "): ");
                // Ensure user input is an integer
                if (scanner.hasNextInt()) {
                    userAnswerIndex = scanner.nextInt() - 1;  // Convert to zero-based index
                    if (userAnswerIndex >= 0 && userAnswerIndex < options.size()) {
                        break;
                    } else {
                        System.out.println("Invalid option. Please enter a number between 1 and " + options.size() + ".");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();  // Clear the invalid input
                }
            }

            // Check if the answer is correct
            if (question.checkAnswer(userAnswerIndex)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + options.get(question.getCorrectAnswerIndex()));
            }
        }
        displayScore();
    }

    // Method to display the final score
    private void displayScore() {
        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.size());
    }
}