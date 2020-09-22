import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) throws IOException {
        //需求: 通过字符流拷贝文件, 一次读写一个字符数组.
        //例如: 将1.txt文件中的内容复制到2.txt文件中.
        //1
        FileReader fr = new FileReader("lib/1.txt");
        //2
        FileWriter fw = new FileWriter("lib/2.txt");
        //3
        //定义一个字符数组
        char[] chs = new char[1024];
        //用来记录读取到的有效字符数.
        int len;
        //4
        while((len = fr.read(chs)) != -1) {
            //5
            fw.write(chs,0,len);
        }
        //6
        fr.close();
        fw.close();
        
    }
}