package com.rakuten;

import io.reactivex.rxjava3.core.Observable;

public class ObservableUsingCreateEmitter {

	public static void main(String[] args) {
		Observable<String> source = Observable.create(emitter -> {
		emitter.onNext("one");
		emitter.onNext("two");
		emitter.onNext("three");
		emitter.onComplete();
		});
		
		source.subscribe(s -> System.out.println(s));

	}

}
