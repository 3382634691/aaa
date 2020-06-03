package Map;

import java.util.List;
import java.util.Map;
import java.util.Set;
/*
 * 1.of方法只适用于list，set，map接口不能在实现类适用
 * 2.of方法返回的是一个不变集合
 * 3.set和map接口在调用of的时候，不能有重复元素
 */


public class of {
public static void main(String[] args)
{
	List<String> list= List.of("a","b","b");
	System.out.println(list);
	list.add("w");//不能再增加元素了
	Set<String> set=Set.of("a","a","c");
	System.out.println(set);
	Map<String,Integer> map=Map.of("张三",18,"张三",20,"王五",18);
	System.out.println(map);
}
}
