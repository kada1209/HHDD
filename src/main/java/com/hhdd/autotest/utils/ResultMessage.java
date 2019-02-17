package com.hhdd.autotest.utils;

/**
 * Created by Administrator on 2019/1/16.
 */

import java.io.Serializable;
public class ResultMessage implements Serializable {

    private static final long serialVersionUID = 9206089273374909697L;

    private int status; //返回状态码  成功 200
    private String msg; //返回信息
    private Object data; //返回数据

    /**
     * 构造方法  没有返回数据
     * ResultMessage.
     * @param status
     * @param msg
     */
    public ResultMessage(int status,String msg) {
        this.status = status;
        this.msg = msg;
    }
    /**
     * 	有返回数据
     * ResultMessage.
     * @param status
     * @param msg
     * @param data
     */
    public ResultMessage(int status,String msg,Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    /**
     * 成功返回 不带自定义的msg
     * @Title: isSuccess
     * @Description: TODO
     * @param @return
     * @return ResultMessage
     * @throws
     */
    public static ResultMessage isSuccess() {
        return new ResultMessage(200,"操作成功");
    }
    /**
     * 成功返回 带自定义的msg
     * @Title: isSuccess
     * @Description: TODO
     * @param @return
     * @return ResultMessage
     * @throws
     */
    public static ResultMessage isSuccess(String msg) {
        return new ResultMessage(200,msg);
    }

    /**
     * 失败返回 不带自定义的msg
     * @Title: isSuccess
     * @Description: TODO
     * @param @return
     * @return ResultMessage
     * @throws
     */
    public static ResultMessage isFail() {
        return new ResultMessage(100,"操作失败");
    }
    /**
     * 失败返回 带自定义的msg
     * @Title: isSuccess
     * @Description: TODO
     * @param @return
     * @return ResultMessage
     * @throws
     */
    public static ResultMessage isFail(String msg) {
        return new ResultMessage(100,msg);
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

}
