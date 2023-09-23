package RestAssured.com.RestAssured;

import java.util.HashMap;
import java.util.Map;

import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;

public class ProductTest {

	public static void main(String[] args) throws SerializeException, ParseException {
		// TODO Auto-generated method stub
		
		JsonSerializer jsonserializer=	JsonSerializer.DEFAULT_READABLE;
		
		HashMap<String, String>data=new HashMap<String ,String>();
		data.put("id", "1");
		data.put("email","george.bluth@reqres.in");
		data.put("first_name","George");
		data.put("last_name", "Bluth");
		data.put("avatar","https://reqres.in/img/faces/1-image.jpg");
		Product pro=new Product("1","6","12","2",data);
		
		String json=jsonserializer.serialize(pro);
		System.out.println(json);

		
		
//     //deserialization
//		JsonParser jsonparser=JsonParser.DEFAULT;
//		String jsonval="{\r\n"
//				+ "	\"color\": \"black\",\r\n"
//				+ "	\"name\": \"HPnoteBook\",\r\n"
//				+ "	\"price\": 1000,\r\n"
//				+ "	\"sellername\": [\r\n"
//				+ "		\"HP,Dell,MacBook\"\r\n"
//				+ "	]\r\n"
//				+ "}";
//	
//		Product prod=jsonparser.parse(jsonval, Product.class);
//		System.out.println(prod.getPrice());
//		
	}

}
