package com.tencent.mm.sdk.d;

import android.os.Bundle;

public abstract class b
{
  public String eam;
  public String ehE;
  public int errCode;
  public String hvw;

  public void d(Bundle paramBundle)
  {
    paramBundle.putInt("_wxapi_command_type", getType());
    paramBundle.putInt("_wxapi_baseresp_errcode", this.errCode);
    paramBundle.putString("_wxapi_baseresp_errstr", this.eam);
    paramBundle.putString("_wxapi_baseresp_transaction", this.hvw);
    paramBundle.putString("_wxapi_baseresp_openId", this.ehE);
  }

  public void e(Bundle paramBundle)
  {
    this.errCode = paramBundle.getInt("_wxapi_baseresp_errcode");
    this.eam = paramBundle.getString("_wxapi_baseresp_errstr");
    this.hvw = paramBundle.getString("_wxapi_baseresp_transaction");
    this.ehE = paramBundle.getString("_wxapi_baseresp_openId");
  }

  public abstract int getType();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.d.b
 * JD-Core Version:    0.6.2
 */