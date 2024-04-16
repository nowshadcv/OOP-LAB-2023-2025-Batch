package customerorder;
import java.util.*;

interface BillCalc{
	double calculate(int quantity,double unitPrice);
}

class Product{
	int productId;
	String name;
	int quantity;
	double unitPrice;
	
	public Product(int productId,String name,int quantity,double unitPrice) {
		this.productId=productId;
		this.name=name;
		this.quantity=quantity;
        this.unitPrice=unitPrice;
    	}

        public double getTotal(BillCalc calculator){
            return calculator.calculate(quantity,unitPrice);
        }
}

class Bill{
    private List<Product> products;
    private int orderNo;
    private String date;

    public Bill(int orderNo,String date){
        this.orderNo=orderNo;
        this.date=date;
        this.products=new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void generateBill(){
        System.out.println("Order No.: "+ orderNo);
        System.out.println("Date:"+ date);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("productId\tName\t\tQuantity\tUnit Price\tTotal");
        System.out.println("------------------------------------------------------------------------------------------");
        double netAmount=0;
        for (Product product : products){
            double total=product.getTotal((quantity,unitPrice)->quantity*unitPrice);
            netAmount+=total;
            System.out.printf("%d\t\t%s\t\t%d\t\t%.2f\t\t%.2f\n",product.productId,product.name,product.quantity,product.unitPrice,total);
        }

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Net.Amount:" + netAmount);
    }
}
public class Customerorder{
	public static void main (String args[]) {
		Bill bill = new Bill(1234,"2024-04-16");
		Product product1= new Product(101,"A",2,25);
		Product product2= new Product(102,"B",2,100);
		
		bill.addProduct(product1);
		bill.addProduct(product2);
		bill.generateBill();
	}
}
