
public class Main {

    public static void main(String[] args) {

        int studentNumber = 1;

        while (studentNumber <= 2) {

            String studentName;
            double academicPercentage;
            double attendancePercentage;
            int activeBacklogs;
            boolean projectCompleted;
            int communicationScore;
            int aptitudeScore;

            if (studentNumber == 1) {
                studentName = "Kripa";
                academicPercentage = 90.5;
                attendancePercentage = 80;
                activeBacklogs = 0;
                projectCompleted = true;
                communicationScore = 87;
                aptitudeScore = 83;
            } else {
                studentName = "Vishal";
                academicPercentage = 65;
                attendancePercentage = 70;
                activeBacklogs = 0;
                projectCompleted = false;
                communicationScore = 66;
                aptitudeScore = 55;

            }

            boolean academicEligible = academicPercentage >= 60;
            boolean attendanceEligible = attendancePercentage >= 75;
            boolean backlogEligible = activeBacklogs == 0;
            boolean communicationEligible = communicationScore >= 60;
            boolean aptitudeEligible = aptitudeScore >= 60;

            String academicStatus = academicEligible ? "Eligible" : "Not Eligible";
            String attendanceStatus = attendanceEligible ? "Eligible" : "Not Eligible";
            String backlogStatus = backlogEligible ? "Eligible" : "Not Eligible";
            String projectStatus = projectCompleted ? "Completed" : "Not Completed";
            String communicationStatus = communicationEligible ? "Eligible" : "Not Eligible";
            String aptitudeStatus = aptitudeEligible ? "Eligible" : "Needs Improvement";

            boolean placementReady
                    = academicEligible
                    && attendanceEligible
                    && backlogEligible
                    && projectCompleted
                    && communicationEligible
                    && aptitudeEligible;

            System.out.println("PLACEMENT READINESS REPORT");
            System.out.println();

            System.out.println("Student Name: " + studentName);
            System.out.println("Academic Status: " + academicStatus);
            System.out.println("Attendance Status: " + attendanceStatus);
            System.out.println("Backlog Status: " + backlogStatus);
            System.out.println("Project Status: " + projectStatus);
            System.out.println("Communication Status: " + communicationStatus);
            System.out.println("Aptitude Status: " + aptitudeStatus);

            if (placementReady) {
                System.out.println();
                System.out.println("Final Result: PLACEMENT READY");
                System.out.println("Message: All placement requirements are satisfied.");
            } else {
                System.out.println();
                System.out.println("Final Result: NOT PLACEMENT READY");
                System.out.println();
                System.out.println("Areas to Improve:");

                if (!academicEligible) {
                    System.out.println("Academic Percentage");
                }

                if (!attendanceEligible) {
                    System.out.println("Attendance");
                }

                if (!backlogEligible) {
                    System.out.println("Active Backlogs");
                }

                if (!projectCompleted) {
                    System.out.println("Project Completion");
                }

                if (!communicationEligible) {
                    System.out.println("Communication Score");
                }

                if (!aptitudeEligible) {
                    System.out.println("Aptitude Score");
                }
            }

            System.out.println();

            studentNumber++;

        }

    }
}
