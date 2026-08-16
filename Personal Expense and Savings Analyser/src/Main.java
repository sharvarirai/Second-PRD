
public class Main {

    public static void main(String[] args) {

        int month = 1;

        do {
            double monthlyIncome;
            double homeContribution;
            double rent;
            double food;
            double travel;
            double education;
            double otherExpenses;

            if (month == 1) {
                monthlyIncome = 65000.0;
                homeContribution = 10000.0;
                rent = 10000.0;
                food = 8000.0;
                travel = 4000.0;
                education = 6000.0;
                otherExpenses = 6000.0;
            } else {
                monthlyIncome = 75000.0;
                homeContribution = 12000.0;
                rent = 14000.0;
                food = 9000.0;
                travel = 7000.0;
                education = 9000.0;
                otherExpenses = 8700.0;
            }

            double totalExpenses = homeContribution + rent + food + travel + education + otherExpenses;
            double remainingAmount = monthlyIncome - totalExpenses;

            double savingsPercentage = 0;
            double expensePercentage = 0;

            if (monthlyIncome > 0) {
                savingsPercentage = ((double) remainingAmount / monthlyIncome) * 100;
                expensePercentage = ((double) totalExpenses / monthlyIncome) * 100;

            }

            String expenseStatus = totalExpenses > monthlyIncome ? "Expense exceed income" : "Expense within income";
            String financialCategory;
            String improvementMessage;

            if (savingsPercentage < 10) {
                financialCategory = "Critical";
                improvementMessage = "Reduce unnecessary expenses and increase savings.";
            } else if (savingsPercentage < 20) {
                financialCategory = "Needs Improvement";
                improvementMessage = "Try to increase savings and control expenses.";
            } else if (savingsPercentage < 30) {
                financialCategory = "Good";
                improvementMessage = "Savings are healthy but can be improved.";
            } else {
                financialCategory = "Excellent";
                improvementMessage = "Excellent savings. Continue maintaining this habit.";
            }

            System.out.println("MONTHLY FINANCIAL REPORT");
            System.out.println();

            System.out.println("Month: " + month);
            System.out.println("Monthly Income: " + monthlyIncome);
            System.out.println("Total Expenses: " + totalExpenses);
            System.out.println("Remaining Amount: " + remainingAmount);
            System.out.println("Savings Percentage: " + savingsPercentage + "%");
            System.out.println("Expense Percentage: " + expensePercentage + "%");
            System.out.println("Expense Status: " + expenseStatus);
            System.out.println("Financial Category: " + financialCategory);
            System.out.println("Improvement Message: " + improvementMessage);

            System.out.println();
            System.out.println("-----------------------------");
            System.out.println();

            month++;

        } while (month <= 2);

    }
}
