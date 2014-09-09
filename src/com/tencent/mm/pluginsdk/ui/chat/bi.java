package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.ui.bb;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cn;

final class bi
  implements View.OnClickListener
{
  bi(bh parambh)
  {
  }

  public final void onClick(View paramView)
  {
    z.d("!44@/B4Tb64lLpJUej9RrA1bOcU7fPC/hAaH/rogzloCsig=", "onClick send emoji...");
    if ((bh.a(this.hFp) != null) && (bh.b(this.hFp) != null) && (bh.c(this.hFp) != null))
    {
      bh.b(this.hFp).c(bh.a(this.hFp));
      bh.c(this.hFp).clear();
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(1);
      arrayOfObject[1] = bh.d(this.hFp);
      localn.d(10994, arrayOfObject);
    }
    bh.e(this.hFp).dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.bi
 * JD-Core Version:    0.6.2
 */