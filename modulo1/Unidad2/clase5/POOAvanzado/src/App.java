public class App {
    public static void main(String[] args) throws Exception {
        int[] nuumeros = {12,32,43,2,12,5,876,45,32,1,34,65,88};
        
        int result = sumar(nuumeros);
        System.out.println(result);
    }

    public static int sumar (int[] sumandos){
        int resultado = 0;
        for (int i = 0; i < sumandos.length; i++) {
            resultado += sumandos[i];
        }
        return resultado;
    } 

    public static void ejemploArraysObjetos(){
        Dog[] dogs = new Dog[5];

        dogs[0] = new Dog("Tara");
        dogs[1] = new Dog("Samara" , "bulldog", (byte) 9);
        dogs[2] = new Dog();

        System.out.println(dogs[2]);

        dogs[1].setEdad((byte) 7);

        System.out.println(dogs[1]);
    }
}
