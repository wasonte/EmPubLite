package com.commonsware.empublite;

import java.util.List;

/**
 * Created by jorge.alcolea on 13/04/2016.
 */
public class BookContents {

    String title;
    List<Chapter> chapters;

    String getTitle(){
        return title;
    }

    String getChapterFile(int position){
        return chapters.get(position).file;
    }

    int getChapterCount() {
        return chapters.size();
    }


    static class Chapter {
        String file;
        String title;
    }
}
