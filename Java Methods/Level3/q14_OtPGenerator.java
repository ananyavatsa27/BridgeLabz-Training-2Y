import java.util.HashSet;
import java.util.Set;

public class q14_OTPGenerator {

    public static void main(String[] args) {
        int size = 10;
        int[] otps = new int[size];

        // Generate 10 OTPs
        for (int i = 0; i < size; i++) {
            otps[i] = generateSixDigitOTP();
        }

        // Display the OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        boolean unique = areOTPsUnique(otps);
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("OTP numbers are not unique.");
        }
    }

    // Generate a 6-digit OTP using Math.random()
    public static int generateSixDigitOTP() {
        // Generate random number between 100000 and 999999
        return 100000 + (int)(Math.random() * 900000);
    }

    // Check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            // If set already contains otp, not unique
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }
}