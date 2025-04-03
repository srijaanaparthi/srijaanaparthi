
class Order{
    int OrderID;
    String CustomerName;
    int deliveryDate;
    Order(int OrderID,String CustomerName,int deliveryDate)
    {
        this.OrderID=OrderID;
        this.CustomerName=CustomerName;
        this.deliveryDate=deliveryDate;
    }
}
public class ECommerce{
    public static void sortorder(Order[] orders){
      for(int i=0;i<orders.length-1;i++)
     {
        for(int j=0;j<orders.length-1-i;j++)
        {
            if(orders[j].deliveryDate<orders[j+1].deliveryDate)
            {
                int temp=orders[j].deliveryDate;
                orders[j].deliveryDate=orders[j+1].deliveryDate;
                orders[j+1].deliveryDate=temp;
            }
            
        }
    }
    System.out.println("orders sorted:");
    for(int i=0;i<orders.length;i++)
    {
        System.out.print(orders[i].OrderID+" ");
        System.out.print(orders[i].CustomerName+" ");
        System.out.println(orders[i].deliveryDate+" ");
    }
    }
        public static void main(String []args)
        {
            Order[]orders={
                new Order(101,"alice", 5),
                new Order(203, "bob", 2),
                new Order(312, "cahrlie", 4),
                new Order(410, "david", 1)
            };
        System.out.println("sorted orders:");
        sortorder(orders);
    }
}

    

