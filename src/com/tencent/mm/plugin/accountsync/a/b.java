package com.tencent.mm.plugin.accountsync.a;

import android.content.Context;
import android.os.Looper;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cr;

public final class b
  implements m, com.tencent.mm.o.n
{
  private x cDg;
  private Context context;
  private cr dWq;
  private e dWr;
  private cm gQj = new cm(Looper.getMainLooper());

  private b(Context paramContext, e parame)
  {
    this.context = paramContext;
    this.dWr = parame;
  }

  public static b a(Context paramContext, e parame)
  {
    b localb = new b(paramContext, parame);
    bg.qX().a(37, localb);
    bg.qX().a(38, localb);
    localb.cDg = a.dWp.a(localb);
    bg.qX().d(localb.cDg);
    Context localContext = localb.context;
    localb.context.getString(com.tencent.mm.n.buo);
    localb.dWq = com.tencent.mm.ui.base.e.a(localContext, localb.context.getString(com.tencent.mm.n.btG), true, new c(localb));
    return localb;
  }

  public final void a(int paramInt1, int paramInt2, x paramx)
  {
    if (paramInt2 != 0);
    for (int i = paramInt1 * 100 / paramInt2; ; i = 0)
    {
      this.gQj.post(new d(this, i));
      return;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((paramInt2 == 0) && (paramInt1 == 0))
      this.dWr.DM();
    while (true)
    {
      if (this.dWq != null)
        this.dWq.dismiss();
      return;
      z.e("!24@/B4Tb64lLpIfnJwgZ47LaQ==", "do init failed, err=" + paramInt1 + "," + paramInt2);
      this.dWr.DM();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.a.b
 * JD-Core Version:    0.6.2
 */