package com.hwua.service.impl;

import com.hwua.mapper.NewsMapper;
import com.hwua.pojo.News;
import com.hwua.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public List<News> findALLNews() throws Exception {
        return  newsMapper.findALLNews();
    }

    @Override
    public void updateNews(List<News> list) throws Exception {
        newsMapper.updateNews(list);
    }
}
