package com.tencent.mm.modelfriend;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Random;

final class a extends cm
{
  a(Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    z.i("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "time's up, start");
    Context localContext = (Context)paramMessage.obj;
    if (AddrBookObserver.vn() == null)
    {
      AddrBookObserver.c(new Intent());
      AddrBookObserver.vn().setClass(localContext, AddrBookObserver.AddrBookService.class);
    }
    float f = new Random(System.currentTimeMillis()).nextFloat();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Float.valueOf(f);
    z.i("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", "handlemessage session:%f", arrayOfObject);
    AddrBookObserver.vn().putExtra(AddrBookObserver.AddrBookService.dsG, f);
    try
    {
      localContext.startService(AddrBookObserver.vn());
      AddrBookObserver.vo();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        z.printErrStackTrace("!44@/B4Tb64lLpKsaaaeu1U1LiDGJh8a1cNtheqJurwgkrQ=", localException, "startService failed", new Object[0]);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.a
 * JD-Core Version:    0.6.2
 */