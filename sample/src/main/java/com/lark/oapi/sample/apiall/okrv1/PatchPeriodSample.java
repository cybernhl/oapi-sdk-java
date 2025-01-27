package com.lark.oapi.sample.apiall.okrv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.okr.v1.model.PatchPeriodReq;
import com.lark.oapi.service.okr.v1.model.PatchPeriodReqBody;
import com.lark.oapi.service.okr.v1.model.PatchPeriodResp;

// PATCH /open-apis/okr/v1/periods/:period_id
public class PatchPeriodSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        PatchPeriodReq req = PatchPeriodReq.newBuilder()
                .periodId("6969864184272078374")
                .patchPeriodReqBody(PatchPeriodReqBody.newBuilder()
                        .status(1)
                        .build())
                .build();

        // 发起请求
        PatchPeriodResp resp = client.okr().v1().period().patch(req);

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
