package com.tencent.mm.ui.base;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.tencent.mm.aq.a;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;

final class gg
  implements View.OnTouchListener
{
  gg(VoiceSearchEditText paramVoiceSearchEditText)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    VoiceSearchEditText localVoiceSearchEditText = this.jgk;
    if (localVoiceSearchEditText.getCompoundDrawables()[2] == null)
      return false;
    if (paramMotionEvent.getAction() != 1)
      return true;
    VoiceSearchEditText.a(this.jgk, true);
    if ((VoiceSearchEditText.a(this.jgk)) && (VoiceSearchEditText.b(this.jgk)) && (localVoiceSearchEditText.getText().toString().equals("")))
      if (paramMotionEvent.getX() > localVoiceSearchEditText.getWidth() - localVoiceSearchEditText.getPaddingRight() - this.jgk.jgd.getIntrinsicWidth() - a.fromDPToPix(VoiceSearchEditText.c(localVoiceSearchEditText), 25))
      {
        if (VoiceSearchEditText.d(this.jgk) != null)
        {
          z.i("!44@/B4Tb64lLpKCGRi+LcyHSHn3YP/tfzozJcQbNm6H6Is=", "user clicked voice button");
          if ((this.jgk.getContext() instanceof MMActivity))
            ((MMActivity)this.jgk.getContext()).ak(localVoiceSearchEditText);
          VoiceSearchEditText.d(this.jgk).onClick(this.jgk);
          return true;
        }
      }
      else
      {
        localVoiceSearchEditText.requestFocus();
        if ((this.jgk.getContext() instanceof Activity))
          MMActivity.k((Activity)this.jgk.getContext());
        if (VoiceSearchEditText.d(this.jgk) != null)
          VoiceSearchEditText.d(this.jgk).onClick(null);
      }
    while (true)
    {
      return false;
      if (localVoiceSearchEditText.getText().toString().length() > 0)
      {
        if (paramMotionEvent.getX() > localVoiceSearchEditText.getWidth() - localVoiceSearchEditText.getPaddingRight() - this.jgk.jgf.getIntrinsicWidth() - a.fromDPToPix(VoiceSearchEditText.c(localVoiceSearchEditText), 25))
        {
          localVoiceSearchEditText.setText("");
          if (VoiceSearchEditText.e(this.jgk) != null)
            VoiceSearchEditText.e(this.jgk);
          VoiceSearchEditText.f(this.jgk);
        }
        else if (!localVoiceSearchEditText.isFocused())
        {
          localVoiceSearchEditText.requestFocus();
          if ((this.jgk.getContext() instanceof Activity))
            MMActivity.k((Activity)this.jgk.getContext());
        }
      }
      else if (VoiceSearchEditText.d(this.jgk) != null)
        VoiceSearchEditText.d(this.jgk).onClick(null);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.gg
 * JD-Core Version:    0.6.2
 */