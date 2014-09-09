package com.tencent.mm.pluginsdk.model.app;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class j extends cm
{
  j(h paramh)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    y localy = (y)paramMessage.obj;
    v localv1 = new v(localy.appId, localy.dSC);
    if (h.b(this.huL).contains(localv1))
    {
      h.b(this.huL).remove(localv1);
      if (!bf.GO().c(localy.appId, localy.data, localy.dSC))
        z.e("!32@/B4Tb64lLpLMN5rZgw2Mb59nLZg7Js/O", "handleMessage, saveIcon fail");
    }
    while (h.c(this.huL).size() > 0)
    {
      v localv2 = (v)h.c(this.huL).remove(0);
      if (h.a(this.huL, localv2))
        h.b(this.huL).add(localv2);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.j
 * JD-Core Version:    0.6.2
 */