package 异常;

public class thr extends Exception{
	 public final static double min = 0;
	    public final static double max = 100;
	     
	    public thr() {
			super();
			// TODO 自动生成的构造函数存根
		}


		public thr(String message) {
			super(message);
			// TODO 自动生成的构造函数存根
		}


		
	 
	    public static double verifyScore(String scoreStr) throws thr {
	        double score;
	        try {
	            score = Double.parseDouble(scoreStr);
	             
	        } catch (Exception e) {         
	            throw new thr("无效的成绩："+scoreStr+"，成绩应为实数，请重新输入！\n");
	        }
	        if(score < min || score > max) {
	            throw new thr("无效的成绩："+scoreStr+"，成绩应在[0-100]范围内，请重新输入！\n");
	        }
	        return score;
	         
	    }
}
