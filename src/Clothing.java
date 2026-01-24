abstract class Clothing {

    String type;
    String color;
    int price;
    int condition;

    Clothing(int condition){
        this.condition = condition;

        System.out.printf("Condition: %d\n", condition);
    }

    abstract void mend();

    public String getType(){
        return type;
    }

    public String getColor(){
        return color;
    }

    public int getPrice(){
        return price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(int price){
        this.price = price;
    }


}
