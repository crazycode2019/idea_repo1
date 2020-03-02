package com.hwua.service;

import com.hwua.pojo.News;

import java.util.List;

public interface NewsService {
    public List<News> findALLNews() throws Exception;
    public void updateNews(List<News> list) throws Exception;
}
