package com.tencent.mm.plugin.accountsync.ui;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.modelsimple.g;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class a
  implements com.tencent.mm.plugin.accountsync.model.c
{
  private boolean dWL;
  private g dWM = new b(this);

  public a(ContactsSyncUI paramContactsSyncUI, boolean paramBoolean)
  {
    this.dWL = paramBoolean;
  }

  private int v(Context paramContext, String paramString)
  {
    if (paramContext == null)
      return 1;
    int i = f.a(paramContext, paramString, this.dWM);
    if (i == 2)
    {
      Toast.makeText(paramContext, this.dWN.getString(n.bDG), 1).show();
      return 1;
    }
    if (i == 3)
    {
      Toast.makeText(paramContext, this.dWN.getString(n.bDF), 1).show();
      return 1;
    }
    return 0;
  }

  public final int ah(Context paramContext)
  {
    if ((!bg.ra()) || (bg.rd()))
      return 4;
    if (!this.dWL)
    {
      z.i("!44@/B4Tb64lLpIUGQfqwvb6Vhbtqd7qMdkL5Q4wuWECcU8=", "no need to bind mobile");
      f.a(this.dWN, this.dWM);
      return 0;
    }
    String str = (String)bg.qW().oQ().get(6, "");
    if (ch.jb(str))
    {
      z.e("!44@/B4Tb64lLpIUGQfqwvb6Vhbtqd7qMdkL5Q4wuWECcU8=", "not bind mobile phone");
      return 2;
    }
    if (aa.wa())
    {
      com.tencent.mm.ui.base.e.a(paramContext, n.bDE, n.buo, n.btQ, n.bsK, new c(this, paramContext, str), new d(this, paramContext));
      return 5;
    }
    return v(paramContext, str);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.a
 * JD-Core Version:    0.6.2
 */