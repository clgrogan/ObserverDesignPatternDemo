package com.observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject blog = new Blog();
		Subscriber subscriber = new Subscriber();
		Subscriber subscriber2 = new Subscriber();

		blog.registerObserver(subscriber);
		blog.registerObserver(subscriber2);
		
		System.out.println(blog.toString());
	}

}
