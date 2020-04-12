package subject;

import java.util.LinkedList;
import java.util.List;

public class 全排列 {
    List<List<Integer>> res = new LinkedList<>();

    List<List<Integer>> permute(int[] nums) {
        // 记录「路径」
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums, track);
        return res;
    }

    void backtrack(int[] nums, LinkedList<Integer> track) {
        if(track.size()==nums.length){
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) continue;
            track.add(nums[i]);
            backtrack(nums, track);
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        全排列 a=new 全排列();
        int b[] =new int[]{1,2,3};
        a.permute(b);
    }
}
