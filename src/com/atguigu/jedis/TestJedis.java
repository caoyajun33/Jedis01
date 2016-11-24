package com.atguigu.jedis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class TestJedis {
	public static void main(String[] args) {
		
		Jedis jed = new Jedis("192.168.14.170", 6379);
		
		/*//System.out.println(jed.ping());
		System.out.println(jed.get("k1"));
		
		System.out.println(jed.keys("*"));*/
		//key
		/*Set<String> keys = jed.keys("*");
		for(Iterator it = keys.iterator();it.hasNext();){
			String next = (String) it.next();
			
			System.out.println(next);
		}
		
		System.out.println("exists:"+jed.exists("k2"));
		
		System.out.println("time:"+jed.ttl("k1"));
		*/
		//String
		
		/*System.out.println(jed.get("k1"));
		
		jed.msetnx("str1","ss1","str2","ss2","str3","ss3");
		
		List<String> list = jed.mget("str1","str2","str3");
		
		for (String string : list) {
			System.out.println(string);
		}*/
		
		//list
		
		jed.lpush("ll1", "12","22","33");
		
		String lpop = jed.lpop("ll1");
		
	//	System.out.println(lpop);
		
		//System.out.println(jed.lrange("ll1", 1, 2));
		
		List<String> lrange = jed.lrange("ll1", 0, -1);
		
		for (String string : lrange) {
			System.out.println(string);
		}
		
	}
}
