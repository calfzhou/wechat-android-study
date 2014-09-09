package com.tencent.mm.ad;

import com.tencent.mm.a.c;
import com.tencent.mm.compatible.loader.PluginDescription;
import com.tencent.mm.compatible.loader.p;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ab;
import com.tencent.mm.o.ac;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class w
  implements com.tencent.mm.o.m
{
  private static w jDv;
  private boolean dAf = false;
  private x jDD;
  private final int jzC = 20;

  public static w ajw()
  {
    if (jDv == null)
      jDv = new w();
    return jDv;
  }

  private void nJ(int paramInt)
  {
    String str1 = s.yO().yL();
    String str2 = s.yO().E(paramInt, 20);
    z.i("!44@/B4Tb64lLpJEyWUfDP74gssDFzpBG4jiIl8zKi8Rr34=", "savePluginDescription path: %s, name %s", new Object[] { str1, str2 });
    try
    {
      String str3 = c.af(c.k(str1, str2));
      z.i("!44@/B4Tb64lLpJEyWUfDP74gssDFzpBG4jiIl8zKi8Rr34=", "save PluginDescription %s", new Object[] { str3 });
      Iterator localIterator = com.tencent.mm.compatible.loader.j.cE(str3).iterator();
      while (localIterator.hasNext())
        p.b((PluginDescription)localIterator.next());
      this.jDD.onComplete();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  private void release()
  {
    z.i("!44@/B4Tb64lLpJEyWUfDP74gssDFzpBG4jiIl8zKi8Rr34=", "release");
    this.dAf = false;
    bg.qX().b(159, this);
    bg.qX().b(160, this);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    int i = 0;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramx.getType());
    z.i("!44@/B4Tb64lLpJEyWUfDP74gssDFzpBG4jiIl8zKi8Rr34=", "onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", arrayOfObject);
    if ((!(paramx instanceof ab)) || (((ab)paramx).tu() != 20))
    {
      z.i("!44@/B4Tb64lLpJEyWUfDP74gssDFzpBG4jiIl8zKi8Rr34=", "another scene");
      return;
    }
    int j = paramx.getType();
    l[] arrayOfl;
    label138: l locall;
    if (j == 159)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        arrayOfl = s.yO().ed(20);
        if ((arrayOfl == null) || (arrayOfl.length == 0))
        {
          z.i("!44@/B4Tb64lLpJEyWUfDP74gssDFzpBG4jiIl8zKi8Rr34=", "error no pkg found.");
          release();
          return;
        }
        int k = arrayOfl.length;
        if (i >= k)
          break label342;
        locall = arrayOfl[i];
        if (locall.getId() != a.hNc);
      }
    while (true)
    {
      if (locall == null)
      {
        locall = arrayOfl[(-1 + arrayOfl.length)];
        z.e("!44@/B4Tb64lLpJEyWUfDP74gssDFzpBG4jiIl8zKi8Rr34=", "Can not match SHOOT_PLUGIN_PKG_INDEX");
      }
      z.i("!44@/B4Tb64lLpJEyWUfDP74gssDFzpBG4jiIl8zKi8Rr34=", "dkregcode Pkg id:" + locall.getId() + " version:" + locall.getVersion() + " status:" + locall.getStatus() + " type:" + locall.yJ());
      if (5 == locall.getStatus())
      {
        j localj = new j(locall.getId(), 20);
        bg.qX().d(localj);
        return;
        i++;
        break label138;
      }
      release();
      nJ(locall.getId());
      return;
      release();
      return;
      if (j != 160)
        break;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        nJ(((j)paramx).yI());
      release();
      return;
      label342: locall = null;
    }
  }

  public final void a(x paramx)
  {
    this.jDD = paramx;
  }

  public final void update()
  {
    if (!this.dAf)
    {
      release();
      this.dAf = true;
      bg.qX().a(159, this);
      bg.qX().a(160, this);
      k localk = new k(20);
      bg.qX().d(localk);
      return;
    }
    z.i("!44@/B4Tb64lLpJEyWUfDP74gssDFzpBG4jiIl8zKi8Rr34=", "is Updating");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.w
 * JD-Core Version:    0.6.2
 */