package com.tencent.mm.booter;

import com.tencent.mm.model.aj;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bk;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  implements aj
{
  private bi dho = new bi();
  private bk dhp = new b(this);
  private List dhq = new ArrayList();
  private g dhr;

  public a()
  {
    this.dho.a(this.dhp);
    this.dho.ca(com.tencent.mm.sdk.platformtools.ak.getContext());
    if (this.dhr == null)
      this.dhr = new c(this);
    com.tencent.mm.sdk.c.a.aGB().a("RecordStateChange", this.dhr);
  }

  public final void a(com.tencent.mm.model.ak paramak)
  {
    if (paramak != null)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramak.toString();
      z.d("!44@/B4Tb64lLpI7uCMufYgkMolJsZYezO/Lsg5Y9fbkrg4=", "add callback : %s", arrayOfObject);
      this.dhq.add(paramak);
    }
  }

  public final void b(com.tencent.mm.model.ak paramak)
  {
    if (paramak != null)
      this.dhq.remove(paramak);
  }

  public final void kG()
  {
    if (this.dhq == null);
    while (true)
    {
      return;
      Iterator localIterator = this.dhq.iterator();
      while (localIterator.hasNext())
        ((com.tencent.mm.model.ak)localIterator.next()).qv();
    }
  }

  public final void kH()
  {
    if (this.dhq == null);
    while (true)
    {
      return;
      Iterator localIterator = this.dhq.iterator();
      while (localIterator.hasNext())
        ((com.tencent.mm.model.ak)localIterator.next()).qw();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.a
 * JD-Core Version:    0.6.2
 */