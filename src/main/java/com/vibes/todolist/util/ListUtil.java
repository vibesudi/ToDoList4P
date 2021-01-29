package com.vibes.todolist.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    public static <T> boolean isEmpty(List<T> list) {
        return list == null || list.size() == 0;
    }

    public static <T> List<T> newList() {
        return new ArrayList<T>();
    }

    public static <T> boolean equalSize(List<T> list1, List<T> list2) {
        if (isEmpty(list1) && isEmpty(list2)) {
            return true;
        }

        if (isEmpty(list1) && !isEmpty(list2)) {
            return false;
        }

        if (!isEmpty(list1) && isEmpty(list2)) {
            return false;
        }

        return list1.size() == list2.size();
    }
}
