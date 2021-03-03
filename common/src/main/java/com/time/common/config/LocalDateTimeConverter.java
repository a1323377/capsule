package com.time.common.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
@Component
public class LocalDateTimeConverter extends JsonSerializer<LocalDateTime> {

    /**
     * 将localDateTime以时间戳的形式返回给前端，使用时在对应字段使用@JsonSerializer(using=LocalDateTimeConverter.class)
     *
     * @param localDateTime
     * @param jsonGenerator
     * @param serializerProvider
     * @throws IOException
     */
    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli());
    }
}
