package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.ListByIdJobRequirementReq;
import com.lark.oapi.service.hire.v1.model.ListByIdJobRequirementReqBody;
import com.lark.oapi.service.hire.v1.model.ListByIdJobRequirementResp;

// POST /open-apis/hire/v1/job_requirements/search
public class ListByIdJobRequirementSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        ListByIdJobRequirementReq req = ListByIdJobRequirementReq.newBuilder()
                .userIdType("open_id")
                .departmentIdType("open_department_id")
                .jobLevelIdType("people_admin_job_level_id")
                .jobFamilyIdType("people_admin_job_category_id")
                .employeeTypeIdType("people_admin_employee_type_id")
                .listByIdJobRequirementReqBody(ListByIdJobRequirementReqBody.newBuilder()
                        .idList(new String[]{})
                        .build())
                .build();

        // 发起请求
        ListByIdJobRequirementResp resp = client.hire().v1().jobRequirement().listById(req);

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
