package com.tencent.mm.ui.chatting;

import android.view.View;
import com.tencent.mm.pluginsdk.ui.EmojiView;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.z;

final class hy
  implements al
{
  hy(hd paramhd)
  {
  }

  public final void a(String paramString, ao paramao)
  {
    if (paramString.equals("create_emoji_info_notify"))
    {
      hd.o(this.jtA);
      return;
    }
    if (paramString.equals("delete_emoji_info_notify"))
    {
      hd.o(this.jtA);
      return;
    }
    EmojiView localEmojiView = (EmojiView)this.jtA.findViewById(EmojiView.vm(paramString));
    if (localEmojiView != null)
    {
      localEmojiView.refresh();
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "emojiview update");
      return;
    }
    this.jtA.aPH().invalidate();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.hy
 * JD-Core Version:    0.6.2
 */