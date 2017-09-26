/**
 * 
 */
package jazmin.driver.mq;

import java.lang.reflect.Method;

/**
 * @author yama
 *
 */
public class TopicSubscriber {
	public short id;
	public String topic;
	public Object instance;
	public Method method;
	//
	public TopicSubscriberType type;
	//
	public long sentCount;
	public long lastSentTime;
}
