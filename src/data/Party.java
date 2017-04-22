package data;

import java.util.HashMap;
import java.util.UUID;
import java.util.Vector;

public class Party {
	private String id;
	private String name;
	private String location;
	private int longitude;
	private int latitude;
	private User host;
	HashMap<String,User> attenders;
	
	public Party(String name, String location,int longitude,int latitude, User host)
	{
		id = UUID.randomUUID().toString();
		this.name = name;
		this.location = location;
		this.longitude = longitude;
		this.latitude = latitude;
		this.host = host;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String location()
	{
		return location;
	}
	
	public int getLongitude()
	{
		return longitude;
	}
	
	public int getLatitude()
	{
		return latitude;
	}
	
	public User getHost()
	{
		return host;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public void setGeoLocation(int longitude, int latitude)
	{
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public boolean hasAttender(String username)
	{
		return attenders.containsKey(username);
	}
	
	public void addAttender(User user)
	{
		attenders.put(user.getUsername(), user);
	}
	
	public void removeAttender(String username)
	{
		attenders.remove(username);
	}
}
