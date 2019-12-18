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
                              "In STAR WARS there is a prominent doubt.\n Who killed the Emperor?",
                              "THE GOOD PLACE is a shopw that premiered in 2016. Among many twists and turns, many things seemed to be wrong.\n What was wrong with Jianyu, the Buddhist Monk?",
                              "The enigmatic PRISON BREAK made it to many peoples favourite show.\n What's the name of the caracther that lost his hand?",
                              "Many teens were hooked on the show GOSSIP GIRL, among other scenes, the love story between Chuck and Blair was very memorable.\n How did Blair win the prom?",
                              "The show BOJACK HORSEMAN, is an american adult animated comedy.\n What is Bojack's job?",
                              "STRANGER THINGS, is a show surrounded by science fiction and terror.\n How does Will's mother manage to comunicate with him?",
                              "The cientific show BIG BANG THEORY, made many families laugh since it's enjoyed by all ages.\n Why does the elevator not work?"};
        String[][] allOptions = {
            {
                "A.Yes",
                "B.No",
                "C.They were never together",
                "D.Ross says they were"
             },
            {
                "A.Marshall & Lily",
                "B.Barney",
                "C.Ted",
                "D.Robin"
             },
            {
                "A.He wanted to challenge his abilities",
                "B.He didn't want to go to therapy with his family",
                "C.He really liked pickles",
                "D.He wanted to scare the cats"
             },
            {
                "A.Bilbo",
                "B.Boromir",
                "C.Galadriel",
                "D.Sam"
             },
            {            
                "A.Clothes",
                "B.A sock",
                "C.A magic spell",
                "D.Dobby ran away"
             },
            { 
                "A.Luke Skywalker",
                "B.Yoda",
                "C.Count Dooku",
                "D.Darth Vader"
             },
            {    
                "A.He was very shy",
                "B.He wasn't very smart",
                "C.In reality, he was a DJ from Jacksonville",
                "D.He killed someone"
             },
            {              
                "A.Michael",
                "B.T-bag",
                "C.Bellick",
                "D.Sucre"
             },
            {
                "A.Chuck voted for her 150 times",
                "B.She was really popular",
                "C.She threated her opponents",
                "D.She didn't actually win"
             },
            {
                "A.stripper",
                "B.actor",
                "C.hairdresser",
                "D.teacher"
             },
            { 
                "A.Mobile phone",
                "B.Facebook",
                "C.Christmas Lights",
                "D.Eleven"
              },
            { 
                "A.No one cares",
                "B.Penny pressed all the bottons and it broke",
                "C.Sheldon doesn't allow anyone in there because he doesn't think its safe",
                "D.Sheldon did a crazy experience"
            } 
            };
                    
        int[] correctAnswers ={3, 2, 1, 3, 0, 3, 2, 1, 0, 1, 2, 3};
	    
	boolean [][] rigth = new boolean [12][4];
	    
	booleanAnswers(boolean [][] rigth, int [] correctAnswers);

         // QUESTION'S RELATED VARIABLES
        
        
        
        // VARIABLES -----------------------//
        int[] moneyTree = {0, 200, 500, 1000, 3000, 10000, 50000};  //Dúvida: é preciso fazer método para money tree? como se põe imagens e fonts? como se faz timer?
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
	int questionNumber = randomNumber(0,11);
               
            printQuestions(questions, questionNumber);

            // Definir array de booleans para indicar quais opções de respostas serão apresentadas.
            // Definir variável de controle do Do-While loop abaixo
			
            int questionOptions= printOptions( allOptions, boolean, questionNumber);    
            char answer= readAnswer(sc);
            // Do-While loop, Imprimir Opções de Respostas
                  
            int answer = printAnswer(sc);
                   if( answer ==);
                    // Se a resposta do Concorrente estiver correta
                        // Atualizar os valores adequados
                        
                        moneyTreeIndex++;
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
    
 // game status -FEITO                      
        static void printStatus(int round, int moneyEarned, int jokers) {
    	System.out.println("Your on round number "+round+", you have "+moneyEarned+" and "+jokers+" jokers.");
        } 
			
  // boolean correct answers -FEITO  
        static void booleanAnswers(boolean [][] a, int [] b)  {
               for (int i = 0; i < 12; i++) {
			int c = b[i];
			a [i][c] = true;
         }                 
        }            
                        
 // Escolha random da pergunta -FEITO                              
        static int randomNumber(int min, int max) {
        int randomNumber = (int) (Math.random() * ((max - min) + 1)) + min;
        return randomNumber;   
        }

 // Imprimir a pergunta random -FEITO		
    static void printQuestion(String [] question, int randomNumber) {
    System.out.println(question[randomNumber]);	
   }
			
