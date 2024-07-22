package carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Itens> itensList;
    public CarrinhoDeCompras(List<Itens> itensList){
        this.itensList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade) {
        itensList.add(new Itens(nome, preco, quantidade));
    }
    public void removerItem(String nome){
      List<Itens> itensParaRemover = new ArrayList<>();
      for (Itens I : itensList){
        if(I.getNome().equalsIgnoreCase(nome)){
            itensParaRemover.add(I);
        }
      }
      itensParaRemover.removeAll(itensParaRemover);
    
    }
    public double calcularValorTotal(){
        return itensList.size();
    }
    public void exibirItens(){
        System.out.println(itensList);
    }
    public static void main(String[] args) {
        CarrinhoDeCompras itensList = new CarrinhoDeCompras(null);
        System.out.println("total da lista " + itensList.calcularValorTotal());
        itensList.adicionarItem("objt1 ", 12.00, 1 );
        System.out.println("total da lista " + itensList.calcularValorTotal());
        itensList.exibirItens();
    }
}
