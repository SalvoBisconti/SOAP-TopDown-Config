package com.advancia.stage.service;

import in.benchresources.entity.book.BookRequestType;
import in.benchresources.entity.book.BookResponseType;
import org.example.bookservice.IBookService;

import javax.jws.WebService;

@WebService(
    serviceName = "BookService", 
    endpointInterface = "org.example.bookservice.IBookService",
    targetNamespace = "http://example.org/services/BookService/", 
    portName = "BookServicePort", 
    name = "BookServiceImpl"
)
public class BookServiceImpl implements IBookService {

    @Override
    public BookResponseType getBookByISDNRequestNumber(BookRequestType parameters) {
        // Create object of BookResponseType and set values
        BookResponseType bookResponseType = new BookResponseType();
        bookResponseType.setBookISBN(parameters.getIsbnNumber());
        bookResponseType.setBookName("Microbiology Study");
        bookResponseType.setAuthor("T. Devasena");
        bookResponseType.setCategory("Microbiology");
        
        return bookResponseType;
    }
}

