package com.tencent.mm.ui.applet;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.am.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cr;

public final class ab
  implements m
{
  private Activity cKR;
  private cr gfQ;
  private ay gfR = new ay(new ac(this), false);
  private com.tencent.mm.modelsimple.ac iWl;

  public ab(Activity paramActivity)
  {
    this.cKR = paramActivity;
  }

  private void BH(String paramString)
  {
    this.gfR.aNu();
    if (this.gfQ != null)
      this.gfQ.dismiss();
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    localIntent.putExtra("title", this.cKR.getString(n.bDs));
    localIntent.putExtra("zoom", true);
    localIntent.putExtra("vertical_scroll", false);
    a.b(this.cKR, "webview", ".ui.tools.WebViewUI", localIntent);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    bg.qX().b(205, this);
    com.tencent.mm.modelsimple.ac localac = (com.tencent.mm.modelsimple.ac)paramx;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      BH(localac.getURL());
      return;
    }
    if (paramInt1 != 4)
      z.e("!32@/B4Tb64lLpJPGSJWX2B4M9oeztYJUMZW", "view weibo failed: " + paramInt1 + ", " + paramInt2);
    BH("http://t.qq.com/" + localac.zx());
  }

  public final void bG(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      z.e("!32@/B4Tb64lLpJPGSJWX2B4M9oeztYJUMZW", "null weibo id");
      return;
    }
    bg.qX().a(205, this);
    this.iWl = new com.tencent.mm.modelsimple.ac(ap.ja(paramString1).replace("http://t.qq.com/", "").trim(), paramString2);
    bg.qX().d(this.iWl);
    this.gfR.cP(3000L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.ab
 * JD-Core Version:    0.6.2
 */