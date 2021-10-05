package com.rakuten;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import io.reactivex.rxjava3.core.Observable;

class TimeConsumingComputation implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		Integer value = 42;
		return value;
	}
	
}

public class ObservableFromFuture {

	public static void main(String[] args) {
		
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		Future<Integer> fut = pool.submit(new TimeConsumingComputation());

		Observable<Integer> src = Observable.fromFuture(fut);
		src.subscribe(System.out::println);
		
		pool.shutdown();
	}

}

