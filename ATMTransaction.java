import java.util.Scanner;
public class ATMTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int[] transaction = new int[n];
        System.out.println("enter transction: "+n);
        for(int i=0; i<n; i++){
            transaction[i]=sc.nextInt();
        }
        int balance = 0;
        for(int transactions: transaction){
            balance += transactions;


        } 
        System.out.println("total balance: " +balance);
        if(balance<0){
            System.out.println("Overdraft");
        }
        sc.close();
    }
}
