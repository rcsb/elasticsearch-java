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

package co.elastic.clients.elasticsearch.dangling_indices;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the dangling_indices namespace.
 */
public class ElasticsearchDanglingIndicesAsyncClient extends ApiClient<ElasticsearchDanglingIndicesAsyncClient> {

	public ElasticsearchDanglingIndicesAsyncClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchDanglingIndicesAsyncClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchDanglingIndicesAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchDanglingIndicesAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: dangling_indices.delete_dangling_index

	/**
	 * Deletes the specified dangling index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteDanglingIndexResponse> deleteDanglingIndex(DeleteDanglingIndexRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<DeleteDanglingIndexRequest, DeleteDanglingIndexResponse, ErrorResponse> endpoint = (Endpoint<DeleteDanglingIndexRequest, DeleteDanglingIndexResponse, ErrorResponse>) DeleteDanglingIndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes the specified dangling index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDanglingIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteDanglingIndexResponse> deleteDanglingIndex(
			Function<DeleteDanglingIndexRequest.Builder, ObjectBuilder<DeleteDanglingIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteDanglingIndex(fn.apply(new DeleteDanglingIndexRequest.Builder()).build());
	}

	// ----- Endpoint: dangling_indices.import_dangling_index

	/**
	 * Imports the specified dangling index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ImportDanglingIndexResponse> importDanglingIndex(ImportDanglingIndexRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		Endpoint<ImportDanglingIndexRequest, ImportDanglingIndexResponse, ErrorResponse> endpoint = (Endpoint<ImportDanglingIndexRequest, ImportDanglingIndexResponse, ErrorResponse>) ImportDanglingIndexRequest._ENDPOINT;

		return this.transport.performRequestAsync(request, endpoint, this.transportOptions);
	}

	/**
	 * Imports the specified dangling index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ImportDanglingIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ImportDanglingIndexResponse> importDanglingIndex(
			Function<ImportDanglingIndexRequest.Builder, ObjectBuilder<ImportDanglingIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return importDanglingIndex(fn.apply(new ImportDanglingIndexRequest.Builder()).build());
	}

	// ----- Endpoint: dangling_indices.list_dangling_indices

	/**
	 * Returns all dangling indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<ListDanglingIndicesResponse> listDanglingIndices()
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(ListDanglingIndicesRequest._INSTANCE,
				ListDanglingIndicesRequest._ENDPOINT, this.transportOptions);
	}

}
