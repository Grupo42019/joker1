import java.util.Scanner;

public class JOKER {
    public static void main(String[] args) throws InterruptedException {
    	
    	Scanner sc = new Scanner (System.in);

        // QUESTION'S RELATED VARIABLES
        String[] questions = Questions.questions.clone();
        String[][] allOptions = Questions.options.clone();
        int[] correctAnswers = Questions.correctAnswers.clone();

        // VARIABLES -----------------------//
        int[] moneyTree = {0, 200, 500, 1000, 3000, 10000, 50000};
        int moneyTreeIndex = 0;
        int jokers = 7;
        Scanner scanner = new Scanner(System.in);

        // GAME OPENING
        Utils.printGreeting("JOKER", "$", false);

        // GAME LOOP
        // For loop
            // Imprimir Status
            // Imprimir Quest�es

            // Definir array de booleans para indicar quais op��es de respostas ser�o apresentadas.
            // Definir vari�vel de controle do Do-While loop abaixo

            // Do-While loop
                // Imprimir Op��es de Respostas
                // Se o Concorrente escolher uma das op��es
                    // Atualizar a vari�vel de controle do Do-While loop para interromp�-lo
                    // Se a resposta do Concorrente estiver correta
                        // Atualizar os valores adequados
                        // Prover feedback ao Concorrente
                    // Se a resposta do Concorrente estiver errada
                        // Penalizar os valores adequados (dica: s�o dois valores; considerar um array � veja o m�todo `penalizePlayer()`)
                        // Prover feedback ao Concorrente
                // Sen�o Se o Concorrente escolher um Joker
                    // Se houver Joker dispon�vel
                        // Alterar o array de booleans que indica as op��es a serem apresentadas (omitir uma incorreta)
                        // Atualizar o n�mero de Jokers (aten��o para o valor n�o ser negativo)
                    // Sen�o
                        // Prover feedback ao Concorrente de que n�o h� Jokers
                // Sen�o
                    // Prover feedback de que o input n�o � v�lido.

        // Imprimir conclus�o do Jogo
    }
    
//M�TODOS
    
    static void printStatus(int round, int moneyEarned, int jokers) {
    	
    	// DIZER AO UTILIZADOR EM QUE RONDA EST�, QUANDO DINHEIRO TEM E/OU GANHOU E QUANTOS JOKERS TEM
    }

    static void printQuestion(int round, String question) {
    	// METER AS PERGUNTAS
    	
    	for(round=0; round<12; round++) {
    		System.out.println(question);}
    	
    }

    static void printOptions(String[] options, boolean[] includedOptions) {
    	// METER AS OP��ES E INDICAR QUAL A CERTA E QUAIS AS ERRADAS
    	
    
    }

    static int readAnswer(Scanner sc) {
    	// RECEBER A RESPOSTA DO UTILIZADOR
    	
    	System.out.println("Qual a resposta que gostaria de bloquear?");
    	char answer = sc.next().charAt(0);
    	
    	return answer;
    }

    static void printOutcomeMessage(boolean answerIsCorrect) {
    
    	System.out.println("A resposta correta �: ");
    	
    }

    static boolean[] applyJoker(boolean[] includedOptions, int correctAnswer) {
    	// DIZER AO UTILIZADOR SE A RESPOSTA EST� CERTA OU N�O
    	
    	if() {
    		System.out.println("A resposta est� correta!");
    	} else {
    		System.out.println("A resposta est� errada!");
    	}
    }
   
    static int safelyDecreaseJoker(int jokers) {
    	// O UTILIZADOR UTILIZOU UM JOKER
    	
    	System.out.println("O utilizador tem "+jokers+".");
    	return jokers;
    }

    static int[] penalizePlayer(int jokers, int moneyTreeIndex) {
    	// A RESPOSTA EST� ERRADO LOGO APLICAR AS CONSEQU�NCIAS
    	
    }

    static void printConclusion(int moneyEarned, int jokers) {
    	// SITUA��O CORRENTE: SE GANHOU DINHEIRO OU PERDEU, QUANTOS JOKERS TEM
    
    	System.out.println("Ganhou " +moneyEarned+ ("euros. Tem, neste momento, "+jokers+" jokers."));
    }
}
