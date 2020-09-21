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
            exists()：判断File对象是否存在