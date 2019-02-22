package com.github.shixinke.practise.common.common;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shixinke
 * @version 1.0
 * @Description 分页
 * @Date 19-2-22 下午4:39
 */
@Data
public class PageList<T> {
    /**
     * 总条数
     */
    private Long total;
    /**
     * 页码
     */
    private Integer page;
    /**
     * 每页显示数
     */
    private Integer pageSize;
    /**
     * 总页数
     */
    private Integer pages;
    /**
     * 数据列表
     */
    private List<T> list;

    public PageList() {
        this.total = 0L;
        this.page = 1;
        this.pageSize = 10;
        this.pages = 0;
        this.list = new ArrayList<T>(0);
    }

    public PageList(long total, int page, int pageSize, List<T> list) {
        this.total = total;
        this.page = page;
        this.pageSize = pageSize;
        this.pages = calcPages(total, pageSize);
        this.list = list;
    }

    public PageList(long total, int pageSize) {
        this(total, 1, pageSize, new ArrayList<T>(0));
    }

    public PageList(long total, int page, int pageSize) {
        this(total, page, pageSize, new ArrayList<T>(0));
    }

    public static int calcPages(long total, int pageSize) {
        if (total <= pageSize) {
            return 1;
        }
        int remain = (int) (total % pageSize);
        int pages = (int) (total / pageSize);
        if (remain != 0) {
            pages += 1;
        }
        return pages;
    }


}
