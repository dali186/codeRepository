package algorithm.storage.programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PGRS01 {
    //개인정보 수집 유효기간
    //https://school.programmers.co.kr/learn/courses/30/lessons/150370
    public static int[] soultion(String today, String[] terms, String[] privacies) {
        int[] anwser = new int[privacies.length];
        int index = 0;
        int nowadays = dateToInteger(today);
        Map<String, Integer> termToDays = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            StringTokenizer divideTerms = new StringTokenizer(terms[i], " ");
            String type = divideTerms.nextToken();
            Integer days = Integer.parseInt(divideTerms.nextToken()) * 28;
            termToDays.put(type, days);
        }
        for (int i = 0; i < privacies.length; i++) {
            StringTokenizer dividePrivacies = new StringTokenizer(privacies[i], " ");
            String date = dividePrivacies.nextToken();
            String type = dividePrivacies.nextToken();
            int result = dateToInteger(date) + termToDays.get(type);
            if (nowadays >= result) {
                anwser[index] = i + 1;
                index++;
            }
        }
        int anwsers[] = new int[index];
        for (int i = 0; i < index; i++) {
            anwsers[i] = anwser[i];
        }
        return anwsers;
    }

    private static int dateToInteger(String date) {
        int sum = 0;
        StringTokenizer dateToken = new StringTokenizer(date, ".");
        int year = Integer.parseInt(dateToken.nextToken()) * 28 * 12;
        int month = Integer.parseInt(dateToken.nextToken()) * 28;
        int day = Integer.parseInt(dateToken.nextToken());
        sum = year + month + day;
        return sum;
    }

    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] result = soultion(today, terms, privacies);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
