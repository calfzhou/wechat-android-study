package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.z;

public class TestTimeForChatting extends LinearLayout
{
  public final boolean DEBUG = true;
  public final String TAG = "!44@/B4Tb64lLpItTdpuA6oxWS/W5hNAWFGiw97iJPQYJL0=";
  private int jVp = 0;

  public TestTimeForChatting(Context paramContext)
  {
    super(paramContext);
  }

  public TestTimeForChatting(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void bba()
  {
    this.jVp = 0;
  }

  public final void bbb()
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.jVp);
    z.i("!44@/B4Tb64lLpItTdpuA6oxWS/W5hNAWFGiw97iJPQYJL0=", "klem frameCount:%d", arrayOfObject1);
    n localn = n.fTF;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(this.jVp);
    localn.d(11198, arrayOfObject2);
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    this.jVp = (1 + this.jVp);
    try
    {
      super.dispatchDraw(paramCanvas);
      n.fTF.jt(9);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        z.e("!44@/B4Tb64lLpItTdpuA6oxWS/W5hNAWFGiw97iJPQYJL0=", "dispatchDraw", new Object[] { localThrowable });
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.TestTimeForChatting
 * JD-Core Version:    0.6.2
 */