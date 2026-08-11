class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            freq[s.charAt(right) - 'A']++;

            // Maximum frequency in current window
            maxFreq = Math.max(
                maxFreq,
                freq[s.charAt(right) - 'A']
            );

            // Current window size
            int windowLength = right - left + 1;

            // Characters that need replacement
            int replacements = windowLength - maxFreq;

            // Shrink window if replacements > k
            while (replacements > k) {
                freq[s.charAt(left) - 'A']--;
                left++;

                windowLength = right - left + 1;
                replacements = windowLength - maxFreq;
            }

            // Update answer
            answer = Math.max(answer, windowLength);
        }

        return answer;
    }
}
