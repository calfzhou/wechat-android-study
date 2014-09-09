package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.f.c.n;

public class TestTimeForSns extends FrameLayout
{
  public final boolean DEBUG = true;
  public final String TAG = "!32@/B4Tb64lLpItTdpuA6oxWRdwg5f05xk5";

  public TestTimeForSns(Context paramContext)
  {
    super(paramContext);
  }

  public TestTimeForSns(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
    n.fTF.jt(10);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.TestTimeForSns
 * JD-Core Version:    0.6.2
 */