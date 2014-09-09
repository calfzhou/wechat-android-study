package com.tencent.mm.model;

import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.storage.s;

final class bz
  implements Runnable
{
  bz(cd paramcd)
  {
  }

  public final void run()
  {
    if ((this.dlB == null) || (!this.dlB.rw()))
    {
      bg.qW().oW().aIC();
      if ((this.dlB == null) || (!this.dlB.rw()))
      {
        bw.rs();
        if ((this.dlB == null) || (!this.dlB.rw()))
        {
          bw.rt();
          if ((this.dlB == null) || (!this.dlB.rw()))
          {
            bw.rr();
            if ((this.dlB == null) || (!this.dlB.rw()))
              bw.ru();
          }
        }
      }
    }
    if (this.dlB != null)
      am.h(new ca(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bz
 * JD-Core Version:    0.6.2
 */