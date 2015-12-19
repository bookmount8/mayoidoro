package mayoidoro;

import java.io.IOException;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws IOException {

	Integer limit = Integer.valueOf(setInput());

        BigDecimal xba = new BigDecimal(0);;
        BigDecimal xbc = new BigDecimal(0);;
        BigDecimal sum = new BigDecimal(0);

        for(int i=1;i<=limit;i++) {
        	if (i%2==0) continue;
        	xba = getXBA(sum);
            xbc = getXBC(xba, xbc);
            sum = getSum(xba, xbc);
        }

        System.out.println(xba);
        System.out.println(xbc);
        System.out.println(sum);

    }

	  public static String setInput() throws IOException {
			
		  char[] ar = new char[20];
		  int c = 0;
		  int keta = 0;
		  int i = 0;
		  String input = null;
	    
		  while (true) {
			  c = System.in.read();
			  if (c == 10 || c == 13 ) break;      
			  ar[i++] = (char) c;
			  keta++;
		  }
	    
		  StringBuilder sb = new StringBuilder();
		  for (int j=0;j<keta;j++) {
			  sb.append(ar[j]);
		  }
		  try {
			  input = String.valueOf(sb);     
		  } catch (NumberFormatException e) {
			  System.out.println("appoint numerical value in an argument");
			  System.exit(1);
		  }
		  return input;
	  }
	  
	  public static BigDecimal getXBA(BigDecimal sumBefore) {
		  return sumBefore.add(new BigDecimal(1));
	  }
	
	  public static BigDecimal getXBC(BigDecimal xba, BigDecimal xbcBefore) {
		  return xba.add(xbcBefore);
	  }
	
	  public static BigDecimal getSum(BigDecimal xba, BigDecimal xbc) {
		  return xba.add(xbc);
	  }

}
