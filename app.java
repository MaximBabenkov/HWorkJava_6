public class app {
  public static void main(String[] args) {

    Goods g1 = CreateGoods
    .getInstance()
    .Create();

    g1.print();

    Goods g2 = CreateGoods
    .getInstance()
    .setName("pencil")
    .setPrice(2.50)
    .setCount(100)
    .setDescription("red")  
    .Create();

    g2.print();

    Goods g3 = CreateGoods
    .getInstance()
    .setName("highlighter")    
    .setPrice(3.20)
    .Create();
     
     g3.print();
  }
}
