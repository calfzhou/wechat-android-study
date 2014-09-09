package com.tencent.mm.pluginsdk.ui;

import android.os.Message;
import com.tencent.mm.c.a.ht;
import com.tencent.mm.c.a.hu;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class az extends g
{
  az(ax paramax)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    z.d("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", " jacks call back notify smileygrid");
    ht localht = (ht)parame;
    Message localMessage = new Message();
    localMessage.obj = localht.cMr.cDa;
    ax.a(this.hzD).sendMessage(localMessage);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.az
 * JD-Core Version:    0.6.2
 */