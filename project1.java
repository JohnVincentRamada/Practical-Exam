import java.util.Scanner;
class rawr {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Annual Salary 	: 	");
		int annualSalary = input.nextInt();

		double monthrate = annualSalary/12;
		System.out.println("your Monthly Rate  	:		"+String.format("%,.2f", monthrate));

		double dailyrate = monthrate/22;
		System.out.println("your Daily Rate  	:		" + String.format("%,.2f", dailyrate));

		double hourlyrate = dailyrate/8;
		System.out.println("your Hourly Rate  	:		" + String.format("%,.2f", hourlyrate));

		double tax_deduction = 0;
		double annual_tax = 0;

		while (annualSalary > 250000 && annualSalary <= 400000) {
			annual_tax = annualSalary * 0.2;
			System.out.println("Your Annual tax  	:		" + String.format("%,.2f", annual_tax));
			break;
		}

		while (annualSalary > 400000 && annualSalary <= 800000) {
			tax_deduction = annualSalary - 30000;
			if (tax_deduction > 400000) {
				annual_tax = ((tax_deduction - 400000) * 0.25) + 30000;
				System.out.println("Your Annual tax  	:		" + String.format("%,.2f", annual_tax));
				break;

			}
			
			else {
				annual_tax = 30000;
				System.out.println("Your Annual tax  	:		" + String.format("%,.2f", annual_tax));
				break;
			}
			
		}
		while (annualSalary > 800000 && annualSalary <= 2000000) {
			tax_deduction = annualSalary - 130000;
			if (tax_deduction > 800000) {
				annual_tax = ((tax_deduction - 800000) * 0.30) + 130000;
				System.out.println("Your Annual tax  	:		" + String.format("%,.2f", annual_tax));
				break;

			}
			
			else {
				annual_tax = 130000;
				System.out.println("Your Annual tax  	:		" + String.format("%,.2f", annual_tax));
				break;
			}
			
		}
		while (annualSalary > 2000000 && annualSalary <= 8000000) {
			tax_deduction = annualSalary - 490000;
			if (tax_deduction > 2000000) {
				annual_tax = ((tax_deduction - 2000000) * 0.32) + 490000;
				System.out.println("Your Annual tax  	:		" + String.format("%,.2f", annual_tax));
				break;

			}
			
			else {
				annual_tax = 490000;
				System.out.println("Your Annual tax  	:		" + String.format("%,.2f", annual_tax));
				break;
			}
			
		}
		while (annualSalary > 8000000) {
			tax_deduction = annualSalary - 2410000;
			if (tax_deduction > 8000000) {
				annual_tax = ((tax_deduction - 8000000) * 0.35) + 2410000;
				System.out.println("Your Annual tax  	:		" + String.format("%,.2f", annual_tax));
				break;

			}
			
			else {
				annual_tax = 2410000;
				System.out.println("Your Annual tax  	:		" + String.format("%,.2f", annual_tax));
				break;
			}
			
		}
		

		double monthly_tax_deduction = annual_tax/12;
		System.out.println("Your Monthly Tax Deduction 	:	" + String.format("%,.2f", monthly_tax_deduction));

		double net_pay = monthrate - monthly_tax_deduction;
		System.out.println("Your Net Pay 	:			" + String.format("%,.2f", net_pay));






	}
}