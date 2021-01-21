package utility;

import java.util.Random;

public class Generator {
	public static void main(String [] args) {
		genReservationCode();
	}
	public static String genTicketNumber() {
		return generateRandom(20);
	}
	public static String genReservationCode() {
		return generateRandom(3) + randomAlphabet(3);
	}
	public static String randomAlphabet(int length) {
        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        String randomStr = "";
        
        for(int i =0; i<length ; i++) {
        	int num = random.nextInt(26);
        	randomStr += str1.charAt(num);
        }
        return randomStr;
        
       
    }
	
	public static String generateRandom(int length) {
		Random random = new Random();
		char[] digits = new char[length];
		digits[0] = (char) (random.nextInt(9) + '1');
		for (int i = 1; i < length; i++) {
			digits[i] = (char) (random.nextInt(10) + '0');
		}
		return new String(digits);
	}
}
