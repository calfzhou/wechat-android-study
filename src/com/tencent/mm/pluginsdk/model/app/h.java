package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;
import java.util.Map;

public final class h
{
  private cm gQj = new j(this);
  private List huH = null;
  private List huI = null;
  private Map huJ = null;
  private ay huK = new ay(new i(this), false);

  public h()
  {
    this.huK.cP(600000L);
  }

  private boolean a(v paramv)
  {
    if (paramv == null)
    {
      z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "startDownload fail, geticoninfo is null");
      return false;
    }
    int i;
    if (paramv == null)
    {
      z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "increaseCounter fail, info is null");
      i = 0;
    }
    while (i == 0)
    {
      z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "increaseCounter fail");
      return false;
      Integer localInteger = Integer.valueOf(ch.a((Integer)this.huJ.get(paramv.toString()), 0));
      if (localInteger.intValue() >= 5)
      {
        z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "increaseCounter fail, has reached the max try count");
        i = 0;
      }
      else
      {
        this.huJ.put(paramv.toString(), Integer.valueOf(1 + localInteger.intValue()));
        i = 1;
      }
    }
    k localk = bf.GO().uY(paramv.appId);
    if (localk == null)
    {
      z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "push, appinfo does not exist, appId = " + paramv.appId);
      return false;
    }
    String str;
    switch (paramv.dSC)
    {
    default:
      z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "push, unknown iconType = " + paramv.dSC);
      return false;
    case 1:
      if ((localk.field_appIconUrl == null) || (localk.field_appIconUrl.length() == 0))
      {
        z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "push, appIconUrl is null, appId = " + paramv.appId);
        return false;
      }
      str = localk.field_appIconUrl;
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      new w(this.gQj, paramv.appId, paramv.dSC, str).start();
      return true;
      if ((localk.field_appWatermarkUrl == null) || (localk.field_appWatermarkUrl.length() == 0))
      {
        z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "push, appWatermarkUrl is null, appId = " + paramv.appId);
        return false;
      }
      str = localk.field_appWatermarkUrl;
      continue;
      if ((localk.iH() == null) || (localk.iH().length() == 0))
      {
        z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "push, appSuggestionIconUrl is null, appId = " + paramv.appId);
        return false;
      }
      str = localk.iH();
      continue;
      if ((localk.iT() == null) || (localk.iT().length() == 0))
      {
        z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "push, servicePanelIconUrl is null, appId = " + paramv.appId);
        return false;
      }
      str = localk.iT();
      continue;
      if ((localk.iU() == null) || (localk.iU().length() == 0))
      {
        z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "push, serviceListIconUrl is null, appId = " + paramv.appId);
        return false;
      }
      str = localk.iU();
    }
  }

  public final void ab(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
      z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "push fail, appId is null");
    v localv;
    do
    {
      do
      {
        return;
        localv = new v(paramString, paramInt);
        if (this.huH.contains(localv))
        {
          z.i("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "push, appId = " + paramString + ", iconType = " + paramInt + " already in running list");
          return;
        }
        if (this.huH.size() < 5)
          break;
        z.i("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "running list has reached the max count");
      }
      while (this.huI.contains(localv));
      this.huI.add(localv);
      return;
    }
    while (!a(localv));
    this.huH.add(localv);
  }

  public final void clear()
  {
    this.huH.clear();
    this.huI.clear();
    this.huJ.clear();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.h
 * JD-Core Version:    0.6.2
 */