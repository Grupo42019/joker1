import java.util.Scanner;

public class FINAL {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String[] questions = {
				"On the famous show FRIENDS, there is a very iconic moment that raised many opinions about Ross' and Rachels' relationship.\n Were Rachel and Ross on a break?", 
                "On the show HOW I MET YOUR MOTHER, in the episode: \"Monday Night Football\", the group of friends promised each other they would only see the Super Bowl game when they were all together.\n Who was the only person that didn't break the promise?",
                "ON the show RICK AND MORTY there is a amusing episode: Pickle Rick.\n Why did Rick turn into a pickle?",
                "In the movie LORD OF THE RINGS, there is only one person who is strong enough.\n Who is never tempted by the ring?",
                "In the historic movie HARRY POTTER there is a character that everyone adores and has a tragic ending, Dobby.\n What would give Dobby his freadom?",
                "In STAR WARS there is a prominent doubt.\n Who killed the Emperor?",
                "THE GOOD PLACE is a shopw that premiered in 2016. Among many twists and turns, many things seemed to be wrong.\n What was wrong with Jianyu, the Buddhist Monk?",
                "The enigmatic PRISON BREAK made it to many peoples favourite show.\n What's the name of the caracther that lost his hand?",
                "Many teens were hooked on the show GOSSIP GIRL, among other scenes, the love story between Chuck and Blair was very memorable.\n How did Blair win the prom?",
                "The show BOJACK HORSEMAN, is an american adult animated comedy.\n What is Bojack's job?",
                "STRANGER THINGS, is a show surrounded by science fiction and terror.\n How does Will's mother manage to comunicate with him?",
                "The cientific show BIG BANG THEORY, made many families laugh since it's enjoyed by all ages.\n Why does the elevator not work?"
                };//questions

		// QUESTION'S RELATED VARIABLES  
		//Options
		String[][] allOptions = {
			{
			  "A: Yes",
			  "B: No",
			  "C: They were never together",
			  "D: Ross says they were"
			},
			{
			  "A: Marshall & Lily",
			  "B: Barney",
			  "C: Ted",
			  "D: Robin"
			},
			{
			  "A: He wanted to challenge his abilities",
			  "B: He didn't want to go to therapy with his family",
			  "C: He really liked pickles",
			  "D: He wanted to scare the cats"
			},
			{
			  "A: Bilbo",
			  "B: Boromir",
			  "C: Galadriel",
			  "D: Sam"
			},
			{            
			  "A: Clothes",
			  "B: A sock",
			  "C: A magic spell",
			  "D: Dobby ran away"
			},
			{ 
			  "A: Luke Skywalker",
			  "B: Yoda",
			  "C: Count Dooku",
			  "D: Darth Vader"
			},
			{    
			  "A: He was very shy",
			  "B: He wasn't very smart",
			  "C: In reality, he was a DJ from Jacksonville",
			  "D: He killed someone"
			},
			{              
			  "A: Michael",
			  "B: T-bag",
			  "C: Bellick",
			  "D: Sucre"
			},
			{
			  "A: Chuck voted for her 150 times",
			  "B: She was really popular",
			  "C: She threated her opponents",
			  "D: She didn't actually win"
			},
			{
			  "A: stripper",
			  "B: actor",
			  "C: hairdresser",
			  "D: teacher"
			},
			{ 
			  "A: Mobile phone",
			  "B: Facebook",
			  "C: Christmas Lights",
			  "D: Eleven"
			},
			{ 
			  "A: No one cares",
			  "B: Penny pressed all the bottons and it broke",
			  "C: Sheldon doesn't allow anyone in there because he doesn't think its safe",
			  "D: Sheldon did a crazy experience"
			} 
		}; //allOptions
		      
		int[] correctAnswers = {3, 2, 1, 3, 0, 3, 2, 1, 0, 1, 2, 3};
		
		// Definir array de booleans para indicar quais opções de respostas serão apresentadas.    
		boolean [][] rigth = new boolean [12][4];
		
		booleanAnswers(rigth, correctAnswers);
		
		// Variables -----------------------//
		int[] moneyTree = {0, 200, 500, 1000, 3000, 10000, 50000};  
		int moneyTreeIndex = 0;
		int moneyEarned = 0;
		int jokers = 7;
		
		Scanner scanner = new Scanner(System.in);
		
		// GAME OPENING
		//Utils.printGreeting("JOKER", "$", false);
		
		// WELCOME SPEECH
		System.out.println("\nWelcome to JOKER! \n\nYou have the chance to win 50.000€.\nYou begin with 7 Jokers, they are used to eliminate an options and you simply have to insert \"J\".\nA wrong answer you go down levels. A right answer you go up a level.\nTo win 50k you must stay in the last level.\nLet's play\n!SPOILER ALERT! :P\n");		   
		System.out.println("What is your name?\n");
		String name = sc.nextLine();
		System.out.println("\nWelcome "+ name + " ! Let's Start");
		
		//GAME LOOP   
		for(int round=0; round<12; round++){
		
			//Imprimir Status
			printStatus(round, moneyEarned, jokers);
			
			printQuestion(questions, round);
			
			//Imprimir Opções de Respostas, tendo em conta as condições
			printOptions(allOptions, round);  
			//Ler resposta	
			char answer = readAnswer(sc);
			//Se a resposta FOR A, B, C, D
			char correctAnswer;
			boolean endRound = false;
			int excluded = 4;
			
			do {
				if( answer == 'A' ||answer == 'B' ||answer == 'C' ||answer == 'D'){
					//Verificar Resposta	
					correctAnswer = checkAnswer (rigth ,allOptions, round);	
					moneyTreeIndex = printOutcomeMessage(jokers, answer, correctAnswer, moneyTreeIndex);
					endRound = true;
				}
				else if(answer == 'J'){ //Se a resposta FOR Joker
					excluded = applyJoker(correctAnswers, round, allOptions, jokers);
					jokers = safelyDecreaseJoker(jokers);
					printOptionsJoker(allOptions, round, excluded);
					//Ler resposta	após uso de joker
					answer = readAnswer(sc);
				}
			} while ( !endRound);
			moneyEarned = money(moneyTreeIndex, moneyTree);

		} // END for
		//Imprimir conclusão do Jogo
		printConclusion(moneyEarned);	
		
