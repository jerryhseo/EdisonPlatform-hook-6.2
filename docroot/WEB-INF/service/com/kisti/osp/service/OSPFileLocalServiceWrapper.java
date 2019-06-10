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

package com.kisti.osp.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OSPFileLocalService}.
 *
 * @author Jerry h. Seo
 * @see OSPFileLocalService
 * @generated
 */
public class OSPFileLocalServiceWrapper implements OSPFileLocalService,
	ServiceWrapper<OSPFileLocalService> {
	public OSPFileLocalServiceWrapper(OSPFileLocalService ospFileLocalService) {
		_ospFileLocalService = ospFileLocalService;
	}

	/**
	* Adds the o s p file to the database. Also notifies the appropriate model listeners.
	*
	* @param ospFile the o s p file
	* @return the o s p file that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.kisti.osp.model.OSPFile addOSPFile(
		com.kisti.osp.model.OSPFile ospFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.addOSPFile(ospFile);
	}

	/**
	* Creates a new o s p file with the primary key. Does not add the o s p file to the database.
	*
	* @param propertyName the primary key for the new o s p file
	* @return the new o s p file
	*/
	@Override
	public com.kisti.osp.model.OSPFile createOSPFile(
		java.lang.String propertyName) {
		return _ospFileLocalService.createOSPFile(propertyName);
	}

	/**
	* Deletes the o s p file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param propertyName the primary key of the o s p file
	* @return the o s p file that was removed
	* @throws PortalException if a o s p file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.kisti.osp.model.OSPFile deleteOSPFile(
		java.lang.String propertyName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.deleteOSPFile(propertyName);
	}

	/**
	* Deletes the o s p file from the database. Also notifies the appropriate model listeners.
	*
	* @param ospFile the o s p file
	* @return the o s p file that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.kisti.osp.model.OSPFile deleteOSPFile(
		com.kisti.osp.model.OSPFile ospFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.deleteOSPFile(ospFile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ospFileLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.model.impl.OSPFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.model.impl.OSPFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.kisti.osp.model.OSPFile fetchOSPFile(
		java.lang.String propertyName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.fetchOSPFile(propertyName);
	}

	/**
	* Returns the o s p file with the primary key.
	*
	* @param propertyName the primary key of the o s p file
	* @return the o s p file
	* @throws PortalException if a o s p file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.kisti.osp.model.OSPFile getOSPFile(java.lang.String propertyName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.getOSPFile(propertyName);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the o s p files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.kisti.osp.model.impl.OSPFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of o s p files
	* @param end the upper bound of the range of o s p files (not inclusive)
	* @return the range of o s p files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.kisti.osp.model.OSPFile> getOSPFiles(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.getOSPFiles(start, end);
	}

	/**
	* Returns the number of o s p files.
	*
	* @return the number of o s p files
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOSPFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.getOSPFilesCount();
	}

	/**
	* Updates the o s p file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ospFile the o s p file
	* @return the o s p file that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.kisti.osp.model.OSPFile updateOSPFile(
		com.kisti.osp.model.OSPFile ospFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ospFileLocalService.updateOSPFile(ospFile);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _ospFileLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ospFileLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ospFileLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OSPFileLocalService getWrappedOSPFileLocalService() {
		return _ospFileLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOSPFileLocalService(
		OSPFileLocalService ospFileLocalService) {
		_ospFileLocalService = ospFileLocalService;
	}

	@Override
	public OSPFileLocalService getWrappedService() {
		return _ospFileLocalService;
	}

	@Override
	public void setWrappedService(OSPFileLocalService ospFileLocalService) {
		_ospFileLocalService = ospFileLocalService;
	}

	private OSPFileLocalService _ospFileLocalService;
}