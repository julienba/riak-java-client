/*
 * This file is provided to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.basho.riak.client.response;

import java.util.List;

import com.basho.riak.client.RiakObject;

/**
 * Response from a GET request for an object with link walking
 */
public interface WalkResponse extends HttpResponse {

    /** @return Whether objects were contained in the response */
    public boolean hasSteps();

    /**
     * @return Steps accumulated from link walking. See RiakClient.walk() for
     *         more information.
     */
    public List<? extends List<? extends RiakObject>> getSteps();
}