package creationalPrototype;

public class Shoe implements Cloneable{
    private String brand;
    private String model;
    private String sole;

    public Shoe(String brand, String model, String sole){
        this.brand = brand;
        this.model = model;
        this.sole = sole;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public String getSole(){
        return sole;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setSole(String sole){
        this.sole = sole;
    }

    @Override
    public Shoe clone(){
        try{
            return (Shoe) super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    public void displayInfo(){
        System.out.println("Shoe brand: " + brand + ", model: " + model + ", sole: " + sole);
    }
}
