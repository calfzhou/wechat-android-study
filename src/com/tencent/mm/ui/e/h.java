package com.tencent.mm.ui.e;

import android.content.Context;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class h
  implements Runnable
{
  h(f paramf)
  {
  }

  public final void run()
  {
    File localFile = new File(f.bbP() + "MMSQL.trace");
    if (!localFile.exists())
    {
      z.w("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "SqlTrace file is not  exists");
      return;
    }
    if (bg.qW().oD() == 0)
    {
      z.w("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "acc not ready ");
      return;
    }
    long l1 = System.currentTimeMillis();
    long l2 = f.cH(ak.getContext());
    boolean bool;
    if (l2 > l1)
      bool = true;
    while (true)
    {
      long l3 = localFile.length();
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Long.valueOf(l3);
      arrayOfObject1[1] = Boolean.valueOf(bool);
      z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "check need upload ,file size is %d,time out  %b", arrayOfObject1);
      if ((!bool) || (l3 <= 10240L))
        break;
      this.jXU.aC(ak.getContext(), ak.getContext().getPackageName());
      if ((f.f(this.jXU)[1] != 0L) || (f.g(this.jXU) > 1L))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Long.valueOf(localFile.length());
        z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "start file upload ,file length is %d ", arrayOfObject2);
        if (localFile.length() > f.h(this.jXU))
          z.e("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "log file invaild format");
        while (true)
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Long.valueOf(System.currentTimeMillis());
          z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "set last Upload Time %d ", arrayOfObject3);
          f.a(this.jXU, localFile);
          f.i(this.jXU);
          f.j(this.jXU);
          f.j(ak.getContext(), System.currentTimeMillis());
          return;
          if (l1 - l2 > 86400000L)
          {
            bool = true;
            break;
          }
          if ((l1 - l2 <= f.e(this.jXU)) || (!f.d(this.jXU)))
            break label394;
          bool = true;
          break;
          String str = f.Du(f.bbP() + "MMSQL.trace");
          z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "read content success");
          this.jXU.Dr(str);
        }
      }
      z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "wait for get packageStats");
      f.k(this.jXU);
      return;
      label394: bool = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.h
 * JD-Core Version:    0.6.2
 */