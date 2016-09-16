package base;

public class MyInteger {
	private int iValue;
	
	public MyInteger(int iValue){
		this.iValue = iValue;
	}
	
	public int getiValue(){
		return iValue;
	}
	
	public boolean isEven(){

		return isEven(iValue);
		
	}
	
	public boolean isOdd(){
		return isOdd(iValue);
	}
	
	public boolean isPrime(){
		return isPrime(iValue);
	}
	
	public static boolean isEven(int num ){
		if (num % 2 == 0){
			return true;

		}
		return false;
		
		
	}
	
	public static boolean isOdd(int num ){
		if (num % 2 == 1){
			return true;
		}
		return false;
		
	}
	
	public static boolean isPrime(int num){
		int sqrt = (int) Math.sqrt(num) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
		
	}
	
	public static boolean isEven(MyInteger i){
		return MyInteger.isEven(i.getiValue());
	}
	public static boolean isOdd(MyInteger i){
		return MyInteger.isOdd(i.getiValue());
	}
	
	public static boolean isPrime(MyInteger i){
		return MyInteger.isPrime(i.getiValue());
	}
	
	public boolean equals(int num){
		if (num == iValue){
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger j){
		if (j.getiValue() == iValue){
			return true;
		}
		return false;
	}
	

}
