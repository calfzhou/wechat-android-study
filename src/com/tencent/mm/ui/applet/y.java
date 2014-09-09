package com.tencent.mm.ui.applet;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.a.k;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.cr;

public final class y
  implements m
{
  private Context context;
  private com.tencent.mm.modelsimple.x gfP;
  private cr gfQ;
  private ay gfR = new ay(new z(this), false);
  private String iWi;

  public y(Context paramContext)
  {
    this.context = paramContext;
  }

  private void BG(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.context.getString(n.bCB, new Object[] { paramString }));
    localIntent.putExtra("useJs", true);
    localIntent.putExtra("vertical_scroll", true);
    a.b(this.context, "webview", ".ui.tools.ContactQZoneWebView", localIntent);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    this.gfR.aNu();
    if (this.gfQ != null)
      this.gfQ.dismiss();
    bg.qX().b(233, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      String str = ((com.tencent.mm.modelsimple.x)paramx).zn();
      if ((str == null) || (str.length() == 0))
      {
        BG(this.iWi);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str);
      localIntent.putExtra("useJs", true);
      localIntent.putExtra("vertical_scroll", true);
      a.b(this.context, "webview", ".ui.tools.ContactQZoneWebView", localIntent);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpLndYJUrncSP96j13QaNgBN", "getA8Key fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    BG(this.iWi);
  }

  public final void qw(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpLndYJUrncSP96j13QaNgBN", "go fail, qqNum is null");
      return;
    }
    this.iWi = paramString;
    String str1 = (String)bg.qW().oQ().get(46);
    String str2 = ch.ja((String)bg.qW().oQ().get(72));
    com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpLndYJUrncSP96j13QaNgBN", "get a2key:[%s], get new a2key:[%s]", new Object[] { str1, str2 });
    if ((ch.jb(str1)) && (ch.jb(str2)))
    {
      BG(paramString);
      return;
    }
    bg.qX().a(233, this);
    this.gfP = new com.tencent.mm.modelsimple.x(k.ai(paramString));
    bg.qX().d(this.gfP);
    this.gfR.cP(3000L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.y
 * JD-Core Version:    0.6.2
 */