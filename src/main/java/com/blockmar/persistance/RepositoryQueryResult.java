package com.blockmar.persistance;

import java.util.Iterator;
import java.util.List;

public interface RepositoryQueryResult<T> extends Iterable<T> {

	public abstract List<T> all();

	public abstract List<T> limit(int count);

	public abstract Iterator<T> iterator();

}