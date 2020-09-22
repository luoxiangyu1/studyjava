字符流写数据

Writer类中的方法:
            void write(int ch);                          一次写一个字符
            void write(char[] chs,int index,int len);    一次写一个指定的字符数组
            void write(String str);                      一次写一个字符串

 FileWriter类的构造方法:
        public FileWriter(String pathname);           根据传入的字符串形式的路径, 获取字符输出流对