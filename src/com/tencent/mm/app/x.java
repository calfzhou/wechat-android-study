package com.tencent.mm.app;

import android.content.Context;
import com.tencent.mm.booter.notification.a.m;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.w;

final class x
  implements w
{
  x(WorkerProfile paramWorkerProfile)
  {
  }

  public final String a(int paramInt1, String paramString1, String paramString2, int paramInt2, Context paramContext)
  {
    return m.a(paramInt1, paramString1, paramString2, paramInt2, paramContext);
  }

  public final void a(ar paramar, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean)
  {
    m.b(paramar, paramPString1, paramPString2, paramPInt, paramBoolean);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.x
 * JD-Core Version:    0.6.2
 */