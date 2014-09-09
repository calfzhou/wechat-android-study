package com.tencent.mm.ui.chatting;

import com.tencent.mm.model.cx;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.pluginsdk.ui.applet.aa;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.platformtools.z;

final class pl
  implements aa
{
  pl(pj parampj, WXMediaMessage paramWXMediaMessage, k paramk)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    if (paramBoolean)
    {
      int i = this.jwT.getType();
      str = null;
      if (i != 8)
        break label85;
      if (this.jwT.thumbData == null)
        z.e("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "code should not reach here due to WXMediaMessage::checkArgs, sendEmoji Fail cause thumbData is null");
    }
    else
    {
      return;
    }
    String str = g.axR().b(pj.a(this.jwV).agh(), this.jwT, this.jwU.field_appId);
    if (str == null)
    {
      z.v("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "sendEmoji Fail cause emojiconmd5 is null");
      return;
    }
    label85: cx localcx = cx.rV();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(1);
    localcx.a(27, arrayOfObject1);
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = this.jwT.messageAction;
    arrayOfObject2[1] = this.jwT.messageExt;
    z.v("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "onDialogClick, messageAction = %s, messageExt = %s", arrayOfObject2);
    s.a(this.jwT, this.jwU.field_appId, this.jwU.field_appName, pj.a(this.jwV).aUL(), 1, str);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.pl
 * JD-Core Version:    0.6.2
 */