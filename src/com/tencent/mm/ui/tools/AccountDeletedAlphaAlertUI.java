package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.c.a.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;

public class AccountDeletedAlphaAlertUI extends MMActivity
{
  private static AccountDeletedAlphaAlertUI jOA = null;

  public static AccountDeletedAlphaAlertUI aZy()
  {
    return jOA;
  }

  protected final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jOA = this;
    l locall = new l();
    com.tencent.mm.sdk.c.a.aGB().g(locall);
    bg.re();
    com.tencent.mm.d.a locala = com.tencent.mm.d.a.ct(getIntent().getStringExtra("errmsg"));
    if (locala != null)
    {
      locala.a(this, new a(this), null);
      return;
    }
    e.a(this, getString(n.bQY), null, false, new b(this));
  }

  public void onDestroy()
  {
    if (equals(jOA))
      jOA = null;
    super.onDestroy();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI
 * JD-Core Version:    0.6.2
 */