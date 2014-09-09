package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.modelmsg.WXEmojiObject;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.y.ag;

final class ly
  implements DialogInterface.OnClickListener
{
  ly(lx paramlx, boolean paramBoolean, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((this.jus) && (this.jut.jtA.fpD != null) && (this.jut.jtA.fpD.aBM() != null) && ((this.jut.jtA.fpD.aBM() instanceof gy)))
    {
      WXMediaMessage localWXMediaMessage = new WXMediaMessage(new WXEmojiObject(this.fqs));
      String str = g.axR().b(this.jut.jtA.agh(), localWXMediaMessage, null);
      if (str != null)
        ((gy)this.jut.jtA.fpD.aBM()).d(g.axR().ly(str));
      return;
    }
    ag localag = new ag(5, this.jut.jtA.zj(), this.jut.jtA.aUL(), this.fqs, 0, null, 0, "", "", true, h.Ti);
    bg.qX().d(localag);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ly
 * JD-Core Version:    0.6.2
 */