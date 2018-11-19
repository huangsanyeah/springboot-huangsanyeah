package com.wonders.other;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description boolean类型不要is开头 同时用封装类不会影响get方法
 * @date Created in 2018-11-19
 * @modifiedBy
 */
public class BooleanDemo {
    private boolean isDeleted;
    private Boolean flagRemoved;

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean getFlagRemoved() {
        return flagRemoved;
    }

    public void setFlagRemoved(Boolean flagRemoved) {
        this.flagRemoved = flagRemoved;
    }
}
