public class Widget extends Product{
    private String productionDate;
    public Widget(String id, String pd, double price){
        super(id + pd, price);
        productionDate = pd;
    }
    }