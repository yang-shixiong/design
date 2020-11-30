package flyweight;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
