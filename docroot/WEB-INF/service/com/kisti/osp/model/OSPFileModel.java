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

package com.kisti.osp.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the OSPFile service. Represents a row in the &quot;OSP_OSPFile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.kisti.osp.model.impl.OSPFileModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.kisti.osp.model.impl.OSPFileImpl}.
 * </p>
 *
 * @author Jerry h. Seo
 * @see OSPFile
 * @see com.kisti.osp.model.impl.OSPFileImpl
 * @see com.kisti.osp.model.impl.OSPFileModelImpl
 * @generated
 */
public interface OSPFileModel extends BaseModel<OSPFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a o s p file model instance should use the {@link OSPFile} interface instead.
	 */

	/**
	 * Returns the primary key of this o s p file.
	 *
	 * @return the primary key of this o s p file
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this o s p file.
	 *
	 * @param primaryKey the primary key of this o s p file
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the property name of this o s p file.
	 *
	 * @return the property name of this o s p file
	 */
	@AutoEscape
	public String getPropertyName();

	/**
	 * Sets the property name of this o s p file.
	 *
	 * @param propertyName the property name of this o s p file
	 */
	public void setPropertyName(String propertyName);

	/**
	 * Returns the property value of this o s p file.
	 *
	 * @return the property value of this o s p file
	 */
	@AutoEscape
	public String getPropertyValue();

	/**
	 * Sets the property value of this o s p file.
	 *
	 * @param propertyValue the property value of this o s p file
	 */
	public void setPropertyValue(String propertyValue);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.kisti.osp.model.OSPFile ospFile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.kisti.osp.model.OSPFile> toCacheModel();

	@Override
	public com.kisti.osp.model.OSPFile toEscapedModel();

	@Override
	public com.kisti.osp.model.OSPFile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}