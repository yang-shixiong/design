package interpreter;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.operation("1+2+3");
        /**
         * result==>: 6
         */
    }
}
