public class Calculate {
public static void main(String[] arg){
	System.out.println("Calculate...");
	double first  =  Double.valueOf(arg[0]);
	double second  =  Double.valueOf(arg[1]);
	double summ  = first + second;
	double proizv  = first * second;
	double delen  = first / second;
	
	System.out.println("sum " + summ);
	System.out.println("proizv " + proizv);
	System.out.println("delen " + delen);
	

  }
}