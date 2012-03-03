package com.blockmar.persistance;


public interface RepositoryQuery<T> {

	public abstract T first();

	public abstract RepositoryQueryResult<T> result();

	public abstract <V> RepositoryQuery<T> and(String key, V value);

	public abstract <V> RepositoryQuery<T> orderBy(String key, Order direction);

	public abstract <V> RepositoryQuery<T> orderBy(String key);

	public static enum Order {
		ASC, DESC
	}
}