package com.Assignment4;
/**
 *Created by Ernst on 2017/03/31.
 */
public class App {

	public static void main(String[] args) {

		PLKDemo plkDemo = new PLKDemo();

		Order order = new Order();

		plkDemo.process(order);
	}

}
