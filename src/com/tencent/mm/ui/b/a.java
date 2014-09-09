package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.tencent.mm.i;
import com.tencent.mm.k;
import java.lang.ref.WeakReference;

public final class a extends com.tencent.mm.pluginsdk.ui.a.b
{
  private View efu = null;
  private f iWo;
  private int iWp = 0;
  private ap iWq;
  private e iWr;

  public a(Context paramContext)
  {
    super(paramContext);
    if (this.view != null)
    {
      this.efu = this.view.findViewById(i.aeQ);
      this.iWq = new ap();
      this.iWq.iXd = this.efu;
      this.iWq.iXe = ((Button)this.view.findViewById(i.aes));
      this.iWq.iXe.setOnClickListener(new b(this));
      this.efu.setOnClickListener(new c(this));
    }
  }

  public final void aRn()
  {
    this.iWo = new f((Context)this.hCe.get());
    this.iWr = new d(this);
  }

  public final void aRo()
  {
    this.iWo = new f((Context)this.hCe.get());
  }

  public final void aRp()
  {
    this.iWo = null;
  }

  public final f aRq()
  {
    return this.iWo;
  }

  public final boolean du()
  {
    f localf = this.iWo;
    boolean bool = false;
    if (localf != null)
    {
      int i = this.iWo.getCount();
      bool = false;
      if (i > 0)
      {
        int j = this.iWo.pi(0).a(this.iWq);
        bool = false;
        if (j == 0)
          bool = true;
      }
    }
    return bool;
  }

  public final int getLayoutId()
  {
    return k.baI;
  }

  public final void setVisibility(int paramInt)
  {
    if (this.efu != null)
      this.efu.setVisibility(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.a
 * JD-Core Version:    0.6.2
 */