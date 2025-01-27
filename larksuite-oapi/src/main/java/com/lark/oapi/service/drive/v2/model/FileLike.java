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

package com.lark.oapi.service.drive.v2.model;

import com.google.gson.annotations.SerializedName;

public class FileLike {
    /**
     * 用户 ID
     * <p> 示例值：ou_3bbe8a09c20e89cce9bff989ed840674
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 用户最后点赞时间，秒级时间戳
     * <p> 示例值：1690857821
     */
    @SerializedName("last_liked_time")
    private String lastLikedTime;
    /**
     * 用户名字，用户信息被脱敏时此值不会返回
     * <p> 示例值：张三
     */
    @SerializedName("user_name")
    private String userName;
    /**
     * 用户英文名字，用户信息被脱敏时此值不会返回
     * <p> 示例值：San Zhang
     */
    @SerializedName("user_en_name")
    private String userEnName;
    /**
     * 用户头像，用户信息被脱敏时此值不会返回
     * <p> 示例值：https://foo.icon.com/xxxx
     */
    @SerializedName("user_avatar_url")
    private String userAvatarUrl;
    /**
     * 用户信息是否脱敏
     * <p> 示例值：false
     */
    @SerializedName("user_is_desensitized")
    private Boolean userIsDesensitized;

    // builder 开始
    public FileLike() {
    }

    public FileLike(Builder builder) {
        /**
         * 用户 ID
         * <p> 示例值：ou_3bbe8a09c20e89cce9bff989ed840674
         */
        this.userId = builder.userId;
        /**
         * 用户最后点赞时间，秒级时间戳
         * <p> 示例值：1690857821
         */
        this.lastLikedTime = builder.lastLikedTime;
        /**
         * 用户名字，用户信息被脱敏时此值不会返回
         * <p> 示例值：张三
         */
        this.userName = builder.userName;
        /**
         * 用户英文名字，用户信息被脱敏时此值不会返回
         * <p> 示例值：San Zhang
         */
        this.userEnName = builder.userEnName;
        /**
         * 用户头像，用户信息被脱敏时此值不会返回
         * <p> 示例值：https://foo.icon.com/xxxx
         */
        this.userAvatarUrl = builder.userAvatarUrl;
        /**
         * 用户信息是否脱敏
         * <p> 示例值：false
         */
        this.userIsDesensitized = builder.userIsDesensitized;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastLikedTime() {
        return this.lastLikedTime;
    }

    public void setLastLikedTime(String lastLikedTime) {
        this.lastLikedTime = lastLikedTime;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEnName() {
        return this.userEnName;
    }

    public void setUserEnName(String userEnName) {
        this.userEnName = userEnName;
    }

    public String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl;
    }

    public Boolean getUserIsDesensitized() {
        return this.userIsDesensitized;
    }

    public void setUserIsDesensitized(Boolean userIsDesensitized) {
        this.userIsDesensitized = userIsDesensitized;
    }

    public static class Builder {
        /**
         * 用户 ID
         * <p> 示例值：ou_3bbe8a09c20e89cce9bff989ed840674
         */
        private String userId;
        /**
         * 用户最后点赞时间，秒级时间戳
         * <p> 示例值：1690857821
         */
        private String lastLikedTime;
        /**
         * 用户名字，用户信息被脱敏时此值不会返回
         * <p> 示例值：张三
         */
        private String userName;
        /**
         * 用户英文名字，用户信息被脱敏时此值不会返回
         * <p> 示例值：San Zhang
         */
        private String userEnName;
        /**
         * 用户头像，用户信息被脱敏时此值不会返回
         * <p> 示例值：https://foo.icon.com/xxxx
         */
        private String userAvatarUrl;
        /**
         * 用户信息是否脱敏
         * <p> 示例值：false
         */
        private Boolean userIsDesensitized;

        /**
         * 用户 ID
         * <p> 示例值：ou_3bbe8a09c20e89cce9bff989ed840674
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 用户最后点赞时间，秒级时间戳
         * <p> 示例值：1690857821
         *
         * @param lastLikedTime
         * @return
         */
        public Builder lastLikedTime(String lastLikedTime) {
            this.lastLikedTime = lastLikedTime;
            return this;
        }


        /**
         * 用户名字，用户信息被脱敏时此值不会返回
         * <p> 示例值：张三
         *
         * @param userName
         * @return
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }


        /**
         * 用户英文名字，用户信息被脱敏时此值不会返回
         * <p> 示例值：San Zhang
         *
         * @param userEnName
         * @return
         */
        public Builder userEnName(String userEnName) {
            this.userEnName = userEnName;
            return this;
        }


        /**
         * 用户头像，用户信息被脱敏时此值不会返回
         * <p> 示例值：https://foo.icon.com/xxxx
         *
         * @param userAvatarUrl
         * @return
         */
        public Builder userAvatarUrl(String userAvatarUrl) {
            this.userAvatarUrl = userAvatarUrl;
            return this;
        }


        /**
         * 用户信息是否脱敏
         * <p> 示例值：false
         *
         * @param userIsDesensitized
         * @return
         */
        public Builder userIsDesensitized(Boolean userIsDesensitized) {
            this.userIsDesensitized = userIsDesensitized;
            return this;
        }


        public FileLike build() {
            return new FileLike(this);
        }
    }
}
