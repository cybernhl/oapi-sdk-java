// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.authen.v1.model;

import com.google.gson.annotations.SerializedName;
public class AuthenRefreshAccessTokenReqBody {
    @SerializedName("grant_type")
    private String grantType;
    @SerializedName("refresh_token")
    private String refreshToken;

    public String getGrantType() {
        return this.grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

}