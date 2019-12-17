import java.util.Scanner;

public class JOKER {
    public static void main(String[] args) throws InterruptedException {
    	
    	Scanner sc = new Scanner (System.in);
>master
         String[] questions = {"On the famous show FRIENDS, there is a very iconic moment that raised many opinions about Ross' and Rachels' relationship.\n Were Rachel and Ross on a break?", 
                              "On the show HOW I MET YOUR MOTHER, in the episode: \"Monday Night Football\", the group of friends promised each other they would only see the Super Bowl game when they were all together.\n Who was the only person that didn't break the promise?",
                              "ON the show RICK AND MORTY there is a amusing episode: Pickle Rick.\n Why did Rick turn into a pickle?",
                              "In the movie LORD OF THE RINGS, there is only one person who is strong enough.\n Who is never tempted by the ring?",
                              "In the historic movie HARRY POTTER there is a character that everyone adores and has a targic ending, Dobby.\n What would give Dobby his freadom?",
                              "In STAR WARS there is a prominent doubt.\n Who killed Emperor?",
                              "THE GOOD PLACE is a shopw that premiered in 2016. Among many twists and truns many things seemed to be wrong.\n What was wrong with Jianyu, the Buddhist Monk?",
                              "The enigmatic PRISON BREAK made it to many peoples favourite show.\n What's the name of the caracther that lost his hand?",
                              "Many teens were hooked on the show GOSSIP GIRL, among other scenes, the love story between Chuck and Blair was very memorable.\n How did Blair win the prom?",
                              "The show BOJACK HORSEMEN, is an american adult animated comedy.\n What is Bojack's job?",
                              "STRANGER THINGS, is a show surrounded by science fiction and terror.\n How does Will's mother manage to comunicate with him?",
                              "The cientific show BIG BANG THEORY, made many families laugh since it's enjoyed by all ages.\n Why does the elevator not work?"};
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
    
 // FEITO                      
        static void printStatus(int round, int moneyEarned, int jokers) {
    	System.out.println("Your on round number "+round+", you have "+moneyEarned+" and "+jokers+" jokers.");
        }                       
 // FEITO       
        static int randomNumber(int min, int max) {
        int randomNumber = (int) (Math.random() * ((max - min) + 1)) + min;
        return randomNumber;   
        }
// FEITO
    static void printQuestion(int round, String [] question) {
        
    int randomQuestionNumber= randomNumber( 0, 11);
    System.out.println(question[randomQuestionNumber]);	
   }
// DÚVIDAS
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
