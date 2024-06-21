/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author ZIPTECH LTD
 */
public class OTPService {

    public static String generateOTP() {
        // Generate random alphanumeric string (adjust length as needed)
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder otp = new StringBuilder();
        Random rnd = new SecureRandom();
        while (otp.length() < 5) { // Replace 6 with desired OTP length
            int index = (int) (rnd.nextDouble() * chars.length());
            otp.append(chars.charAt(index));
        }
        return otp.toString();
    }
}
