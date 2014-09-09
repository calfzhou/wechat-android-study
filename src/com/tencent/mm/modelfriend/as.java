package com.tencent.mm.modelfriend;

import com.tencent.mm.n.af;
import com.tencent.mm.n.x;
import com.tencent.mm.n.y;
import com.tencent.mm.protocal.a.qy;
import com.tencent.mm.protocal.a.ra;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;

final class as
  implements aq
{
  as(ar paramar, ra paramra)
  {
  }

  public final boolean rD()
  {
    if ((this.dui != null) && (this.dui.igB.size() > 0))
    {
      Iterator localIterator = this.dui.igB.iterator();
      while (localIterator.hasNext())
      {
        qy localqy = (qy)localIterator.next();
        if (localqy.dZy == 1)
        {
          x localx = new x();
          localx.setUsername(localqy.gnq);
          localx.fe(localqy.hTy);
          localx.ff(localqy.hTz);
          localx.db(-1);
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = localx.getUsername();
          arrayOfObject[1] = localx.st();
          arrayOfObject[2] = localx.su();
          z.d("!44@/B4Tb64lLpK+IBX8XDgnvpKCE3nz9A0+zImqOl2Mqc8=", "getmlist  %s b[%s] s[%s]", arrayOfObject);
          localx.bi(3);
          localx.T(true);
          af.sJ().a(localx);
        }
      }
    }
    return true;
  }

  public final boolean rE()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.as
 * JD-Core Version:    0.6.2
 */