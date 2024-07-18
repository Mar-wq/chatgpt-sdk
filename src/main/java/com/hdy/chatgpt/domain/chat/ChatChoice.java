package com.hdy.chatgpt.domain.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Hdy
 * @description
 * @date 2024/6/11
 */
@Data
public class ChatChoice implements Serializable {

    private long index;
    /** stream = true 请求参数里返回的属性是 delta */
    @JsonProperty("delta")
    private Message delta; // 用于逐步生成的消息片段
    /** stream = false 请求参数里返回的属性是 delta */
    @JsonProperty("message")       // 用于完整的生成消息
    private Message message;
    @JsonProperty("finish_reason")
    private String finishReason;

    private String logprobs;
}
