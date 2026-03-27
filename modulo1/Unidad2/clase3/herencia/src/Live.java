public class Live extends Contenido implements Monetizable{

    public Live(String titulo) {
        super(titulo);
    }
    public Live(){}

    @Override
    public  void mostrar_anuncio(){
        System.out.println("Mostrando anuncio para ganar platica");
    }
    
}