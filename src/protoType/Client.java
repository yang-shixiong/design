package protoType;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class Client {

    public static void main(String[] args) {
        ProtoType origin = new ConcreteProtoType1("1", new ConcreteProtoType1("2", null));
        ProtoType clone = origin.clone();
        long start = System.nanoTime();
        ProtoType deepClone1 = origin.deepClone1();
        long cloneEnd = System.nanoTime();
        ProtoType deepClone2 = origin.deepClone2();
        long deepCloneEnd = System.nanoTime();
        System.out.println("first clone use time, nano: " + (cloneEnd - start));
        System.out.println("second clone use time, nano: " + (deepCloneEnd - cloneEnd));
        System.out.println("origin.getProtoType().hashCode() = " + origin.getProtoType().hashCode());
        System.out.println("clone.getProtoType().hashCode() = " + clone.getProtoType().hashCode());
        System.out.println("deepClone1.getProtoType().hashCode() = " + deepClone1.getProtoType().hashCode());
        System.out.println("deepClone2.getProtoType().hashCode() = " + deepClone2.getProtoType().hashCode());
        System.out.println("origin reference== clone reference==> " + (origin.getProtoType() == clone.getProtoType()));
        System.out.println("origin reference == deepClone1 reference==>" + (origin.getProtoType() == deepClone1.getProtoType()));
        System.out.println("origin reference == deepClone2 reference==>" + (origin.getProtoType() == deepClone2.getProtoType()));
    }
}
