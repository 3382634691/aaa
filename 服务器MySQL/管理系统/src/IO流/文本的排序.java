package IO流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
//hashmap写入无序，读取按key的顺序大小来读取
public class 文本的排序 {
public static void main(String[] args) throws IOException
{
	HashMap<String,String> hash=new HashMap<>();
	BufferedReader br=new BufferedReader(new FileReader("E:\\javafile文件操作测试\\乱序文本.txt"));
	BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\javafile文件操作测试\\out.txt"));
	
	String line;
	while((line=br.readLine())!=null)
	{
		String[] a=line.split("\\.");
		hash.put(a[0], a[1]);//这里要注意Map集合本身就是无序的，因此他会按照顺序1.23.来取出
	}
	
	
	
	for(String set:hash.keySet())
	{
		System.out.println(set+"."+hash.get(set));
		bw.write(set+"."+hash.get(set));
		bw.newLine();
	}
	bw.close();
	br.close();

}
}
