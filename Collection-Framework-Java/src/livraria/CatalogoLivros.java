package livraria;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros{
    private List<Livro> livrosList;
    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
          for(Livro L : livrosList){
            if(L.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(L);
            }
          }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
         for(Livro L : livrosList){
            if(L.getAnoPublicacao() >= anoInicial && L.getAnoPublicacao() <= anoFinal){
                livrosPorIntervaloAnos.add(L);
            }
         }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro LivroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro L : livrosList){
                if(L.getTitulo().equalsIgnoreCase(titulo)){
                    LivroPorTitulo = L;
                    break;
                }
            }
        }
        return LivroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2010);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2011);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2015);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2020);
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2020));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}