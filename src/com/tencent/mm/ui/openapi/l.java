package com.tencent.mm.ui.openapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import java.util.List;

public final class l extends BaseAdapter
  implements al
{
  private Context context;
  private List hKR;
  private boolean jJR = false;

  public l(Context paramContext, List paramList)
  {
    this.context = paramContext;
    this.hKR = paramList;
  }

  private int aPA()
  {
    return this.hKR.size();
  }

  private int apd()
  {
    return (4 - aPA() % 4) % 4;
  }

  public final void a(String paramString, ao paramao)
  {
    notifyDataSetChanged();
  }

  public final boolean aYJ()
  {
    return this.jJR;
  }

  public final void fQ(boolean paramBoolean)
  {
    this.jJR = paramBoolean;
    notifyDataSetChanged();
  }

  public final int getCount()
  {
    return aPA() + apd();
  }

  public final Object getItem(int paramInt)
  {
    if (oL(paramInt))
      return null;
    return this.hKR.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    p localp;
    if (paramView == null)
    {
      localp = new p();
      paramView = View.inflate(this.context, com.tencent.mm.k.baT, null);
      localp.fzX = ((ImageView)paramView.findViewById(i.agn));
      localp.hzG = ((TextView)paramView.findViewById(i.agm));
      localp.dYV = ((TextView)paramView.findViewById(i.ago));
      localp.jKm = paramView.findViewById(i.agp);
      paramView.setTag(localp);
    }
    while (true)
    {
      localp.jKm.setVisibility(4);
      if (!oL(paramInt))
        break;
      localp.fzX.setVisibility(4);
      localp.hzG.setVisibility(4);
      localp.dYV.setVisibility(4);
      return paramView;
      localp = (p)paramView.getTag();
    }
    com.tencent.mm.pluginsdk.model.app.k localk = (com.tencent.mm.pluginsdk.model.app.k)getItem(paramInt);
    localp.fzX.setVisibility(0);
    Bitmap localBitmap = com.tencent.mm.pluginsdk.model.app.l.b(localk.field_appId, 5, a.getDensity(this.context));
    if (localBitmap == null)
      localp.fzX.setBackgroundResource(h.RS);
    while (true)
    {
      localp.dYV.setVisibility(0);
      localp.dYV.setText(com.tencent.mm.pluginsdk.model.app.l.d(this.context, localk));
      if (!this.jJR)
        break;
      localp.hzG.setVisibility(0);
      return paramView;
      localp.fzX.setBackgroundDrawable(new BitmapDrawable(localBitmap));
    }
    localp.hzG.setVisibility(8);
    return paramView;
  }

  public final boolean oL(int paramInt)
  {
    int i = this.hKR.size();
    return (paramInt >= i) && (paramInt < i + apd());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.l
 * JD-Core Version:    0.6.2
 */