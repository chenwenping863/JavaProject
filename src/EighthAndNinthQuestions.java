import java.util.Set;
import java.util.TreeSet;

/**
 * Created by chenwenping on 17/3/5.
 */
public class EighthAndNinthQuestions {
    /**
     * @param fromCity
     * @param toCityNm
     * @return
     */
    //题目8~9
    public String solution(City fromCity, String toCityNm){
        String result = "NO SUCH ROUTE";
        TreeSet<Integer> resultSet = new TreeSet<Integer>();
        logicForSolution(-1, toCityNm, 0, fromCity, fromCity.getCityName(), 0, resultSet);
        if(null != resultSet.ceiling(0)){
            result = resultSet.ceiling(0) +  "";
        }
        return  result;
    }

    /**
     * @param minDistance
     * @param toCityNm
     * @param distance
     * @param fromCity
     * @param logRoute
     * @param result
     * @param resultSet
     */
    private void logicForSolution(int minDistance, String toCityNm, int distance, City fromCity,String logRoute,int result,Set<Integer> resultSet){
        if(minDistance > distance){
            return;
        }
        for(Route r : fromCity.getRoutes()){
            String buffer = logRoute + r.getToCity().getCityName();
            int distanceBuffer = distance + r.getDistance();
            if(r.getToCity().getCityName().equalsIgnoreCase(toCityNm)){
                result = distanceBuffer;
              // System.out.println(buffer + "," + result);
                minDistance = result ;
                resultSet.add(result);
            }else if(logRoute.indexOf(r.getToCity().getCityName())==-1){
                logicForSolution(minDistance,toCityNm,distanceBuffer,r.getToCity(),buffer,result,resultSet);
            }
        }
        return;
    }
}
