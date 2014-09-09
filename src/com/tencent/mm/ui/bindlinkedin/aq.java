package com.tencent.mm.ui.bindlinkedin;

import android.app.Dialog;
import com.tencent.mm.sdk.platformtools.az;

final class aq
  implements az
{
  aq(ListLinkedInFriendUI paramListLinkedInFriendUI)
  {
  }

  public final boolean kJ()
  {
    if (ListLinkedInFriendUI.j(this.jjM) != null)
    {
      ListLinkedInFriendUI.j(this.jjM).dismiss();
      ListLinkedInFriendUI.k(this.jjM);
    }
    ListLinkedInFriendUI.i(this.jjM);
    ListLinkedInFriendUI.d(this.jjM);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.aq
 * JD-Core Version:    0.6.2
 */