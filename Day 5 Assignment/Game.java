package quizApplication;

public class Game {
	
	Question[] questions = new Question[4];
	Player player = new Player();
	
	public void initGame() {
		
		for(int i = 0; i < 4; i++) {
			questions[i] = new Question();
		}
		
		questions[0].ques = "Which city does Ash Ketchum belong to?";
		questions[0].option1 = "Pewter City";
		questions[0].option2 = "Cerulean City";
		questions[0].option3 = "Pallet Town";
		questions[0].option4 = "LaRousse City";
		questions[0].correctAns = 3;
		
		questions[1].ques = "Which pokemon is Ash Ketchum's partner?";
		questions[1].option1 = "Pikachu";
		questions[1].option2 = "Ditto";
		questions[1].option3 = "Celebi";
		questions[1].option4 = "Pichu";
		questions[1].correctAns = 1;
		
		questions[2].ques = "In which form does Pikachu evolve into?";
		questions[2].option1 = "Pichu";
		questions[2].option2 = "Zapdos";
		questions[2].option3 = "Electrike";
		questions[2].option4 = "Raichu";
		questions[2].correctAns = 4;
		
		questions[3].ques = "This cartoon originates from...";
		questions[3].option1 = "USA";
		questions[3].option2 = "Japan";
		questions[3].option3 = "India";
		questions[3].option4 = "Russia";
		questions[3].correctAns = 2;
		
	}
	
	public void play() {
		
		System.out.println("Welcome to Pokemon Quiz");
		System.out.println();
		player.getDetails();
		for(int i = 0; i < 4; i++) {
			boolean status = questions[i].askQuestion();
			if (status == true) {
				System.out.println("Correct!!!!");
				player.score++;
			}
			else {
				System.out.println("You are wrong!!");
			}
			System.out.println();
		}
		
		System.out.println(player.name + ", your score is " + player.score);
		
	}
	
}
