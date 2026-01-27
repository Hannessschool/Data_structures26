/*public class Bike extends Vehicle implements Shoppable{

    bikeshop.getBike(0).addSpec("suspension", "hardtail");
    public Bike(String name, double price){
        super(name, "pedaled");
        setPrice(price);
    }

    public void addSpec (String key, String value){
        specs.put(key, value);
    }

    public String getSpecsString(){
String ret;
for (String key: specs.keySet()){
ret += String.format("%s: %s," +
key,
specs.get(key));
}
}

@Override
public String soundWarning(){
return "pling-pling";
}

@Override
public double getStock(){
return 0;
}

//}*/
