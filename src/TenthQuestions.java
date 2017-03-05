/**
 * Created by chenwenping on 17/3/5.
 */
public class TenthQuestions {

    /**
     * @param fromCity
     * @param toCityNm
     * @return
     */
    //题目10
    public String solution(City fromCity,String toCityNm){
        String result = "NO SUCH ROUTE";
        int r = logicForSolution10(30,toCityNm, 0, fromCity, fromCity.getCityName(),0);
        if(r>0){
            result = r + "";
        }
        return  result;
    }

    /**
     * @param maxDistance
     * @param toCityNm
     * @param distance
     * @param fromCity
     * @param logRoute
     * @param result
     * @return
     */
    private int logicForSolution10(int maxDistance, String toCityNm, int distance, City fromCity,String logRoute,int result){
        if(distance > maxDistance ){
            return result;
        }
        for(Route r : fromCity.getRoutes()){
            String buffer = logRoute + r.getToCity().getCityName();
            int distanceBuffer = distance + r.getDistance();
            if(r.getToCity().getCityName().equalsIgnoreCase(toCityNm) && distanceBuffer < maxDistance){
                result ++;
//                  System.out.println(buffer + "," + distanceBuffer + ", " + maxDistance);
            }
            result = logicForSolution10(maxDistance,toCityNm,distanceBuffer,r.getToCity(),buffer,result);
        }
        return result;
    }

}
