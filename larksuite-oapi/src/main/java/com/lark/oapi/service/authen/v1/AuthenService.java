// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.authen.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.authen.v1.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class AuthenService {
    private static final Logger log = LoggerFactory.getLogger(AuthenService.class);
    private final AccessToken accessToken; // access_token
    private final RefreshAccessToken refreshAccessToken; // refresh_access_token
    private final UserInfo userInfo; // user_info

    public AuthenService(Config config) {
        this.accessToken = new AccessToken(config);
        this.refreshAccessToken = new RefreshAccessToken(config);
        this.userInfo = new UserInfo(config);
    }

    /**
     * access_token
     *
     * @return
     */
    public AccessToken accessToken() {
        return accessToken;
    }

    /**
     * refresh_access_token
     *
     * @return
     */
    public RefreshAccessToken refreshAccessToken() {
        return refreshAccessToken;
    }

    /**
     * user_info
     *
     * @return
     */
    public UserInfo userInfo() {
        return userInfo;
    }

    public static class AccessToken {
        private final Config config;

        public AccessToken(Config config) {
            this.config = config;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=authen&resource=access_token&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=authen&resource=access_token&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/CreateAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/CreateAccessTokenSample.java</a> ;
         */
        public CreateAccessTokenResp create(CreateAccessTokenReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/authen/v1/access_token"
                    , Sets.newHashSet(AccessTokenType.App)
                    , req);

            // 反序列化
            CreateAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/authen/v1/access_token"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=authen&resource=access_token&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=authen&resource=access_token&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/CreateAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/CreateAccessTokenSample.java</a> ;
         */
        public CreateAccessTokenResp create(CreateAccessTokenReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/authen/v1/access_token"
                    , Sets.newHashSet(AccessTokenType.App)
                    , req);

            // 反序列化
            CreateAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/authen/v1/access_token"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }
    }

    public static class RefreshAccessToken {
        private final Config config;

        public RefreshAccessToken(Config config) {
            this.config = config;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=authen&resource=refresh_access_token&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=authen&resource=refresh_access_token&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/CreateRefreshAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/CreateRefreshAccessTokenSample.java</a> ;
         */
        public CreateRefreshAccessTokenResp create(CreateRefreshAccessTokenReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/authen/v1/refresh_access_token"
                    , Sets.newHashSet(AccessTokenType.App)
                    , req);

            // 反序列化
            CreateRefreshAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateRefreshAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/authen/v1/refresh_access_token"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=authen&resource=refresh_access_token&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=create&project=authen&resource=refresh_access_token&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/CreateRefreshAccessTokenSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/CreateRefreshAccessTokenSample.java</a> ;
         */
        public CreateRefreshAccessTokenResp create(CreateRefreshAccessTokenReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/authen/v1/refresh_access_token"
                    , Sets.newHashSet(AccessTokenType.App)
                    , req);

            // 反序列化
            CreateRefreshAccessTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateRefreshAccessTokenResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/authen/v1/refresh_access_token"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }
    }

    public static class UserInfo {
        private final Config config;

        public UserInfo(Config config) {
            this.config = config;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=authen&resource=user_info&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=authen&resource=user_info&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/GetUserInfoSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/GetUserInfoSample.java</a> ;
         */
        public GetUserInfoResp get(RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                    , "/open-apis/authen/v1/user_info"
                    , Sets.newHashSet(AccessTokenType.User)
                    , null);

            // 反序列化
            GetUserInfoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserInfoResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/authen/v1/user_info"
                        , Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));

                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=authen&resource=user_info&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=get&project=authen&resource=user_info&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/GetUserInfoSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/authenv1/GetUserInfoSample.java</a> ;
         */
        public GetUserInfoResp get() throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                    , "/open-apis/authen/v1/user_info"
                    , Sets.newHashSet(AccessTokenType.User)
                    , null);

            // 反序列化
            GetUserInfoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserInfoResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/authen/v1/user_info"
                        , Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));

                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            return resp;
        }
    }

}