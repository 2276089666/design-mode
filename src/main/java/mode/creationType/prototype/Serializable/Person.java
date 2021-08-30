package mode.creationType.prototype.Serializable;

import java.io.*;

/**
 * @Author ws
 * @Date 2021/4/22 11:04
 * @Version 1.0
 */
public class Person implements Serializable{
    Integer id;
    private String name;
    private Computer computer;

    public Person(Integer id, String name, Computer computer) {
        this.id = id;
        this.name = name;
        this.computer = computer;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Computer getComputer() {
        return computer;
    }

    public Person deepCloneBySerializable() {
        ObjectOutputStream objectOutputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        Person person = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);  // 当前对象以对象流的方式输入

            // 反序列化流
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);

            person = (Person) objectInputStream.readObject();
            return person;

        } catch (IOException | ClassNotFoundException ioException) {
            ioException.printStackTrace();
            return null;
        } finally {
            try {
                objectInputStream.close();
                byteArrayInputStream.close();
                objectOutputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
