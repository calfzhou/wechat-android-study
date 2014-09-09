package com.tencent.mm.network;

import com.tencent.mm.compatible.g.o;
import com.tencent.mm.sdk.a;
import com.tencent.mm.xlog.Xlog;

public class bg
{
  public static void onCreate()
  {
    Xlog.init();
    o.a(a.iCS, bg.class.getClassLoader());
    Java2C.onCreate();
  }

  public static void onDestroy()
  {
    Java2C.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bg
 * JD-Core Version:    0.6.2
 */