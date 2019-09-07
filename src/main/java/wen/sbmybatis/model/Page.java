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

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(long totalNumber) {
        this.totalNumber = totalNumber;
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }
}
