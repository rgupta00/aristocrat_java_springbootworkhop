package com.productapp.demo.service;

import com.productapp.demo.dao.BookDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

//How to configure mockito + junit5
@ExtendWith(MockitoExtension.class)
class BookServiceImplTest {

    @InjectMocks
    private BookServiceImpl bookService;

    @Mock
    private BookDao bookDao;

    @BeforeEach
    void setUp() {
        List<String> books= Arrays.asList("java","rich dad poor dad","java adv");
        when(bookDao.getBooks()).thenReturn(books);
    }

    @Test
    void TestGetBooks() {
        List<String> books=bookService.getBooks("java");
        assertEquals(2,books.size());
    }

    @AfterEach
    void tearDown() {
    }


}