//LEETCODE 1700
public class NumOfStudentsUnableToEatLunch {
	public int countStudents(int[] students, int[] sandwiches) {
		int ones = 0;
		int zeros = 0;
		for(int s:students){
			if(s==0) zeros++;
			else ones++;
		}
		for(int sandwich: sandwiches){
			if(sandwich == 0){
				if(zeros == 0) return ones;
				else zeros--;
			}
			else if(sandwich == 1){
				if(ones==0) return zeros;
				else ones--;
			}
		}
		return 0;
	}
}
