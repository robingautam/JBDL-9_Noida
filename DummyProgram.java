public class DummyProgram {
 
     int ans = 0;

  public static void main(String[] args){
      int a = 10;
      int b = 20;
      ans = a+b;
      Data d = new Data();
      d.val = ans;
      System.out.println(d.val);    
  }
}

class Data {
   int val;
}