package week3;

/*
3.36.2 Property Tax Calculator*
easy
|
30 min
|
Share
Description: Property tax is a tax assessed on real estate by the local government. The amount of property tax you pay is based on the assessed value of your property, the tax rate, and any applicable exemptions. Your task is to write a method that will take in three inputs, the assessed value of the property, the tax rate, and any applicable exemptions, and then calculate the annual property tax bill. Params in the exact order:

Assessed Value: The value of the property as determined by the local government.

Tax Rate: The percentage of the assessed value that is charged as property tax.

Exemptions: Any exemptions or deductions that may be available to the property owner, such as a homestead exemption.

Return:

Annual Property Tax Bill: The amount of property tax that the property owner is required to pay each year.
Task: Your task is to write a static calculatePropertyTax() method that will take in three double params, the assessed value of the property, the tax rate, and any applicable exemptions, and then calculate the annual property tax bill. Formula:

first, find the taxable value which is assessed value minus exemptions.

then multiple taxable value by the tax rate.

Expected Output:

plain
Copy code
Input: assessedValue = 200000.0, taxRate = 1.5, exemptions = 5000.0
Calculation: taxableValue = 200000 - 5000 = 195000.0
              annualPropertyTax = 195000 * 1.5 / 100 = 2925.0
Output: 2925.0

Input: assessedValue = 150000.0, taxRate = 2.0, exemptions = 2000.0
Calculation: taxableValue = 150000 - 2000 = 148000.0
              annualPropertyTax = 148000 * 2 / 100 = 2960.0
Output: 2960.0

Input: assessedValue = 300000.0, taxRate = 1.25, exemptions = 10000.0
Calculation: taxableValue = 300000 - 10000 = 290000.0
              annualPropertyTax = 290000 * 1.25 / 100 = 3625.0
Output: 3625.0
 */
//write your static method here. No need to add Main class or main method.

public class Week3_36_2_PropertyTaxCalculator {
    public static void main(String[] args) {

        double result1 = calculatePropertyTax(200000.0, 1.5, 5000.0);
        System.out.println(result1);

        double result2 = calculatePropertyTax(150000.0, 2.0, 2000.0);
        System.out.println(result2);

        double result3 = calculatePropertyTax(300000.0, 1.25, 10000.0);
        System.out.println(result3);


    }

    //taxableValue = 200000 - 5000 = 195000.0
    //annualPropertyTax = 195000 * 1.5 / 100 = 2925.0
    public static double calculatePropertyTax(double assessedValue, double taxRate, double exemptions) {
        double taxableValue = assessedValue - exemptions;

        return (taxableValue * taxRate) / 100;
    }

}
