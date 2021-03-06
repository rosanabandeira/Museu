
package com.stetter.dhartmuseum.model;

import com.google.gson.annotations.Expose;


public class Info {

    @Expose
    private String next;
    @Expose
    private Long page;
    @Expose
    private Long pages;
    @Expose
    private Long totalrecords;
    @Expose
    private Long totalrecordsperquery;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Long getTotalrecords() {
        return totalrecords;
    }

    public void setTotalrecords(Long totalrecords) {
        this.totalrecords = totalrecords;
    }

    public Long getTotalrecordsperquery() {
        return totalrecordsperquery;
    }

    public void setTotalrecordsperquery(Long totalrecordsperquery) {
        this.totalrecordsperquery = totalrecordsperquery;
    }

}
