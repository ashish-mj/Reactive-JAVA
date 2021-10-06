package com.rakuten;

import io.reactivex.rxjava3.core.Observable;

public class FixedSizeBuffer {

	public static void main(String[] args) {
		Observable.range(1, 50)
		.buffer(8)
		.subscribe(System.out::println);
		}
}