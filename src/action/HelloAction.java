package action;

public class HelloAction {
	private String message;
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String msg){
		this.message =msg;
	}
	
	public String execute(){
		this.message = "My first Strust2 program";
		return "Success_1";
	}
	
	public String other(){
		this.message = "This is the second function";
		return "Success_2";
	}
}
