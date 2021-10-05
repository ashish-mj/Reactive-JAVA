package com.rakuten;

import java.util.Arrays;
import java.util.List;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class ObserverImplementation {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Alpha","Beta","Gamma");
		
		Observable<String> src = Observable.fromIterable(l);
		
		/*Observable<String> src = Observable.create(emitter -> {
			emitter.onNext("one");
			emitter.onNext(null);
			emitter.onNext("three");
			emitter.onComplete();
		});
		*/
		src.subscribe(new Observer<String>() {

			@Override
			public void onSubscribe(@NonNull Disposable d) {
				System.out.println("Subscription started. ");				
			}

			@Override
			public void onNext(@NonNull String t) {
				System.out.println("OnNext ---- "+t);
				
			}

			@Override
			public void onError(@NonNull Throwable e) {
				System.out.println("OnError --- ");
				e.printStackTrace();
			}

			@Override
			public void onComplete() {
				System.out.println("OnComplete -----");
				
			}
		
		
		});

	}

}
