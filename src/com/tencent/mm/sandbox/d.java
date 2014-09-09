package com.tencent.mm.sandbox;

import android.os.Process;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  private static d iBc = null;
  private static Map iBd = new HashMap();

  public static void f(int paramInt, Object paramObject)
  {
    String str = "regLifeCycle, id=" + paramInt + ", class=%s";
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject.getClass().getName();
    z.i("!32@/B4Tb64lLpIbcv7LUFwb8ff/9fEzhTkE", str, arrayOfObject);
    iBd.put(Integer.valueOf(paramInt), Boolean.valueOf(true));
    z.i("!32@/B4Tb64lLpIbcv7LUFwb8ff/9fEzhTkE", "regLifeCycle, map size=" + iBd.size());
  }

  public static void g(int paramInt, Object paramObject)
  {
    String str = "unregLifeCycle, id=" + paramInt + ", class=%s";
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramObject.getClass().getName();
    z.i("!32@/B4Tb64lLpIbcv7LUFwb8ff/9fEzhTkE", str, arrayOfObject);
    iBd.remove(Integer.valueOf(paramInt));
    z.i("!32@/B4Tb64lLpIbcv7LUFwb8ff/9fEzhTkE", "unregLifeCycle, map size=" + iBd.size());
    if (iBd.size() == 0)
    {
      Process.killProcess(Process.myPid());
      z.w("!32@/B4Tb64lLpIbcv7LUFwb8ff/9fEzhTkE", "Sandbox exit Now.");
      z.appenderFlushSync();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.d
 * JD-Core Version:    0.6.2
 */