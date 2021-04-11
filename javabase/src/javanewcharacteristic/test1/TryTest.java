package javanewcharacteristic.test1;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author pay-o
 * @create 2021-04-09-17:05
 */
public class TryTest {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        try(reader) {
            char[] chuf = new char[20];
            int len;
            if ((len = reader.read(chuf)) != -1){
                String s = new String(chuf, 0, len);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
