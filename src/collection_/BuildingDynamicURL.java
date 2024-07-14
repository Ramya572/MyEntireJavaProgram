package collection_;

public class BuildingDynamicURL {

	public static void main(String[] args) {
		//Base url of website being tested
		String baseURL="https://grotechminds.com/search";
		//test data or parameter
		String searchQuery="laptop";
		String sortBy="place";
		String order="ascending";
		
		//use stringbuilder to construct the full URL
		StringBuilder urlBuilder=new StringBuilder(baseURL);
		urlBuilder.append("?query=");
		urlBuilder.append(searchQuery);
		urlBuilder.append("&sort=");
		urlBuilder.append(sortBy);
		urlBuilder.append("&order=");
		urlBuilder.append(order);
	
		//convert StringBuilder to string to be used in selenium
		String fullUrl=urlBuilder.toString();
		//output URL(in practice,this would be where u navigate to the URL using selenium
		System.out.println("Constructed URL:"+fullUrl);
		//Example seslenium useage
		//webdriver driver=new ChromeDriver();
		//driver.get(fullUrl);
	}

}
