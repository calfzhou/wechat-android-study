package com.tencent.mm.ui.base;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public class MMFalseProgressBar extends ProgressBar
{
  private boolean iYJ = false;
  private float iYK = 0.0F;
  private float iYL;
  private float iYM;
  private float iYN;
  private float iYO;
  private cm mHandler = new av(this, Looper.getMainLooper());

  public MMFalseProgressBar(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMFalseProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMFalseProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setMax(1000);
  }

  public final void finish()
  {
    z.d("!44@/B4Tb64lLpIgFH7tRrb7XIDRWwDi3rpMvhPURIsL2LQ=", "[cpan] finish");
    if (this.mHandler != null)
      this.mHandler.sendEmptyMessage(1002);
  }

  public final void start()
  {
    z.d("!44@/B4Tb64lLpIgFH7tRrb7XIDRWwDi3rpMvhPURIsL2LQ=", "[cpan] start");
    if (this.iYJ);
    while (true)
    {
      return;
      this.iYJ = true;
      if (bc.bZ(getContext()))
      {
        this.iYL = 4.0F;
        this.iYM = 1.0F;
        this.iYN = 0.3F;
      }
      for (this.iYO = 50.0F; this.mHandler != null; this.iYO = 50.0F)
      {
        this.mHandler.sendEmptyMessage(1000);
        this.mHandler.sendEmptyMessage(1001);
        return;
        this.iYL = 2.0F;
        this.iYM = 0.5F;
        this.iYN = 0.15F;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFalseProgressBar
 * JD-Core Version:    0.6.2
 */