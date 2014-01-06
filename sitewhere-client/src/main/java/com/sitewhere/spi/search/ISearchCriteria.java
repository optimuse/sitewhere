/*
 * ISearchCriteria.java 
 * --------------------------------------------------------------------------------------
 * Copyright (c) Reveal Technologies, LLC. All rights reserved. http://www.reveal-tech.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.search;

/**
 * Common base class for searching that includes support for paging.
 * 
 * @author Derek
 */
public interface ISearchCriteria {

	/**
	 * Get offset from beginning of dataset.
	 * 
	 * @return
	 */
	public int getPageNumber();

	/**
	 * Get number of records per page of data.
	 * 
	 * @return
	 */
	public int getPageSize();
}