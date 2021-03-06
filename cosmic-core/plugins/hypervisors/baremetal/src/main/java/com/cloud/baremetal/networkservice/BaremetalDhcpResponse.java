// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//
// Automatically generated by addcopyright.py at 01/29/2013
package com.cloud.baremetal.networkservice;

import com.cloud.baremetal.database.BaremetalDhcpVO;
import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;

import org.apache.cloudstack.api.ApiConstants;
import org.apache.cloudstack.api.BaseResponse;
import org.apache.cloudstack.api.EntityReference;

@EntityReference(value = BaremetalDhcpVO.class)
public class BaremetalDhcpResponse extends BaseResponse {
    @SerializedName(ApiConstants.ID)
    @Param(description = "device id of ")
    private String id;

    @SerializedName(ApiConstants.PHYSICAL_NETWORK_ID)
    @Param(description = "the physical network to which this external dhcp device belongs to")
    private String physicalNetworkId;

    @SerializedName(ApiConstants.PROVIDER)
    @Param(description = "name of the provider")
    private String providerId;

    @SerializedName(ApiConstants.DHCP_SERVER_TYPE)
    @Param(description = "name of the provider")
    private String deviceType;

    @SerializedName(ApiConstants.URL)
    @Param(description = "url")
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhysicalNetworkId() {
        return physicalNetworkId;
    }

    public void setPhysicalNetworkId(String physicalNetworkId) {
        this.physicalNetworkId = physicalNetworkId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
