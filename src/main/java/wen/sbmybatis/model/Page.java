package wen.sbmybatis.model;

import java.io.Serializable;
import java.util.List;

public class Page<E> implements Serializable {

    private int currentPage = 0;

    private long totalPage;

    private long totalNumber;

    private List<E> list;

    public Page(long totalPage, long totalNumber, List<E> list) {
        this.totalPage = totalPage;
        this.totalNumber = totalNumber;
        this.list = list;
    }
}
