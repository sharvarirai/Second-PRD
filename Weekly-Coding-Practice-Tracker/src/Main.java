
public class Main {

    public static void main(String[] args) {

        int day = 1;

        int attempted = 0;
        int solved = 0;
        double hours = 0;

        int totalAttempted = 0;
        int totalSolved = 0;
        double totalHours = 0;

        int productiveDays = 0;
        int nonProductiveDays = 0;

        while (day <= 7) {

            if (day == 1) {
                attempted = 7;
                solved = 5;
                hours = 3.0;
            } else if (day == 2) {
                attempted = 6;
                solved = 4;
                hours = 4.0;
            } else if (day == 3) {
                attempted = 9;
                solved = 7;
                hours = 5.0;
            } else if (day == 4) {
                attempted = 5;
                solved = 3;
                hours = 1.5;
            } else if (day == 5) {
                attempted = 6;
                solved = 6;
                hours = 3.0;
            } else if (day == 6) {
                attempted = 8;
                solved = 8;
                hours = 1.5;
            } else {
                attempted = 5;
                solved = 5;
                hours = 4.0;
            }

            System.out.println("Day : " + day);
            System.out.println("Problems Attempted: " + attempted);
            System.out.println("Problems Solved: " + solved);
            System.out.println("Hours: " + hours);

            if (solved >= 5 && hours >= 2.0) {
                System.out.println("Status: Productive Day");
                productiveDays++;
            } else {
                System.out.println("Status: Non Productive Day");
                nonProductiveDays++;
            }

            System.out.println();

            totalAttempted += attempted;
            totalSolved += solved;
            totalHours += hours;

            day++;

        }

        double successPercentage = 0;
        double averageSolved = 0;

        if (totalAttempted > 0) {
            successPercentage = ((double) totalSolved / totalAttempted) * 100;
        }

        averageSolved = (double) totalSolved / 7;

        String weeklyTarget = totalSolved >= 35 ? "Achieved" : "Not Achieved";

        String consistencyMessage;

        if (productiveDays >= 5) {
            consistencyMessage = "Excellent";
        } else if (productiveDays >= 3) {
            consistencyMessage = "Good";
        } else {
            consistencyMessage = "Needs Improvement";
        }

        System.out.println("WEEKLY CODING PRACTICE REPORT");
        System.out.println();

        System.out.println("Total Problems Attempted: " + totalAttempted);
        System.out.println("Total Problems Solved: " + totalSolved);
        System.out.println("Total Practice Hours: " + totalHours);
        System.out.println("Success Percentage: " + successPercentage + "%");
        System.out.println("Average Problems Solved Per Day: " + averageSolved);
        System.out.println("Productive Days: " + productiveDays);
        System.out.println("Non-Productive Days: " + nonProductiveDays);
        System.out.println("Weekly Target: " + weeklyTarget);
        System.out.println("Consistency Status: " + consistencyMessage);

    }
}
