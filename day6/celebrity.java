import java.util.Stack;

public class celebrity {
    // Returns true if person a knows person b
    static boolean knows(int[][] M, int a, int b) {
        return M[a][b] == 1;
    }

    // Finds the celebrity (if one exists)
    static int findCelebrity(int[][] M, int n) {
        Stack<Integer> st = new Stack<>();

        // Step 1: Push all people onto the stack
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Step 2: Find the potential celebrity
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (knows(M, a, b)) {
                // a knows b => a is not celebrity, b might be
                st.push(b);
            } else {
                // a doesn't know b => b is not celebrity, a might be
                st.push(a);
            }
        }

        // If there's no candidate, return -1
        if (st.isEmpty()) return -1;

        int c = st.pop();

        // Step 3: Verify the candidate c
        for (int i = 0; i < n; i++) {
            if (i == c) continue;
            // Celebrity does NOT know anyone; everyone must know celebrity
            if (M[c][i] == 1 || M[i][c] == 0) {
                return -1;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        int[][] M = {
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {0, 0, 1, 0}
        };
        int n = M.length;
        int celeb = findCelebrity(M, n);
        if (celeb == -1)
            System.out.println("No Celebrity is present");
        else
            System.out.println("Celebrity ID is: " + celeb);
    }
}
