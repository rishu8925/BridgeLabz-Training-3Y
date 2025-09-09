public class UniversityFee {
    public static void main(String[] args) {
        double fee = 125000;          
        double discountPercent = 10;  

        double discount = (fee * discountPercent) / 100;  
        double finalFee = fee - discount;                 

        System.out.println(
            "The Original Fee is INR " + fee + "\n" +
            "The Discount is INR " + discount + "\n" +
            "The Discounted Fee to Pay is INR " + finalFee
        );
    }
}

