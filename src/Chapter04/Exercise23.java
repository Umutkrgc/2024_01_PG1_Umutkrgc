package Chapter04;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee`s name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate (%): ");
        double federalTaxRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate (%): ");
        double stateTaxRate = input.nextDouble();

        double grossPay = hoursWorked * hourlyPayRate;

        double federalWithholding = grossPay * (federalTaxRate / 100);

        double stateWithholding = grossPay * (stateTaxRate / 100);

        double totalDeduction = federalWithholding + stateWithholding;

        double netPay = grossPay - totalDeduction;

        System.out.println("\nPayroll Statement for " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Pay Rate: $" + hourlyPayRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("\tFederal Withholding (" + federalTaxRate + "%): $" + federalWithholding);
        System.out.println("\tState Withholding (" + stateTaxRate + "%): $" + stateWithholding);
        System.out.println("\tTotal Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);
    }
}
//'////hatali
////dogru calismiyor kod