package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.MMAppMgr;
import java.lang.ref.WeakReference;

final class am
  implements View.OnClickListener
{
  am(ag paramag, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    MMAppMgr.b((Context)ag.l(this.iXb).get(), this.eaJ, new an(this), new ao(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.am
 * JD-Core Version:    0.6.2
 */