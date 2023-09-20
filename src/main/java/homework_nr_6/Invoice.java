package homework_nr_6;

public class Invoice {
    String deviceModel;
    String deviceDescription;
    int quantity;
    double price;

    public Invoice(String deviceModel, String deviceDescription, int quantity, double price) {
        this.deviceModel = deviceModel;
        this.deviceDescription = deviceDescription;
        //this.quantity = quantity;
        //this.price = price;
        // check value for quantity
        if (quantity < 0){
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
        // check value for price
        if (price < 0){
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        // check value
        if (quantity < 0){
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // check value for price
        if (price < 0){
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public double getAmount(){
        return quantity * price;
    }
}
