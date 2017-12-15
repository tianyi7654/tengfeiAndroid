package com.inca.administrator.opensourcelibrary.http;


/**
 * 首先会验证token是否过期/失效,
 * 如果过期/失效会进入登录页面登录
 */
public abstract class TFFailuredListener {

    private TFIViewController viewController;

    public TFFailuredListener(){}

    public TFIViewController getViewController(){
        return viewController;
    }

    public TFFailuredListener(TFIViewController pViewController){
        viewController = pViewController;
    }

    /**
     * 预处理,
     * @param msg
     * @param errorCode
     */
    public void handleResponse(String msg , int errorCode){
        boolean isNeedLogin = preRespone(msg , errorCode);
        if (isNeedLogin){
            //去登陆
            if(viewController != null){
                viewController.gotoLoginPage();
                onRespone(msg , errorCode);
            }else{
                onRespone(msg , errorCode);
            }
        }else{
            onRespone(msg , errorCode);
        }
    }

    public abstract void onRespone(String msg , int errorCode);

    public boolean preRespone(String msg , int errorCode){
     if (errorCode==404){
         return true;
     }
        return false;
    }

}
