package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.tencent.mm.am.a;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.y;

final class ol
  implements y
{
  ol(oj paramoj, String paramString, DialogInterface.OnDismissListener paramOnDismissListener)
  {
  }

  public final void onClick(int paramInt)
  {
    String str1 = this.jwm.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
    switch (paramInt)
    {
    default:
      if (this.jwn != null)
        this.jwn.onDismiss(null);
    case 0:
    case 1:
    case 2:
      do
      {
        do
        {
          do
          {
            return;
            Intent localIntent3 = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str1));
            oj.a(this.jwl).startActivity(localIntent3);
            com.tencent.mm.plugin.f.c.n.fTF.q(10112, "1");
          }
          while (this.jwn == null);
          this.jwn.onDismiss(null);
          return;
          if (oj.d(this.jwl))
            break;
          com.tencent.mm.pluginsdk.e.c.a(oj.a(this.jwl), str1, str1);
        }
        while (this.jwn == null);
        this.jwn.onDismiss(null);
        return;
        String[] arrayOfString;
        if ((oj.e(this.jwl)) && (oj.f(this.jwl)))
          arrayOfString = oj.a(this.jwl).getResources().getStringArray(com.tencent.mm.c.Ns);
        while (true)
        {
          String str2 = oj.a(this.jwl).getResources().getString(com.tencent.mm.n.bzU);
          e.b(oj.a(this.jwl), this.jwm + str2, arrayOfString, "", new om(this, str1));
          return;
          if (oj.e(this.jwl))
          {
            arrayOfString = new String[1];
            arrayOfString[0] = oj.a(this.jwl).getResources().getString(com.tencent.mm.n.bzR);
          }
          else
          {
            arrayOfString = new String[1];
            arrayOfString[0] = oj.a(this.jwl).getResources().getString(com.tencent.mm.n.bzV);
          }
        }
        if ((oj.aWB()) && (!oj.d(this.jwl)))
        {
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("rawUrl", "http://dianhua.qq.com/cgi-bin/readtemplate?lang=en&t=w_phone_home&channel=100008");
          a.b(oj.a(this.jwl), "webview", ".ui.tools.WebViewUI", localIntent2);
          return;
        }
        com.tencent.mm.pluginsdk.e.c.a(oj.a(this.jwl), str1, str1);
        com.tencent.mm.plugin.f.c.n.fTF.q(10115, "1");
      }
      while (this.jwn == null);
      this.jwn.onDismiss(null);
      return;
    case 3:
    }
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("rawUrl", "http://dianhua.qq.com/cgi-bin/readtemplate?lang=en&t=w_phone_home&channel=100008");
    a.b(oj.a(this.jwl), "webview", ".ui.tools.WebViewUI", localIntent1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ol
 * JD-Core Version:    0.6.2
 */