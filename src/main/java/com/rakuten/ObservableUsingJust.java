package com.rakuten;

import io.reactivex.rxjava3.core.Observable;

public class ObservableUsingJust {

	public static void main(String[] args) {
		Observable <String> src = Observable.just("alpha","beta","gamma");
		src.subscribe(System.out::println);
	}

}
