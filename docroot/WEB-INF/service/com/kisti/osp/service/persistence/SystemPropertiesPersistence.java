/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.kisti.osp.service.persistence;

import com.kisti.osp.model.SystemProperties;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the system properties service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jerry h. Seo
 * @see SystemPropertiesPersistenceImpl
 * @see SystemPropertiesUtil
 * @generated
 */
public interface SystemPropertiesPersistence extends BasePersistence<SystemProperties> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SystemPropertiesUtil} to access the system properties persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the system properties in the entity cache if it is enabled.
	*
	* @param systemProperties the system properties
	*/
	public void cacheResult(
		com.kisti.osp.model.SystemProperties systemProperties);

	/**
	* Caches the system propertieses in the entity cache if it is enabled.
	*
	* @param systemPropertieses the system propertieses
	*/
	public void cacheResult(
		java.util.List<com.kisti.osp.model.SystemProperties> systemPropertieses);

	/**
	* Creates a new system properties with the primary key. Does not add the system properties to the database.
	*
	* @param propertyName the primary key for the new system properties
	* @return the new system properties
	*/
	public com.kisti.osp.model.SystemProperties create(
		java.lang.String propertyName);

	/**
	* Removes the system properties with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param propertyName the primary key of the system properties
	* @return the system properties that was removed
	* @throws com.kisti.osp.NoSuchSystemPropertiesException if a system properties with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.kisti.osp.model.SystemProperties remove(
		java.lang.String propertyName)
		throws com.kisti.osp.NoSuchSystemPropertiesException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.kisti.osp.model.SystemProperties updateImpl(
		com.kisti.osp.model.SystemProperties systemProperties)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the system properties with the primary key or throws a {@link com.kisti.osp.NoSuchSystemPropertiesException} if it could not be found.
	*
	* @param propertyName the primary key of the system properties
	* @return the system properties
	* @throws com.kisti.osp.NoSuchSystemPropertiesException if a system properties with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.kisti.osp.model.SystemProperties findByPrimaryKey(
		java.lang.String propertyName)
		throws com.kisti.osp.NoSuchSystemPropertiesException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the system properties with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param propertyName the primary key of the system properties
	* @return the system properties, or <code>null</code> if a system properties with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.kisti.osp.model.SystemProperties fetchByPrimaryKey(
		java.lang.String propertyName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the system propertieses.
	*
	* @return the system propertieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.kisti.osp.model.SystemProperties> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the system propertieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.model.impl.SystemPropertiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of system propertieses
	* @param end the upper bound of the range of system propertieses (not inclusive)
	* @return the range of system propertieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.kisti.osp.model.SystemProperties> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the system propertieses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.model.impl.SystemPropertiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of system propertieses
	* @param end the upper bound of the range of system propertieses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of system propertieses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.kisti.osp.model.SystemProperties> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the system propertieses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of system propertieses.
	*
	* @return the number of system propertieses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}