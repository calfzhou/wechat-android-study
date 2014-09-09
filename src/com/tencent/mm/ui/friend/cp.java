package com.tencent.mm.ui.friend;

import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.ui.base.z;
import java.util.ArrayList;

final class cp
  implements z
{
  cp(co paramco, ArrayList paramArrayList)
  {
  }

  public final void onClick(int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
      co.a(this.jJp, ((ad)this.jiL.get(paramInt2)).field_googlegmail);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.cp
 * JD-Core Version:    0.6.2
 */