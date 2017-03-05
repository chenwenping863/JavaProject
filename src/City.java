import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenwenping on 17/3/5.
 */
public class City {
    /**
     *城市节点
     */
    private String cityName = "";
    /**
     *连接城市节点的线路
     */
    private List<Route> routes = new ArrayList<Route>();

    /**
     * @return
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return
     */
    public List<Route> getRoutes() {
        return routes;
    }

    /**
     * @param routes
     */
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    /**
     * @param cityName
     */
    public City(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "City [cityName=" + cityName + ", routes=" + routes + "]";
    }
}
