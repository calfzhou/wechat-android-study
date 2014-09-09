package com.tencent.mm.plugin.ext;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ci;
import java.util.Iterator;
import java.util.LinkedList;

final class i extends cm
{
  i(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    while (true)
    {
      String str;
      k localk;
      try
      {
        if (b.b(this.eLF).size() <= 0)
          return;
        Iterator localIterator = b.b(this.eLF).iterator();
        if (!localIterator.hasNext())
          break;
        str = (String)localIterator.next();
        if ("*".equals(str))
          continue;
        localk = l.F(str, true);
        if (localk == null)
        {
          z.w("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "appInfo is null");
          continue;
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "exception in onAppInfoStgChange, %s", arrayOfObject1);
        return;
      }
      if (com.tencent.mm.sdk.platformtools.ch.jb(localk.field_appId))
      {
        z.w("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "appId is null");
      }
      else
      {
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = str;
        arrayOfObject2[1] = Integer.valueOf(localk.field_appInfoFlag);
        arrayOfObject2[2] = localk.field_appId;
        z.d("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "onAppInfoStgChange, notify[%s], appFlag[%s], id[%s]", arrayOfObject2);
        com.tencent.mm.storage.ch localch = b.Qa().zP(localk.field_appId);
        if (localch == null)
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = localk.field_appId;
          z.w("!32@/B4Tb64lLpIAhUt0Bg2QTpTjMO1by0jp", "openMsgListener is null, appId = %s", arrayOfObject3);
        }
        else if (l.k(localk))
        {
          if (localch.field_status == 1)
            break;
        }
        else
        {
          for (localch.field_status = 1; ; localch.field_status = 0)
          {
            b.Qa().a(localk.field_appId, localch);
            break;
            if (localch.field_status == 0)
              break;
          }
        }
      }
    }
    b.b(this.eLF).clear();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.i
 * JD-Core Version:    0.6.2
 */