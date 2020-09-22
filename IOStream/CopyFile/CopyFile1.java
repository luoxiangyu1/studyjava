import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        //通过字符流拷贝文件，一次写一个字符，将1.txt的文件内容复制到2.txt
        //1.
        FileReader fr = new FileReader("lib/1.txt");
        
        //2.
        FileWriter fw = new FileWriter("lib/2.txt");//如果目的地文件不存在，程序将自动创建
        
        //3.
        int len;
        
        //4.
        while ((len = fr.read()) != -1) {
            //5.
            fw.write(len);
        }
        
        6.
        fr.close();
        fw.close();
    }
}