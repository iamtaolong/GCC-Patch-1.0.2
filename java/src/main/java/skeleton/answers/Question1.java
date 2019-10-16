package skeleton.answers;

public class Question1 {


    public static double calculateTotalPayment(double initialLevelOfDebt, double interestPercentage, double repaymentPercentage) {
        // TODO Auto-generated method stub

        double monthlyPayment = repaymentPercentage * initialLevelOfDebt;
        double currentTotal = initialLevelOfDebt;
        int month = 0;

        while (currentTotal < monthlyPayment){
            currentTotal *= (1 + interestPercentage);
            currentTotal -= monthlyPayment;
            month++;

        }

        double finalPayment = currentTotal;
        double overallPayment = month * monthlyPayment + (0.1 * initialLevelOfDebt) + finalPayment;
        System.out.print("Sum of papyments: " + overallPayment);

        return -5;
    }


}
