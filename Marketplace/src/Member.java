import java.util.*;

public class Member {
	private int memberID;
	private String name;
	private String email;
	private String password;
	
	public Member(int memberID, 
			String name, 
			String email,
			String password){
		this.memberID = memberID;
		this.name = name;
		this. password = password;
	}
	
	public int getMemberID(){
		return this.memberID;
	}
	
	public String getName(){
		return this.name;
	}
}
