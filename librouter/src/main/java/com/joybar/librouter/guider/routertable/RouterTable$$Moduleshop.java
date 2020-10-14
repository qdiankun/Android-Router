package com.joybar.librouter.guider.routertable;

import com.joybar.librouter.guider.routerguider.RouterGuider;
import java.lang.Integer;
import java.lang.String;

public final class RouterTable$$Moduleshop {
  public static RouterGuider launchFinishWithResult() {
    // This class was generated automatically 2020-10-14 14:06:17
    // module=shop,path=finish_with_result
    RouterGuider routerGuider =  new RouterGuider("shop", "finish_with_result");
    return routerGuider;
  }

  public static RouterGuider launchMain() {
    // This class was generated automatically 2020-10-14 14:06:18
    // module=shop,path=main
    RouterGuider routerGuider =  new RouterGuider("shop", "main");
    return routerGuider;
  }

  public static RouterGuider launchReceiveParam(String address) {
    // This class was generated automatically 2020-10-14 14:06:18
    // module=shop,path=receive_param
    RouterGuider routerGuider =  new RouterGuider("shop", "receive_param");
    routerGuider.withString("address", address);
    return routerGuider;
  }

  public static RouterGuider launchReceiveParam(String name, Integer id) {
    // This class was generated automatically 2020-10-14 14:06:18
    // module=shop,path=receive_param
    RouterGuider routerGuider =  new RouterGuider("shop", "receive_param");
    routerGuider.withString("name", name);
    routerGuider.withInt("id", id);
    return routerGuider;
  }
}
