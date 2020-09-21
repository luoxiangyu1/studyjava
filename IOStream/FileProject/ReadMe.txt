File类:
        概述:
            文件，文件夹，一个File对象代表磁盘上的某个文件或文件夹
            大白话解释: 就是用来操作文件(夹)路径的.
            构造方法：
        File(String pathname)               根据给定的字符串路径创建其对应File对象.
        File(String parent, String child)   根据给定的字符串形式的父目录和子文件(夹)名创建File对象.
        File(File parent, String child)     根据给定的父目录对象和子文件(夹)名创建File对象.
    成员方法：
        创建功能:   如果不存在就创建, 返回true, 否则就不创建, 返回false.
            createNewFile()：创建文件,
            mkdir():         创建单级目录
            mkdirs()：       创建目录
        判断功能:
            isDirectory()：判断File对象是否为目录
            isFile()：判断File对象是否为文件
            exists()：判断File对象是否存
File类的获取功能:
        getAbsolutePath()：获取绝对路径
        getPath()：        获取文件的相对路径
        getName()：        获取文件名
        list()：           获取指定目录下所有文件（夹）名称数组
        listFiles()：      获取指定目录下所有文件（夹）File数组

 Java中路径的划分:
            绝对路径:
                以盘符开头的路径, 固定的, 写"死"的路径.
            相对路径:
                意思是相对于某个路径而言, Java中的相对路径是指: 相对于当前项目的路径来讲的.