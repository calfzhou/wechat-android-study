package com.tencent.mm.ui;

import android.os.Looper;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

final class u
{
  private w iIC;
  private x iID;
  private LinkedList iIE;
  private int iIF;

  public u(n paramn)
  {
    aOO();
  }

  private void aOO()
  {
    this.iIC = new w(this, Looper.getMainLooper());
    this.iID = new x(this, bg.qQ().getLooper());
  }

  private void aOP()
  {
    x.a(this.iID);
    this.iIC.clear();
    this.iIE.clear();
    this.iIF = 0;
  }

  private int aOR()
  {
    int j;
    if (this.iIE.size() > 1)
      j = 2;
    int i;
    do
    {
      return j;
      i = this.iIE.size();
      j = 0;
    }
    while (i != 1);
    return ((Integer)this.iIE.get(0)).intValue();
  }

  private void aOT()
  {
    try
    {
      this.iID.lastUpdateTime = System.currentTimeMillis();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private int aOU()
  {
    try
    {
      int i = this.iIF;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void oF(int paramInt)
  {
    try
    {
      if (!this.iIE.contains(Integer.valueOf(paramInt)))
        this.iIE.add(Integer.valueOf(paramInt));
      this.iIF = aOR();
      x.b(this.iID);
      return;
    }
    finally
    {
    }
  }

  public final void aOQ()
  {
    try
    {
      z.i(this.iIy.TAG, "newcursor resetQueue ");
      aOP();
      aOO();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean aOS()
  {
    try
    {
      int i = this.iIF;
      if (i != 0)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public final void quit()
  {
    try
    {
      z.i(this.iIy.TAG, "newcursor quit ");
      aOP();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u
 * JD-Core Version:    0.6.2
 */