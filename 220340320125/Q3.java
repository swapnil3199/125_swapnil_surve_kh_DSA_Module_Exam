import java.util.*;
class twoStackArr
	{
		int arr[];
		int top1;
		int top2;
		int size;
		
		twoStackArr(int size)
		{
		this.size=size;
		arr=new int[size];
		top1=size/2+1;
		top2=size/2;
		
		}
		
		void push1(int x){
		
			if(top1>0){
				top1--;
				arr[top1]=x;
				
			}
			else{
				System.out.println("stack overflow");
				return;
				
			}
		
		}
		void push2(int x){
			if(top2<size-1){
				top2++;
				arr[top2]=x;
			}
			else{
			System.out.println("stacK Overflow");
				return;
			}
		}
		
		int pop1()
		{
			if(top1<=size/2){
				int x=arr[top1];
				top1++;
				return x;
			}
			else{
			System.out.println("stacK Underflow");
				return -1;
			}
			
		}
		
		int pop2(){
			if(top2>=size/2+1){
				int x=arr[top2];
				top2--;
				return x;
			
			}
			else
			{
			    System.out.println("stacK Underflow");
				return -1;	
			}
			
		
		}
	}
	
	class twoStackArrDemo{
		public static void main(String[]arge){
			
		twoStackArr sa = new twoStackArr(10);
		
		sa.push1(5);
		sa.push2(10);
		sa.push2(15);
		sa.push1(11);
		sa.push2(7);
		sa.push2(40);
		
		System.out.println("Popped element"+sa.pop1());
		
		System.out.println("Popped element"+sa.pop2());
				
				
		}
	
	}