		scanner.close();
	} // main

	//Dúvida:como se põe imagens e fonts? swing   
	
	//MÉTODOS
	
	//game status -FEITO                      
	static void printStatus (int round, int moneyEarned, int jokers) {
		System.out.println("\nYou are on round number "+round+", you have "+moneyEarned+" euros and "+jokers+" jokers.\n");
	} //END printStatus
	
	//boolean correct answers -FEITO  
	static void booleanAnswers (boolean [][] a, int [] b)  {
		for (int i = 0; i < 12; i++) {
			int c = b[i];
			a [i][c] = true;
		}                 
	} // END booleanAnswers       
	       
	//Escolha random da pergunta -FEITO                              
	static void printQuestion (String [] question, int round) {	
		System.out.println(question[round]);
	}// END printQuestion
	
	//Imprimir as opções depois de excluidas pelo Joker
	static void printOptionsJoker (String[][] allOptions, int round, int excluded) {
	
		System.out.println( "\nThe available options are: ");
		
		for (int i = 0; i < allOptions[0].length; i++){
			if (i != excluded) {
				System.out.println( allOptions[round][i]);
			}	
		}   
	} //END printOptionsJoker
	
	//Imprimir as opções-FEITO
	static void printOptions (String[][] allOptions, int round) {
	
		System.out.println( "\nThe options are: ");
		
		for (int i = 0; i < allOptions[0].length; i++){
			System.out.println( allOptions[round][i]);
		}   
	} //END printOptions
	
	//RECEBER A RESPOSTA DO UTILIZADOR- FEITO
	static char readAnswer (Scanner sc) {
		char answer;
		do{
			System.out.println("\nWhat is your final answer?"); 
			answer= Character.toUpperCase(sc.next().charAt(0));			
		} while(answer != 'A' && answer != 'B' &&  answer != 'C' &&  answer != 'D' &&  answer != 'J');
		
		return answer;
	}// END readAnswer
	
	//Identificar resposta correta -FEITO
	static char checkAnswer (boolean [][] booleanAnswers, String [][]  allOptions, int round ) {
	 
		char temp = 'e';
		
		for (int i = 0; i < 4; i ++) {
			if ( booleanAnswers[round][i] == true){
				temp = (allOptions[round][i]).charAt(0);
			}	
		}
		return temp;
	} //END checkAnswer
	
	//Verificar se a opção escolhida pelo utilizador é a certa -PODE ESTAR MAL		
	static int printOutcomeMessage (int jokers, char answer, char correctAnswer, int moneyTreeIndex ) {
		if(answer == correctAnswer) {
			System.out.println("\nThe answer is correct!");
			if (moneyTreeIndex <6) {
				moneyTreeIndex ++;
			}
		} else {
			System.out.println("\nThe answer is wrong!");
			if (moneyTreeIndex >0) {
				moneyTreeIndex --;
			}
			jokers= penalizePlayer(jokers, moneyTreeIndex);
		}   
		return moneyTreeIndex;
	} //END printOutcomeMessage
	
	//O que acontece quando utilizador pede joker -FEITO
	static int  applyJoker( int [] correctAnswer, int round, String [][] allOptions, int jokers) {
		int sai;
		do {
			sai = (int) (Math.random() * ((3 + 1)));
		}while (sai == correctAnswer[round]);
		System.out.println("\nYou choose use one of your " +jokers +" jokers.\nOne of the incorect answers is:\n"  + allOptions [round][sai] + "\nTaking that into account...");
		return sai;
	}//END applyJoker
	
	//O utilizador quer um Joker -FEITO
	static int safelyDecreaseJoker(int jokers) {    
	
		if(jokers > 0){    
			jokers--;	
		}else{	
			System.out.println("\nThis feature is no longer available.");
		}
		
		return jokers;
	}//END safelyDecreaseJoker
	
	//A RESPOSTA ESTÁ ERRADO LOGO APLICAR AS CONSEQUÊNCIAS -FEITO		    
	static int penalizePlayer (int jokers, int moneyTreeIndex) {
	
		if(jokers >= 3){    
			jokers= jokers-3;
		}   
		switch (jokers) {  
			case 2: //( jokers=2);
				jokers = jokers-2;
				moneyTreeIndex--;
				break;		
			case 1: //( jokers=1);
				jokers = jokers-1;
				moneyTreeIndex = moneyTreeIndex-2;
				break;		
			case 0: //(jokers=0) ;
				moneyTreeIndex = moneyTreeIndex-3;
				break;
		}
		return moneyTreeIndex;
	}// penalizePlayer
	
	//MoneyTree
	static int money(int moneyTreeIndex, int [] moneyTree)	{	
		int moneyEarned = moneyTree[moneyTreeIndex];	
		    
	    if (moneyTreeIndex <= 0 ) {
		    moneyEarned = 0;
		}  else if (moneyTreeIndex > 6 ) {
		    moneyEarned = 50000; 
		}
	    return moneyEarned;		    
	}//END money
	    
	//SITUAÇÃO final: quanto DINHEIRO -FEITO	
	static void printConclusion(int moneyEarned) {
		System.out.println("\nThe game is over.\nYou won " +moneyEarned+ " euros.");
	}//END  printConclusion

} // END public class FINAL


