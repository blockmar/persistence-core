package com.blockmar.persistence;

import java.util.List;

public interface RepositoryQueryResult<T> extends Iterable<T> {

	public abstract List<T> asList();

}