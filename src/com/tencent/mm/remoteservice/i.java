package com.tencent.mm.remoteservice;

import android.os.Bundle;
import java.lang.reflect.Constructor;

final class i extends g
{
  i(RemoteService paramRemoteService)
  {
  }

  public final void a(String paramString1, String paramString2, Bundle paramBundle, c paramc)
  {
    try
    {
      Class localClass = this.iBb.getClassLoader().loadClass(paramString1);
      Constructor[] arrayOfConstructor = localClass.getConstructors();
      Object[] arrayOfObject;
      if (arrayOfConstructor.length > 0)
      {
        arrayOfObject = new Object[arrayOfConstructor[0].getParameterTypes().length];
        arrayOfObject[0] = null;
      }
      for (a locala = (a)arrayOfConstructor[0].newInstance(arrayOfObject); ; locala = (a)localClass.newInstance())
      {
        locala.ibx = paramc;
        locala.ibw = this.iBb;
        locala.onCallback(paramString2, paramBundle, false);
        return;
      }
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.i
 * JD-Core Version:    0.6.2
 */