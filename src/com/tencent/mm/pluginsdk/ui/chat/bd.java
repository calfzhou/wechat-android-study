package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.c.a.kt;
import com.tencent.mm.pluginsdk.ac;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.z.b;

public final class bd
  implements View.OnClickListener
{
  private Context context;

  public bd(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void onClick(View paramView)
  {
    int i = 1;
    Object localObject = paramView.getTag();
    bg localbg;
    if ((localObject instanceof bg))
    {
      localbg = (bg)localObject;
      if ((localbg == null) || (paramView == null))
      {
        z.w("!44@/B4Tb64lLpJNTHUnt8U8i1AKj89DUbkhJMv2ktHo+Q4=", "localAppRedirectHandle: but info or v is null");
        i = 0;
        label38: if (i == 0)
        {
          String str2 = u.a(this.context, localbg.appId, localbg.dkc);
          kt localkt2 = new kt();
          localkt2.cOg.cOh = str2;
          localkt2.cOg.context = this.context;
          com.tencent.mm.sdk.c.a.aGB().g(localkt2);
        }
      }
    }
    bf localbf;
    ac localac;
    do
    {
      do
      {
        return;
        if ("wx485a97c844086dc9".equals(localbg.appId))
        {
          Intent localIntent1 = new Intent();
          localIntent1.putExtra("shake_music", i);
          com.tencent.mm.am.a.b(this.context, "shake", ".ui.ShakeReportUI", localIntent1);
          break label38;
        }
        if ("wxfbc915ff7c30e335".equals(localbg.appId))
        {
          if (b.yq())
            break label38;
          Intent localIntent5 = new Intent();
          localIntent5.putExtra("BaseScanUI_select_scan_mode", i);
          com.tencent.mm.am.a.b(this.context, "scanner", ".ui.BaseScanUI", localIntent5);
          break label38;
        }
        if ("wx482a4001c37e2b74".equals(localbg.appId))
        {
          if (b.yq())
            break label38;
          Intent localIntent4 = new Intent();
          localIntent4.putExtra("BaseScanUI_select_scan_mode", 2);
          com.tencent.mm.am.a.b(this.context, "scanner", ".ui.BaseScanUI", localIntent4);
          break label38;
        }
        if ("wx751a1acca5688ba3".equals(localbg.appId))
        {
          if (b.yq())
            break label38;
          Intent localIntent3 = new Intent();
          localIntent3.putExtra("BaseScanUI_select_scan_mode", 5);
          com.tencent.mm.am.a.b(this.context, "scanner", ".ui.BaseScanUI", localIntent3);
          break label38;
        }
        if (!"wxaf060266bfa9a35c".equals(localbg.appId))
          break;
        if (b.yr())
          break label38;
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("shake_tv", i);
        com.tencent.mm.am.a.b(this.context, "shake", ".ui.ShakeReportUI", localIntent2);
        break label38;
      }
      while (!(localObject instanceof bf));
      localbf = (bf)localObject;
      String str1 = u.a(this.context, localbf.appId, localbf.dkc);
      kt localkt1 = new kt();
      localkt1.cOg.cOh = str1;
      localkt1.cOg.context = this.context;
      com.tencent.mm.sdk.c.a.aGB().g(localkt1);
      localac = g.axX();
    }
    while (localac == null);
    localac.a(this.context, localbf.appId, localbf.pkgName, localbf.cMU, localbf.hEq, localbf.cCn, 5, localbf.hEr);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.bd
 * JD-Core Version:    0.6.2
 */