package com.qimu.qiapibackend.constant;

/**
 * @Author: QiMu
 * @Date: 2023/09/03 11:24:40
 * @Version: 1.0
 * @Description: 电子邮件常量
 */
public interface EmailConstant {

    /**
     * 电子邮件html内容路径
     */
    String EMAIL_HTML_CONTENT_PATH = "email.html";

    /**
     * captcha缓存键
     */
    String CAPTCHA_CACHE_KEY = "api:captcha:";

    /**
     * 电子邮件发件人
     */
    String EMAIL_FROM = "2483482026@qq.com";

    /**
     * 电子邮件主题
     */
    String EMAIL_SUBJECT = "验证码邮件";

    /**
     * 电子邮件标题
     */
    String EMAIL_TITLE = "柒木接口";

    /**
     * 电子邮件标题英语
     */
    String EMAIL_TITLE_ENGLISH = "QiMu-Interface";

    /**
     * 平台负责人
     */
    String PLATFORM_RESPONSIBLE_PERSON = "柒木工作室";

    /**
     * 平台地址
     */
    String PLATFORM_ADDRESS = "<a href='https://api.qimuu.icu/'>请联系我们</a>";
}
