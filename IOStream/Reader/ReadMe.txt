### 字符流读取数据——按单个字符读取

创建字符流读取文件对象：
Reader reader = new FileReader("readme.txt");

调用方法读取数据：
int data = reader.read();

读取一个字符，返回该字符对应的ASCII码值，若到达流的末尾，返回-1。

异常处理：throws IOException

关闭资源：reader.close();