import java.util.*;
import java.lang.*;
import java.util.regex.*;

class TransactionParty 
{
    String seller;
    String buyer;

    public TransactionParty(String seller, String buyer)
    {
      this.seller = seller;
      this.buyer = buyer;
    }
}

class Receipt
{
  TransactionParty transactionParty;
  String productsQR;

  public Receipt(TransactionParty transactionParty,String productsQR)
  {
    this.transactionParty = transactionParty;
    this.productsQR = productsQR;
  }
}

class GenerateReceipt
{
    public int verifyParty(Receipt r)
    {
      String regex = "[a-zA-Z]{1}[a-zA-Z\\'\\s-]+[a-zA-Z]{1}";
      boolean b1 = Pattern.matches(regex,r.transactionParty.buyer);
      boolean b2 = Pattern.matches(regex,r.transactionParty.seller);

      if(b1 && b2)
			  return 2;
		  else if((b1 || b2)==false)
		  	return 0;
		  else
		  	return 1;
    }

    public String calcGST(Receipt r)
    {
      StringTokenizer st1 = new StringTokenizer(r.productsQR,"@");
      int GST = 0,rate = 0,qty = 0;
      
      while(st1.hasMoreTokens())
      {
        String pair = st1.nextToken();
        StringTokenizer st2 = new StringTokenizer(pair,",");
        while(st2.hasMoreTokens())
        {
          rate = Integer.parseInt(st2.nextToken());
          qty = Integer.parseInt(st2.nextToken());
        }
        GST = GST + rate*qty;
      }
      GST = (int)(GST*0.12);
      return Integer.toString(GST);
    }
}
class Source
{
  public static void main(String[] args)
  {
    
  }
}