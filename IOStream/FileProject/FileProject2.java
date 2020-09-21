import java.io.File;

public class FileProject2 {
    public static void main(String[] args) {
        File file1 = new File("lib/1.txt");

        //获取file1的绝对路径
        String path1 = file1.getAbsolutePath();
        System.out.println("path1 " + path1);

        //获取file1的相对路径
        String path2 = file1.getPath();
        System.out.println("path2 " + path2);

        //获取文件名
        String fileName = file1.getName();
        System.out.println("fileName " + fileName);

        //获取lib文件夹下的所有文件（夹）的名称数组String[]
        File file2 = new File("lib");
        String[] names = file2.list();
        for (String name : names) {
            System.out.println(name);
        }

        //获取lib文件夹下的所有文件（夹）的File对象数组 File[]
        File[] files = file2.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}