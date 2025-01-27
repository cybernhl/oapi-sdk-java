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

package com.lark.oapi.service.im.v1.resource;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.im.v1.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class ChatTab {
    private static final Logger log = LoggerFactory.getLogger(ChatTab.class);
    private final Config config;

    public ChatTab(Config config) {
        this.config = config;
    }


    /**
     * 添加会话标签页，添加自定义会话标签页。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability);- 机器人或授权用户必须在群里;- 只允许添加类型为`doc`和`url`的会话标签页;- 添加doc类型时，操作者（access token对应的身份）需要拥有对应文档的权限;- tab_config字段当前只对`url`类型的会话标签页生效;- 在开启 ==仅群主和管理员可管理标签页== 的设置时，仅群主和群管理员可以添加会话标签页;- 操作内部群时，操作者须与群组在同一租户下 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateChatTabSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateChatTabSample.java</a> ;
     */
    public CreateChatTabResp create(CreateChatTabReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/chats/:chat_id/chat_tabs"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CreateChatTabResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateChatTabResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/chat_tabs"
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
     * 添加会话标签页，添加自定义会话标签页。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability);- 机器人或授权用户必须在群里;- 只允许添加类型为`doc`和`url`的会话标签页;- 添加doc类型时，操作者（access token对应的身份）需要拥有对应文档的权限;- tab_config字段当前只对`url`类型的会话标签页生效;- 在开启 ==仅群主和管理员可管理标签页== 的设置时，仅群主和群管理员可以添加会话标签页;- 操作内部群时，操作者须与群组在同一租户下 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateChatTabSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateChatTabSample.java</a> ;
     */
    public CreateChatTabResp create(CreateChatTabReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/chats/:chat_id/chat_tabs"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        CreateChatTabResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateChatTabResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/chat_tabs"
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
     * 删除会话标签页，删除会话标签页。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability);- 机器人或授权用户必须在群里;- 只允许删除类型为`doc`和`url`的会话标签页;- 在开启 ==仅群主和管理员可管理标签页== 的设置时，仅群主和群管理员可以删除会话标签页;- 操作内部群时，操作者须与群组在同一租户下 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/delete_tabs">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/delete_tabs</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteTabsChatTabSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteTabsChatTabSample.java</a> ;
     */
    public DeleteTabsChatTabResp deleteTabs(DeleteTabsChatTabReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/im/v1/chats/:chat_id/chat_tabs/delete_tabs"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        DeleteTabsChatTabResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteTabsChatTabResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/chat_tabs/delete_tabs"
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
     * 删除会话标签页，删除会话标签页。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability);- 机器人或授权用户必须在群里;- 只允许删除类型为`doc`和`url`的会话标签页;- 在开启 ==仅群主和管理员可管理标签页== 的设置时，仅群主和群管理员可以删除会话标签页;- 操作内部群时，操作者须与群组在同一租户下 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/delete_tabs">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/delete_tabs</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteTabsChatTabSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteTabsChatTabSample.java</a> ;
     */
    public DeleteTabsChatTabResp deleteTabs(DeleteTabsChatTabReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/im/v1/chats/:chat_id/chat_tabs/delete_tabs"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        DeleteTabsChatTabResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteTabsChatTabResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/chat_tabs/delete_tabs"
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
     * 拉取会话标签页，拉取会话标签页。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability);- 机器人或授权用户必须在群里;- 操作内部群时，操作者须与群组在同一租户下 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/list_tabs">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/list_tabs</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListTabsChatTabSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListTabsChatTabSample.java</a> ;
     */
    public ListTabsChatTabResp listTabs(ListTabsChatTabReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/im/v1/chats/:chat_id/chat_tabs/list_tabs"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        ListTabsChatTabResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListTabsChatTabResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/chat_tabs/list_tabs"
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
     * 拉取会话标签页，拉取会话标签页。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability);- 机器人或授权用户必须在群里;- 操作内部群时，操作者须与群组在同一租户下 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/list_tabs">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/list_tabs</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListTabsChatTabSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/ListTabsChatTabSample.java</a> ;
     */
    public ListTabsChatTabResp listTabs(ListTabsChatTabReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/im/v1/chats/:chat_id/chat_tabs/list_tabs"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        ListTabsChatTabResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListTabsChatTabResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/chat_tabs/list_tabs"
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
     * 会话标签页排序，会话标签页排序。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability);- 机器人或授权用户必须在群里;- 消息标签页强制固定为第一顺位，不参与排序，但是请求体中必须包含该标签页的Tab ID;- 操作内部群时，操作者须与群组在同一租户下 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/sort_tabs">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/sort_tabs</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/SortTabsChatTabSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/SortTabsChatTabSample.java</a> ;
     */
    public SortTabsChatTabResp sortTabs(SortTabsChatTabReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/chats/:chat_id/chat_tabs/sort_tabs"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        SortTabsChatTabResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SortTabsChatTabResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/chat_tabs/sort_tabs"
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
     * 会话标签页排序，会话标签页排序。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability);- 机器人或授权用户必须在群里;- 消息标签页强制固定为第一顺位，不参与排序，但是请求体中必须包含该标签页的Tab ID;- 操作内部群时，操作者须与群组在同一租户下 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/sort_tabs">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/sort_tabs</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/SortTabsChatTabSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/SortTabsChatTabSample.java</a> ;
     */
    public SortTabsChatTabResp sortTabs(SortTabsChatTabReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/chats/:chat_id/chat_tabs/sort_tabs"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        SortTabsChatTabResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SortTabsChatTabResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/chat_tabs/sort_tabs"
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
     * 更新会话标签页，更新会话标签页
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability);- 机器人或授权用户必须在群里;- 只允许更新类型为`doc`和`url`的会话标签页;- 更新doc类型时，操作者（access token对应的身份）需要拥有对应文档的权限;- 在开启 ==仅群主和管理员可管理标签页== 的设置时，仅群主和群管理员可以更新会话标签页;- 操作内部群时，操作者须与群组在同一租户下 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/update_tabs">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/update_tabs</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/UpdateTabsChatTabSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/UpdateTabsChatTabSample.java</a> ;
     */
    public UpdateTabsChatTabResp updateTabs(UpdateTabsChatTabReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/chats/:chat_id/chat_tabs/update_tabs"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        UpdateTabsChatTabResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateTabsChatTabResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/chat_tabs/update_tabs"
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
     * 更新会话标签页，更新会话标签页
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability);- 机器人或授权用户必须在群里;- 只允许更新类型为`doc`和`url`的会话标签页;- 更新doc类型时，操作者（access token对应的身份）需要拥有对应文档的权限;- 在开启 ==仅群主和管理员可管理标签页== 的设置时，仅群主和群管理员可以更新会话标签页;- 操作内部群时，操作者须与群组在同一租户下 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/update_tabs">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-tab/update_tabs</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/UpdateTabsChatTabSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/UpdateTabsChatTabSample.java</a> ;
     */
    public UpdateTabsChatTabResp updateTabs(UpdateTabsChatTabReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/chats/:chat_id/chat_tabs/update_tabs"
                , Sets.newHashSet(AccessTokenType.Tenant, AccessTokenType.User)
                , req);

        // 反序列化
        UpdateTabsChatTabResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateTabsChatTabResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/chat_tabs/update_tabs"
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
