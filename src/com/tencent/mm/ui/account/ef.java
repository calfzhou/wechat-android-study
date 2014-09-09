package com.tencent.mm.ui.account;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.c.a.a;
import com.tencent.mm.ui.c.a.e;

public final class ef
{
  private cm gQj;
  private e iNN;
  private ei iQc;

  public ef(e parame, ei paramei)
  {
    this.iNN = parame;
    this.iQc = paramei;
  }

  public final void aQF()
  {
    this.gQj = new eg(this);
    Bundle localBundle = new Bundle();
    localBundle.putString("client_id", "290293790992170");
    localBundle.putString("client_secret", "6667e9307e67283c76028fd37189c096");
    localBundle.putString("grant_type", "fb_exchange_token");
    localBundle.putString("fb_exchange_token", this.iNN.aYA());
    eh localeh = new eh(this);
    new a(this.iNN).a("oauth/access_token", localBundle, "GET", localeh);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ef
 * JD-Core Version:    0.6.2
 */