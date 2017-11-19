package myPackage;

import java.lang.reflect.Executable;

import freemarker.template.utility.Execute;

public class LoginAction {
	private String username;
	private String password;
	
	public String getUsername(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void seUsername(String username){
		this.username =username;
	}
	
	public void setPassword(String password){
		this.password =password;
	}
	private String execute() throws Exception {
		String str ="login";
		if(this.getUsername().equals("abc")&&this.getPassword().equals("123")){
			str="succ";
		}
		return str;

	}
}
