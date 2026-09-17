void main()
{
  double purchasePrice = 30.45;
  final double SALES_TAX_RATE = 0.05;
  double salesTax = 0;
  double total = 0;

  salesTax = purchasePrice * SALES_TAX_RATE;
  total = salesTax + purchasePrice;
  IO.println("The sales tax on " + purchasePrice + " will be " + salesTax);
  IO.println("Your total cost is " + total);
}
