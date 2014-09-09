package com.tencent.mm.ui.account;

import android.os.Bundle;
import com.tencent.mm.l.a;

final class am extends a
{
  am(FacebookFriendUI paramFacebookFriendUI)
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
      FacebookFriendUI.f(this.iOo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.am
 * JD-Core Version:    0.6.2
 */