import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define questions
        Question q1 = new Question(
            "What is the size of an int in Java?",
            Arrays.asList("8 bits", "16 bits", "32 bits", "64 bits"),
            2  // Index of the correct answer ("32 bits")
        );
        Question q2 = new Question(
            "Which of the following is not a Java keyword?",
            Arrays.asList("class", "public", "void", "define"),
            3  // Index of the correct answer ("define")
        );
        Question q3 = new Question(
            "Which loop is guaranteed to execute at least once?",
            Arrays.asList("for", "while", "do-while", "none of the above"),
            2  // Index of the correct answer ("do-while")
        );
        Question q4 = new Question(
            "What is the default value of a boolean variable in Java?",
            Arrays.asList("true", "false", "0", "null"),
            1  // Index of the correct answer ("false")
        );
        Question q5 = new Question(
            "Which of the following data types is used to create a variable that should store a whole number?",
            Arrays.asList("int", "float", "char", "boolean"),
            0  // Index of the correct answer ("int")
        );
        Question q6 = new Question(
            "What is the correct syntax to create an instance of a class?",
            Arrays.asList("ClassName obj = new ClassName();", "ClassName obj = ClassName();", "new ClassName obj = ClassName();", "ClassName obj = new ClassName;"),
            0  // Index of the correct answer ("ClassName obj = new ClassName();")
        );
        Question q7 = new Question(
            "What will be the output of the following code snippet?\n`String str = \"Hello\";\nstr.concat(\" World\");\nSystem.out.println(str);`",
            Arrays.asList("Hello World", "Hello", "World", "Error"),
            1  // Index of the correct answer ("Hello")
        );
        Question q8 = new Question(
            "Which of the following methods is used to compare two strings in Java?",
            Arrays.asList("compareTo()", "equals()", "equalsIgnoreCase()", "All of the above"),
            3  // Index of the correct answer ("All of the above")
        );
        Question q9 = new Question(
            "Which access modifier allows visibility within the same package and subclasses?",
            Arrays.asList("private", "protected", "public", "default"),
            1  // Index of the correct answer ("protected")
        );
        Question q10 = new Question(
            "What is the purpose of the final keyword in Java?",
            Arrays.asList("To prevent method overriding", "To prevent class inheritance", "To make variables immutable", "All of the above"),
            3  // Index of the correct answer ("All of the above")
        );

        // Add questions to a list
        List<Question> questions = Arrays.asList(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10);

        // Initialize and start the quiz
        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}