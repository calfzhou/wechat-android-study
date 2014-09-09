package com.tencent.mm.ui.voicetranstext;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.e;

final class f
  implements View.OnLongClickListener
{
  f(VoiceTransTextUI paramVoiceTransTextUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "onLongClick");
    VoiceTransTextUI localVoiceTransTextUI = this.kav;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.kav.getString(n.bsO);
    e.b(localVoiceTransTextUI, "", arrayOfString, "", new g(this));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.f
 * JD-Core Version:    0.6.2
 */