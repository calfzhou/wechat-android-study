package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.i;
import com.tencent.mm.k;
import java.util.HashMap;
import java.util.Map;

public class MMPageControlView extends LinearLayout
{
  private Context context;
  private int count;
  private ImageView eEg;
  private int jaI = k.bjM;
  private Map map = new HashMap();

  public MMPageControlView(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
  }

  public MMPageControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }

  private void pD(int paramInt)
  {
    removeAllViews();
    if (paramInt >= this.count)
      return;
    int i = this.count;
    int j = 0;
    label20: if (j < i)
    {
      if (paramInt != j)
        break label137;
      this.eEg = ((ImageView)this.map.get(Integer.valueOf(j)));
      if (this.eEg == null)
      {
        this.eEg = ((ImageView)View.inflate(this.context, this.jaI, null).findViewById(i.aEx));
        this.map.put(Integer.valueOf(j), this.eEg);
      }
      this.eEg.setSelected(true);
    }
    while (true)
    {
      if (j == 0)
        this.eEg.setPadding(0, 0, 0, 0);
      addView(this.eEg);
      j++;
      break label20;
      break;
      label137: this.eEg = ((ImageView)this.map.get(Integer.valueOf(j)));
      if (this.eEg == null)
      {
        this.eEg = ((ImageView)View.inflate(this.context, this.jaI, null).findViewById(i.aEx));
        this.map.put(Integer.valueOf(j), this.eEg);
      }
      this.eEg.setSelected(false);
    }
  }

  public final void bg(int paramInt1, int paramInt2)
  {
    this.count = paramInt1;
    pD(paramInt2);
  }

  public final void pB(int paramInt)
  {
    pD(paramInt);
  }

  public final void pC(int paramInt)
  {
    this.jaI = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMPageControlView
 * JD-Core Version:    0.6.2
 */