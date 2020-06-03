package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//续写只需要在构造方法中加入true
//换行符：winds \r \n  liux :/n  mac:/r
public class fileout {
public static void main(String[] args) throws IOException
{
	FileOutputStream fos=new FileOutputStream("E:\\javafile文件操作测试\\abc.txt",true);
	fos.write("你好".getBytes());
	fos.write("\r\n".getBytes());
	fos.write("你好".getBytes());
	fos.close();
}
}
