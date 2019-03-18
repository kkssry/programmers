package programmers.school.week1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class 소수만들기Test {
    @Test
    public void mainTest() {
        int[] nums = {1,2,8,5};
        소수만들기 sol = new 소수만들기();
        System.out.println(sol.solution(nums));

    }

    @Test
    public void 스트링버퍼테스트() {
        StringBuilder sb = new StringBuilder();
        int[] arr = {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            sb.append(""+arr[i]);
        }
        System.out.println(sb);
        System.out.println(sb.toString());
        System.out.println(sb);
        String a = sb.toString();
        System.out.println(a);
    }

    @Test
    public void 배열을매개변수로() {
        int[] nums = {1, 2, 3, 4};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void change(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1000;
        }

    }
}