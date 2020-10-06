package com.observer;

import java.util.ArrayList;

public class Subject {
		private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
		
		public void registerObserver(Subscriber subscriber) {
			subscribers.add(subscriber);
		}
		
		public void unregisterObserver(Subscriber observer) {
			subscribers.remove(observer);
		}
		
		public void notifySubscriber() {
			for (Subscriber o : subscribers) {
				o.update();
			}
		}

		@Override
		public String toString() {
			return "Subject [subscribers=" + subscribers + "]";
		}
}