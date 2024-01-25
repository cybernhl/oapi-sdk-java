package com.lark.oapi.sample.apiall.corehrv2;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.corehr.v2.model.ParentsDepartmentReq;
import com.lark.oapi.service.corehr.v2.model.ParentsDepartmentReqBody;
import com.lark.oapi.service.corehr.v2.model.ParentsDepartmentResp;

// POST /open-apis/corehr/v2/departments/parents
public class ParentsDepartmentSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        ParentsDepartmentReq req = ParentsDepartmentReq.newBuilder()
                .departmentIdType("open_department_id")
                .parentsDepartmentReqBody(ParentsDepartmentReqBody.newBuilder()
                        .departmentIdList(new String[]{})
                        .build())
                .build();

        // 发起请求
        ParentsDepartmentResp resp = client.corehr().v2().department().parents(req);

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