/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.GeoLocation;

/**
 * Builders for {@link Context} variants.
 * <p>
 * Variants <code>category</code> are not available here as they don't have a
 * dedicated class. Use {@link Context}'s builder for these.
 * 
 */
public class ContextBuilders {
	private ContextBuilders() {
	}

	/**
	 * Creates a builder for the {@link GeoLocation location} {@code Context}
	 * variant.
	 */
	public static GeoLocation.Builder location() {
		return new GeoLocation.Builder();
	}

}
