import java.util.Scanner;

public class JOKER {
    public static void main(String[] args) throws InterruptedException {
    	
    	Scanner sc = new Scanner (System.in);

        // QUESTION'S RELATED VARIABLES
        String[] questions = {"On the famous show Friends, there is a very iconic moment that raises many opinions. Were Rachel and Ross on a break?", 
                              "In the \"Monday Night Football\", the group of friends promised each other they would only see the Super Bowl game when they were all together."+ \t + "Who was the only person that didn't break the promise?",
                              "Why did Rick turn into a pickle?",
                              "Who is never tempted by the ring?",
                              "What would give Dobby his freadom?",
                              "Who killed Emperor?",
                              "What was wrong with Jianyu, the Buddhist Monk?",
                              "What's the name of the caracther that lost his hand?",
                              "How did Blair win the prom?",
                              "What is Bojack's job?",
                              "How does Will's mother manage to comunicate with him?",
                              "Why does the elevator not work?"};
        
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
            // Imprimir Questões

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

    static void printQuestion(int round, String question) {
    	// METER AS PERGUNTAS
    	
    	for(round=0; round<12; round++) {
    		System.out.println(question);}
    	
    }

    static void printOptions(String[] options, boolean[] includedOptions) {
    	// METER AS OPÇÕES E INDICAR QUAL A CERTA E QUAIS AS ERRADAS
    	
    
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
