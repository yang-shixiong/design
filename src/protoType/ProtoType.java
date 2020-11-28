package protoType;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public interface ProtoType {

    ProtoType clone();

    ProtoType deepClone1();

    ProtoType deepClone2();

    ProtoType getProtoType();
}
