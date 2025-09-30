import java.util.*;

public class MaxTree {
    static int n, idxSmall, idxLarge;
    static ArrayList<Edge>[] graph;
    static int[] p;  // result values assigned
    static boolean[] visited;

    static class Edge {
        int to; 
        int x, y; 
        Edge(int to, int x, int y) { this.to = to; this.x = x; this.y = y; }
    }

    static void dfs(int u) {
        visited[u] = true;
        for (Edge e : graph[u]) {
            if (visited[e.to]) continue;

            if (e.x > e.y) {
                // p[u] > p[v] => child gets smaller value
                p[e.to] = --idxLarge;
            } else {
                // p[u] < p[v] => child gets larger value
                p[e.to] = ++idxSmall;
            }

            dfs(e.to);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            n = sc.nextInt();
            graph = new ArrayList[n+1];
            for (int i=1; i<=n; i++) graph[i] = new ArrayList<>();

            for (int i=1; i<n; i++) {
                int u = sc.nextInt(), v = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
                graph[u].add(new Edge(v, x, y));
                graph[v].add(new Edge(u, x, y));
            }

            p = new int[n+1];
            visited = new boolean[n+1];
            idxSmall = 1;
            idxLarge = n;
            p[1] = ++idxSmall; // root value (can be anywhere but consistent)
            visited[1] = true;

            dfs(1);

            for (int i=1; i<=n; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
