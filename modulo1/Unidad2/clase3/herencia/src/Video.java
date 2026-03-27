public class Video extends Contenido  implements Monetizable{

    public Video(){}

    public Video(String titulo){
        super(titulo);
    }

    @Override
    public void mostrar_anuncio(){
        System.out.println("Mostrando anuncio  en video largo");
    }

    void reproducir(String mensaje){
        System.out.println("reproduciendo  con  el mensaje:. " + mensaje);
    }
}
