package com.tencent.mm.ui.chatting;

import android.text.TextUtils;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;

final class hz
  implements al
{
  hz(hd paramhd)
  {
  }

  public final void a(String paramString, ao paramao)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals("event_update_group")))
      hd.o(this.jtA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hz
 * JD-Core Version:    0.6.2
 */