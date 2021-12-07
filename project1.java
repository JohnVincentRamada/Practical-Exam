import java.util.Scanner;
class rawr {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("please enter youre annual salary 	: ");
		int annual_salary = input.nextInt();

		double monthly_rate = annual_salary/12;
		System.out.println("your Monthly Rate is 	:		"+String.format("%.2f", monthly_rate));

		double daily_rate = monthly_rate/22;
		System.out.println("your Daily Rate is 	:		" + String.format("%.2f", daily_rate));

		double hourly_rate = daily_rate/8;
		System.out.println("your Hourly Rate is 	:		" + String.format("%.2f", hourly_rate));

		double tax = 0;
		double tax_deduction = 0;
		double annual_tax = 0;

		if ((annual_salary >= 0) && (annual_salary <= 250000)) {
			tax = annual_salary-0;
			tax_deduction = tax * .0;
			annual_tax = tax_deduction;
			System.out.println("your Annual tax is 	:		" + String.format("%.2f", annual_tax));
		}

		else if ((annual_salary >= 250000) && (annual_salary <= 400000))	{
			tax = annual_salary-250000;
			tax_deduction = tax * .20;
			annual_tax = tax_deduction;
			System.out.println("your Annual tax is 	:		" + String.format("%.2f", annual_tax));
		}
		else if ((annual_salary >= 400000) && (annual_salary <= 800000))	{
			tax = annual_salary-30000-400000;
			tax_deduction = tax * .25 + 30000;
			annual_tax = tax_deduction;
			System.out.println("your Annual tax is 	:		" + String.format("%.2f", annual_tax));
		}
		else if ((annual_salary >= 800000) && (annual_salary <= 2000000))	{
			tax = annual_salary-130000-800000;
			tax_deduction = tax * .30 + 130000;
			annual_tax = tax_deduction;
			System.out.println("your Annual tax is 	:		" + String.format("%.2f", annual_tax));
		}
		else if ((annual_salary >= 2000000) && (annual_salary <= 8000000))	{
			tax = annual_salary-490000-2000000;
			tax_deduction = tax * .32 + 490000;
			annual_tax = tax_deduction;
			System.out.println("your Annual tax is 	:		" + String.format("%.2f", annual_tax));
		}
		else if (annual_salary >= 8000000)	{
			tax = annual_salary-2410000-8000000;
			tax_deduction = tax * .35 + 2410000;
			annual_tax = tax_deduction;
			System.out.println("your Annual tax is 	:		" + String.format("%.2f", annual_tax));
		}

		double monthly_tax_deduction = annual_tax/12;
		System.out.println("your Monthly Tax Deduction is 	:	" + String.format("%.2f", monthly_tax_deduction));

		double net_pay = monthly_rate - monthly_tax_deduction;
		System.out.println("your Net Pay is 	:		" + String.format("%.2f", net_pay));






	}
}