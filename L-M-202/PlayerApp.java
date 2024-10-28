import java.util.*;
public class PlayerApp {
 public static void  main(String []args) {
	 PlayerManagement pm=new PlayerManagement();
	 Scanner sc=new Scanner(System.in);
	 while(true) {
		 System.out.println("1 for add player");
		 System.out.println("2 for a specific player");
		 System.out.println("3 for complete list of player");
		 System.out.println("4 for hire player");
		 System.out.println("0 for exit");
		 int op=sc.nextInt();
		 if (op==1) {
			 System.out.println("Name:");
			 String name=sc.next();
			 System.out.println("Player id:");
			 String player_id=sc.next();
			 System.out.println("Sport type:");
			 String sport_type=sc.next();
			 Player p=new Player(name,player_id,sport_type);
			 pm.addPlayer(p);
		 }
		 else if(op==0) {
			 break;
		 }
		 else if(op==2) {
			 System.out.println("Player id:");
			 String id=sc.next();
			 pm.specificPlayer(id);
		 }
		 else if(op==3) {
			 pm.allPlayer();
		 }
		 else if(op==4) {
			 System.out.println("Player id:");
			 String id=sc.next();
			 pm.hirePlayers(id);
		 }
	 }
	 sc.close();
 }
}
