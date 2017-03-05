/**
 * Created by chenwenping on 17/3/5.
 */
public class FristToFifthQuestions {

    /**
     * 题目1~5
     * @param cities
     * @return
     */

    public String solution(City ...cities) {

        boolean isFound;

        int total = 0;

        for(int i = 0 ; i<cities.length-1;i++){
            isFound = false;

            for(Route r : cities[i].getRoutes()){
                if(r.getToCity().getCityName().equalsIgnoreCase(cities[i+1].getCityName())){
                    total += r.getDistance();
                    isFound = true;
                    break;
                }
            }

            if(!isFound){
                return "NO SUCH ROUTE";
            }
        }

        return total + "";
    }
}
