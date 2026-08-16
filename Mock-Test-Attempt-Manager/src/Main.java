
public class Main {

    public static void main(String[] args) {

        int attempt = 1;
        int remainingAttempt = 3;
        int bestScore = 0;

        int score;
        int correctAnswers;
        int incorrectAnswers;

        boolean passed = false;

        while (attempt <= 3 && !passed) {

            if (attempt == 1) {
                score = 50;
                correctAnswers = 50;
                incorrectAnswers = 50;
            } else if (attempt == 2) {
                score = 59;
                correctAnswers = 59;
                incorrectAnswers = 41;
            } else {
                score = 78;
                correctAnswers = 78;
                incorrectAnswers = 22;
            }

            remainingAttempt--;

            System.out.println("Attempt: " + attempt);
            System.out.println("Score: " + score);
            System.out.println("Correct Answers: " + correctAnswers);
            System.out.println("Incorrect Answers: " + incorrectAnswers);

            if (score >= 60) {
                System.out.println("Result: passed");
            } else {
                System.out.println("Result: failed");
            }

            if (score >= bestScore) {
                bestScore = score;
            }

            if (!passed) {
                System.out.println("Remaining Attempts: " + remainingAttempt);
            }

            System.out.println();

            attempt++;
        }

        System.out.println("MOCK TEST ATTEMPT REPORT");
        System.out.println();

        System.out.println("Best Score: " + bestScore);

        if (passed) {
            System.out.println("Final Result: MOCK TEST CLEARED");
            System.out.println("Recommendation: Continue practising to improve your score.");
        } else {
            System.out.println("Final Result: MOCK TEST NOT CLEARED");
            System.out.println("Recommendation: Revise weak areas and attempt more practice tests.");
        }

    }
}
