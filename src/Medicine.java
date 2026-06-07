
public class Medicine {
     private int id;
     public String name;
     private int qty;
     private double price;
     private String exp;
     public Medicine(int id,String name,int qty,double price,String exp) {
    	 this.id=id;
    	 this.name=name;
    	 this.qty=qty;
    	 this.price=price;
    	 this.exp=exp;
     }
     public int getId() {return id;}
     public String getName() {return name;}
     public int  getQty() {return qty;}
     public double getPrice() {return price;}
     public String getExpiry() {return exp;}
     public void setQuantity(int qty) {this.qty=qty;}
     @Override
     public String toString() {
    	return "Medicine[ID = "+id+", Name = "+name+", Qty = "+qty+", Price = "+price+", Expiry = "+exp+"]";
     }
}
