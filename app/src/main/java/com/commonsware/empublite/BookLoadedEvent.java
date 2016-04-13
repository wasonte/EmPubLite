package com.commonsware.empublite;

/**
 * Created by jorge.alcolea on 13/04/2016.
 */
public class BookLoadedEvent {

    private BookContents contents = null;

    public BookLoadedEvent(BookContents contents){
        this.contents = contents;
    }

    public BookContents getBook(){
        return contents;
    }
}
