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
		return generateRandom(6);
	}
	public static void find(int n, int length) {
        String str1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder(length);
        Random r = new Random();

        System.out.println("\n\t Unique codes are \n\n");
        for(int i=0; i<n; i++) {
            for(int j=0; j<length; j++) {
                sb.append(str1.charAt(r.nextInt(str1.length())));
            }
            System.out.println("  " + sb.toString());
            sb.delete(0, length);
        }
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
