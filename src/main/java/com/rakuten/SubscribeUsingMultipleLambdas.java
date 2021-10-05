package com.rakuten;

import io.reactivex.rxjava3.core.Observable;

public class SubscribeUsingMultipleLambdas {

	public static void main(String[] args) {
		Observable<String> src = Observable.create(emitter -> {
			emitter.onNext("one");
			emitter.onNext("two");
			emitter.onNext("three");
			emitter.onComplete();
		});
		
		src.subscribe(s -> System.out.println(s),
						e->{System.out.println("Error :");},
						() -> System.out.println("finished processing"));

	}

}