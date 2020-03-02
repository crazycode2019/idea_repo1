package com.hwua.mapper;

import com.hwua.pojo.News;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface NewsMapper {
    public List<News> findALLNews() throws Exception;
    public void updateNews(List<News> list) throws Exception;
}
