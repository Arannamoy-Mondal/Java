import java.util.*;
public class PlayerManagement {
	ArrayList<Player> players;
	PlayerManagement(){
		this.players=new ArrayList<>();
	}
	public void addPlayer(Player a) {
		players.add(a);
	}
	public void specificPlayer(String id) {
		for (Player it:players) {
			if(it.player_id.equals(id)) {
				System.out.println(it);
				return;
			}
		}
		System.out.println("No such player. Please enter correct id.");
	}
	public void allPlayer() {
		for (Player it:players) {
			System.out.println(it);
		}
	}
	public void hirePlayers(String id) {
		for (Player it:players) {
			if(it.player_id.equals(id))
			{
				if(!it.ishire) {
					it.availability_status="Unavailable";
					it.ishire=true;
					System.out.println("Congrats! You hired successfully.");
					return;
				}
				else {
					System.out.println("Player is not available");
					return;
				}
			}
		}
		System.out.println("No such player. Please enter correct id.");
		
	}
}
