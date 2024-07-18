package com.hdy.chatgpt.domain.qa;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Hdy
 * @description
 * @date 2024/6/11
 */
public class QAChoice {
    private long index;
    private String text;
    private Object logprobs;
    @JsonProperty("finish_reason")
    private String finishReason;

}
