package com.tencent.mm.plugin.gwallet;

import com.tencent.mm.sdk.platformtools.aq;

final class b
  implements aq
{
  b(a parama)
  {
  }

  public final boolean rD()
  {
    GWalletQueryProvider.d(this.fdv.fdu);
    return true;
  }

  public final boolean rE()
  {
    if (GWalletQueryProvider.b(this.fdv.fdu) != null)
      GWalletQueryProvider.b(this.fdv.fdu).dispose();
    GWalletQueryProvider.c(this.fdv.fdu);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.b
 * JD-Core Version:    0.6.2
 */