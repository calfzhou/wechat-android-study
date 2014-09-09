package com.tencent.mm.ui.qrcode;

import android.os.Bundle;
import com.tencent.mm.l.a;

final class l extends a
{
  l(ShareToQQUI paramShareToQQUI)
  {
  }

  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
  }

  public final void onError(int paramInt, String paramString)
  {
    super.onError(paramInt, paramString);
    if (paramInt == 3)
      ShareToQQUI.d(this.jLd);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.l
 * JD-Core Version:    0.6.2
 */