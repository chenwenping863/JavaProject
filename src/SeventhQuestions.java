/**
 * Created by chenwenping on 17/3/5.
 */
public class SeventhQuestions {
    /**
     * @param exactlyStops
     * @param fromCity
     * @param toCityNm
     * @return
     */
    //题目7
    public String solution(int exactlyStops,City fromCity,String toCityNm){
        int r = logicForSolution7(exactlyStops, toCityNm, 0, fromCity, fromCity.getCityName(),0);
        return r +"";
    }

    /**
     * @param exactlyStops
     * @param toCityNm
     * @param count
     * @param city
     * @param logRoute
     * @param result
     * @return
     */
    private int logicForSolution7(int exactlyStops, String toCityNm, int count, City city,String logRoute,int result){
        count ++;
        if(count > exactlyStops){
            return result;
        }
        for(Route r : city.getRoutes()){
            String buffer = logRoute + r.getToCity().getCityName();
            if(r.getToCity().getCityName().equalsIgnoreCase(toCityNm)){
                if(count == exactlyStops){
//                  System.out.println(buffer);
                    result++;
                }
            }
            result = logicForSolution7(exactlyStops,toCityNm,count,r.getToCity(),buffer,result);
        }
        return result;
    }
}
