import java.io.*;

/**
 * @author xuhao
 * @date 2022/5/26-15:37
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/hello.txt"));
        Student s1=new Student("zs",20);
        Student s2=new Student("ls",30);
        Student s3=new Student("lw",30);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        oos.close();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/hello.txt"));
        Student s=null;
        /*Object o = ois.readObject();
        Student s=(Student)o;
        System.out.println(s.getAge()+","+s.getName());
        Object o2 = ois.readObject();
        Student s2=(Student)o2;
        System.out.println(s2.getAge()+","+s2.getName());
        ois.close();*/
        while(true){
            try {
                Object o = ois.readObject();
                s=(Student)o;
                System.out.println(s.getAge()+","+s.getName());
            }catch (Exception e){
                System.out.println("读取完毕");
//                e.printStackTrace();
                break;
            }
        }
    }
}
