
public class Main {

    public static void main(String[] args) {

        String studentName = "Nihal";

        int subject1 = 76;
        int subject2 = 88;
        int subject3 = 90;
        int subject4 = 79;
        int subject5 = 82;

        int subject = 1;
        int totalMarks = 0;
        int passedSubjects = 0;
        int failedSubjects = 0;

        boolean allPassed = true;

        while (subject <= 5) {

            int marks;
            if (subject == 1) {
                marks = subject1;
            } else if (subject == 2) {
                marks = subject2;
            } else if (subject == 3) {
                marks = subject3;
            } else if (subject == 4) {
                marks = subject4;
            } else {
                marks = subject5;
            }

            if (marks >= 0 && marks <= 100) {
                totalMarks += marks;

                if (marks >= 35) {
                    passedSubjects++;
                } else {
                    failedSubjects++;
                    allPassed = false;
                }
            } else {
                System.out.println("Invalid marks for subject" + subject);
            }
            subject++;
        }

        double average = (double) totalMarks / 5;
        double percentage = average;

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Needs Improvement";
        }

        String overallResult = allPassed ? "PASS" : "FAIL";

        String nextLevelEligibility;

        if (allPassed && percentage >= 60) {
            nextLevelEligibility = "Eligible";
        } else {
            nextLevelEligibility = "Not Eligible";
        }

        System.out.println("STUDENT MARKS REPORT");
        System.out.println();

        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");

        System.out.println();
        System.out.println("Passed Subjects: " + passedSubjects);
        System.out.println("Failed Subjects: " + failedSubjects);

        System.out.println();
        System.out.println("Overall Result: " + overallResult);
        System.out.println("Grade: " + grade);
        System.out.println("Next-Level Eligibility: " + nextLevelEligibility);

    }
}
