package com.rakuten;

import java.util.concurrent.ThreadLocalRandom;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class SubscribeOnDemo {

	public static void main(String[] args) {
		Observable.just("Alpha", "Beta", "Gamma").subscribeOn(Schedulers.computation())
				.map(s -> intenseCalculation((s))).subscribe(System.out::println);
		Observable.range(1, 3).subscribeOn(Schedulers.computation()).map(s -> intenseCalculation((s)))
				.subscribe(System.out::println);
		sleep(20000);
	}

	private static <T> T intenseCalculation(T value) {
		sleep(ThreadLocalRandom.current().nextInt(3000));
		return value;
	}

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
