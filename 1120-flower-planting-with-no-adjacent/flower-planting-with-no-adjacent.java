// class Solution {
//     public int[] gardenNoAdj(int n, int[][] paths) {

//         ArrayList<Integer>[] graph = new ArrayList[n];

//         for (int i = 0; i < n; i++)
//             graph[i] = new ArrayList<>();

//         for (int[] path : paths) {
//             int u = path[0] - 1;
//             int v = path[1] - 1;

//             graph[u].add(v);
//             graph[v].add(u);
//         }

//         int[] answer = new int[n];

//         for (int i = 0; i < n; i++) {

//             boolean[] used = new boolean[5];

//             for (int neighbor : graph[i]) {
//                 used[answer[neighbor]] = true;
//             }

//             for (int flower = 1; flower <= 4; flower++) {
//                 if (!used[flower]) {
//                     answer[i] = flower;
//                     break;
//                 }
//             }
//         }

//         return answer;
//     }
// }

class Solution {

    public boolean color(int garden, int n,
                         ArrayList<Integer>[] graph,
                         int[] answer) {

        // Base Case
        if (garden == n)
            return true;

        // Try all 4 flowers
        for (int flower = 1; flower <= 4; flower++) {

            boolean safe = true;

            // Check all neighbors
            for (int neighbor : graph[garden]) {

                if (answer[neighbor] == flower) {
                    safe = false;
                    break;
                }
            }

            if (safe) {

                answer[garden] = flower;

                if (color(garden + 1, n, graph, answer))
                    return true;

                // Backtrack
                answer[garden] = 0;
            }
        }

        return false;
    }

    public int[] gardenNoAdj(int n, int[][] paths) {

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] path : paths) {

            int u = path[0] - 1;
            int v = path[1] - 1;

            graph[u].add(v);
            graph[v].add(u);
        }

        int[] answer = new int[n];

        color(0, n, graph, answer);

        return answer;
    }
}