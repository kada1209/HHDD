package com.hhdd.autotest.utils;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Administrator on 2019/3/19.
 * 工具集
 */

public class UtilVO {
    public static void main(String[] args) throws ParseException {
        UtilVO utilVO = new UtilVO();
        //根据输入时间计算出处于几岁第几周
        utilVO.settingTime("2018-03-10");
        //根据第几岁第几周计算出生日期
        utilVO.shouldTime(6,1);
    }
    /**
     * 根据输入时间计算出处于几岁第几周
     * @param time 输入初始时间
     * @return
     */
    public String settingTime(String time) throws ParseException {
        Date oldTime = null;
        Date nowTime = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        oldTime = simpleDateFormat.parse(time);
        //获取当前时间戳
        nowTime = new Date();
        Long s = nowTime.getTime();
        //得到多少天
        Long currTime = (nowTime.getTime()-oldTime.getTime())/(60*60*24*1000);
        if (currTime>=0){
            int years = (int) (currTime/365);
            int a = (int) ((currTime%365)%7);
            int week =0 ;
            if (a==0){
                week = (int) ((currTime%365)/7);
            }else {
                week = (int) ((currTime%365)/7)+1;
            }

            System.out.println("你到今天是第"+years+"岁，"+"第"+week+"周");
        }

        return null;
    }


    /**
     * 根据年龄计算出生日期
     * @param year 第几年
     * @param week 第几周
     * @return
     */
    public String shouldTime(int year ,int week){
        UtilVO utilVO = new UtilVO();
        int allDays = utilVO.allDays(year,week);
        int days = -allDays;
        Calendar calendar1 = Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        calendar1.add(Calendar.DATE, days);
        String birthday = sdf1.format(calendar1.getTime());
        System.out.println(birthday);
        return  null;

    }

    /**
     * 根据第几岁第几周，算出出生多少天
     * @param year
     * @param week
     * @return
     */
    public int allDays(int year,int week){
        int allDays = 0;
        int yearDays = 0;
        int weekDays = 0;
        weekDays = week * 7;
        if (year%4==0){
            yearDays = year * 366;
            allDays = yearDays + weekDays;
        }else {
            yearDays = year * 365;
            allDays = yearDays + weekDays;
        }
        return  allDays;
    }
}
