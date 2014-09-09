package com.tencent.mm.model;

import android.content.Context;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.compatible.g.c;
import com.tencent.mm.sdk.platformtools.ak;

public final class r
{
  private a dke;
  private Context dkf = ak.getContext();
  private c dkg;
  private s dkh;

  public static r pD()
  {
    return new r();
  }

  public final void a(s params)
  {
    this.dkh = params;
    t localt = new t(this, (byte)0);
    if (this.dke == null)
      this.dke = new a(this.dkf);
    if (this.dkg != localt)
      this.dkg = localt;
    this.dke.a(this.dkg);
    this.dke.requestFocus();
  }

  public final void pE()
  {
    if (this.dke != null)
      this.dke.nH();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.r
 * JD-Core Version:    0.6.2
 */