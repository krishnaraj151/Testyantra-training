package upcasting;

public class Group {
	
	public static void main(String[] args) {
		
	User user=new Admin("krishna", 737381882);
	user.chat();
	user.videocall();
	user.share();
	
	Admin admin=(Admin)user;
	admin.chat();
	admin.videocall();
	admin.share();
	admin.adduser("vinoth");
	admin.removeuser("krishna");
	
		
	}

}
