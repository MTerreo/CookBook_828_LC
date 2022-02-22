package terreo.mauricio;

import terreo.mauricio.controller.Catalogo;
import terreo.mauricio.domain.Receita;
import terreo.mauricio.enums.Categoria;
import terreo.mauricio.view.CatalogoView;

public class CookBook {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        catalogo.add(new Receita("Cookies da Lara 1", Categoria.DOCE));
        catalogo.add(new Receita("Cookies da Lara 2", Categoria.DOCE));
        catalogo.add(new Receita("Cookies da Lara 3", Categoria.DOCE));
        catalogo.add(new Receita("Cookies da Lara 4", Categoria.DOCE));
        CatalogoView catalogoView = new CatalogoView(catalogo);
        catalogoView.view();
    }
}
