
import redis.clients.jedis.JedisPool;

public class JedisPoolUtil {
	
	private static volatile JedisPool jedisPool = null;

	private JedisPoolUtil() {
	}
	
	public static JedisPool getInstance() {
		if(null==jedisPool){
			return new JedisPool("192.168.160.128");
		} else {
			return jedisPool;
		}
	}
	
	

}
