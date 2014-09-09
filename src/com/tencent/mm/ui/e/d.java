package com.tencent.mm.ui.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class d
  implements Runnable
{
  d(a parama)
  {
  }

  public final void run()
  {
    File localFile = new File(a.bbL());
    if (!localFile.exists())
    {
      z.w("!44@/B4Tb64lLpKt4OWd5OHuPC+IfVrbYXPiiFECu72P1p0=", "summer handler trace file is not exists");
      return;
    }
    if (bg.qW().oD() == 0)
    {
      z.w("!44@/B4Tb64lLpKt4OWd5OHuPC+IfVrbYXPiiFECu72P1p0=", "summer acc not ready ");
      return;
    }
    long l1 = a.d(this.jXI).getLong("handler_report_lastUploadTime", 0L);
    long l2 = System.currentTimeMillis();
    int i;
    if ((l2 - l1 > a.e(this.jXI)) || (l1 > l2))
    {
      i = 1;
      label89: if ((!a.c(this.jXI)) || (i == 0))
        break label263;
      long l3 = localFile.length();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Long.valueOf(l3);
      arrayOfObject[1] = Boolean.valueOf(true);
      z.i("!44@/B4Tb64lLpKt4OWd5OHuPC+IfVrbYXPiiFECu72P1p0=", "summer check need upload ,file size is %d,time out %b", arrayOfObject);
      this.jXI.aC(ak.getContext(), ak.getContext().getPackageName());
      if ((a.f(this.jXI)[1] == 0L) && (a.g(this.jXI) <= 1L))
        break label285;
      if (localFile.length() <= a.h(this.jXI))
        break label265;
      z.e("!44@/B4Tb64lLpKt4OWd5OHuPC+IfVrbYXPiiFECu72P1p0=", "summer log file invaild format");
    }
    while (true)
    {
      a.a(this.jXI, localFile);
      a.i(this.jXI);
      a.j(this.jXI);
      a.d(this.jXI).edit().putLong("handler_report_lastUploadTime", System.currentTimeMillis()).commit();
      return;
      i = 0;
      break label89;
      label263: break;
      label265: String str = a.Dt(a.bbL());
      this.jXI.Dr(str);
    }
    label285: a.k(this.jXI);
  }

  public final String toString()
  {
    return super.toString() + "|checkAndUpload";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.d
 * JD-Core Version:    0.6.2
 */