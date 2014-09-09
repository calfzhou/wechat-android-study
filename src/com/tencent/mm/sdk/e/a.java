package com.tencent.mm.sdk.e;

import android.os.Bundle;

public final class a extends com.tencent.mm.sdk.d.a
{
  public String appId;
  public String hMP;
  public String hMU;
  public String hMV;
  public b hmh;
  public String iDj;
  public String iDk;
  public String iDl;
  public String iDm;

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("_wxapi_payreq_appid", this.appId);
    paramBundle.putString("_wxapi_payreq_partnerid", this.hMP);
    paramBundle.putString("_wxapi_payreq_prepayid", this.iDj);
    paramBundle.putString("_wxapi_payreq_noncestr", this.hMU);
    paramBundle.putString("_wxapi_payreq_timestamp", this.hMV);
    paramBundle.putString("_wxapi_payreq_packagevalue", this.iDk);
    paramBundle.putString("_wxapi_payreq_sign", this.iDl);
    paramBundle.putString("_wxapi_payreq_extdata", this.iDm);
    if (this.hmh != null)
    {
      b localb = this.hmh;
      paramBundle.putString("_wxapi_payoptions_callback_classname", localb.iDn);
      paramBundle.putInt("_wxapi_payoptions_callback_flags", localb.iDo);
    }
  }

  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.appId = paramBundle.getString("_wxapi_payreq_appid");
    this.hMP = paramBundle.getString("_wxapi_payreq_partnerid");
    this.iDj = paramBundle.getString("_wxapi_payreq_prepayid");
    this.hMU = paramBundle.getString("_wxapi_payreq_noncestr");
    this.hMV = paramBundle.getString("_wxapi_payreq_timestamp");
    this.iDk = paramBundle.getString("_wxapi_payreq_packagevalue");
    this.iDl = paramBundle.getString("_wxapi_payreq_sign");
    this.iDm = paramBundle.getString("_wxapi_payreq_extdata");
    this.hmh = new b();
    this.hmh.e(paramBundle);
  }

  public final int getType()
  {
    return 5;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.a
 * JD-Core Version:    0.6.2
 */