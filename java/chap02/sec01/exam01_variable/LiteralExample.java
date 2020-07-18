package sec01.exam01_variable;

public class LiteralExample {
	public static void main (String[] args){
		int var1 = 10;
			System.out.println(var1);
			
			int var2 =010;	//8진수의 10표현 1x8^1+0x8^0 =8로표현
			System.out.println(var2);
			
			int var3 =0x10;//16진수의 10표현 	
			System.out.println(var3);		
			
			double var4 = 0.25;
			System.out.println(var4);
			
			double var5 = 2e5; // 정수지만 지수와 가수로 작성되었기떄문에 double로 구성
			System.out.println(var5);
			
			//문자리터럴
			char var6 = 'a';
			System.out.println(var6); 
			
			char var7 = '한';
			System.out.println(var7);
			
			//escape 
			System.out.println("\t들여쓰기");
			System.out.println("대한"+'\n'+"민국");//줄바꿈
			System.out.println("this"+'\''+"s Java");//작은따옴표 표현
			System.out.println("이것은"+"\""+"중요"+"\""+"합니다"); //큰따옴표 표현
			System.out.println("가격이"+"\\"+"300입니다");//역슬래쉬 표현
			
			char var8 = '\u0041'; //4자리16진수 표현
			System.out.println(var8);
			System.out.println("java"+ 8); //문자열 결합 연산자
             
			
			//boolean 논리리터럴 저장
			boolean var10 = true;
			boolean var11 = false;
			System.out.println(var10); 
			
			
	}
}
