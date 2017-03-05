/**
 * Created by chenwenping on 17/3/5.
 */
public class Route {
    /**
     *路线起始点
     */
    private String fromCity ;
    /**路线终止节点
     *
     */
    private City toCity;
    /**
     * 路线权重
     */
    private int distance;

    /**
     * @return
     */
    public String getFromCity() {
        return fromCity;
    }

    /**
     * @param fromCity
     */
    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    /**
     * @return
     */
    public City getToCity() {
        return toCity;
    }

    /**
     * @param toCity
     */
    public void setToCity(City toCity) {
        this.toCity = toCity;
    }

    /**
     * @return
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     * @param fromCity
     * @param toCity
     * @param distance
     */
    public Route(String fromCity, City toCity, int distance) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Route [fromCity=" + fromCity + ", toCity=" + toCity + ", distance=" + distance + "]";
    }
}
