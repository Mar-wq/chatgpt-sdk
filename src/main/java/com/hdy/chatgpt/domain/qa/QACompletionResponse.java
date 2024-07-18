package com.hdy.chatgpt.domain.qa;

import com.hdy.chatgpt.domain.other.Usage;

/**
 * @author Hdy
 * @description
 * @date 2024/6/11
 */
public class QACompletionResponse {
    /** ID */
    private String id;
    /** 对象 */
    private String object;
    /** 模型 */
    private String model;
    /** 对话 */
    private QAChoice[] choices;
    /** 创建 */
    private long created;
    /** 耗材 */
    private Usage usage;
}
