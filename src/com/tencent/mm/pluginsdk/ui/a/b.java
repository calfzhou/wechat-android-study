package com.tencent.mm.pluginsdk.ui.a;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

public abstract class b
  implements a
{
  protected WeakReference hCe = null;
  protected View view = null;

  public b(Context paramContext)
  {
    this.hCe = new WeakReference(paramContext);
    if (getLayoutId() > 0)
      this.view = View.inflate((Context)this.hCe.get(), getLayoutId(), null);
  }

  public boolean Hd()
  {
    return false;
  }

  public void He()
  {
  }

  public void Hf()
  {
  }

  public abstract int getLayoutId();

  public final View getView()
  {
    return this.view;
  }

  public boolean refresh()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.a.b
 * JD-Core Version:    0.6.2
 */