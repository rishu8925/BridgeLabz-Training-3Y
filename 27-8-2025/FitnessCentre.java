import java.util.Scanner;

public class FitnessCentre {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int membershipType, membersCount;
        double fee = 0, totalFee = 0;
        char choice;

        System.out.println("---- Fitness Center Membership System ----");

        
        do {
            System.out.print("\nEnter number of members to register: ");
            membersCount = sc.nextInt();

            
            for (int i = 1; i <= membersCount; i++) {
                System.out.println("\nRegistering Member " + i + ":");

               
                System.out.println("Select Membership Type:");
                System.out.println("1. Monthly (Rs. 1000)");
                System.out.println("2. Quarterly (Rs. 2500)");
                System.out.println("3. Yearly (Rs. 9000)");
                System.out.print("Enter choice: ");
                membershipType = sc.nextInt();

                switch (membershipType) {
                    case 1:
                        fee = 1000;
                        break;
                    case 2:
                        fee = 2500;
                        break;
                    case 3:
                        fee = 9000;
                        break;
                    default:
                        System.out.println("Invalid choice! Default Monthly applied.");
                        fee = 1000;
                }

                
                System.out.print("Is member eligible for discount? (1=Yes, 0=No): ");
                int discountEligible = sc.nextInt();

                if (discountEligible == 1) {
                    fee *= 0.8; // 20% discount
                    System.out.println("Discount applied! New Fee = Rs. " + fee);
                } else {
                    System.out.println("No discount applied.");
                }

                totalFee += fee;
            }

            System.out.println("\nTotal Fee for this batch = Rs. " + totalFee);

           
            System.out.print("\nDo you want to register more members? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\n---- System Closed. Final Total Collected = Rs. " + totalFee + " ----");
        sc.close();
    }
}

