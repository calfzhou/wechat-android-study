package com.tencent.mm.ui.b;

import android.content.Context;
import android.view.View;
import com.tencent.mm.c.a.ad;
import com.tencent.mm.c.a.ae;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;

public final class q extends b
{
  private boolean hasInit = false;

  public q(Context paramContext)
  {
    super(paramContext);
    Tb();
  }

  private void Tb()
  {
    View localView;
    if (this.view != null)
    {
      localView = this.view.findViewById(i.auB);
      if (!this.hasInit);
    }
    else
    {
      return;
    }
    this.hasInit = true;
    localView.setOnClickListener(new r(this));
    localView.setVisibility(8);
  }

  public final void HA()
  {
    if (!this.hasInit)
    {
      Tb();
      return;
    }
    int i = bg.qX().tw();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(i);
    z.i("!32@/B4Tb64lLpKpOnH56/zYel/7+zg+ELv3", "now network state : %d", arrayOfObject1);
    View localView = this.view.findViewById(i.auB);
    if (i == 0)
    {
      localView.setVisibility(8);
      return;
    }
    ad localad = new ad();
    a.aGB().g(localad);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(localad.cHI.state);
    z.i("!32@/B4Tb64lLpKpOnH56/zYel/7+zg+ELv3", "check is wechat freewifi state : %d", arrayOfObject2);
    switch (localad.cHI.state)
    {
    default:
      localView.setVisibility(8);
      return;
    case 2:
    }
    localView.setVisibility(0);
  }

  public final int getLayoutId()
  {
    return k.bfP;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.q
 * JD-Core Version:    0.6.2
 */