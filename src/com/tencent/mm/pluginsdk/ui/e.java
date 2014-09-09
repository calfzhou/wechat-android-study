package com.tencent.mm.pluginsdk.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class e
  implements AbsListView.OnScrollListener
{
  private AbsListView.OnScrollListener hxo;
  private ArrayList hxp = new ArrayList();

  public e()
  {
    this(null);
  }

  public e(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.hxo = paramOnScrollListener;
  }

  private void dd(boolean paramBoolean)
  {
    int i = 0;
    if (i < this.hxp.size())
    {
      WeakReference localWeakReference = (WeakReference)this.hxp.get(i);
      if (localWeakReference != null)
      {
        f localf = (f)localWeakReference.get();
        if (localf != null)
          localf.onScrollStateChanged(paramBoolean);
      }
      while (true)
      {
        i++;
        break;
        this.hxp.remove(i);
        continue;
        this.hxp.remove(i);
      }
    }
  }

  public final void a(f paramf)
  {
    this.hxp.add(new WeakReference(paramf));
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.hxo != null)
      this.hxo.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 2)
      dd(true);
    while (true)
    {
      if (this.hxo != null)
        this.hxo.onScrollStateChanged(paramAbsListView, paramInt);
      return;
      dd(false);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e
 * JD-Core Version:    0.6.2
 */