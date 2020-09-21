import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //需求: 将 D:\abc\1.txt 封装成File对象.
        //方式一: 根据字符串形式的路径获取File对象.
        //File file1 = new File("D:\\abc\\1.txt");
        File file1 = new File("D:/abc/1.txt");
        System.out.println("file1: " + file1);

        //方式二: 根据字符串形式的父目录以及子目录创建File对象.
        File file2 = new File("D:/abc/", "1.txt");
        System.out.println("file2: " + file2);

        //方式三: 根据父目录对象, 以及字符串形式的子目录来获取File对象.
        File file3 = new File("D:/abc/");
        File file4 = new File(file3, "1.txt");
        System.out.println("file4: " + file4);
        System.out.println("-----------------------------");
        System.out.println("创建功能");
        //需求: 在d:盘下创建 2.txt文件
        File file5 = new File("d:/2.txt");
        boolean flag1 = file5.createNewFile();
        System.out.println("flag1: " + flag1);

        //需求: 在D:盘下创建 a文件夹
        File file6 = new File("D:/a");
        boolean flag2 = file6.mkdir();   //make directory, 创建单级目录
        System.out.println("flag2: " + flag2);

        //需求: 在D:盘下创建 a/b/c文件夹
        File file7 = new File("D:/a/b/c");
        boolean flag3 = file7.mkdirs();     //创建多级目录(也可以创建单级目录)
        System.out.println("flag3: " + flag3);

        System.out.println("------------------------------");
        System.out.println("测试判断功能");

        File file8 = new File("D:/abc/11.txt");
       /* boolean flag4 = file8.isDirectory();
        System.out.println("测试file8是否是文件夹: " + flag4 );*/
        System.out.println("测试file8是否是文件夹: " + file8.isDirectory() );
        System.out.println("测试file8是否是文件: " + file8.isFile());
        System.out.println("测试file8是否存在: "  + file8.exists());
    }
}