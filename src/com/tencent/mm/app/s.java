package com.tencent.mm.app;

import android.content.Context;
import com.tencent.mm.c.a.fb;
import com.tencent.mm.c.a.fc;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class s extends g
{
  s(WorkerProfile paramWorkerProfile)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    fb localfb = (fb)parame;
    Context localContext = localfb.cKs.context;
    if (localContext == null)
      localContext = ak.getContext();
    String str = localfb.cKs.appId;
    WXMediaMessage localWXMediaMessage = localfb.cKs.cKt;
    if (localContext == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "launch app failed: context is null");
      return false;
    }
    if (ch.jb(str))
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "launch app failed: appid is null or nil");
      return false;
    }
    if (localWXMediaMessage == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "launch app failed: wxMsg is null");
      return false;
    }
    k localk = l.F(str, true);
    if (localk == null)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "get appinfo is null, appid is : [%s]", new Object[] { str });
      return false;
    }
    if (localk.field_status == 3)
    {
      z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "requestAppShow fail, app is in blacklist, packageName = " + localk.field_packageName);
      return false;
    }
    l.a(localContext, localk.field_packageName, localWXMediaMessage, localk.field_openId);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.s
 * JD-Core Version:    0.6.2
 */