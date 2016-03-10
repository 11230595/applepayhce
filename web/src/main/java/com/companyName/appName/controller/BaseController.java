package com.companyName.appName.controller;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by peter on 2016/1/29.
 */
public class BaseController {
    private final Logger logger = LoggerFactory.getLogger(BaseController.class);
    private static Gson gson=new Gson();
    public void writeJson(HttpServletResponse response,Object object){
        try {
            response.setContentType("text/html; charset=utf-8");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().print(gson.toJson(object));
        }catch (IOException io){
            logger.error(io.getMessage(),io);
        }
    }
}
