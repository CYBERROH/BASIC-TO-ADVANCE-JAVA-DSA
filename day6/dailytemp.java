package day6;

import java.util.Arrays;
import java.util.Stack;

public class dailytemp {
    public static void main(String[] args) {
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = new int[temp.length];

        Stack<Integer> stack = new Stack<>(); // stack holds indices of temps not yet resolved

        for (int i = 0; i < temp.length; i++) {
            // While current temperature is greater than the temperature at the index stored on top of the stack
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int idx = stack.pop();
                ans[idx] = i - idx;  // Number of days until warmer temperature for index idx
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}
