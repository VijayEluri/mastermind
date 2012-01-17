import static org.ericminio.mastermind.Combinaison.combinaison;
import static org.ericminio.mastermind.Players.bilou;
import static org.ericminio.mastermind.Players.claire;

public class MastermindFixture {

	public MastermindFixture() {
		claire.acceptToPlayWith( bilou );
	}
	
	public void setGivenTheSecret(String secret) {
		bilou.choosesSecret( combinaison( secret ) );
	}
	
	public void setWhenPlayerPlays(String proposition) {
		claire.plays( combinaison( proposition) );
	}
	
	public boolean doesHeWin() {
		return bilou.blackCount() == 4;
	}
	
	public int black() {
		return bilou.blackCount();
	}
	
	public int white() {
		return bilou.whiteCount();
	}
	
}
