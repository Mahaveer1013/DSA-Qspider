package DSA.weeklyContest429;


public class SmallestSubstringWithIdenticalCharacters {
    public static void main(String[] args) {
        String s = "0000";
        int numOps = 2;
        System.out.println(minimumLength(s, numOps));
    }

    public static int minimumLength(String s, int numOps) {
        // Use the sliding window technique to find the smallest longest substring
        int maxLengthForZeroes = getMaxLength(s, numOps, '0');
        int maxLengthForOnes = getMaxLength(s, numOps, '1');

        // Return the minimum of both results
        return Math.min(maxLengthForZeroes, maxLengthForOnes);
    }

    // Helper function to calculate the maximum length of a valid substring
    // where we can flip characters to make the substring all `targetChar`
    private static int getMaxLength(String s, int numOps, char targetChar) {
        int left = 0;
        int flips = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // If the current character is not the targetChar, we need a flip
            if (s.charAt(right) != targetChar) {
                flips++;
            }

            // If flips exceed numOps, we need to shrink the window from the left
            while (flips > numOps) {
                if (s.charAt(left) != targetChar) {
                    flips--;
                }
                left++;
            }

            // Update the maximum length of valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
