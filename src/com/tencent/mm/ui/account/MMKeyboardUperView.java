package com.tencent.mm.ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.mm.sdk.platformtools.z;

public class MMKeyboardUperView extends ScrollView
{
  private int defaultHeight = -1;
  private View iPY;
  private Runnable iPZ = new ec(this);
  private Runnable iQa = new ed(this);

  public MMKeyboardUperView(Context paramContext)
  {
    super(paramContext);
  }

  public MMKeyboardUperView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public MMKeyboardUperView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void an(View paramView)
  {
    this.iPY = paramView;
    this.defaultHeight = -1;
  }

  public final void bd(int paramInt1, int paramInt2)
  {
    z.d("!44@/B4Tb64lLpICoG9rhJuc+TFgjqHr5i5P3+F8OjrD0os=", "onLayoutChange h " + paramInt1 + "  oh " + paramInt2);
    if (this.defaultHeight == -1)
      this.defaultHeight = paramInt1;
    if (paramInt1 == this.defaultHeight)
    {
      this.iPY.post(this.iQa);
      return;
    }
    this.iPY.post(this.iPZ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.MMKeyboardUperView
 * JD-Core Version:    0.6.2
 */