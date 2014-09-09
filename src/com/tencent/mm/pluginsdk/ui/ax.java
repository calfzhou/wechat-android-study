package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.mm.ar.d;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ad;
import java.util.ArrayList;

final class ax extends BaseAdapter
{
  private ArrayList hzA;
  private com.tencent.mm.sdk.c.g hzB = null;
  private cm hzC = new ay(this);
  private final String hzz = "lock_emoji_async";

  public ax(SmileyGrid paramSmileyGrid)
  {
  }

  private ad mu(int paramInt)
  {
    try
    {
      if (this.hzA == null)
      {
        z.v("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", "jacks catch cache emoji info list null but request getView!. pass~");
        return null;
      }
      if (this.hzA.size() <= paramInt)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(this.hzA.size());
        arrayOfObject[1] = Integer.valueOf(paramInt);
        z.v("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", "jacks catch cache emoji beyond size, size: %d, position: %d", arrayOfObject);
        return null;
      }
    }
    finally
    {
    }
    ad localad = (ad)this.hzA.get(paramInt);
    return localad;
  }

  public final void aAp()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = SmileyGrid.e(this.hzy);
    arrayOfObject[1] = Integer.valueOf(this.hzy.hzq);
    z.d("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", "jacks add addRePullEmojiInfoDescListener: %s - %d", arrayOfObject);
    if (this.hzB == null)
    {
      this.hzB = new az(this);
      com.tencent.mm.sdk.c.a.aGB().a("RePullEmojiInfoDesc", this.hzB);
    }
  }

  public final void aAq()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = SmileyGrid.e(this.hzy);
    arrayOfObject[1] = Integer.valueOf(this.hzy.hzq);
    z.i("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", "jacks remove: %s, %d", arrayOfObject);
    if (this.hzB != null)
    {
      com.tencent.mm.sdk.c.a.aGB().b("RePullEmojiInfoDesc", this.hzB);
      this.hzB = null;
    }
  }

  public final int getCount()
  {
    if (SmileyGrid.a(this.hzy) == 20)
      return this.hzy.hzo;
    if ((SmileyGrid.a(this.hzy) == 23) || (SmileyGrid.a(this.hzy) == 25))
    {
      if (this.hzy.hzq == -1 + SmileyGrid.f(this.hzy))
      {
        if (SmileyGrid.c(this.hzy) - this.hzy.hzq * this.hzy.hzo == -1)
          return 0;
        return SmileyGrid.c(this.hzy) - this.hzy.hzq * this.hzy.hzo;
      }
      return this.hzy.hzo;
    }
    return this.hzy.hzo;
  }

  public final Object getItem(int paramInt)
  {
    try
    {
      if (this.hzA == null)
        return null;
      if ((SmileyGrid.a(this.hzy) == 25) && (paramInt + this.hzy.hzq * this.hzy.hzo == this.hzA.size()))
        return null;
    }
    finally
    {
    }
    return mu(paramInt + this.hzy.hzq * this.hzy.hzo);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ba localba2;
    switch (SmileyGrid.a(this.hzy))
    {
    case 21:
    case 22:
    case 24:
    default:
      localba2 = (ba)paramView.getTag();
      switch (SmileyGrid.a(this.hzy))
      {
      case 21:
      case 22:
      case 24:
      default:
      case 23:
      case 25:
      case 20:
      }
      break;
    case 23:
    case 25:
    case 20:
    }
    ad localad;
    do
    {
      return paramView;
      if (paramView == null)
      {
        ba localba3 = new ba(this);
        paramView = View.inflate(SmileyGrid.g(this.hzy), k.bnu, null);
        localba3.hzF = paramView.findViewById(com.tencent.mm.i.aQs);
        localba3.fpi = ((ImageView)paramView.findViewById(com.tencent.mm.i.agC));
        localba3.hzE = ((TextView)paramView.findViewById(com.tencent.mm.i.agE));
        localba3.hzG = ((TextView)paramView.findViewById(com.tencent.mm.i.agB));
        localba3.hzH = ((TextView)paramView.findViewById(com.tencent.mm.i.agF));
        localba3.hzI = paramView.findViewById(com.tencent.mm.i.agD);
        localba3.hzJ = ((ImageView)paramView.findViewById(com.tencent.mm.i.aQr));
        localba3.hzK = paramView.findViewById(com.tencent.mm.i.aQq);
        localba3.fpi.setScaleType(ImageView.ScaleType.FIT_CENTER);
        paramView.setTag(localba3);
        break;
      }
      paramView.getTag();
      break;
      if (paramView == null)
      {
        ba localba1 = new ba(this);
        paramView = View.inflate(SmileyGrid.g(this.hzy), k.bnv, null);
        localba1.fpi = ((ImageView)paramView.findViewById(com.tencent.mm.i.agC));
        localba1.fpi.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        paramView.setTag(localba1);
        break;
      }
      paramView.getTag();
      break;
      localba2.hzK.setVisibility(8);
      localba2.fpi.setVisibility(0);
      localad = mu(paramInt + this.hzy.hzq * this.hzy.hzo);
      localba2.hzF.setBackgroundResource(h.aaO);
    }
    while (localad == null);
    TextView localTextView;
    int j;
    if (localad.ijh == null)
    {
      localba2.hzE.setVisibility(8);
      localba2.hzH.setVisibility(4);
      localTextView = localba2.hzG;
      int i = SmileyGrid.hzk;
      j = 0;
      if (i != 2)
        break label505;
    }
    while (true)
    {
      localTextView.setVisibility(j);
      com.tencent.mm.pluginsdk.g.axR().a(localba2.fpi, SmileyGrid.e(this.hzy), localad);
      return paramView;
      localba2.hzE.setVisibility(0);
      localba2.hzE.setText(localad.ijh);
      break;
      label505: j = 8;
    }
    if (paramInt == -1 + getCount())
    {
      localba2.fpi.setImageDrawable(com.tencent.mm.aq.a.n(SmileyGrid.g(this.hzy), h.Uz));
      localba2.fpi.setContentDescription(SmileyGrid.g(this.hzy).getString(n.fza));
      return paramView;
    }
    if (this.hzy.hzq == -1 + SmileyGrid.f(this.hzy))
    {
      if (paramInt < SmileyGrid.c(this.hzy) - (-1 + this.hzy.hzo) * this.hzy.hzq)
      {
        if (SmileyGrid.d(this.hzy));
        for (Drawable localDrawable2 = d.D(SmileyGrid.g(this.hzy), paramInt + (-1 + this.hzy.hzo) * this.hzy.hzq); ; localDrawable2 = d.C(SmileyGrid.g(this.hzy), paramInt + (-1 + this.hzy.hzo) * this.hzy.hzq))
        {
          localba2.fpi.setImageDrawable(localDrawable2);
          return paramView;
        }
      }
      localba2.fpi.setImageDrawable(null);
      return paramView;
    }
    if (SmileyGrid.d(this.hzy));
    for (Drawable localDrawable1 = d.D(SmileyGrid.g(this.hzy), paramInt + (-1 + this.hzy.hzo) * this.hzy.hzq); ; localDrawable1 = d.C(SmileyGrid.g(this.hzy), paramInt + (-1 + this.hzy.hzo) * this.hzy.hzq))
    {
      localba2.fpi.setImageDrawable(localDrawable1);
      return paramView;
    }
  }

  public final void update()
  {
    try
    {
      if (SmileyGrid.a(this.hzy) == 23)
      {
        this.hzA = SmileyGrid.a(this.hzy, SmileyGrid.e(this.hzy));
        if (this.hzA == null)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = SmileyGrid.e(this.hzy);
          z.w("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", "get emoji list by group id[%s] fail, new one", arrayOfObject);
          this.hzA = new ArrayList();
        }
      }
      while (true)
      {
        super.notifyDataSetChanged();
        return;
        if (SmileyGrid.a(this.hzy) == 25)
        {
          this.hzA = ((ArrayList)com.tencent.mm.pluginsdk.g.axR().KH());
          if (this.hzA == null)
          {
            z.w("!32@/B4Tb64lLpJimsn0tIjWLdbyd6XDG6bV", "get all custom emoji list fail, new one");
            this.hzA = new ArrayList();
          }
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ax
 * JD-Core Version:    0.6.2
 */