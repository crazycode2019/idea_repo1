package com.hwua.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hwua.pojo.News;
import com.hwua.service.NewsService;
import com.hwua.service.impl.RedisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private RedisService redisService;
  
    @GetMapping("/findAllNews")
    @ResponseBody
    public String findAllNews() throws Exception{
        String news = redisService.getkey("news");
        if(news==null) {
            List<News> newsList = newsService.findALLNews();
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonStr = objectMapper.writeValueAsString(newsList);
            redisService.setValue("news",jsonStr);
            return jsonStr;
        }else{
            return news;
        }

    }

    public void  aa(){
        System.out.println("hahahahaah");
    }
}
