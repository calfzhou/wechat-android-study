package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import com.tencent.mm.l;
import com.tencent.mm.n;
import com.tencent.mm.o.r;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class cd
  implements az
{
  cd(bw parambw)
  {
  }

  public final boolean kJ()
  {
    long l = bw.a(this.jor).tg();
    z.d("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "ms " + l);
    if ((l >= 50000L) && (l <= 60000L))
    {
      if (!bw.m(this.jor))
      {
        ch.bG(bw.f(this.jor).agh());
        bw.a(this.jor, true);
      }
      int i = (int)((60000L - l) / 1000L);
      ChatFooter localChatFooter = bw.d(this.jor);
      Resources localResources = bw.f(this.jor).getResources();
      int j = l.bqz;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      localChatFooter.vE(localResources.getQuantityString(j, i, arrayOfObject));
    }
    if (l >= 60000L)
    {
      z.v("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "record stop on countdown");
      bw.n(this.jor);
      bw.d(this.jor).St();
      bl.z(bw.f(this.jor).agh(), n.cmp);
      return false;
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cd
 * JD-Core Version:    0.6.2
 */