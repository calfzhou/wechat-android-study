package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.mm.sdk.platformtools.z;

final class gi
  implements View.OnFocusChangeListener
{
  gi(VoiceSearchEditText paramVoiceSearchEditText)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = Boolean.valueOf(VoiceSearchEditText.g(this.jgk));
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSHn3YP/tfzozJcQbNm6H6Is=", "onFocusChange hasFocus = [%s], currentFocusState = [%s]", arrayOfObject);
    if ((!paramBoolean) && (VoiceSearchEditText.g(this.jgk)))
    {
      VoiceSearchEditText.f(this.jgk);
      VoiceSearchEditText.a(this.jgk, false);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.gi
 * JD-Core Version:    0.6.2
 */