package api.endpoints;

public class Routes {
//	https://petstore.swagger.io/v2/user
//  POST	https://petstore.swagger.io/v2/user
//	GET		https://petstore.swagger.io/v2/user{username}
//	PUT		https://petstore.swagger.io/v2/user{Username}
//	DELETE	https://petstore.swagger.io/v2/user{Username}

	public static String baseUrl = "https://petstore.swagger.io/v2";
	// user module urls
	public static String postUrl = baseUrl + "/user"; // Create user
	public static String getUrl = baseUrl + "/user/{username}"; // Get user
	public static String putUrl = baseUrl + "/user/{username}"; // Update user
	public static String deleteUrl = baseUrl + "/user/{username}"; // Delete user
}
