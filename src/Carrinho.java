import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Item> itens;

    //INICIANDO COLEÇÃO NO CONSTRUTOR
    public Carrinho(){
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        itens.add(item);
        System.out.println(item.getNome() + " | " + item.getPreco() + " R$  Adicionado ao Carrinho");

    }

    //PERCORRENDO A LISTA DE ITENS PARA REMOVER
    public void removerItem(int cod){
        for (int i=0; i<itens.size(); i++){

            if (itens.get(i).getCod() == cod){

                System.out.println(itens.get(i).getNome() + " Foi Removido!");
                itens.remove(i);

            }

        }
    }

    public void calcular(){
        double valor = 0;
        for (int i=0; i<itens.size(); i++){

            valor += itens.get(i).getPreco();

        }
        System.out.println("Total: R$" +valor);
    }

}
