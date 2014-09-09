package com.tencent.mm.ui.bindlinkedin;

import android.widget.Toast;
import com.tencent.mm.g.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.bj;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.ui.applet.h;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

final class aj
  implements h
{
  aj(ListLinkedInFriendUI paramListLinkedInFriendUI)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    z.d("!44@/B4Tb64lLpJ4FHnyJpFGLC6Xej9PxJXB86Z93mHPIZQ=", "[oneliang]AddContact hasSentVerify:" + paramBoolean2);
    if (!ch.jb(paramString2))
    {
      if (paramBoolean1)
      {
        i locali = bg.qW().oT().ys(paramString1);
        if ((int)locali.dhv > 0)
          y.k(locali);
        az.CG().jn(paramString2);
        Toast.makeText(this.jjM, n.cDx, 0).show();
      }
      ListLinkedInFriendUI.f(this.jjM).DW();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.aj
 * JD-Core Version:    0.6.2
 */