package com.tnc.service.adapters;

import java.util.List;

public class ListDto<T> {

    private Integer count;
    private List<?> objectList;

    public ListDto(Integer count, List<?> objectList) {
        this.count = count;
        this.objectList = objectList;
    }

    public Integer getCount() {
        return count;
    }

    public ListDto<T> setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<?> getObjectList() {
        return objectList;
    }

    public ListDto<T> setObjectList(List<?> objectList) {
        this.objectList = objectList;
        return this;
    }
}
