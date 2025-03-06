package string.autocorrect;

import java.util.HashMap;
import java.util.Scanner;

public class AutoCorrect {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HashMap<String, String> corrections = new HashMap<>();
            corrections.put("hte", "the");
            corrections.put("freind", "friend");
            corrections.put("recieve", "receive");

            System.out.print("Enter message: ");
            String input = sc.nextLine();

            StringBuilder correctedMessage = new StringBuilder(input);
            for (String typo : corrections.keySet()) {
                int index;
                while ((index = correctedMessage.indexOf(typo)) != -1) {
                    correctedMessage.replace(index, index + typo.length(), corrections.get(typo));
                }
            }
            System.out.println("Autocorrected: " + correctedMessage);
        }

}
