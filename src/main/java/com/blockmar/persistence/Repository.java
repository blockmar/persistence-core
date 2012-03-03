package com.blockmar.persistence;

public interface Repository<T> {
	
	public T findById(String id);
	
	public <V> RepositoryQuery<T> find(String key, V value);
	
	public RepositoryQueryResult<T> findAll();
	
	public T store(T object);
	
	public void delete(T object);
}
