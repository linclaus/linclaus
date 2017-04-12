import java.math.BigInteger;

public class zhongying {
	public static void main(String[] args) {
		long sum=1;
		BigInteger bsum=new BigInteger(1+"");
		int n=20;
		for(int i=2*n;i>n;i--){
			bsum=bsum.multiply(new BigInteger(i+""));
		}
		for(int i=1;i<=n;i++){
			bsum=bsum.divide(new BigInteger(i+""));
		}
		int j=1;
		for(int i=2*n;i>n;i--,j++){
			
			sum*=i;
			sum/=j;
		}
		System.out.println(sum);
		System.out.println(Long.parseLong(bsum.toString()));
	}
}
