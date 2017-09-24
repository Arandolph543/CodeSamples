import java.util.ArrayList;
import java.util.List;
 
public class MyThreadJoin {
 
    public static List<String> names = new ArrayList<String>(); 
     
    public static void main(String[] a){
        List<SampleThread> list = new ArrayList<SampleThread>();
        for(int i=0;i<5;i++){
            SampleThread s = new SampleThread();
            list.add(s);
            s.start();
        }
        for(SampleThread st:list){
            try{
                st.join();
            } catch (Exception ex){}
        }
        System.out.println(names);
    }
	
	static class SampleThread extends Thread {
     
		public SampleThread() {
		}

		public void run(){
			MyThreadJoin.names.add(getName());
		}
	}
}
 
