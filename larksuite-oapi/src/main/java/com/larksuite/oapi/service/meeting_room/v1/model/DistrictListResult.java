// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.meeting_room.v1.model;
import com.google.gson.annotations.SerializedName;

public class DistrictListResult {
    @SerializedName("districts")
    private District[] districts;

    public District[] getDistricts() {
        return this.districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

}