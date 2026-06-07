import java.util.*;
public class pharmacyStock {
	public static void main(String[] args) {
		Inventory inv=new Inventory();
		Scanner sc=new Scanner(System.in);
		System.out.println("==== Welcome to Pharmacy Stock Management System ====");
		int choice;
		do {
			System.out.println("1.Add Medicine");
			System.out.println("2.Update Stock");
			System.out.println("3.Medicine List");
			System.out.println("4.Delete Medicine");
			System.out.println("5.Search Medicine");
			System.out.println("0.Exit");
			System.out.print("Enter Your Choice: ");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					System.out.print("Enter Medicine ID: ");
					int id=sc.nextInt();
					System.out.print("Enter Medicine Name: ");
					String name=sc.next();
					System.out.print("Enter Quantity Of The Medicine: ");
					int qty=sc.nextInt();
					System.out.print("Enter Price: ");
					double price=sc.nextDouble();
					System.out.print("Enter Expiry:");
					String exp=sc.next();
					inv.addMedicine(new Medicine(id,name,qty,price,exp));
					break;
				case 2:
					System.out.println("Enter ID to Update: ");
					int uid=sc.nextInt();
					System.out.println("Enter New Quantity: ");
					int newqty=sc.nextInt();
					inv.updateStock(uid,newqty);
					break;
				case 3:
					inv.showAll();
					break;
				case 4:
				    System.out.print("Enter Medicine ID to Delete: ");
				    int delid = sc.nextInt();
				    inv.deleteMedicine(delid);
				    break;
				case 5:
				    System.out.print("Enter Medicine ID: ");
				    int sid = sc.nextInt();
				    inv.searchMedicine(sid);
				    break;
				    
				case 0:
					System.out.println("Good Bye!");
					break;
				default:
					System.out.println("Enter Valid Option");
					break;
			}
		}while(choice!=0);
		
	}
}
