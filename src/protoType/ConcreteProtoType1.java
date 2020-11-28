package protoType;

import java.io.*;
import java.util.Objects;

/**
 * Description:
 *
 * @author mark
 * Date 2020/11/28
 */
public class ConcreteProtoType1 implements ProtoType, Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    String name;

    private ProtoType protoType;

    public ConcreteProtoType1(String name, ProtoType protoType) {
        this.name = name;
        this.protoType = protoType;
    }

    @Override
    public ProtoType clone() {
        Object clone = null;
        try {
            // 调用Object的克隆方法
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (ProtoType) clone;
    }

    @Override
    public ProtoType deepClone1() {
        // 方案一：所有引用的属性都实现深拷贝,然后引用属性统一调用深拷贝方法即可
        ConcreteProtoType1 clone = null;
        try {
            // 调用Object的克隆方法
            clone = (ConcreteProtoType1) super.clone();
            if (Objects.nonNull(protoType))
                clone.setProtoType(protoType.deepClone1());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (ProtoType) clone;
    }

    @Override
    public ProtoType deepClone2() {

        // 在这里使用的时序列化，把对象进行序列化，然后再反序列化，也同样可以得到一个新的对象
        ByteArrayOutputStream outputStream = null;
        ByteArrayInputStream inputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            outputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this);

            inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            objectInputStream = new ObjectInputStream(inputStream);
            return (ProtoType) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (Objects.nonNull(outputStream))
                    outputStream.close();
                if (Objects.nonNull(inputStream))
                    inputStream.close();
                if (Objects.nonNull(objectOutputStream))
                    objectOutputStream.close();
                if (Objects.nonNull(objectInputStream))
                    objectInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public ProtoType getProtoType() {
        return this.protoType;
    }

    public void setProtoType(ProtoType protoType) {
        this.protoType = protoType;
    }

    @Override
    public String toString() {
        return "ConcreteProtoType1{" +
                "name='" + name + '\'' +
                '}';
    }
}
