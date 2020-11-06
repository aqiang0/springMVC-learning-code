package com.aqiang.dao;


import com.aqiang.pojo.Books;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books book);
    //根据id删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books book);
    //查询，返回一本书
    Books queryBookById(int id);
    //查询，返回全部书
    List<Books> queryAllBook();
}
