public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Feijão", 8.40, 1);
        Item item2 = new Item("Café", 10, 2);
        Item item3 = new Item("Picanha", 100, 3);
        Item item4 = new Item("Cervejinha", 12, 4);

        Carrinho c = new Carrinho();

        c.adicionarItem(item3);
        c.adicionarItem(item4);
        c.removerItem(4);
        c.adicionarItem(item2);
        c.removerItem(2);
        c.removerItem(4);
        c.removerItem(3);

        c.calcular();

    }
}
