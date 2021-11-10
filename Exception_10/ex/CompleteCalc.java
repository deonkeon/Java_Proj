package Exception_10.ex;

import java.util.Scanner;

public class CompleteCalc extends Calculator implements Calc {
   
   int a;
   int b;
   public CompleteCalc(int a, int b) {
      this.a = a;
      this.b = b;
   }
   
   public static void main(String[] args) {
      
      // Calc 인터페이스를 구현, Calculator 추상클래스 구현
      // 스캐너로 두개의 정수를 인풋 받아서, 객체 자체를 print 했을 때, 사칙연산 모두 출력(toString 오버라이딩)
      // a나누기b : b가 0인 경우 Exception이 발생됨. ArithmeticException 처리하기

      boolean run = true;
      Scanner sc = new Scanner(System.in);
      
      while (run) {
         int inputNum1 = 0;
         int inputNum2 = 0;
         System.out.println("========================");
         System.out.println("계산기를 실행합니다. ");
         System.out.print("계산방식을 선택하세요. ");
         
         int secNo = sc.nextInt();
         
         System.out.println("첫번째 정수 ");
         inputNum1 = sc.nextInt();
         System.out.println("두번째 정수 ");
         inputNum2 = sc.nextInt();
         CompleteCalc calc = new CompleteCalc(inputNum1, inputNum2);
  
         if (secNo == 1) {
            System.out.println("더하기");
            System.out.println("입력한 값의 합은 : " + calc.add(inputNum1,inputNum2));
        
         } else if (secNo == 2) {
            System.out.println("곱하기");
            System.out.println("입력한 값의 곱은 : " + calc.times(inputNum1,inputNum2));
            
            
         } else if (secNo == 3) {
            System.out.println("빼기");
            System.out.println("입력한 값의 빼기는 : " + calc.substract(inputNum1,inputNum2));
            
            
         } else if (secNo == 4) {
            System.out.println("나누기");
            System.out.println("입력한 값의 나누기는 : " + calc.divide(inputNum1,inputNum2));
            
           
         } else if (secNo == 5) {
            System.out.println("모든 계산을 실행합니다.");
            System.out.println(calc.toString());
         } else if (secNo == 6) {
            run = false;
         } 

      }
      System.out.println("계산기를 종료합니다. ");
      sc.close();
   }
   
   @Override
   public String toString() {
      return "입력한 값의 합은 : " + add(this.a, this.b) + ", 입력한 값의 빼기는 : " +  substract(this.a, this.b) 
      +", 입력한 값의 곱은 : "  + times(this.a, this.b) +", 입력한 값의 나누기는 : " + divide(this.a, this.b);

   }
   
   @Override
   public int add(int a, int b) {
      return a + b;
   }

   @Override
   public int times(int a, int b) {
      return a * b;
   }

   @Override
   int substract(int a, int b) {
      return a - b;
   }

   @Override
   int divide(int a, int b) {
      try {
         if (a != b) {
            return a / b;
         } else {
            System.out.println("에러발생");
            return a / b;
         }

      } catch (ArithmeticException e) {
         // System.out.println(e);
         System.out.println("예외가 발생하여 처리합니다.");
      }
      System.out.println("b가 1보다 작아 나눌 수가 없습니다. ");
      return b;

   }
}