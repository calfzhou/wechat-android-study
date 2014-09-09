package com.tencent.mm.pluginsdk.ui.chat;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.pluginsdk.model.app.bo;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

final class r
  implements View.OnClickListener
{
  r(ChatFooter paramChatFooter)
  {
  }

  public final void onClick(View paramView)
  {
    ChatFooter.i(this.hDT).YV();
    if ((ChatFooter.m(this.hDT).getVisibility() == 0) && (!ChatFooter.h(this.hDT).aCE()))
    {
      if (ChatFooter.n(this.hDT) == 1)
      {
        this.hDT.aep();
        return;
      }
      this.hDT.aCp();
      return;
    }
    this.hDT.aCr();
    if ((ChatFooter.o(this.hDT) != null) && (ChatFooter.o(this.hDT).getVisibility() == 0))
    {
      z.d("!32@/B4Tb64lLpJ/7uFBkt7iPG30XecwVaGJ", "voiceInputPanel is VISIBLE, set appPanel VISIBLE");
      ChatFooter.o(this.hDT).setVisibility(8);
      ChatFooter.o(this.hDT).reset();
    }
    bo.azd().bh(ak.getContext());
    bo.azd();
    ak.getContext();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.r
 * JD-Core Version:    0.6.2
 */