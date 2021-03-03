import java.util.ArrayList;
import java.util.TreeSet;

public class User {

	private String firstName;
	private String lastName;
	private String adress;
	private String telephone;
	private ArrayList<User> listOfConnections = new ArrayList<>();
	private String email;
	private String password;
	//This list contains all Posts made by the User and their friends
	private TreeSet<Post> listOfPosts = new TreeSet<>(Comparator);
	private TreeSet<Message> listOfMessages = new TreeSet<>(Comparator);
	public User(String firstName, String lastName, String email, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	
}
