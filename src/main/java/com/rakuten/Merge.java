package com.rakuten;

import io.reactivex.rxjava3.core.Observable;

public class Merge {
	
	public static void main(String[] args) {
		Observable<String> src1 = Observable.just("Alpha", "Beta");
		Observable<String> src2 = Observable.just("Zeta", "Eta");
		Observable.merge(src1, src2)
		.subscribe(i -> System.out.println("RECEIVED: " + i));
		}

}
