package memento;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/30
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator("1");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        System.out.println("origin stats: " + originator.getState());
        originator.setState("change");
        System.out.println("change stats: " + originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("restore stats: " + originator.getState());
        /**
         * origin stats: 1
         * change stats: change
         * restore stats: 1
         */
    }
}
