package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bt;
import com.tencent.mm.plugin.autoadd.ui.AutoAddFriendUI;
import java.lang.ref.WeakReference;

final class u
  implements View.OnClickListener
{
  u(s params, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    bt.rn().y(this.eaJ, this.iWN);
    Context localContext = (Context)s.j(this.iWO).get();
    localContext.startActivity(new Intent(localContext, AutoAddFriendUI.class));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.u
 * JD-Core Version:    0.6.2
 */