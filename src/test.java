import java.util.TreeSet;


public class test {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();

		for(int i=0;i<=6;i++){

		    for(int j=0;j<=8;j++){

		        for(int k=0;k<=8;k++){

		            set.add(i*4+j*5+k*7);

		        }

		    }
		}
		System.out.println(set.toString());
		System.out.println(set.size());
	}
}
