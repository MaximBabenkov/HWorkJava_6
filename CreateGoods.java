public class CreateGoods {

  private static CreateGoods instance;

  public static CreateGoods getInstance() {
  if (instance == null)
  instance = new CreateGoods();
  instance.init();
  return instance;
  }


  Goods temp;

  private void init() {  
    temp = new Goods();
    temp.name = CONST.EMPTY;
    temp.price = CONST.NIL_VAL;
    temp.count = CONST.NIL_VALUE;
    temp.description = CONST.EMPTY;
  } 
  
  public CreateGoods setName(String name) {
    temp.name = name;
    return this;
  }

  public CreateGoods setPrice(Double price) {
    temp.price = price;
    return this;
  }

  public CreateGoods setCount(int count) {
    temp.count = count;
    return this;
  }

  public CreateGoods setDescription(String description) {
    temp.description = description;
    return this;
  }


  public Goods Create() {
    return temp;
  }
}
