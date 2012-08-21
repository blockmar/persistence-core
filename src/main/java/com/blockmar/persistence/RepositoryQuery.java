package com.blockmar.persistence;

public interface RepositoryQuery<T> {

	public abstract T first();

	public abstract RepositoryQueryResult<T> result();

	public abstract <V> RepositoryQuery<T> offset(int offset);

	public abstract <V> RepositoryQuery<T> limit(int limit);

	public abstract <V> RepositoryQuery<T> and(String key, V value);

	public abstract <V> RepositoryQuery<T> orderBy(String key, Order direction);

	public abstract <V> RepositoryQuery<T> orderBy(String key);

	public static enum Order {
		ASC, DESC
	}
}