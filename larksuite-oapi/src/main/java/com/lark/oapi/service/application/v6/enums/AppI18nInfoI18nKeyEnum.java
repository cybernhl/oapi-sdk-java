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

package com.lark.oapi.service.application.v6.enums;

/**
 * 国际化语言的 key
 */
public enum AppI18nInfoI18nKeyEnum {
    ZH_CN("zh_cn"), // 中文
    EN_US("en_us"), // 英文
    JA_JP("ja_jp"), // 日文
    ZH_HK("zh_hk"), // 繁体中文(中国香港)
    ZH_TW("zh_tw"), // 繁体中文(中国台湾)
    ID_ID("id_id"), // 印度尼西亚语
    MS_MY("ms_my"), // 马来语
    DE_DE("de_de"), // 德语
    ES_ES("es_es"), // 西班牙语
    FR_FR("fr_fr"), // 法语
    IT_IT("it_it"), // 意大利语
    PT_BR("pt_br"), // 葡萄牙语(巴西)
    VI_VN("vi_vn"), // 越南语
    RU_RU("ru_ru"), // 俄语
    TH_TH("th_th"), // 泰语
    KO_KR("ko_kr"), // 韩语
    ;
    private String value;

    AppI18nInfoI18nKeyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}