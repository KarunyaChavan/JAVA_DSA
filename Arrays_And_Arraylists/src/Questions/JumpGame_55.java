package Questions;

public class JumpGame_55 {
    public boolean canJump(int[] nums) {
        int mx = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>mx) return false;
            mx = Math.max(mx, i+nums[i]);
        }
        return true;
    }
}
