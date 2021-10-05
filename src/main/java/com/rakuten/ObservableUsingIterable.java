package com.rakuten;

import java.util.Arrays;
import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public class ObservableUsingIterable {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Aplha","Beta","Gamma");
		Observable<String> src = Observable.fromIterable(l);
		
		src.subscribe(System.out::println);

	}

}
