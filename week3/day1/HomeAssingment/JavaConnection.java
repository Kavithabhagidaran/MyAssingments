package week3.day1;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
System.out.println("Connected to database");		
	}

	@Override
	public void disconnect() {
		
System.out.println("Disconnected from the database");		
	}

	@Override
	public void executeUpdate() {
System.out.println("Executing update in the database");		
	}
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		
		jc.connect();
		jc.executeUpdate();
		jc.disconnect();
	}
	

}
