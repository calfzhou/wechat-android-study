package com.tencent.mm.plugin.f.c;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.z;

final class o
  implements br
{
  x fTK;
  final int type;

  public o(int paramInt)
  {
    this.type = paramInt;
  }

  public final boolean rD()
  {
    this.fTK = k.jv(this.type);
    Object[] arrayOfObject = new Object[2];
    if (this.fTK == null);
    for (boolean bool = true; ; bool = false)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      arrayOfObject[1] = Integer.valueOf(this.type);
      z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "doInBackground : result is null ? %B, type = %d", arrayOfObject);
      if (this.fTK == null)
        break;
      return true;
    }
    return false;
  }

  public final boolean rE()
  {
    Object[] arrayOfObject1 = new Object[2];
    if (this.fTK == null);
    for (boolean bool = true; ; bool = false)
    {
      arrayOfObject1[0] = Boolean.valueOf(bool);
      arrayOfObject1[1] = Integer.valueOf(this.type);
      z.v("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "onPostExecute : result is null ? %B, type = %d", arrayOfObject1);
      if (this.fTK != null)
      {
        bg.qX().d(this.fTK);
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(this.type);
        z.d("!32@/B4Tb64lLpJlEqDd0Ubo4DOSRDszeCSB", "do scene end, type = %d", arrayOfObject2);
      }
      return false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.o
 * JD-Core Version:    0.6.2
 */