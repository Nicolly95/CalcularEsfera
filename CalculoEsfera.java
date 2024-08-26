import java.util.Scanner;

public class CalculoEsfera {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); //Invoca a classe Scanner e a instancia com o nome "s" para dentro do método main, 
                                            // armazena a entrada do usuário com o método .in e armazena em "s".

        System.out.println("Digite o valor do raio: ");     

        double raio = s.nextDouble();       //Método que recupera o valor da entrada do usuário armazenada no Scanner "s"
                                            // e armazena na variável "raio", para podermos usá-la nos calculos a baixo.


        //Calculo de Diâmetro: 2.r
        //double raio = 0;
        double diametro = (2 * raio);
        System.out.println("Diâmetro: " + diametro);

        //Calculo de Circunferência: 2.PI.r
        double pi = Math.PI;                    //Busca na classe Math o valor de PI e armazena na variável pi para usá-la
        double circunferencia = (2 * pi * raio);
        System.out.println("Circunferẽncia: " + circunferencia);

        //Calculo da Área: PI.r²
        double area = (pi * (raio * raio));
        System.out.println("Área: " + area);
    }

}
