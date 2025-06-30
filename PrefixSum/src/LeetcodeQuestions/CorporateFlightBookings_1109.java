package LeetcodeQuestions;

public class CorporateFlightBookings_1109 {
	//BRUTE FORCE METHOD - TC = O(m*n)
	public int[] corpFlightBookings(int[][] bookings, int n) {
		int[] ans = new int[n];
		int first = 0, last = 0, seats = 0;
		for(int i=0;i<bookings.length;i++){
			first = bookings[i][0];
			last = bookings[i][1];
			seats = bookings[i][2];
			for(int j=first-1;j<=last-1;j++){
				ans[j] += seats;
			}
		}
		return ans;
	}

	//USING PREFIX SUM - TC = O(m+n)
	public int[] corpFlightBookings2(int[][] bookings, int n) {
		int[] ans = new int[n];
		int first = 0, last = 0, seats = 0;
		for(int i=0;i<bookings.length;i++){
			first = bookings[i][0];
			last = bookings[i][1];
			seats = bookings[i][2];
			//prefix sum logic
			ans[first-1] += seats;
			if(last<n) ans[last] -= seats; //removing offsets from the remaining ones, so that when prefix summing it will be logical
		}
		for(int i=1;i<n;i++)
			ans[i] += ans[i-1];
		return ans;
	}
}
