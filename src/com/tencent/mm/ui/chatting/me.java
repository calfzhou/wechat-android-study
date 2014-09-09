package com.tencent.mm.ui.chatting;

import android.os.Looper;
import com.tencent.mm.model.az;
import com.tencent.mm.model.y;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.storage.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class me
  implements az
{
  private final hd joF;
  private mj juy;

  public me(hd paramhd)
  {
    this.joF = paramhd;
    this.juy = new mj();
  }

  public final void Cq(String paramString)
  {
    if (ap.jb(paramString))
      return;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    a(localArrayList, true, false);
  }

  protected final void a(List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.juy.a(paramList, this.joF.h(), paramBoolean1, paramBoolean2);
  }

  public final void aWq()
  {
    this.juy.aWq();
  }

  public final void b(ar paramar)
  {
    this.joF.aVP();
    if ((!paramar.kt().equals(this.joF.aUL())) || (!paramar.aJD()))
      return;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramar.getContent());
    a(localArrayList, false, false);
  }

  public final void c(List paramList)
  {
    if (y.dc(this.joF.aUL()))
      return;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      ar localar = (ar)localIterator.next();
      if ((localar.kt().equals(this.joF.aUL())) && (localar.aJD()))
        localArrayList.add(localar.getContent());
    }
    a(localArrayList, false, false);
  }

  public final Looper getLooper()
  {
    return Looper.getMainLooper();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.me
 * JD-Core Version:    0.6.2
 */