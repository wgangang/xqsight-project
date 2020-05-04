package com.xqsight.common.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializableSerializer;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import feign.codec.Decoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;


/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author ganggang.wang
 * @see [相关类/方法]（可选）
 * @since 2020/5/4
 */
@SpringBootConfiguration
public class FeignDecoderConvertConfig {

    @Bean
    public Decoder decoder() {
        return new ResponseEntityDecoder(new SpringDecoder(httpMessageConverter()));
    }

    public ObjectFactory<HttpMessageConverters> httpMessageConverter() {
        return () -> new HttpMessageConverters(getFastJsonConverter());
    }

    private FastJsonHttpMessageConverter getFastJsonConverter() {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(MediaType.APPLICATION_JSON);
        converter.setSupportedMediaTypes(supportedMediaTypes);
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //修改配置返回内容的过滤
        fastJsonConfig.getSerializeConfig().put(JSON.class, new JSONSerializableSerializer());
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteMapNullValue
        );
        converter.setFastJsonConfig(fastJsonConfig);
        return converter;
    }
}
