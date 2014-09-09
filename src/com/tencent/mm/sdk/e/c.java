package com.tencent.mm.sdk.e;

import android.os.Bundle;
import com.tencent.mm.sdk.d.b;

public final class c extends b
{
  public String iDj;
  public String iDm;
  public String iDp;

  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    paramBundle.putString("_wxapi_payresp_prepayid", this.iDj);
    paramBundle.putString("_wxapi_payresp_returnkey", this.iDp);
    paramBundle.putString("_wxapi_payresp_extdata", this.iDm);
  }

  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    this.iDj = paramBundle.getString("_wxapi_payresp_prepayid");
    this.iDp = paramBundle.getString("_wxapi_payresp_returnkey");
    this.iDm = paramBundle.getString("_wxapi_payresp_extdata");
  }

  public final int getType()
  {
    return 5;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.c
 * JD-Core Version:    0.6.2
 */