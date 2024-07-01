package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    //Construtores
    public Product() {

    }
    //Estudo sobre sobrecarga 3 atributos
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //Sobrecarga 2 atributos
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    //Logica de calculo preço x quantidade
    public double totalValueInStock() {
        return price * quantity;
    }
    // Logica de adição de produto
    public void addProduct(int quantity){
        this.quantity += quantity;
    }
    //Logica de remoção de produto
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $"
                + String.format("%.2f",price)+ ", "
                + quantity+" units, Total: $"
                + String.format("%.2f",totalValueInStock());
    }

}