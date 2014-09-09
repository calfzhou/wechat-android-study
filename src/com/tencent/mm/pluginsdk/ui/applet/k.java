package com.tencent.mm.pluginsdk.ui.applet;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.mm.n;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.base.e;
import java.util.LinkedList;

final class k
  implements aa
{
  k(j paramj, i parami)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    if (paramBoolean)
    {
      if (j.a(this.hAS) != null)
        j.a(this.hAS).dismiss();
      j localj = this.hAS;
      Context localContext = j.b(this.hAS);
      j.b(this.hAS).getString(n.buo);
      j.a(localj, e.a(localContext, j.b(this.hAS).getString(n.cud), true, null));
      a locala = new a(j.b(this.hAS), this.hAS);
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(Integer.valueOf(j.c(this.hAS)));
      locala.f(this.fLx.getUsername(), localLinkedList);
    }
    while (true)
    {
      j.d(this.hAS).dismiss();
      return;
      j.a(this.hAS, 0);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.k
 * JD-Core Version:    0.6.2
 */