package com.tencent.mm.plugin.accountsync.ui;

import android.os.Bundle;
import com.tencent.mm.l.a;

final class i extends a
{
  i(InviteFacebookFriendsUI paramInviteFacebookFriendsUI)
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
      InviteFacebookFriendsUI.c(this.dWW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.i
 * JD-Core Version:    0.6.2
 */