package com.nightonke.saver.ui;

import com.nightonke.saver.model.UploadInfo;

import cn.bmob.v3.BmobQuery;



public class MyQuery {

    private int task;
    public BmobQuery<UploadInfo> query;

    public int getTask() {
        return task;
    }

    public void setTask(int task) {
        this.task = task;
    }
}
