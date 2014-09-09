package com.tencent.mm.ui.chatting;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.f.am;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.m;
import com.tencent.mm.sdk.modelmsg.n;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;

public final class pm
  implements mn
{
  private static am jwS = new pn();
  private hd joF;
  private final Map jwW = new HashMap();

  protected pm(hd paramhd)
  {
    this.joF = paramhd;
  }

  public static void y(Bundle paramBundle)
  {
    jwS.ae(paramBundle);
    jwS.Bo();
  }

  public final void a(String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2)
  {
    z.d("!44@/B4Tb64lLpK7L4H1H4x0/ar4BeHL+k+fT/ijijg1SLs=", "request pkg = " + paramString1 + ", openId = " + paramString2);
    m localm = l.a(this.joF.agh(), paramString1, paramWXMediaMessage, paramString2);
    this.jwW.put(localm.hvw, localm);
  }

  public final void x(Bundle paramBundle)
  {
    String str = Uri.parse(paramBundle.getString("_mmessage_content")).getQueryParameter("appid");
    z.d("!44@/B4Tb64lLpK7L4H1H4x0/ar4BeHL+k+fT/ijijg1SLs=", "handleResp, appid = " + str);
    n localn = new n(paramBundle);
    z.i("!44@/B4Tb64lLpK7L4H1H4x0/ar4BeHL+k+fT/ijijg1SLs=", "handleResp, errCode = " + localn.errCode + ", type = 4");
    if ((m)this.jwW.get(localn.hvw) == null)
    {
      z.e("!44@/B4Tb64lLpK7L4H1H4x0/ar4BeHL+k+fT/ijijg1SLs=", "invalid resp, check transaction failed, transaction=" + localn.hvw);
      return;
    }
    this.jwW.remove(localn.hvw);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.pm
 * JD-Core Version:    0.6.2
 */