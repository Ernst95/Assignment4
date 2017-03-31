package com.Assignment4;
/**
 *Created by Ernst on 2017/03/31.
 */

public class PLKDemo
{
	public void process(Order o)
	{
		Message message = o.getMessage();

		message.normalize();

		((Message) o.getMessage).normalize();
		
	}
}
