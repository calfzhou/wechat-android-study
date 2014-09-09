package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;

public class MMLoadMoreListView extends ListView
{
  private View eCE = null;
  private boolean jaA = false;
  private TextView jaB;
  private cf jaz = null;

  public MMLoadMoreListView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public MMLoadMoreListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public MMLoadMoreListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private void aSd()
  {
    this.eCE = View.inflate(getContext(), k.bit, null);
    this.jaB = ((TextView)this.eCE.findViewById(i.aut));
    this.eCE.setVisibility(8);
  }

  private void init()
  {
    if (this.eCE == null)
    {
      aSd();
      addFooterView(this.eCE);
      this.eCE.setVisibility(8);
    }
  }

  public final void BP(String paramString)
  {
    this.jaB.setText(paramString);
  }

  public final void a(cf paramcf)
  {
    this.jaz = paramcf;
  }

  public final void aSe()
  {
    if (this.eCE == null)
      aSd();
    try
    {
      removeFooterView(this.eCE);
      addFooterView(this.eCE);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final boolean aSf()
  {
    return this.jaA;
  }

  public final void aSg()
  {
    this.jaA = true;
    setOnScrollListener(new ce(this));
  }

  public final void aSh()
  {
    if (this.eCE != null)
    {
      this.jaB.setVisibility(8);
      this.eCE.setVisibility(8);
    }
  }

  public final void aSi()
  {
    this.jaB.setVisibility(0);
    this.eCE.setVisibility(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMLoadMoreListView
 * JD-Core Version:    0.6.2
 */