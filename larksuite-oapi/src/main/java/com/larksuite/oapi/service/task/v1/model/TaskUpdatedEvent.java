// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.task.v1.model;
import com.google.gson.annotations.SerializedName;
import com.larksuite.oapi.core.event.model.BaseEventV2;

public class TaskUpdatedEvent extends BaseEventV2{
    @SerializedName("event")
    private TaskUpdatedEventData event;

    public TaskUpdatedEventData getEvent() {
        return this.event;
    }

    public void setEvent(TaskUpdatedEventData event) {
        this.event = event;
    }

}