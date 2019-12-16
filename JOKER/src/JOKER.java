import java.util.Scanner;

public class JOKER {
    public static void main(String[] args) throws InterruptedException {
    	
    	Scanner sc = new Scanner (System.in);
>master
        
        String[][] allOptions = {
            {
                "Yes",
                "No",
                "They were never together",
                "Ross says they were"
             },
            {
                "Marshall & Lily",
                "Barney",
                "Ted",
                "Robin"
             },
            {
                "He wanted to challenge his abilities",
                "He didn't want to go to therapy with his family",
                "He really liked pickles",
                "He wanted to scare the cats"
             },
            {
                "Bilbo",
                "Boromir",
                "Galadriel",
                "Sam"
             },
            {            
                "Clothes",
                "A sock",
                "A magic spell",
                "Dobby ran away"
             },
            { 
                "Luke Skywalker",
                "Yoda",
                "Count Dooku",
                "Darth Vader"
             },
            {    
                "He was very shy",
                "He wasn't very smart",
                "In reality, he was a DJ from Jacksonville",
                "He killed someone"
             },
            {              
                "Michael",
                "T-bag",
                "Bellick",
                "Sucre"
             },
            {
                "Chuck voted for her 150 times",
                "She was really popular",
                "She threated her opponents",
                "She didn't actually win"
             },
            {
                "stripper",
                "actor",
                "hairdresser",
                "teacher"
             },
            { 
                "Mobile phone",
                "Facebook",
                "Christmas Lights",
                "Eleven"
              },
            { 
                "No one cares",
                "Penny pressed all the bottons and it broke",
                "Sheldon doesn't allow anyone in there because he doesn't think its safe",
                "Sheldon did a crazy experience"
            } 
            };
                    
        int[] correctAnswers ={3, 2, 1, 3, 0, 3, 2, 1, 0, 1, 2, 3};

         // QUESTION'S RELATED VARIABLES
        
        
        
        // VARIABLES -----------------------//
        int[] moneyTree = {0, 200, 500, 1000, 3000, 10000, 50000};
        int moneyTreeIndex = 0;
        int jokers = 7;
        Scanner scanner = new Scanner(System.in);

        // GAME OPENING
        Utils.printGreeting("JOKER", "$", false);

        // GAME LOOP
        for(round=0; round<12; round++){

        // For loop
            // Imprimir Status
            printStatus(round, 
            // Imprimir Questões
        printQuestions(round, questions);

            // Definir array de booleans para indicar quais opções de respostas serão apresentadas.
            // Definir variável de controle do Do-While loop abaixo

            // Do-While loop
                // Imprimir Opções de Respostas
                // Se o Concorrente escolher uma das opções
                    // Atualizar a variável de controle do Do-While loop para interrompê-lo
                    // Se a resposta do Concorrente estiver correta
                        // Atualizar os valores adequados
                        // Prover feedback ao Concorrente
                    // Se a resposta do Concorrente estiver errada
                        // Penalizar os valores adequados (dica: são dois valores; considerar um array – veja o método `penalizePlayer()`)
                        // Prover feedback ao Concorrente
                // Senão Se o Concorrente escolher um Joker
                    // Se houver Joker disponível
                        // Alterar o array de booleans que indica as opções a serem apresentadas (omitir uma incorreta)
                        // Atualizar o número de Jokers (atenção para o valor não ser negativo)
                    // Senão
                        // Prover feedback ao Concorrente de que não há Jokers
                // Senão
                    // Prover feedback de que o input não é válido.

        // Imprimir conclusão do Jogo
    }
    
//MÉTODOS
    
    static void printStatus(int round, int moneyEarned, int jokers) {
    	
    	// DIZER AO UTILIZADOR EM QUE RONDA ESTÁ, QUANDO DINHEIRO TEM E/OU GANHOU E QUANTOS JOKERS TEM
    }

    static void printQuestion(int round, String [] question) {
    	
    System.out.println(question[round]);
    	
   }

    static void printOptions(String[][] options, boolean[] includedOptions, int round) {
    	
        for (int i = 0; i < options.length; i++){
            
            System.out.println( options[round][i]);
            
          }   
    }

    static int readAnswer(Scanner sc) {
    	// RECEBER A RESPOSTA DO UTILIZADOR
    	
    	System.out.println("Qual a resposta que gostaria de bloquear?");
    	char answer = sc.next().charAt(0);
    	
    	return answer;
    }

    static void printOutcomeMessage(boolean answerIsCorrect) {
    
    	System.out.println("A resposta correta é: ");
    	
    }

    static boolean[] applyJoker(boolean[] includedOptions, int correctAnswer) {
    	// DIZER AO UTILIZADOR SE A RESPOSTA ESTÁ CERTA OU NÃO
    	
    	if() {
    		System.out.println("A resposta está correta!");
    	} else {
    		System.out.println("A resposta está errada!");
    	}
    }
   
    static int safelyDecreaseJoker(int jokers) {
    	// O UTILIZADOR UTILIZOU UM JOKER
    	
    	System.out.println("O utilizador tem "+jokers+".");
    	return jokers;
    }

    static int[] penalizePlayer(int jokers, int moneyTreeIndex) {
    	// A RESPOSTA ESTÁ ERRADO LOGO APLICAR AS CONSEQUÊNCIAS
    	
    }

    static void printConclusion(int moneyEarned, int jokers) {
    	// SITUAÇÃO CORRENTE: SE GANHOU DINHEIRO OU PERDEU, QUANTOS JOKERS TEM
    
    	System.out.println("Ganhou " +moneyEarned+ ("euros. Tem, neste momento, "+jokers+" jokers."));
    }
}
