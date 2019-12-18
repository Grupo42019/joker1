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
	
    // QUESTION'S RELATED VARIABLES  
	    //Options
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
	    
	// Definir array de booleans para indicar quais opções de respostas serão apresentadas.    
	boolean [][] rigth = new boolean [12][4];
	    
	booleanAnswers(boolean [][] rigth, int [] correctAnswers);
	   
        // Variables -----------------------//
        int[] moneyTree = {0, 200, 500, 1000, 3000, 10000, 50000};  
        int moneyTreeIndex = 0;
	int moneyEarned = money(moneyTreeIndex, moneyTree);
        int jokers = 7;
        Scanner scanner = new Scanner(System.in);
        
        

        // GAME OPENING
        Utils.printGreeting("JOKER", "$", false);

        // WELCOME SPEECH
	System.out.println("Welcome to JOKER!/n
			   You have the chance to win 50.000€.
			   /nYou begin with 7 Jokers, they are used to eliminate an options and you simply have to insert \"J\".
			   /nA wrong answer you go down levels. A right answer you go up a level.
			   /nTo win 50k you must stay in the last level./nLet's play!
			   /n!SPOILER ALERT! :P");		   
	System.out.println("What is your name?");
	string name= sc.nextLine();
	    
	// GAME LOOP   
        for(round=0; round<12; round++){
		
        // Imprimir Status
        printStatus(round, moneyEarned, jokers);
        // Imprimir Questões
	int randomQuestion = randomNumber(0,11);
        printQuestions(questions, randomQuestion);
	//Imprimir Opções de Respostas, tendo em conta as condições
        printOptions( allOptions, questionNumber);  
	//Ler resposta	
        char answer= readAnswer(sc);
	//Se a resposta FOR A, B, C, D
        if( answer == 'A' ||answer == 'B' ||answer == 'C' ||answer == 'D' ||){
	//Verificar Resposta	
	char correctAnswer= checkAnswers (booleanAnswers,allOptions, randomQuestion);	
        printOutcomeMessage(jokers, answer, correctAnswer, moneyTreeIndex);
	//Se a resposta FOR J	
	}else if(answer == 'J'){	
        applyJoker(correctAnswer, randomQuestion, allOptions, jokers);
	safelyDecreaseJoker(joker);
	//Ler resposta	após uso de joker
	char answer= readAnswer(sc);
	//Verificar Resposta	
	char correctAnswer= checkAnswers (booleanAnswers,allOptions, randomQuestion);	
        printOutcomeMessage(jokers, answer, correctAnswer, moneyTreeIndex);	
    }
       // Imprimir conclusão do Jogo
	printConclusion(moneyEarned, Jokers);	
}
			
 //Dúvida:como se põe imagens e fonts? swing   
			
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
			
//Imprimir as opções-FEITO
    static void printOptions(String[][] allOptions, int randomNumber) {
    	
 	System.out.println( "The options are: ");
        for (int i = 0; i < allOptions[0].length; i++){
	 System.out.println( allOptions[randomNumber][i]);
          }   
    }
			
// RECEBER A RESPOSTA DO UTILIZADOR- FEITO
    static char readAnswer(Scanner sc) {
        char answer;
    	do{
            System.out.println("What is your final answer?"); 
            answer= Character.toUpperCase(sc.next().charAt(0));
            System.out.println(answer);
            
        } while(answer != 'A' && answer != 'B' &&  answer != 'C' &&  answer != 'D' &&  answer != 'J');
    	
    	return answer;
    }
			
//Identificar resposta correta -FEITO
static char checkAnswer(boolean [][] booleanAnswers, String [][]  allOptions, int randomNumber ) {
    
    	System.out.println("The correct answer is: "); 
	    for (int i = 0; i < 4; i ++) {
		    if ( booleanAnswers[randomNumber][i] == true){
			   char correctAnswer= (allOptions[randomNumber][i]).charAt(0);
	}	
		    return correctAnswer;
    }
			
//Verificar se a opção escolhida pelo utilizador é a certa -PODE ESTAR MAL		
    static void printOutcomeMessage (int joker, char answer, char correctAnswer, int moneyTreeIndex ) {
	   if(answer==correctAnswer) {
    		System.out.println("The answer is correct!"); 
		   moneyTreeIndex++;
		   
       	} else {
    		System.out.println("The answer is wrong!");
		   int penalize= penalizePlayer(jokers, moneyTreeIndex)
    	} 
	    
    }
			
//O que acontece quando utilizador pede joker -FEITO
    static void applyJoker( int [] correctAnswer, int randomNumber, boolean [][] allOptions, int jokers) {
	    int sai;
	    do {
	     sai = (int) (Math.random() * ((3 + 1));
		    
	    }while (sai == correctAnswers(randomNumber);
		    System.out.println("One of the incorect answers is:"  + allOptions [randomNumber][sai] +/n +"Taking that into account...");		    	       
    }
		    
		    
// O utilizador quer um Joker -FEITO
    static int safelyDecreaseJoker(int jokers) {    
	
	if(joker>0){    
	jokers--;
		
	}else{	
	System.out.println("This feature is no longer available.");
	}
	    
    	return jokers;
    }

// A RESPOSTA ESTÁ ERRADO LOGO APLICAR AS CONSEQUÊNCIAS -FEITO		    
    static int penalizePlayer(int jokers, int moneyTreeIndex) {
    
	if(jokers>=3){    
	    jokers= jokers-3;
	}   
	  switch (jokers) {  
	    case 2: //( jokers=2);
		jokers=jokers-2;
		 moneyTreeIndex--;
	         break;
	    	 
	    case 1: //( jokers=1);
		 jokers=jokers-1;
		 moneyTreeIndex= moneyTreeIndex-2;
	         break;
		 
	    case 0: //(jokers=0) ;
		  moneyTreeIndex= moneyTreeIndex-3;
	          break;
	}
	    return jokers, moneyTreeIndex;
    }
//money tree -FEITO
static int money(int moneyTreeIndex, int [] moneyTree)	
	int moneyEarned= moneyTree[moneyTreeIndex];	
		    
		    if (moneyTreeIndex<=0 ) {
			    moneyEarned=0;
	           }  else if (moneyTreeIndex>6 ) {
			    moneyEarned=50000; 
		   }
		    return moneyEarned;		    
 }
	    
// SITUAÇÃO final: quanto DINHEIRO -FEITO
    static void printConclusion(int moneyEarned, int jokers) {
    	System.out.println("You won " +moneyEarned+ "euros.);
    }
}
