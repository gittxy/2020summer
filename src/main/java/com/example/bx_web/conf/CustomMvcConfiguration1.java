
package com.example.bx_web.conf;
/*
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.sss.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.List;

@Configuration
@EnableWebMvc
public class CustomMvcConfiguration1 implements WebMvcConfigurer {
    @Override

    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter mjmc = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        DeserializationConfig dc = objectMapper.getDeserializationConfig();
        // 设置反序列化日期格式、忽略不存在get、set的属性
        objectMapper.setConfig(dc.with(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mjmc.setObjectMapper(objectMapper);

        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        converters.add(converter);

    }
}

*/
