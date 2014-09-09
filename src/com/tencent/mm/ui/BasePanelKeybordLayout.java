package com.tencent.mm.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.compatible.g.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public abstract class BasePanelKeybordLayout extends KeyboardLinearLayout
{
  private int hEc = -1;

  public BasePanelKeybordLayout(Context paramContext)
  {
    super(paramContext);
  }

  public BasePanelKeybordLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected abstract View aot();

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(i);
    arrayOfObject1[1] = Integer.valueOf(j);
    z.d("!44@/B4Tb64lLpJsVdmH+NTxJtbiDDQ2LHTrqCpSsv0IxKQ=", "onMeasure, width: %d, height: %d", arrayOfObject1);
    if (j >= 0)
    {
      if (this.hEc >= 0)
        break label68;
      this.hEc = j;
    }
    label68: int k;
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    do
    {
      do
      {
        do
        {
          super.onMeasure(paramInt1, paramInt2);
          return;
          k = this.hEc - j;
          this.hEc = j;
        }
        while (k == 0);
        localView = aot();
      }
      while (localView == null);
      localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
    }
    while (localLayoutParams == null);
    if (localLayoutParams.height < 0);
    for (int m = 0; ; m = localLayoutParams.height - k)
    {
      if (m < 0)
        m = 0;
      int n = n.R(ak.getContext());
      int i1 = n.U(getContext());
      if ((n.nO() > 0) && (j >= n.nO()))
        m = i1;
      if ((m > 0) && (m < n) && (localView.getVisibility() != 0))
        m = 0;
      if (m > n.Q(getContext()))
        m = i1;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(localLayoutParams.height);
      arrayOfObject2[1] = Integer.valueOf(k);
      arrayOfObject2[2] = Integer.valueOf(m);
      z.d("!44@/B4Tb64lLpJsVdmH+NTxJtbiDDQ2LHTrqCpSsv0IxKQ=", "oldHeight: %d, offset: %d newHeight: %d", arrayOfObject2);
      localLayoutParams.height = m;
      localView.setLayoutParams(localLayoutParams);
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.BasePanelKeybordLayout
 * JD-Core Version:    0.6.2
 */