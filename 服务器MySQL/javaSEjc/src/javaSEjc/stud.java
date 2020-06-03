package javaSEjc;

import java.util.Date;

public class stud {
	 
    private String id; //学号
    private String name; //姓名
    Date birthDate; //出生日期
     
    protected double average = 0; //平均分
    String info =id + name + average + "是第" + count + "个对象实例";
 
     
    public stud(String id, String name) {
        this();
        this.id = id;
        this.name = name;
    }
    
    public stud() {
        super();
        count++;
    }
    
    
    public stud(String id) {
        this.id = id;
         
    }
 
     
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public double getAverage() {
        return average;
    }
    public void setAverage(double average) {
        this.average = average;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        stud.count = count;
    }
     
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", average=" + average + ""
                + ",count="+ count +" ]";
    }
 
    //业务方法
        public double test() {// 考试方法
            double average = 90;
            System.out.println("考试开始：");
            System.out.println("考试进行中......");
//          try {
//             Thread.sleep(1000*60*30);//考试时长30分钟
//          } catch (InterruptedException e) {
//              // TODO Auto-generated catch block
//              e.printStackTrace();
//          } 
             
            System.out.println("考试结束！");
            System.out.println("考生数量为"+count);
            System.out.println("test()average="+average);
            return Math.random()*100; //随机返回成绩
        }
         
        public static int getInstanceCount() { //返回学生个数
            return count;
        }
        public static void printScore(stud stu) {
            stu.average = 80;
            System.out.println(stu.name+"平均分为"+stu.average);
        }
        public static void printScore(stud[] studentArray) {
            for (stud stu : studentArray) {
                System.out.println(stu.name+"平均分为"+stu.average);
            }
        }
         
        public static int count = 0; //类的对象数
        
        
        
        
        
        
        
        
    public static void main(String[] args) {
        stud stu1 = new stud("019907","张敏");
        System.out.println(stu1);
        stud stu2 = new stud("019936","曹舟");
        System.out.println(stu2);
//      System.out.println(Student.getInstanceCount());
//      System.out.println(stu1.name+"参加考试");
//      stu1.test();
//      System.out.println("main()average="+stu1.average);
        stud[] studentArray = new stud[10];
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new stud(i+" ");
            System.out.println();
        }
        stud.printScore(stu1);
    }
 
}