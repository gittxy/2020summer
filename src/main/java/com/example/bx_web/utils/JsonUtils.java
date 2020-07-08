package com.example.bx_web.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {


        public static String putJson(Object object){
            ObjectMapper mapper=new ObjectMapper();
            try{
                return mapper.writeValueAsString(object);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return null;
        }

}
