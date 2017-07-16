package main;

import eager.EagerSingleton;
import field.PublicFieldSingleton;
import locking.DoubleCheckedLockingSingleton;
import singleenum.EnumSingleton;
import sync.SynchronizedSingleton;

public class SingletonClient {
	public static void main(String[] args) {
		SynchronizedSingleton syncSingleton = SynchronizedSingleton
				.getInstance();
		System.out.println(syncSingleton.getDescription());

		DoubleCheckedLockingSingleton dclSingleton = DoubleCheckedLockingSingleton
				.getInstance();
		System.out.println(dclSingleton.getDescription());

		EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		System.out.println(eagerSingleton.getDescription());

		System.out
				.println(PublicFieldSingleton.UNIQUE_INSTANCE.getDescription());

		System.out.println(EnumSingleton.UNIQUE_INSTANCE.getDescription());
	}
}
