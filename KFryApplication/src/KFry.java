import java.util.*;
import java.text.DecimalFormat;
public class KFry {
	int totalKFryOrder;
	double totalSales;
	double totalSales_2=0;
	double totalSales_4=0.0;
	int noOfSpicyOrder;
	int noOfOriginalOrder;
	int noOfHoneyOrder;
	int noOfSpicyOrder_2=0;
	int noOfOriginalOrder_2=0;
	int noOfHoneyOrder_2=0;
	int noOfSpicyOrder_4;
	int noOfOriginalOrder_4;
	int noOfHoneyOrder_4;
	Stack<String>KoreanChicken=new Stack<String>();
	//Stack<String>KoreanChicken_2=new Stack<String>()
	Queue<String>last6=new Queue<String>();
	Queue<String>last4=new Queue<String>();
	ArrayList<String>listKFry=new ArrayList<String>(Arrays.asList("original","spicy","spicy","honey"));
	
	
	DecimalFormat df=new DecimalFormat("0.00");
	KFry(){
		this.totalSales=0.0;
		this.noOfHoneyOrder=0;
		this.noOfOriginalOrder=0;
		this.noOfSpicyOrder=0;
		this.totalKFryOrder=0;
		
		
	}
	public void addOrder(String KFryOrder) {
		KoreanChicken.push(KFryOrder);
		if(KFryOrder.equals("spicy"))
		{
			noOfSpicyOrder++;
		}
		else if(KFryOrder.equals("original"))
		{
			noOfOriginalOrder++;
		}
		else if(KFryOrder.equals("honey"))
		{
			noOfHoneyOrder++;
		}
		
	}
	public void calculateAndPrintAllOrders() {
		totalSales=(noOfSpicyOrder*20.90)+(noOfOriginalOrder*15.90)+(noOfHoneyOrder*17.90);
		System.out.print("All Orders: ");
		int total=0;
		while(!KoreanChicken.isEmpty())
		{
			if(total<6)
			{
				last6.enqueue(KoreanChicken.peek());
				if(KoreanChicken.peek().equals("spicy"))
				{
					noOfSpicyOrder_2++;
				}
				else if(KoreanChicken.peek().equals("original"))
				{
					noOfOriginalOrder_2++;
				}
				else if(KoreanChicken.peek().equals("honey"))
				{
					noOfHoneyOrder_2++;
				}
			}
			if(total<4)
			{
				last4.enqueue(KoreanChicken.peek());
				if(KoreanChicken.equals("spicy"))
				{
					noOfSpicyOrder_4++;
				}
				else if(KoreanChicken.equals("original"))
				{
					noOfOriginalOrder_4++;
				}
				else if(KoreanChicken.equals("honey"))
				{
					noOfHoneyOrder_4++;
				}
			}
			System.out.print(KoreanChicken.pop()+" ");
			
			total++;
		}
		System.out.println();
		System.out.println("Total KFry Orders: "+total);
		System.out.println("Total Sales: RM"+df.format(totalSales));
		System.out.println("Number of Order Chicken Spicy: "+noOfSpicyOrder);
		System.out.println("Number of Order Chicken Original: "+noOfOriginalOrder);
		System.out.println("Number of Order Chicken Honey: "+noOfHoneyOrder);
		
	}
	public void last6Order() {
		//totalSales_2=(noOfSpicyOrder_2*20.90)+(noOfOriginalOrder_2*15.90)+(noOfHoneyOrder_2*17.90);
		//totalSales_4=(noOfSpicyOrder_4*20.90)+(noOfOriginalOrder_4*15.90)+(noOfHoneyOrder_4*17.90);
		totalSales=0;
		totalSales=(noOfSpicyOrder_2*20.90)+(noOfOriginalOrder_2*15.90)+(noOfHoneyOrder_2*17.90);
		System.out.print("Last 6 Order: ");
		while(!last6.isEmpty())
		{
			System.out.print(last6.dequeue()+" ");
		}
		System.out.println();
	    System.out.println("Last 6 Total Sales: RM"+df.format(totalSales));
	   
	}
	
	public void setSale() {

		if(totalSales<70)
		{
			System.out.print("Sale Alert!!");
		}
		
	
	}
	
	public void KFryList(String k)
	{
		
		listKFry.add(k);
		
	}
	public void replaceOrder() {
		System.out.print("All order:");
		for(String a:listKFry)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Total KFry Orders: "+listKFry.size());
		listKFry.set(6,"honey");
		System.out.print("After update honey at position 6"+listKFry);
		//listKFry.add(15,"original");
	}
	
	public void sortAndPrintKFryList() {
		Collections.sort(listKFry);
		
	}

}
