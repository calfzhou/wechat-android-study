package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.q;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.sdk.platformtools.aq;

final class ai
  implements aq
{
  ai(FindMContactAddUI paramFindMContactAddUI)
  {
  }

  public final boolean rD()
  {
    FindMContactAddUI.a(this.jIz, a.aY(this.jIz));
    FindMContactAddUI.c(this.jIz).j(FindMContactAddUI.d(this.jIz));
    FindMContactAddUI.c(this.jIz).b(az.xf());
    return true;
  }

  public final boolean rE()
  {
    if (FindMContactAddUI.a(this.jIz) != null)
    {
      FindMContactAddUI.a(this.jIz).dismiss();
      FindMContactAddUI.b(this.jIz);
    }
    FindMContactAddUI.c(this.jIz).notifyDataSetChanged();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.ai
 * JD-Core Version:    0.6.2
 */