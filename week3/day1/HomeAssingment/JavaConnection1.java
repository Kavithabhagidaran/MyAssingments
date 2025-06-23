package week3.day1;

public class JavaConnection1 extends MySqlConnection{

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
	
	@Override
	public void executeQuery() {
		System.out.println("Execute the query");
		
	}
	public static void main(String[] args) {
		JavaConnection1 jc1=new JavaConnection1();
		
		jc1.connect();
		jc1.executeUpdate();
		jc1.executeQuery();
		jc1.disconnect();
		
		
	
	}

	
	
}
