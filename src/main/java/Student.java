import java.io.Serializable;

/**
 * @author xuhao
 * @date 2022/5/26-10:55
 */
public class Student implements Serializable {
    private String name;
    private transient int age;
    private static final long serialVersionUID=99L;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name+","+this.age;
    }
}
