/**
 * Created by chenwenping on 17/3/5.
 */
public class SeventhQuestions {

    /**
     *
     */
    public int[][] map = {
            { -1, 5, -1, 5, 7 },
            { -1, -1, 4, -1, -1 },
            { -1, -1, -1, 8, 2 },
            { -1, -1, 8, -1, 6 },
            { -1, 3, -1, -1, -1 }
    };

    /**
     * @param start
     * @param end
     * @param hops
     */
    public void bfs(String start, String end, int hops) {
        String lastRoute = start;
        for (int hop = 0; hop < hops; hop++) {
            String route = "";
            for (int i = 0; i < lastRoute.length(); i++) {
                char c = lastRoute.charAt(i);
                int id = c - 'A';
                for (int j = 0; j < map[id].length; j++) {
                    if (map[id][j] > 0)
                        route = route + (char) (j + 'A');
                }
            }
//          System.out.println(lastRoute);
            lastRoute = route;
        }
//      System.out.println(lastRoute);
        System.out.println(lastRoute.split(end).length - 1);
    }
}
