package com.lark.oapi.sample.apiall.acsv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.acs.v1.model.CreateVisitorReq;
import com.lark.oapi.service.acs.v1.model.CreateVisitorReqBody;
import com.lark.oapi.service.acs.v1.model.CreateVisitorResp;
import com.lark.oapi.service.acs.v1.model.UserExternal;

// POST /open-apis/acs/v1/visitors
public class CreateVisitorSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        CreateVisitorReq req = CreateVisitorReq.newBuilder()
                .userIdType("user_id")
                .createVisitorReqBody(CreateVisitorReqBody.newBuilder()
                        .user(UserExternal.newBuilder().build())
                        .build())
                .build();

        // 发起请求
        CreateVisitorResp resp = client.acs().v1().visitor().create(req);

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getCode(), resp.getMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}