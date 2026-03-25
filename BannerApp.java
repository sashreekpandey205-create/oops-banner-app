import java.util.*;

public class BannerApp {

    public static void main(String[] args) {

        // Create Map
        Map<Character, String[]> patternMap = new HashMap<>();

        // Store patterns
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        // Word
        String word = "OOPS";

        // Print banner
        printBanner(word, patternMap);
    }

    public static void printBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                } else {
                    line.append("???? ").append("  "); // fallback
                }
            }

            System.out.println(line);
        }
    }
}