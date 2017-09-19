package com.zjhc.mytest_one.dao.base;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18 0018.
 */
public interface BaseDao<T> {

    public Boolean insert(T var);

    public Boolean delete(T var);

    public Boolean update(T var);

    public List<T> select(T var);


}
