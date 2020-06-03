package 常用API;

import java.util.Arrays;

public class Arrayss {
	private int a;
	private String ab;
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((ab == null) ? 0 : ab.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arrayss other = (Arrayss) obj;
		if (a != other.a)
			return false;
		if (ab == null) {
			if (other.ab != null)
				return false;
		} else if (!ab.equals(other.ab))
			return false;
		return true;
	}

public static void main(String[] args)
{
	int a[]= {1,2,3};
	System.out.println(Arrays.toString(a));
	
	
}

@Override
public String toString() {
	return "Arrayss []";
}
}
