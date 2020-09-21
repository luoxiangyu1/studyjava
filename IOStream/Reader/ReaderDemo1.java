import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //需求: 通过字符流读取数据.
        //1. 创建字符输入流对象.
        Reader reader = new FileReader("lib/1.txt");
        //2. 读取数据.
        /*int ch1 = reader.read();
        System.out.println(ch1);        //97
        int ch2 = reader.read();
        System.out.println(ch2);        //98
        int ch3 = reader.read();
        System.out.println(ch3);        //99
        int ch4 = reader.read();
        System.out.println(ch4);        //-1*/

        /*
            优化上述的读法, 用循环改进.
            又因为不知道循环次数, 所以用while循环.
         */
        //定义变量, 用来接收读取到的字符.
        int ch;
        /*
            (ch = reader.read()) != -1 做了三件事
                1. 执行reader.read(), 去文件中读取一个字符.
                2. 执行ch = reader.read(), 将读取到的字符赋值给变量.
                3. (ch = reader.read()) != -1, 用读取到的字符(内容) 和 -1进行比较.
         */
        while((ch = reader.read()) != -1){
            //ch = reader.read();
            System.out.println(ch);
        }

        //3. 释放资源.
        reader.close();
    }
}