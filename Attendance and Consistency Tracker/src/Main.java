
public class Main {

    public static void main(String[] args) {

        int day1 = 1;
        int day2 = 1;
        int day3 = 0;
        int day4 = 1;
        int day5 = 1;
        int day6 = 0;
        int day7 = 1;
        int day8 = 1;
        int day9 = 1;
        int day10 = 1;

        int totalDays = 10;
        int presentDays = 0;
        int absentDays = 0;
        int invalidEntries = 0;

        int day = 1;

        while (day <= totalDays) {

            int attendence = 0;

            if (day == 1) {
                attendence = day1;
            } else if (day == 2) {
                attendence = day2;
            } else if (day == 3) {
                attendence = day3;
            } else if (day == 4) {
                attendence = day4;
            } else if (day == 5) {
                attendence = day5;
            } else if (day == 6) {
                attendence = day6;
            } else if (day == 7) {
                attendence = day7;
            } else if (day == 8) {
                attendence = day8;
            } else if (day == 9) {
                attendence = day9;
            } else if (day == 10) {
                attendence = day10;
            }

            if (attendence == 1 || attendence == 0) {
                if (attendence == 1) {
                    presentDays++;
                } else if (attendence == 0) {
                    absentDays++;
                } else {
                    invalidEntries++;
                }
            }
            day++;
        }

        double attendencePercentage = ((double) presentDays / totalDays) * 100;

        double requiredAttendence = 75.0;

        boolean eligible = attendencePercentage >= requiredAttendence && invalidEntries == 0;

        String eligibilityStatus = eligible ? "ELIGIBLE" : "NOT ELIGIBLE";

        String consistencyStatus
                = attendencePercentage >= 75.0
                        ? "Good Attendance"
                        : "Poor Attendance";

        System.out.println("ATTENDANCE REPORT");
        System.out.println();

        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Present Days: " + presentDays);
        System.out.println("Absent Days: " + absentDays);
        System.out.println("Attendance Percentage: " + attendencePercentage + "%");
        System.out.println();
        System.out.println("Required Attendance: " + requiredAttendence + "%");
        System.out.println("Eligibility Status: " + eligibilityStatus);
        System.out.println("Invalid Attendance Entries: " + invalidEntries);
        System.out.println("Consistency Status: " + consistencyStatus);

    }
}
