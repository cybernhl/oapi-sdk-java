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

public class ChatMenuTree {
    private static final Logger log = LoggerFactory.getLogger(ChatMenuTree.class);
    private final Config config;

    public ChatMenuTree(Config config) {
        this.config = config;
    }


    /**
     * 添加群菜单，向群内添加群菜单。
     * <p> 注意事项：;- 该API是向群内追加菜单，群内原来存在的菜单并不会被覆盖。操作API后，将返回群内所有菜单。;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)。;- 机器人必须在群里。;- 一个群内，一级菜单最多有3个，每个一级菜单最多有5个二级菜单。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateChatMenuTreeSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateChatMenuTreeSample.java</a> ;
     */
    public CreateChatMenuTreeResp create(CreateChatMenuTreeReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/chats/:chat_id/menu_tree"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        CreateChatMenuTreeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateChatMenuTreeResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/menu_tree"
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
     * 添加群菜单，向群内添加群菜单。
     * <p> 注意事项：;- 该API是向群内追加菜单，群内原来存在的菜单并不会被覆盖。操作API后，将返回群内所有菜单。;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)。;- 机器人必须在群里。;- 一个群内，一级菜单最多有3个，每个一级菜单最多有5个二级菜单。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/create</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateChatMenuTreeSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/CreateChatMenuTreeSample.java</a> ;
     */
    public CreateChatMenuTreeResp create(CreateChatMenuTreeReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/chats/:chat_id/menu_tree"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        CreateChatMenuTreeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateChatMenuTreeResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/menu_tree"
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
     * 删除群菜单。，删除群内菜单。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)。;- 机器人必须在群里。;- 操作API后，将返回群内所有菜单。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteChatMenuTreeSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteChatMenuTreeSample.java</a> ;
     */
    public DeleteChatMenuTreeResp delete(DeleteChatMenuTreeReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/im/v1/chats/:chat_id/menu_tree"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        DeleteChatMenuTreeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteChatMenuTreeResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/menu_tree"
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
     * 删除群菜单。，删除群内菜单。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)。;- 机器人必须在群里。;- 操作API后，将返回群内所有菜单。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/delete">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/delete</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteChatMenuTreeSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/DeleteChatMenuTreeSample.java</a> ;
     */
    public DeleteChatMenuTreeResp delete(DeleteChatMenuTreeReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open-apis/im/v1/chats/:chat_id/menu_tree"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        DeleteChatMenuTreeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteChatMenuTreeResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/menu_tree"
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
     * 获取群内菜单，通过群ID获取群内菜单。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)。;- 机器人必须在群里。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/GetChatMenuTreeSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/GetChatMenuTreeSample.java</a> ;
     */
    public GetChatMenuTreeResp get(GetChatMenuTreeReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/im/v1/chats/:chat_id/menu_tree"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetChatMenuTreeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetChatMenuTreeResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/menu_tree"
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
     * 获取群内菜单，通过群ID获取群内菜单。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)。;- 机器人必须在群里。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/get">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/get</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/GetChatMenuTreeSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/GetChatMenuTreeSample.java</a> ;
     */
    public GetChatMenuTreeResp get(GetChatMenuTreeReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open-apis/im/v1/chats/:chat_id/menu_tree"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        GetChatMenuTreeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetChatMenuTreeResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/menu_tree"
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
     * 排序群菜单，给一个群内的一级菜单排序。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)。;- 机器人必须在群里。;- 操作API后，将返回群内所有菜单。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/sort">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/sort</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/SortChatMenuTreeSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/SortChatMenuTreeSample.java</a> ;
     */
    public SortChatMenuTreeResp sort(SortChatMenuTreeReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/chats/:chat_id/menu_tree/sort"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        SortChatMenuTreeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SortChatMenuTreeResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/menu_tree/sort"
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
     * 排序群菜单，给一个群内的一级菜单排序。
     * <p> 注意事项：;- 应用需要开启[机器人能力](https://open.feishu.cn/document/uAjLw4CM/ugTN1YjL4UTN24CO1UjN/trouble-shooting/how-to-enable-bot-ability)。;- 机器人必须在群里。;- 操作API后，将返回群内所有菜单。 ;
     * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/sort">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/chat-menu_tree/sort</a> ;
     * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/SortChatMenuTreeSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/imv1/SortChatMenuTreeSample.java</a> ;
     */
    public SortChatMenuTreeResp sort(SortChatMenuTreeReq req) throws Exception {
        // 请求参数选项
        RequestOptions reqOptions = new RequestOptions();

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open-apis/im/v1/chats/:chat_id/menu_tree/sort"
                , Sets.newHashSet(AccessTokenType.Tenant)
                , req);

        // 反序列化
        SortChatMenuTreeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SortChatMenuTreeResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/im/v1/chats/:chat_id/menu_tree/sort"
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