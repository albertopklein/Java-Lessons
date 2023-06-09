public class Gerenciador {
    private static Gerenciador gerenciador;

    private Gerenciador(){
        
    }
    public static Gerenciador getInstance(){
        if(gerenciador == null){
            gerenciador = new Gerenciador();

        }
        return gerenciador;
    }

    // adicionar
    //buscar
    //remover produtos
}

