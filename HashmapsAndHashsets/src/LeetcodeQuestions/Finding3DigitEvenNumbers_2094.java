package LeetcodeQuestions;
import java.util.*;

public class Finding3DigitEvenNumbers_2094 {
	public int[] findEvenNumbers(int[] digits) {
		// Count frequency of each digit
		int[] freq = new int[10];
		for (int digit : digits) {
			freq[digit]++;
		}

		ArrayList<Integer> result = new ArrayList<>();

		// Check all 3-digit even numbers from 100 to 998
		for (int num = 100; num <= 999; num += 2) {
			int a = num / 100;          // hundreds
			int b = (num / 10) % 10;    // tens
			int c = num % 10;           // units (even)

			// Create frequency count for current number
			int[] tempFreq = new int[10];
			tempFreq[a]++;
			tempFreq[b]++;
			tempFreq[c]++;

			// Check if all digits are available in input
			boolean valid = true;
			for (int d = 0; d < 10; d++) {
				if (tempFreq[d] > freq[d]) {
					valid = false;
					break;
				}
			}

			if (valid) {
				result.add(num);
			}
		}

		// Convert ArrayList to array
		int[] ans = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			ans[i] = result.get(i);
		}

		return ans;
	}
}
