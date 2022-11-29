public class Goods {

  String name;
  Double price;
  int count;
  String description;
    

  public void print() {
    System.out.println(
        String.format(
            "| name %s | price %.2f | count %d | description %s |",
            name,
            price,
            count,
            description));    
  }
}
