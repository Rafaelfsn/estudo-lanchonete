public class Item {
    private int cod;
    private String nome;
    private double preco;

    public Item(String nome, double preco, int cod){
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreço(double preco) {
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void apresentar(){
        System.out.println("Cód Item: "+cod+" Nome do item: " + nome + " Preço: R$" + preco);
    }

}
