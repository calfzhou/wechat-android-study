package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.z;

public class MMTextView extends TextView
{
  private boolean jcR = false;
  private em jcS = null;
  private GestureDetector jcT = null;

  public MMTextView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public MMTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public MMTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private void init()
  {
    this.jcT = new GestureDetector(getContext(), new el(this));
  }

  public final void a(em paramem)
  {
    this.jcS = paramem;
  }

  public void cancelLongPress()
  {
    z.d("!32@/B4Tb64lLpJ/g4sb0pugm9RTv6dIAy2a", "cancelLongPress , should ignore Action Up Event next time");
    this.jcR = true;
    super.cancelLongPress();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    int j = paramMotionEvent.getAction();
    if ((j == i) && (this.jcR))
    {
      int k = i;
      if (k == 0)
        break label42;
      z.d("!32@/B4Tb64lLpJ/g4sb0pugm9RTv6dIAy2a", "ignore Action Up Event this time");
    }
    while (true)
    {
      return i;
      int m = 0;
      break;
      label42: if (j == 0)
        this.jcR = false;
      if ((this.jcS != null) && (this.jcT != null));
      for (i = this.jcT.onTouchEvent(paramMotionEvent); i == 0; i = 0)
        return super.onTouchEvent(paramMotionEvent);
    }
  }

  public boolean performLongClick()
  {
    z.d("!32@/B4Tb64lLpJ/g4sb0pugm9RTv6dIAy2a", "performLongClick , should ignore Action Up Event next time");
    this.jcR = true;
    return super.performLongClick();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTextView
 * JD-Core Version:    0.6.2
 */