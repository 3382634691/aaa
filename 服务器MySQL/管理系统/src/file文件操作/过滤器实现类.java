package file文件操作;

import java.io.File;
import java.io.FileFilter;

public class 过滤器实现类 implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// TODO 自动生成的方法存根
		if(pathname.isDirectory())
			
			return true;
		return pathname.getName().toLowerCase().endsWith(".txt");
	}

}
