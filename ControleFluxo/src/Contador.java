import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
            System.out.println(contar(parametroUm, parametroDois));
            
		
		}catch (ArrayIndexOutOfBoundsException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
        
    }
    public static int contar(int ParametroUm, int ParametroDois) throws ArithmeticException {
        int x = ParametroUm;
            int res = 0, i = 0;
            res = ParametroDois - ParametroUm;
        
        if (ParametroUm > ParametroDois) {
            throw new ArithmeticException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        else {
            for (i = 2; i >= res; i++) {
                System.out.println("Imprimindo o " + i + "° Número: ");
                for (; x >= ParametroDois; x++) {
                    System.out.println(x);

                }

}}
        return x;
            }
    
}