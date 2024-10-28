public class Player {
	public String name,player_id,sport_type,availability_status;
	public boolean ishire;
	Player(String name,String player_id,String sport_type){
		this.name=name;
		this.player_id=player_id;
		this.sport_type=sport_type;
		this.availability_status="Available";
		this.ishire=false;
	}
	public String toString(){
		return "Name: "+name+", Player id: "+player_id+", Sport type: "+sport_type+", Availability status: "+availability_status;
	}
}
