package orientacaoObjeto.entities;

public class produto {
    public String name = "Arroz tio joão";
    public double price = 29.90;
    public int quantity = 100;


    public double TotalValueInStock() {
        return this.quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public void ExibeItem() {
        System.out.println("Produto em estoque: " + name + " " + price + " " + quantity);
    }
}
