package com.tencent.mm.ui.account.mobile;

import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.n;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.j;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMActivity;

public final class a
{
  private String cOh;
  private String dCF = "";
  private String iUb = "";
  private g iUc;
  private String username = "";

  public a(g paramg, String paramString1, String paramString2, String paramString3)
  {
    this.username = paramString1;
    this.dCF = paramString3;
    this.iUb = paramString2;
    this.iUc = paramg;
  }

  public final void a(MMActivity paramMMActivity, int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      bg.qX().d(new ce(new c(this)));
    for (int i = 1; ; i = 0)
    {
      if ((paramx instanceof i))
        this.cOh = ((i)paramx).za();
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        bg.rf();
        com.tencent.mm.modelsimple.f.F(paramMMActivity);
        com.tencent.mm.platformtools.ac.jB(this.dCF);
        com.tencent.mm.platformtools.ac.a(paramMMActivity, new d(this, paramMMActivity), false);
      }
      while (true)
      {
        return;
        if (paramInt2 == -106)
        {
          com.tencent.mm.platformtools.ac.s(paramMMActivity, paramString);
          return;
        }
        int j;
        if (com.tencent.mm.plugin.a.a.dWp.a(paramMMActivity, paramInt1, paramInt2, paramString))
          j = 1;
        while (j == 0)
        {
          int k = n.bJW;
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Integer.valueOf(paramInt1);
          arrayOfObject[1] = Integer.valueOf(paramInt2);
          Toast.makeText(paramMMActivity, paramMMActivity.getString(k, arrayOfObject), 0).show();
          return;
          if (paramInt1 == 4);
          switch (paramInt2)
          {
          default:
            j = 0;
            break;
          case -1:
            if (bg.qX().tw() == 6)
            {
              com.tencent.mm.ui.base.e.b(paramMMActivity, n.bUe, n.bUd);
              j = 1;
            }
            break;
          case -4:
          case -3:
            com.tencent.mm.ui.base.e.b(paramMMActivity, n.bFW, n.bQj);
            j = 1;
            break;
          case -9:
            com.tencent.mm.ui.base.e.b(paramMMActivity, n.bQi, n.bQj);
            j = 1;
            break;
          case -72:
            com.tencent.mm.ui.base.e.b(paramMMActivity, n.bYU, n.buo);
            j = 1;
            break;
          case -75:
            com.tencent.mm.ui.base.e.b(paramMMActivity, n.bsC, n.buo);
            j = 1;
            break;
          case -100:
            bg.re();
            if (TextUtils.isEmpty(j.aGQ()));
            for (String str = com.tencent.mm.aq.a.p(paramMMActivity, n.bQZ); ; str = j.aGQ())
            {
              com.tencent.mm.ui.base.e.a(paramMMActivity, str, paramMMActivity.getString(n.buo), new e(this), new f(this));
              j = 1;
              break;
            }
          case -140:
            if (!ch.jb(this.cOh))
              com.tencent.mm.platformtools.ac.d(paramMMActivity, paramString, this.cOh);
            j = 1;
          }
        }
      }
    }
  }

  public final void e(MMActivity paramMMActivity)
  {
    i locali = new i(this.username, "", false, "", "", "", 0);
    locali.hu(this.iUb);
    bg.qX().d(locali);
    g localg = this.iUc;
    paramMMActivity.getString(n.buo);
    localg.a(com.tencent.mm.ui.base.e.a(paramMMActivity, paramMMActivity.getString(n.bQn), true, new b(this, locali)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.a
 * JD-Core Version:    0.6.2
 */