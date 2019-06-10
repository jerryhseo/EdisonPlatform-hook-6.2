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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for OSPFile. This utility wraps
 * {@link com.kisti.osp.service.impl.OSPFileLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Jerry h. Seo
 * @see OSPFileLocalService
 * @see com.kisti.osp.service.base.OSPFileLocalServiceBaseImpl
 * @see com.kisti.osp.service.impl.OSPFileLocalServiceImpl
 * @generated
 */
public class OSPFileLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.kisti.osp.service.impl.OSPFileLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the o s p file to the database. Also notifies the appropriate model listeners.
	*
	* @param ospFile the o s p file
	* @return the o s p file that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.kisti.osp.model.OSPFile addOSPFile(
		com.kisti.osp.model.OSPFile ospFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addOSPFile(ospFile);
	}

	/**
	* Creates a new o s p file with the primary key. Does not add the o s p file to the database.
	*
	* @param propertyName the primary key for the new o s p file
	* @return the new o s p file
	*/
	public static com.kisti.osp.model.OSPFile createOSPFile(
		java.lang.String propertyName) {
		return getService().createOSPFile(propertyName);
	}

	/**
	* Deletes the o s p file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param propertyName the primary key of the o s p file
	* @return the o s p file that was removed
	* @throws PortalException if a o s p file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.kisti.osp.model.OSPFile deleteOSPFile(
		java.lang.String propertyName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOSPFile(propertyName);
	}

	/**
	* Deletes the o s p file from the database. Also notifies the appropriate model listeners.
	*
	* @param ospFile the o s p file
	* @return the o s p file that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.kisti.osp.model.OSPFile deleteOSPFile(
		com.kisti.osp.model.OSPFile ospFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOSPFile(ospFile);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.kisti.osp.model.OSPFile fetchOSPFile(
		java.lang.String propertyName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchOSPFile(propertyName);
	}

	/**
	* Returns the o s p file with the primary key.
	*
	* @param propertyName the primary key of the o s p file
	* @return the o s p file
	* @throws PortalException if a o s p file with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.kisti.osp.model.OSPFile getOSPFile(
		java.lang.String propertyName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getOSPFile(propertyName);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.kisti.osp.model.OSPFile> getOSPFiles(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOSPFiles(start, end);
	}

	/**
	* Returns the number of o s p files.
	*
	* @return the number of o s p files
	* @throws SystemException if a system exception occurred
	*/
	public static int getOSPFilesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOSPFilesCount();
	}

	/**
	* Updates the o s p file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ospFile the o s p file
	* @return the o s p file that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.kisti.osp.model.OSPFile updateOSPFile(
		com.kisti.osp.model.OSPFile ospFile)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateOSPFile(ospFile);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static OSPFileLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					OSPFileLocalService.class.getName());

			if (invokableLocalService instanceof OSPFileLocalService) {
				_service = (OSPFileLocalService)invokableLocalService;
			}
			else {
				_service = new OSPFileLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(OSPFileLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(OSPFileLocalService service) {
	}

	private static OSPFileLocalService _service;
}