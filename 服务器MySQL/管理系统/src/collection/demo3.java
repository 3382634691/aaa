package collection;

public class demo3 {
public static void main(String[] args)
{
	gener g=new gener();
	g.method(2);
	
	gener.meth2("静态方法");
	gener.meth2(2);
//	shixan<String> shixan=new shixan<>();
  shixan sx=new shixan();
  sx.method("23");
  
  
  gener2<Integer> gen=new gener2<Integer>();
  gen.method(32);
  
  
  gener2<Double> gi3=new gener2<Double>();
  
}
}
