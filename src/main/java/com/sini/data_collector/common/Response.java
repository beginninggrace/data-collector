package com.sini.data_collector.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

    private String msg;
    private T data;

    public static <T> Response<T> ok(T data) {
        return Response.<T>builder()
            .msg("success")
            .data(data)
            .build();
    }

}
