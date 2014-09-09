package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class v extends cm
{
  v(u paramu, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    ak.getContext().getSharedPreferences("notify_prep", 0).edit().putBoolean("longNoopIntervalFlag", true).commit();
    try
    {
      if (paramMessage.what == 1)
      {
        u.a(this.diD, u.a(this.diD), u.b(this.diD), u.c(this.diD), u.d(this.diD), true);
        return;
      }
      u.a(this.diD, u.a(this.diD), u.b(this.diD), u.c(this.diD), u.d(this.diD), false);
      return;
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localException.getMessage();
      arrayOfObject[1] = localException.getStackTrace();
      z.e("!32@/B4Tb64lLpJmD2NiAVxmvhwfS3ubub4R", "dealNotify failed ! msg:%s, trace: %s", arrayOfObject);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.v
 * JD-Core Version:    0.6.2
 */