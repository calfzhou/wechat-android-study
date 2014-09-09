package com.tencent.mm.ui.b;

import android.content.Context;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.cc;
import com.tencent.mm.ui.chatting.oj;
import java.lang.ref.WeakReference;

final class d
  implements e
{
  d(a parama)
  {
  }

  public final void BI(String paramString)
  {
    com.tencent.mm.ae.b.yR();
    bg.qW().oS().a(new cc(3, paramString));
  }

  public final void onClick(String paramString1, String paramString2)
  {
    com.tencent.mm.ae.b.yR();
    bg.qW().oS().a(new cc(2, paramString1));
    z.d("!32@/B4Tb64lLpIHtCm9rUrK0P6D1midbftv", "jump to " + paramString2);
    oj.d((Context)a.d(this.iWs).get(), paramString2, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.d
 * JD-Core Version:    0.6.2
 */