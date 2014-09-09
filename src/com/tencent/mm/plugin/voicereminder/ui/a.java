package com.tencent.mm.plugin.voicereminder.ui;

import com.tencent.mm.plugin.voicereminder.a.k;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class a
  implements k
{
  a(RemindDialog paramRemindDialog)
  {
  }

  public final void m(String paramString, long paramLong)
  {
    z.d("!32@/B4Tb64lLpJfDXyKelEN4nDZk7Tu4Frw", "onVoiceRemind " + paramString);
    RemindDialog.a(this.gTb).add(paramString);
    RemindDialog.b(this.gTb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.ui.a
 * JD-Core Version:    0.6.2
 */