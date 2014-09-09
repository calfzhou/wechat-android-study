package com.tencent.mm.q;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.f.ap;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;

final class t
  implements as
{
  t(s params)
  {
  }

  public final void a(int paramInt, ap paramap, Object paramObject)
  {
    if ((s.a(this.dqU).equals((String)paramObject)) && (s.b(this.dqU) == 1))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = s.a(this.dqU);
      z.d("!32@/B4Tb64lLpL9SB0DqhCSWgFPYrICdb5Q", "contactStgUpdate, %s", arrayOfObject);
      this.dqU.fI(s.a(this.dqU));
      bg.qW().oT().b(s.c(this.dqU));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.t
 * JD-Core Version:    0.6.2
 */