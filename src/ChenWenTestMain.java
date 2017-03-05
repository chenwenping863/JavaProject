
/**
 * Created by chenwenping on 17/3/4.
 */
public class ChenWenTestMain {
    /**
     * 初始化
     */
    private static City cityA = new City("A");
    private static City cityB = new City("B");
    private static City cityC = new City("C");
    private static City cityD = new City("D");
    private static City cityE = new City("E");

    /**
     * 初始化
     */
    static {
        cityA.getRoutes().add(new Route("A", cityB, 5));
        cityA.getRoutes().add(new Route("A", cityD, 5));
        cityA.getRoutes().add(new Route("A", cityE, 7));

        cityB.getRoutes().add(new Route("B", cityC, 4));

        cityC.getRoutes().add(new Route("C", cityE, 2));
        cityC.getRoutes().add(new Route("C", cityD, 8));

        cityD.getRoutes().add(new Route("D", cityC, 8));
        cityD.getRoutes().add(new Route("D", cityE, 6));

        cityE.getRoutes().add(new Route("E", cityB, 3));
    }


    public static void  main(String arg[]) {
        String result = "";
        /**题目 1 - 5*/
        /**思路：
         * 根据城市，获取该城市节点的路线，然后遍历获取路线的 toCity。
         * 判断是否与改城市节点的下一个参数一样*/
        result = new FristToFifthQuestions().solution(cityA, cityB, cityC);
        System.out.println("Output #1: " + result);

        result = new FristToFifthQuestions().solution(cityA, cityD);
        System.out.println("Output #2: " + result);

        result = new FristToFifthQuestions().solution(cityA, cityD, cityC);
        System.out.println("Output #3: " + result);

        result = new FristToFifthQuestions().solution(cityA, cityE, cityB, cityC, cityD);
        System.out.println("Output #4: " + result);

        result = new FristToFifthQuestions().solution(cityA, cityE, cityD);
        System.out.println("Output #5: " + result);

        /**题目 6*/
        result = new SixthQuestions().solution(3, cityC);
        System.out.println("Output #6: " + result);

        /**题目 7*/
        result = new SeventhQuestions().solution(4, cityA, cityC.getCityName());
        System.out.println("Output #7: " + result);

        /**题目 8、9*/
        result = new EighthAndNinthQuestions().solution(cityA, cityC.getCityName());
        System.out.println("Output #8: " + result);

        result = new EighthAndNinthQuestions().solution(cityC, cityC.getCityName());
        System.out.println("Output #9: " + result);

        /**题目 10*/
        result = new TenthQuestions().solution(cityC, cityC.getCityName());
        System.out.println("Output #10: " + result);
    }

}
