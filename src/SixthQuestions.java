/**
 * Created by chenwenping on 17/3/5.
 */
public class SixthQuestions {
    /** 题目6
     * @param lmtStops
     * @param roundCity
     * @return
     */
    public String solution(int lmtStops,City roundCity) {
        int r = logicForSolution(lmtStops, roundCity.getCityName(), 0, roundCity, roundCity.getCityName(), 0);
        return r + "";
    }

    /**
     * @param lmtStops
     * @param roundCtyNm
     * @param count
     * @param city
     * @param logRoute
     * @param result
     * @return
     */
    private int logicForSolution(int lmtStops, String roundCtyNm, int count, City city, String logRoute, int result){
        count ++;
        if(count > lmtStops){
            return result;
        }
        for(Route r : city.getRoutes()){
            String buffer = logRoute + r.getToCity().getCityName();
            if(r.getToCity().getCityName().equalsIgnoreCase(roundCtyNm)){
  //          System.out.println(buffer);
                result ++;
            }else{
                result = logicForSolution(lmtStops, roundCtyNm, count, r.getToCity(), buffer, result);
            }
        }
        return result;
    }
}
