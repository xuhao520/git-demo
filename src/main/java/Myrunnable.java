/**
 * @author xuhao
 * @date 2022/5/28-13:07
 */
public class Myrunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
