package com.tencent.mm.ui.qrcode;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.modelsimple.al;
import com.tencent.mm.n.af;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.protocal.a.xb;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;

public class GetQRCodeInfoUI extends Activity
  implements com.tencent.mm.o.m
{
  private ProgressDialog dWT = null;
  private al jKY;

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpJ5Rd8ihC6Ej0wHcapqNtX73f9hOLfoMHs=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == -2004))
      e.a(this, com.tencent.mm.n.bWH, com.tencent.mm.n.buo, new c(this));
    xb localxb;
    String str;
    Intent localIntent;
    do
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        int i = com.tencent.mm.n.bLb;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = Integer.valueOf(paramInt2);
        e.a(this, getString(i, arrayOfObject), getString(com.tencent.mm.n.buo), new d(this));
        return;
      }
      localxb = ((al)paramx).zG();
      str = ai.a(localxb.hVf);
      af.sh().c(str, ai.a(localxb.hOU));
      localIntent = new Intent(this, ContactInfoUI.class);
      s.a(localIntent, localxb, 30);
    }
    while (ap.ja(str).length() <= 0);
    if ((0x8 & localxb.ifO) > 0)
      com.tencent.mm.plugin.f.c.n.fTF.q(10298, str + ",30");
    startActivityForResult(localIntent, 1);
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    startActivity(new Intent(this, LauncherUI.class).addFlags(67108864));
    finish();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(k.empty);
    Uri localUri = getIntent().getData();
    if (localUri == null)
    {
      finish();
      return;
    }
    String str1 = ap.ja(localUri.getHost());
    String str2 = ap.ja(localUri.getScheme());
    if ((("http".equals(str2)) && ("weixin.qq.com".equals(str1))) || (("weixin".equals(str2)) && ("qr".equals(str1))))
    {
      bg.qX().d(new ce(new a(this)));
      return;
    }
    finish();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (this.jKY != null)
      bg.qX().c(this.jKY);
    bg.qX().b(106, this);
  }

  public void onResume()
  {
    super.onResume();
    getString(com.tencent.mm.n.buo);
    this.dWT = e.a(this, getString(com.tencent.mm.n.bsp), true, new b(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.GetQRCodeInfoUI
 * JD-Core Version:    0.6.2
 */