//Imprimir as opções- DÚVIDAS: no included options não percebemos que boolean é não precisa de ser matriz, basta escolher a posiçao da matriz que vai retornar as respostas
    static void printOptions(String[][] allOptions, int randomNumber) {
    	
 	System.out.println( "The options are: ");
        for (int i = 0; i < allOptions[0].length; i++){
	 System.out.println( allOptions[randomNumber][i]);
          }   
    }
			
// RECEBER A RESPOSTA DO UTILIZADOR - FEITO
    static char readAnswer(Scanner sc) {
        char answer;
    	do{
            System.ou.println("What is your final answer?"); 
            answer = (sc.next().charAt(0)).toUpperCase();
        } while(answer != 'A' || answer != 'B' || answer != 'C' || answer != 'D' ||answer != 'J');
    	
    	return answer;
    }

			
//Verificação da resposta do utilizador -VERIFICAR linha 217			
    static char printOutcomeMessage(boolean [][] booleanAnswers, String [][]  questionOptions, int randomQuestionNumber) {
    
    	System.out.println("The correct answer is: "); // podemos fazer no main, era mais facil
	    
	    for (int i = 0; i < 4; i ++) {
		    if ( booleanAnswers[randomQuestionNumber][i] == true){
			   char correctAnswer= questionOptions[randomQuestionNumber][i];
			  
	}		    
    }
	   if(answer==correctAnswer) {
    		System.out.println("The answer is correct!"); 
		   
		   
       	} else {
    		System.out.println("The answer is wrong!");
		   
    	} 
	    return correctAnswer;
    }
			

//Utilizador pede um joker, o que acontece -FEITO
    static boolean[] applyJoker(Scanner sc, int [] correctAnswer, int randomNumber, boolean [][] allOptions, int jokers) {
	    
    	int sai;
	   
	    do {
		    sai = (int) (Math.random() * ((3 + 1));
		    
	}    while (sai == correctAnswers(randomNumber);
		    
		    System.out.println("One of the incorect answers is:"  + allOptions [randomNumber][sai]);
		    System.out.println("Taking that into account, whats your final decision?");
		readAnswer(sc)	;
				       
		int jokersAvailable= safelyDecreaseJoker(jokers);
				       
				       
    }
   // O UTILIZADOR UTILIZOU UM JOKER -DUVIDAS: só se põe quando ele pede ou quando ele erra tmb?
    static int safelyDecreaseJoker(int jokers) {    
	 jokers--;
	    
    	System.out.println("The user has "+jokers+" jokers.");
    	return jokers;
    }

// A RESPOSTA ESTÁ ERRADO LOGO APLICAR AS CONSEQUÊNCIAS -FEITO		    
    static int[] penalizePlayer(int jokers, int moneyTreeIndex) {
    	
	 if (answer!= correctAnswer && joker>=3) {
		jokers= jokers-3;
		 
	 }else if (answer!= correctAnswer && jokers=2) {
		jokers=jokers-2;
		 moneyTreeIndex--;
		 
	 }else if (answer!= correctAnswer && jokers=1) {
		 jokers=jokers-1;
		 moneyTreeIndex= moneyTreeIndex-2;
		 
	 }else if (answer!= correctAnswer && jokers=0) {
		  moneyTreeIndex= moneyTreeIndex-3;
    }

// SITUAÇÃO CORRENTE: SE GANHOU DINHEIRO OU PERDEU, QUANTOS JOKERS TEM -fAZER (podemos fazer uma matriz)
    static void printConclusion(int moneyEarned, int jokers) {
    	System.out.println("You won " +moneyEarned+ ("euros. At the moment you have " + jokers + " jokers."));
    }
}
