package com.listit.models;

import java.util.ArrayList;


/**
 * Created by gurudattkulkarni on 19/11/15.
 */
public class ListItemCollection {
    private static ArrayList<ListItem> todoList = new ArrayList<>();

    public static ArrayList<ListItem> getTodoList() {
        if (todoList != null)
            return todoList;
        else
            return todoList = new ArrayList<>();
    }

    public static boolean addItem(ListItem item) {
        return item != null && todoList.add(item);
    }

    public static ListItem updateListItem(int key, ListItem item) {
        if (item != null)
            return todoList.set(key, item);
        else
            return null;
    }

    public static ListItem removeListItem(int key) {
        if (key > -1) {
            return todoList.remove(key);
        } else {
            return null;
        }
    }

    //TODO Implement sortByCreationDate method
    public static ArrayList<ListItem> sortByCreationDate(String order) {
        if (order != null) {
            if (order.toLowerCase().equals("asc")) {
                return todoList;
            } else if (order.toLowerCase().equals("desc")) {
                return todoList;
            }
        }
        return todoList;
    }
}
