//package com.server.config.driud;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ResultCodeee {
//    public static final int OK = 0;
//    public static final int FAIL = -1;
//    public static final int ERR = -2;
//
//    private static Map<Integer, String> map;
//
//    static {
//        map = new HashMap<>();
//        //上面定义错误码 ma定义错误信息  下面那个方法一般不咋用
//        map.put(OK, "OK");//穿前端 都有的 外面最好有个接口统一返回类obj的 这个只是异常处理 异常类ex用来做一些特殊异常处理密码加密什么的我打游戏去了你自己理解理解
//        map.put(FAIL, "网络繁忙");
//        map.put(ERR, "系统级错误");
//    }
//
//    public static String getResultInfo(int code) { return map.get(code);}
//}
