class Scores{
	int []scores;
	int players;
	
	public Scores(int size){
		scores =new int[size];
		players=0;
	}
	
	public void addScores(int score){
		if(scores.length <= players){
			System.out.println("More than score enter from players");
		}
		scores[players]=score;
		players++;
	}
	
	int findMinmunScore(){
		int min=scores[0];
		for(int i=1;i< players;i++){
			if(scores[i] < min){
				min=scores[i];
			}
		}
		return min;
	}
	
	int findMaximunScore(){
		int max=scores[0];
		for(int i=1;i< players;i++){
			if(scores[i] > max){
				max=scores[i];
			}
		}
		return max;
	}
	
	int averageScores(){
		int avg=0;
		int sum=0;
		for(int i=0;i< players;i++){
			sum += scores[i];
		}
		avg =sum / players;
		return avg;
		
	}
	
	void displayScore(){
		for(int i=0;i<players;i++){
			System.out.print(scores[i]+" ");
		}
	}
	
	void displayScoreMorethanavg(){
		for(int i=0;i<players;i++){
			if(scores[i] >= averageScores()){
				System.out.print(scores[i]+" ");
			}
		}
	}
}
public class CricketScores{
	public static void main(String [] args){
		Scores sc=new Scores(10);
		sc.addScores(21);
		sc.addScores(61);
		sc.addScores(31);
		sc.addScores(64);
		sc.addScores(54);
		sc.addScores(12);
		sc.addScores(03);
		sc.addScores(23);
		sc.addScores(44);
		sc.addScores(11);
		sc.displayScore();
		
		System.out.println();
		System.out.println("Min score: "+sc.findMinmunScore());
		System.out.println();
		System.out.println("Max score: "+sc.findMaximunScore());
		
		System.out.println();
		System.out.println("avearge score: "+sc.averageScores());
		
		System.out.println();
		System.out.println("Score more than average");
		sc.displayScoreMorethanavg();
		
	}
}