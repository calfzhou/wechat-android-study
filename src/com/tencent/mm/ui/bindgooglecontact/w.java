package com.tencent.mm.ui.bindgooglecontact;

import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.ui.base.z;
import java.util.ArrayList;

final class w
  implements z
{
  w(GoogleFriendUI paramGoogleFriendUI, ArrayList paramArrayList, ad paramad)
  {
  }

  public final void onClick(int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
      GoogleFriendUI.a(this.jiK, (ad)this.jiL.get(paramInt2), this.jiM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.w
 * JD-Core Version:    0.6.2
 */