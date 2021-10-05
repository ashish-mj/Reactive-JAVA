package com.rakuten;

import io.reactivex.rxjava3.core.Single;

public class SingleDemo {

	public static void main(String[] args) {
		Single.just("Ashish").map(String::length).subscribe(System.out::println,
				e -> System.out.println("Error captured: " + e));
	}

}
