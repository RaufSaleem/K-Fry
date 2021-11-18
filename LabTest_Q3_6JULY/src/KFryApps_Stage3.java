import java.util.Scanner;
import java.util.*;
public class KFryApps_Stage3 {

	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in); 

		String newKFryOrder;
		int testcase;
		KFry order = null;
       
		testcase = in.nextInt(); //cases

		for(int i=0; i< testcase; i++) {
			order= new KFry();
			newKFryOrder = in.next();  
			
			while(!newKFryOrder.equals("closed")) {
				order.addOrder(newKFryOrder);
				
				newKFryOrder = in.next();
				order.KFryList(newKFryOrder);
			}	

			order.calculateAndPrintAllOrders();
			order.last6Order();
			order.setSale();
			
			order.replaceOrder();
			order.sortAndPrintKFryList();
			System.out.println();
		}

	}
}