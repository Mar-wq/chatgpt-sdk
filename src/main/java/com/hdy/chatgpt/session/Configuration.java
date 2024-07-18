package com.hdy.chatgpt.session;

import com.hdy.chatgpt.IOpenAiApi;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSources;
import org.jetbrains.annotations.NotNull;

/**
 * @author Hdy
 * @description
 * @date 2024/6/11
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configuration {
    @Getter
    @Setter
    private IOpenAiApi openAiApi;

    @Getter
    @Setter
    private OkHttpClient okHttpClient;

    @Getter
    @NotNull
    private String apiKey;

    @Getter
    private String apiHost;

    @Getter
//    @NotNull
    private String authToken;

    public EventSource.Factory createRequestFactory() {

        return EventSources.createFactory(okHttpClient);
    }

}
