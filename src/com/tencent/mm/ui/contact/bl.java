package com.tencent.mm.ui.contact;

import android.widget.ImageView;
import com.tencent.mm.ag.d;

final class bl
  implements d
{
  bl(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void ab(boolean paramBoolean)
  {
    ContactRemarkInfoModUI.t(this.jzm).post(new bm(this, paramBoolean));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bl
 * JD-Core Version:    0.6.2
 */