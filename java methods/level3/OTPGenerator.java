import java.util.*;

public class OTPGenerator {

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); 
    }

    
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int otp : otps) {
            uniqueSet.add(otp);
        }
        return uniqueSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

    
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

      
        boolean unique = areOTPsUnique(otpArray);
        if (unique) {
            System.out.println("\nAll OTPs are unique ✅");
        } else {
            System.out.println("\nSome OTPs are repeated ❌");
        }
    }
}

