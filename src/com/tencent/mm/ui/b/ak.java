package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import java.lang.ref.WeakReference;

final class ak
  implements View.OnClickListener
{
  ak(ag paramag)
  {
  }

  public final void onClick(View paramView)
  {
    a.l((Context)ag.j(this.iXb).get(), "webwx", ".ui.WebWXLogoutUI");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.ak
 * JD-Core Version:    0.6.2
 */