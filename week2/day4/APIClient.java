package week2.day4;

public class APIClient {

	
	//sendRequest with one argument
	public void sendRequest(String endpoint) {

		System.out.println("Sending request: "+endpoint);
	}
	//sendRequest with three arguments
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println("Sending request for " + endpoint + requestBody + requestStatus);
		
	//To verify whether the request is successful	
		if (requestStatus) {
			System.out.println("Request was succesfull");
			
		} else {
			System.out.println("Request failed");
		}
		
	}
	
	
	public static void main(String[] args) {

		APIClient apic= new APIClient();
		
		apic.sendRequest("By endpoints");
		apic.sendRequest("By endpoints,", " body of the request ", true);
		
	}

}
