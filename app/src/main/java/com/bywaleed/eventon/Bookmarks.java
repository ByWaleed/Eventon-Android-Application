package com.bywaleed.eventon;

import android.util.Log;

import java.util.ArrayList;

public class Bookmarks {

    private ArrayList<Event> bookmarks = new ArrayList<>(0);

    public Bookmarks() {
    }

    public ArrayList<Event> getBookmarks() {
        return bookmarks;
    }

    public void addBookmark(Event event) {
        bookmarks.add(event);
    }

    public boolean removeBookmark(Integer eventArrayPosition) {
        if (eventArrayPosition >= 0) {
            bookmarks.remove(0);
            return true;
        }
        return false;
    }

    public Integer bookmarked(Event event){
        if (bookmarks.size() > 0) {
            Integer position = 0;
            for (Event current : bookmarks) {
                Log.i("Bookmarks", "bookmarked: " + current.getTitle());
                if (current.getTitle().equals(event.getTitle())) {
                    Log.d("Bookmarks", "bookmarked: Found " + current.getTitle());
                    return position;
                }
                position++;
            }
        }
        return -1;
    }

    public int numberOfBookmarks() {
        return bookmarks.size();
    }
}