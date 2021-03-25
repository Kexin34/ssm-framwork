package com.kexin.service;

import com.kexin.dao.BookMapper;
import com.kexin.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class BookServiceImpl implements BookService {

    // service业务层调用dao层：组合dao
    private BookMapper bookMapper;

    // 设置一个set接口，方便Spring管理
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
