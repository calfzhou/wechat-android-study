package com.tencent.mm.ui.tools;

import android.annotation.TargetApi;
import android.support.v4.view.ca;
import android.view.View;

public final class k
  implements ca
{
  @TargetApi(11)
  public final void a(View paramView, float paramFloat)
  {
    if (paramFloat >= -1.0F)
    {
      if (paramFloat <= 0.0F)
      {
        paramView.setAlpha(1.0F + paramFloat);
        paramView.setTranslationX(0.0F);
        paramView.setScaleX(1.0F);
        paramView.setScaleY(1.0F);
        return;
      }
      if (paramFloat <= 1.0F)
      {
        paramView.setAlpha(1.0F - paramFloat);
        paramView.setTranslationX(0.0F);
        paramView.setScaleX(1.0F);
        paramView.setScaleY(1.0F);
        return;
      }
    }
    paramView.setAlpha(0.0F);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.k
 * JD-Core Version:    0.6.2
 */