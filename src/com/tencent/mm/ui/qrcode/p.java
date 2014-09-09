package com.tencent.mm.ui.qrcode;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.a.f;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.account.FacebookAuthUI;

final class p
  implements View.OnClickListener
{
  p(ShowQRCodeStep1UI paramShowQRCodeStep1UI)
  {
  }

  public final void onClick(View paramView)
  {
    if (ShowQRCodeStep1UI.a(this.jLg) == 3)
    {
      String str1 = bg.qL();
      String str2 = x.pG();
      int i = ap.a((Integer)bg.qW().oQ().get(66561));
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = str1;
      arrayOfObject[1] = str2;
      arrayOfObject[2] = Integer.valueOf(i);
      z.d("!44@/B4Tb64lLpLyuqVLBcN9+Uus+Oh738YWjrXtrK9BSZ8=", "sessionKey[%s], userName[%s], style[%d]", arrayOfObject);
      String str3 = "http://weixin.qq.com/cgi-bin/rweibourl?sid=" + f.d(str1.getBytes()) + "&u=" + str2 + "&qr=" + i + "&device=" + com.tencent.mm.protocal.a.hrg + "&version=" + com.tencent.mm.protocal.a.hrn;
      z.d("!44@/B4Tb64lLpLyuqVLBcN9+Uus+Oh738YWjrXtrK9BSZ8=", "[%s]", new Object[] { str3 });
      Intent localIntent4 = new Intent();
      localIntent4.putExtra("rawUrl", str3);
      localIntent4.putExtra("title", this.jLg.getString(n.cdY));
      com.tencent.mm.am.a.b(this.jLg, "webview", ".ui.tools.WebViewUI", localIntent4);
      this.jLg.finish();
      return;
    }
    if (ShowQRCodeStep1UI.a(this.jLg) == 4)
    {
      if (x.qc())
      {
        Intent localIntent3 = new Intent(this.jLg, ShareToQQUI.class);
        localIntent3.putExtra("show_to", 4);
        this.jLg.startActivity(localIntent3);
      }
      while (true)
      {
        this.jLg.finish();
        return;
        ShowQRCodeStep1UI.a(this.jLg, FacebookAuthUI.class);
      }
    }
    if (ShowQRCodeStep1UI.a(this.jLg) == 2)
    {
      Intent localIntent1 = new Intent(this.jLg, ShareToQQUI.class);
      localIntent1.putExtra("show_to", 2);
      this.jLg.startActivity(localIntent1);
      this.jLg.finish();
      return;
    }
    Intent localIntent2 = new Intent(this.jLg, ShareToQQUI.class);
    localIntent2.putExtra("show_to", 1);
    this.jLg.startActivity(localIntent2);
    this.jLg.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.p
 * JD-Core Version:    0.6.2
 */