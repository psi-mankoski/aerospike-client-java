/*
 * Copyright 2012-2018 Aerospike, Inc.
 *
 * Portions may be licensed to Aerospike, Inc. under one or more contributor
 * license agreements WHICH ARE COMPATIBLE WITH THE APACHE LICENSE, VERSION 2.0.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.aerospike.client.admin;

import java.io.Serializable;

/**
 * User privilege.
 */
public final class Privilege implements Serializable {
	/**
	 * Privilege code.
	 */
	public PrivilegeCode code;
	
	/**
	 *	Namespace scope. Apply permission to this namespace only.
	 *	If namespace is null, the privilege applies to all namespaces.
	 */
	public String namespace;

	/**
	 *	Set name scope. Apply permission to this set within namespace only.
	 *	If set is null, the privilege applies to all sets within namespace.
	 */
	public String setName;
}
