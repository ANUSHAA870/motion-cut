import java.util.List;

public class Question {
    private String questionText;
    private List<String> options;
    private int correctAnswerIndex;

    // Constructor to initialize question details
    public Question(String questionText, List<String> options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    // Method to check if the user's answer is correct
    public boolean checkAnswer(int userAnswerIndex) {
        return userAnswerIndex == correctAnswerIndex;
    }

    // Method to get the question text
    public String getQuestionText() {
        return questionText;
    }

    // Method to get the list of options
    public List<String> getOptions() {
        return options;
    }

    // Method to get the index of the correct answer
    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}