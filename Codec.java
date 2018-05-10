package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Codec {

	private Map<String, String> map=new HashMap();
	private final String values="1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public String encode(String longUrl) {
    	map.put(longUrl, randomValue());
    	return "http://tinyurl.com/" + map.get(longUrl).toString();
        
    }

    private String randomValue() {
    	String url = "";
    	Random rand = new Random();
    	for(int i=0;i<6;i++)
    		url=url + values.charAt(rand.nextInt(61));
		return url;
	}

	// Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    	String Key="";
        for (Map.Entry<String,String> entry : map.entrySet())
        {
        	Key =entry.getKey();
    }

    	return Key;
        
    }
    public Map getMap()
    {
    	return map;
    }
}
