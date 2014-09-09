package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.mm.ak.c;
import com.tencent.mm.ak.v;
import com.tencent.mm.n;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cr;

final class lg
  implements c
{
  lg(hd paramhd)
  {
  }

  public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    if (hd.aa(this.jtA) != null)
    {
      hd.aa(this.jtA).dismiss();
      hd.ab(this.jtA);
    }
    if (paramInt1 == -50002)
    {
      Toast.makeText(this.jtA.agh(), this.jtA.agh().getString(n.cnS), 0).show();
      return;
    }
    if (paramInt1 < 0)
    {
      Toast.makeText(this.jtA.agh(), this.jtA.agh().getString(n.cnR), 0).show();
      return;
    }
    v.a(paramString1, paramInt2, this.jtA.jnf.getUsername(), paramString2);
    v.ih(paramString1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.lg
 * JD-Core Version:    0.6.2
 */