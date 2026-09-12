package week3;

/*
3.39.2 Insurance Policy Approval*
easy
|
30 min
|
Share
Create a static method called approveInsurancePolicy() to determine whether a customer's insurance policy should be approved or declined based on specific criteria. The method should accept the following parameters:

Customer's age (an integer)

Customer's driving record (a character 'G' for good, 'P' for poor)

Customer's credit score (an integer)

The method should return one of the following results:

'A' (Approved) if the customer's age is between 25 and 65 (inclusive), their driving record is 'G' (good), and their credit score is 700 or higher.

'D' (Declined) for any other combination of criteria (except driving record).

'E' (Error) if customer's driving record doesn't match two of possible.

Example of result:
plain
Copy code
Input: 35, 'G', 720
Output: 'A'

Input: 22, 'P', 680
Output: 'D'

Input: 55, 'G', 750
Output: 'A'

Input: 27, 'F', 710
Output: 'E'
Example of solution
java
Copy code
static char approveInsurancePolicy(int age, char drivingRecord, int creditScore) {
    if (!(age >= 25 && age <= 65 && drivingRecord == 'G')) {
        if (!(drivingRecord == 'G' || drivingRecord == 'P')) {
            return 'E';
        }
        return 'D';
    }
    return 'A';
}
 */
//write your static method here. No need to add Main class or main method.

public class Week3_39_2_InsurancePolicyApproval {
    public static void main(String[] args) {
        char info = approveInsurancePolicy(35, 'G', 720);
        System.out.println(info);

        char info2 = approveInsurancePolicy(22, 'P', 680);
        System.out.println(info2);

        char info3 = approveInsurancePolicy(55, 'G', 750);
        System.out.println(info3);

        char info4 = approveInsurancePolicy(27, 'F', 710);
        System.out.println(info4);
    }

    public static char approveInsurancePolicy(int age, char drivingRecord, int creditScore) {
        if (drivingRecord != 'G' && drivingRecord != 'P') {
            return 'E';
        } else if (age >= 25 && age <= 65 && drivingRecord == 'G' && creditScore >= 700) {
            return 'A';
        } else {
            return 'D';
        }
    }
}
