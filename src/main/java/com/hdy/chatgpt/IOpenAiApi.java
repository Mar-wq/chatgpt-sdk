package com.hdy.chatgpt;

import com.hdy.chatgpt.domain.chat.ChatCompletionRequest;
import com.hdy.chatgpt.domain.chat.ChatCompletionResponse;
import com.hdy.chatgpt.domain.qa.QACompletionRequest;
import com.hdy.chatgpt.domain.qa.QACompletionResponse;
import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IOpenAiApi {
    String v1_completions = "v1/completions";
    /**
     * 文本问答
     * @param qaCompletionRequest 请求信息
     * @return
     */
    @POST("v1/completions")
    Single<QACompletionResponse> completions(@Body QACompletionRequest qaCompletionRequest);

    /**
     * 默认 GPT-3.5 问答模型
     * @param chatCompletionRequest 请求信息
     * @return                      返回结果
     */
    @POST("v1/chat/completions")
    Single<ChatCompletionResponse> completions(@Body ChatCompletionRequest chatCompletionRequest);
}
